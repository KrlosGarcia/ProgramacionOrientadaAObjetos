import java.util.Scanner;

public class Cuenta_Corriente {
	
	public static int contador = 100;
	
	public static void sumarContador () {
		contador +=100;
	}

	//double porque los saldos llevan decimales
	public double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void retirar(double dinero) {
		saldo -= dinero;
	}
	
	public void depositar(double dinero) {
		saldo += dinero;
	}
}		
