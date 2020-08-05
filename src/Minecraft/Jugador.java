package Minecraft;


public class Jugador {
		public String nombre;
		public int vida;
		public int localizaciony;
		private int[] inventario = new int[12];
		
		
		public void ataqueRecibido() {
			if(vida>0)
			vida = vida - 1;
			else
				System.out.println("El jugador esta muerto");
		}
	
		
		public void saltar() {
			System.out.println("Saltando");
		}

		public void mover() {
			System.out.println("Moviendose");
		}
		
		public void come() {
			System.out.println("Comiendo");
		}
		
		public void golpear(Jugador jugador) {
			jugador.ataqueRecibido();
			System.out.println("Golpeando al jugador:" + jugador.nombre);
		}
		
		public void nadar( ) {
			System.out.println("Nadando");
		}
}

