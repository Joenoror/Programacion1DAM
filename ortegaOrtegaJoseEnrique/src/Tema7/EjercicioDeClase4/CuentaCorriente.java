package Tema7.EjercicioDeClase4;
import java.util.Scanner;
import Tema7.EjercicioDeClase3.Aula;


public class CuentaCorriente {

    String dni;
    public String nombreDelTitular;
    private double saldo;
    Gestor gestor;

    CuentaCorriente(){

    }

    CuentaCorriente(String dni, String nombreDelTitular){
        this.dni = dni;
        this.nombreDelTitular = nombreDelTitular;
        this.saldo = 0;
    }
    CuentaCorriente(String dni, String nombreDelTitular, double saldo){
        this.dni = dni;
        this.nombreDelTitular = nombreDelTitular;
        this.saldo = saldo;
    }
    CuentaCorriente(String dni, double saldo){
        this.dni = dni;
        this.saldo = saldo;
        this.nombreDelTitular = "";
    }

    CuentaCorriente(String nombreDelTitular){
        this("00000", nombreDelTitular, 0);
    }

//    void setSaldo(double saldo){
//        if(saldo > 0){
//            this.saldo = saldo;
//        }
//        else{
//            System.out.println("ERROR. Saldo negativo");
//        }
//    }
//    double getSaldo(){
//        return this.saldo;
//    }



    CuentaCorriente crearCuenta(){
        Scanner sc = new Scanner(System.in);
        CuentaCorriente cuentaNueva;

        System.out.println("Introduce tu dni");
        String dni = sc.nextLine();
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();

        cuentaNueva = new CuentaCorriente(dni, nombre);

        return cuentaNueva;
    }

    void sacarDinero(){
        System.out.println("Introduce el dinero que quieres retirar");
        double dineroARetirar = new Scanner(System.in).nextDouble();
        if(dineroARetirar > this.saldo) System.out.println("ERROR. No dispones de suficiente saldo");
        else saldo -= dineroARetirar;
    }

    void ingresarDinero(){
        System.out.println("Introduce el dinero que quieres ingresar");
        double dineroAIngresar = new Scanner(System.in).nextDouble();
        saldo += dineroAIngresar;
    }

    void mostrarInformacion(){
        System.out.println("INFO DE CUENTA");
        System.out.println("NOMBRE: " + this.nombreDelTitular);
        System.out.println("DNI: " + this.dni);
        System.out.println("SALDO: " + this.saldo);
    }


}
