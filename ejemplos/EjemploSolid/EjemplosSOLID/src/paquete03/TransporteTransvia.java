/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author UTPL
 */
public class TransporteTransvia {

    private String cooperativaTransvia;
    public double tarifa;

    public String obtenerCooperativaTransvia() {
        return cooperativaTransvia;
    }

    public void establecerCooperativaTransvia(String n) {
        cooperativaTransvia = n;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    public void establecerTarifa() {
        tarifa = 3.00 * 2.00;
    }

}
