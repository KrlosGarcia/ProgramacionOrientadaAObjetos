import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Cuenta_Corriente cta1 = new Cuenta_Corriente();
		Cuenta_Corriente cta2 = new Cuenta_Corriente();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresar cantidad de deposito para cta1: ");
		double dinero = in.nextDouble();
		cta1.depositar(dinero);

		
		System.out.println("Ingresar cantidad de deposito para cta2: ");
		dinero = in.nextDouble();
		cta2.depositar(dinero);
		
		
		System.out.println("Saldo cta1:" + cta1.getSaldo());
		System.out.println("Saldo cta2:" + cta2.getSaldo());

	}

}
