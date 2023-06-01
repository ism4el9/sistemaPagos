/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagos;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Ismael Arias, Isaac Cueva, Matew Pozo, Javier Pupiales, Steve Rosero
 */
public class Calculadora {
    
    public static BigDecimal calcularTotalPago(BigDecimal baseImponible) {
        BigDecimal impuestoRenta = calcularImpuestoRenta(baseImponible);
        BigDecimal retencionIESS = calcularRetencionIESS(baseImponible);
        BigDecimal descuentoTotal = impuestoRenta.add(retencionIESS);
        BigDecimal totalPago = baseImponible.subtract(descuentoTotal).setScale(2, RoundingMode.HALF_UP);
        return totalPago;
    }
    
    private static BigDecimal calcularImpuestoRenta(BigDecimal baseImponible) {
        BigDecimal impuestoRenta = baseImponible.multiply(Descuento.getTasaImpuestoRenta());
        return impuestoRenta.setScale(2, RoundingMode.HALF_UP);
    }

    private static BigDecimal calcularRetencionIESS(BigDecimal baseImponible) {
        BigDecimal retencionIESS = baseImponible.multiply(Descuento.getTasaRetencionIESS());
        return retencionIESS.setScale(2, RoundingMode.HALF_UP);
    }
}
