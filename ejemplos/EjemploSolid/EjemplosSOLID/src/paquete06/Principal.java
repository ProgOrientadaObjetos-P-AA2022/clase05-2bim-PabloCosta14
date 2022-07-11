/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        TarjetaCredito tc = new TarjetaCredito("Juan", "111--2545", 10.00);

        MayorEdad representante = new MayorEdad("José", "Visa");

        MenorEdad menor = new MenorEdad("Felipe", representante);

        System.out.printf("Nombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta());

        System.out.printf("Nombre: %s\n"
                + "Codigo: %s\n"
                + "Cupo Maximo: %.2f", tc.obtenerNombre(),
                tc.obtenerCodigo(), tc.obtenerCupoMax());

    }
}
