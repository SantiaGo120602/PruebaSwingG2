package model;

import controller.Eventos;
import view.Ventana;

public class Launcher {

	public static void main(String[] args) {
		
		Logica l=new Logica();
		
		Eventos e=new Eventos(l);
		
		Ventana v=new Ventana(e);
		e.setV(v);
		

	}

}
