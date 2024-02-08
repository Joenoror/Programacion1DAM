package Tema7.EjercicioDeClase3Extra;

import java.util.Arrays;
import java.util.Scanner;

public class Banco {
    private String nombre;
    CuentaBancaria[] cuentasAsociadas = new CuentaBancaria[0];

    Banco(String nombre){
        setNombre(nombre);
    }

    public CuentaBancaria[] getCuentasAsociadas() {
        return cuentasAsociadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuentasAsociadas(CuentaBancaria[] cuentasAsociadas) {
        this.cuentasAsociadas = cuentasAsociadas;
    }

    void agregarCuenta(CuentaBancaria cuenta){
        cuentasAsociadas = Arrays.copyOf(cuentasAsociadas, cuentasAsociadas.length+1);
        cuentasAsociadas[cuentasAsociadas.length-1] = cuenta;
    }

    CuentaBancaria rellenarCuenta(){
        //Recojo datos de la nueva cuenta
        System.out.println("Introduce el nombre del titular de la cuenta");
        String titularAux = new Scanner(System.in).nextLine();
        System.out.println("Introduce el saldo inicial de la cuenta");
        double saldoAux = new Scanner(System.in).nextDouble();
        CuentaBancaria nuevaCuenta = new CuentaBancaria(titularAux,saldoAux);
        return nuevaCuenta;
    }

    void mostrarInformacionDelBanco(){

        System.out.println("Nombre del banco: " + getNombre());
        System.out.println("Cantidad de cuentas asociadas: " + getCuentasAsociadas().length);
        for (int i = 0; i < cuentasAsociadas.length; i++) {
            System.out.println("Cuenta nº " + i +" : Titular de la cuenta" + cuentasAsociadas[i].getTitular());
            System.out.println("Saldo: " + cuentasAsociadas[i].getSaldo());
        }
    }

    void obtenerSaldoTotal(){
        double saldoTotalAux = 0;
        for (int i = 0; i < cuentasAsociadas.length; i++) {
            System.out.println("Cuenta nº " + i + " Saldo: " + cuentasAsociadas[i].getSaldo() + "€.");
            saldoTotalAux+=cuentasAsociadas[i].getSaldo();
        }
        System.out.println("El saldo total del banco es " + saldoTotalAux);
    }

    void realizarTransferencia(CuentaBancaria origen, CuentaBancaria destino, double cantidad){
        System.out.println("-------------------------------------------------------------------");
        System.out.println("---------------------------TRANSFERENCIA---------------------------");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Se va a proceder a realizar una transferencia entre las cuentas de " +
                origen.getTitular() + " y " + destino.getTitular() + ".");


        if(origen.getSaldo() >= cantidad) //Si en la cuenta origen hay suficiente dinero como para realizar la transferencia
        {
            origen.retirar(cantidad); //Retiro el dienero de la cuenta origen
            destino.depositar(cantidad); //Ingreso el dinero en la cuenta destino
        }

        System.out.println("-------------------------------------------------------------------");
    }

}
