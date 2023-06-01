/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagos;

/**
 *
 * @author Isma
 */
public class Cuenta {
    
    private double saldo;

    public Cuenta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void debitar(double cantidad) {
        saldo -= cantidad;
    }
    
    /*
    public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private Cuenta cuentaBancaria;

    public Empleado(String nombre, int edad, double salario, double saldoInicial) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.cuentaBancaria = new Cuenta(saldoInicial);
    }

    public void aplicarDescuento(double descuento) {
        cuentaBancaria.debitar(descuento);
    }
    */
}
