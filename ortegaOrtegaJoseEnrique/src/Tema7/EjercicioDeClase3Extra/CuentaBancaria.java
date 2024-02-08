package Tema7.EjercicioDeClase3Extra;

import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    CuentaBancaria(String titular, double saldo){
        setTitular(titular);
        setSaldo(saldo);
    }
    CuentaBancaria(String titular){
        setTitular(titular);
        setSaldo(0); //Asigno por defecto 1000 de saldo.
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    void depositar(double cantidad){
        if(cantidad > 0){
            setSaldo(getSaldo()+cantidad);
        }
        else{
            System.out.println("Estas intentando realizar un depósito con saldo negativo, quizás prefieras retirar dinero.");
        }
    }

    void retirar(double cantidad){
        if(getSaldo()>=cantidad){
            setSaldo(getSaldo()-cantidad);
        }
        else{
            System.out.println("No tienes suficientes fondos en la cuenta.");
        }
    }



}
