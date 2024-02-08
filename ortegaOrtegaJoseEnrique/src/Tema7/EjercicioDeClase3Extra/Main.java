package Tema7.EjercicioDeClase3Extra;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("NewBank");

        banco.mostrarInformacionDelBanco();

        for (int i = 0; i < 3; i++) {
            banco.agregarCuenta(banco.rellenarCuenta());
        }
        //banco.obtenerSaldoTotal();
        banco.mostrarInformacionDelBanco();
        //Si quisieramos realizar una transferencia de 1000€ de la cuenta 0 a la cuenta 2
        banco.realizarTransferencia(banco.cuentasAsociadas[0], banco.cuentasAsociadas[2], 1000);
        banco.obtenerSaldoTotal();
    }
}
