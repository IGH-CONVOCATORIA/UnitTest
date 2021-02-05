/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.convocatoria.mod05.problema01.service;

/**
 *
 * @author ugartemiguel
 */
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Bitacora {

  private static final Logger LOG_RAIZ = Logger.getLogger("bitacora");
  private static final Logger LOG_SUBNIVEL = Logger.getLogger(
    "bitacora.subnivel"
  );
  private static final Logger LOG_UNDER = Logger.getLogger(
    "bitacora.subnivel.under"
  );

  private static final Logger LOGGER = Logger.getLogger("bitacora.Bitacora");

  public static void main(String[] args) {
    try {
      Handler consoleHandler = new ConsoleHandler();

      Handler fileHandler = new FileHandler("./bitacora.log", false);

      SimpleFormatter simpleFormatter = new SimpleFormatter();

      fileHandler.setFormatter(simpleFormatter);

      LOG_RAIZ.addHandler(consoleHandler);
      LOG_RAIZ.addHandler(fileHandler);

      consoleHandler.setLevel(Level.ALL);
      fileHandler.setLevel(Level.ALL);

      LOGGER.log(Level.INFO, "Bitacora inicializada");

      Services servicios = new Services();

      LOGGER.log(Level.INFO, "Llamadas a los componentes del sistema");

      servicios.calcGastosTotales(200, 30);
      servicios.calcIngresosTotales(servicios.calcGastosTotales(200, 30), 60);

      LOGGER.log(Level.INFO, "Probando manejo de excepciones");
    } catch (IOException ex) {
      LOGGER.log(Level.SEVERE, "Error de IO");
    } catch (SecurityException ex) {
      LOGGER.log(Level.SEVERE, "Error de Seguridad");
    }
  }
}
