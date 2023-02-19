package test;

public class Asiento {
	String color;
	int registro;
	int precio;
	
	void cambiarColor(String color) {
		 
		if (color== "rojo" || color=="azul" || color=="amarillo" || color=="negro" || color=="blanco") {
			this.color = color;
		}
		
	}
	

}
