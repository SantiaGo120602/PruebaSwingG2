package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.Eventos;

public class Ventana extends JFrame{
	
	private Eventos ev;
	public JLabel label;
	public Ventana(Eventos e) {
		super("Mi ventana");
		ev=e;
		initComponents();
		addJLabel();
	}
	
	public void initComponents() {
		this.setSize(400,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		addButtons();
		this.setVisible(true);
	}
	
	public void addButtons() {
		JButton button1=new JButton("HOLA!");
		button1.setBounds(10,10,70,70);
		button1.addActionListener(ev);
		this.add(button1);
	}

	public void addJLabel() {
		label=new JLabel("no sé qué pasó");
		label.setBounds(80,180,180,300);
		this.add(label);
	}

	public void crearPanel(String s) {
		MyPanel mp=new MyPanel(s);
		mp.setBounds(50, 300, 300, 300);
		this.add(mp);
		
		
		
	}

}
