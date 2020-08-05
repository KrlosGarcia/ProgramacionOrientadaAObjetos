//estado - caracteristicas- varibales
//comportamiento - funciones o metodos
public class Tv {

	public boolean encendido; //caracteristicas
	public int volumen; //caracteristicas
	public int canal; //caracteristicas
	
	
	//metodos ...
	public void apagar() {
		encendido = false;
	}
	
	public void encender() {
		encendido = true;
	}
	
	public void avanzarCanal() {
		if(encendido)
		canal++;
	}
	
	public void disminuirCanal() {
		if(encendido && canal > 0)
			canal--;
	}
	
	public void subirVolumen() {
		if(encendido && volumen < 100)
			volumen ++;
	}
	
	public void bajarVolumen() {
		if(encendido && volumen > 0)
			volumen --;
	}
	
}

