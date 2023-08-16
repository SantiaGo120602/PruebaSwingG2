package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Logica;
import view.Ventana;

public class Eventos implements ActionListener {

	
	private Logica l;
	private Ventana v;
	
	public Eventos(Logica l) {
		this.l=l;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String resultado=l.darMensaje();
		
		v.label.setText(resultado);
		v.crearPanel(resultado);
	}

	public Logica getL() {
		return l;
	}


	public void setL(Logica l) {
		this.l = l;
	}


	public Ventana getV() {
		return v;
	}


	public void setV(Ventana v) {
		this.v = v;
	}
	
	
	
}
