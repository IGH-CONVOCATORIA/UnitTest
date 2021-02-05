/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.convocatoria.mod05.problema01.service.Services;
import junit.framework.TestCase;
import org.junit.Assert;
/**
 *
 * @author ugartemiguel
 */
public class TestService extends TestCase {
    
    private Services service;
    
    public void scenario(){
        service = new Services();
    }
    
    public void testCalcGastosTotales() {
        scenario();
        double result;
        result = service.calcGastosTotales(200,30.00);
       
        assertEquals(6300.00,result);
        
  }

  public void testCalcIngresosTotales() {
      scenario();
      double result;
      double gastosTotales;
      gastosTotales = service.calcGastosTotales(200, 30.00);
      result = service.calcIngresosTotales(gastosTotales, 60);
      
      assertEquals(10080.00,result);
      
  }

  public void testCalcGanancia() {
      double result;
      double gastosTotales,ingresosTotales;
      
      scenario();
      
      gastosTotales = service.calcGastosTotales(200, 30.00);
      ingresosTotales = service.calcIngresosTotales(gastosTotales, 60);
      result = service.calcGanancia(gastosTotales, ingresosTotales);
      
      assertEquals(3780.00,result);
      
  }

  public void testCalcPrecioVenta() {
      double result;
      double ingresosTotales;
      double gastosTotales;
      scenario();
      gastosTotales = service.calcGastosTotales(200, 30.00);
      ingresosTotales = service.calcIngresosTotales(gastosTotales, 60/100);
      result = service.calcPrecioVenta(ingresosTotales, 200);
      
      assertEquals(50.40,result);
      
  }
}
