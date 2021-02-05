/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.convocatoria.mod05.problema01.service;

import java.util.logging.Logger;

/**
 *
 * @author ugartemiguel
 */
public class Services {

  private static final Logger LOGGER = Logger.getLogger(
    "bitacora.subnivel.Control"
  );

  public double calcGastosTotales(int cantidadCajas, double precioCaja) {
    double gastosTotales;
    gastosTotales = cantidadCajas * precioCaja;
    if (cantidadCajas >= 200) {
      gastosTotales = cantidadCajas * precioCaja * (1.05);
      LOGGER.info("El flete es correcto");
    }

    LOGGER.info("Calcula los gastos exitosamente");

    return gastosTotales;
  }

  public double calcIngresosTotales(
    double gastosTotales,
    double porcentajeGanancia
  ) {
    double ingresosTotales;

    ingresosTotales = gastosTotales * (1 + porcentajeGanancia / 100);
    LOGGER.info("Calcula ingresos totales correctamente");
    return ingresosTotales;
  }

  public double calcGanancia(double gastosTotales, double ingresosTotales) {
    double ganancias;

    ganancias = ingresosTotales - gastosTotales;
    LOGGER.info("Calcula ganancias correctamente");
    return ganancias;
  }

  public double calcPrecioVenta(double ingresosTotales, int cantidadCajas) {
    double precioVenta;

    precioVenta = ingresosTotales / cantidadCajas;
    LOGGER.info("Calcula precio de venta de cada caja correctamente");
    return precioVenta;
  }
}
