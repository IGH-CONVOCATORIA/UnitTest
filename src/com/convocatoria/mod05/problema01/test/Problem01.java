/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.convocatoria.mod05.problema01.test;

import com.convocatoria.mod05.problema01.service.Services;

/**
 *
 * @author ugartemiguel
 */
public class Problem01 {
      public static void main(String[] args) {
    int cantidadCajas = 200;
    double precioCaja = 30, porcentajeGanancia = 60;
    double gastosTotales, ingresosTotales, ganancia, precioVenta;
    Services servicios;
    servicios = new Services();
    gastosTotales = servicios.calcGastosTotales(cantidadCajas, precioCaja);
    ingresosTotales =
      servicios.calcIngresosTotales(gastosTotales, porcentajeGanancia);
    ganancia = servicios.calcGanancia(gastosTotales, ingresosTotales);
    precioVenta = servicios.calcPrecioVenta(ingresosTotales, cantidadCajas);

    System.out.println("Gastos totales: " + gastosTotales);
    System.out.println("Ingresos totales: " + ingresosTotales);
    System.out.println("Ganancia: " + ganancia);
    System.out.println("Precio de venta por caja: " + precioVenta);
  }
    
}
