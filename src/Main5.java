

public class Main5 {
	
	void sumarContador() {
		Cuenta_Corriente.contador += 100;
		sumarContadorMain1();
	}
	
	static void sumarContadorMain1() {
		Cuenta_Corriente.contador += 100;
		Main5 main = new Main5();
		main.sumarContador();
	}

	public static void main(String[] args) {
		
		Main5 main = new Main5();
		main.sumarContador();
		
		Main5.sumarContadorMain1();
		sumarContadorMain1();
		
		Cuenta_Corriente.sumarContador();
		System.out.println(Cuenta_Corriente.contador); //son llamadas variables de la clase "Static".
		
		
		//Cuenta_Corriente.saldo = 100; no se puede porque saldo no es una variable estatica, es una variable de instancia.
		
		Cuenta_Corriente cta = new Cuenta_Corriente();
		cta.saldo = 100;
		
		Cuenta_Corriente cta1 = new Cuenta_Corriente();
		cta1.saldo = 1000;
		

	}

}
