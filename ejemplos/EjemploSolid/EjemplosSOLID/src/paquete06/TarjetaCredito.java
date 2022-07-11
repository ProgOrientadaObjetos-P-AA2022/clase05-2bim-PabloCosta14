/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author SALA I
 */
public class TarjetaCredito {

    private String nombre;
    private String codigo;
    private double cupoMax;

    public TarjetaCredito(String n, String a, double c) {
        nombre = n;
        codigo = a;
        cupoMax = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerCodigo() {
        return codigo;
    }

    public void establecerCodigo(String n) {
        codigo = n;
    }

    public double obtenerCupoMax() {
        return cupoMax;
    }

    public void establecerCupoMax(double n) {
        cupoMax = n;
    }

}
