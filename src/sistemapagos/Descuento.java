/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagos;

import java.math.BigDecimal;

/**
 *
 * @author Ismael Arias, Isaac Cueva, Matew Pozo, Javier Pupiales, Steve Rosero
 */
public class Descuento {
    
    private static BigDecimal tasaImpuestoRenta = new BigDecimal("0.1"); // Tasa del 10% para el impuesto a la renta
    private static BigDecimal tasaRetencionIESS = new BigDecimal("0.0945"); // Tasa del 9.45% para la retención de IESS
    
    public static BigDecimal getTasaImpuestoRenta() {
        return tasaImpuestoRenta;
    }
    
    public static BigDecimal getTasaRetencionIESS() {
        return tasaRetencionIESS;
    }
}
