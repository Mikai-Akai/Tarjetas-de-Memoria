/*
 * Asignatura: Programacion Interactiva
 * Estudiante: Andres Pineda
 * Codigo: 1843660
 * Periodo Academico: 2020-2
 */
package memoryCards;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

// TODO: Auto-generated Javadoc
/**
 * The Class GUIJuegoMemoria.
 */
@SuppressWarnings("serial")
public class GUIJuegoMemoria extends JFrame {
	
	/** The juego. */
	private ControlMemoria juego = new ControlMemoria();
	
	/**
	 * Instantiates a new GUI juego memoria.
	 */
	public GUIJuegoMemoria() {
		Escucha escucha = new Escucha();
		
		GUINivel();
		this.setTitle("¡Entrena tu memoria!");
		this.setSize(200*juego.getColumnas(), 200*juego.getFilas());
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		Container contenedor = this.getContentPane();
		contenedor.setLayout(new GridLayout(juego.getFilas(),juego.getColumnas()));
		
		for(int i = 0; i<(juego.getColumnas()*juego.getFilas());i++) {
			juego.gettablero(i).addMouseListener(escucha);
			contenedor.add(juego.gettablero(i));
		}
	}

	/**
	 * GUI nivel.
	 */
	private void GUINivel() {
		String[] niveles = {"1","2","3","4","5"};
		String seleccionado = (String)JOptionPane.showInputDialog(null, "¡Selecciona tu nivel!", "Niveles", JOptionPane.QUESTION_MESSAGE, null, niveles, niveles[0]);
		if(seleccionado == "1") {
			juego.setNivel(1);
		}else if(seleccionado == "2") {
			juego.setNivel(2);
		}else if(seleccionado == "3") {
			juego.setNivel(3);
		}else if(seleccionado == "4") {
			juego.setNivel(4);
		}else if(seleccionado == "5") {
			juego.setNivel(5);
		}
	}
	
	/**
	 * The Class Escucha.
	 */
	private class Escucha implements MouseListener {
		
		/**
		 * Mouse clicked.
		 *
		 * @param arg0 the arg 0
		 */
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		/**
		 * Mouse entered.
		 *
		 * @param arg0 the arg 0
		 */
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		/**
		 * Mouse exited.
		 *
		 * @param arg0 the arg 0
		 */
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		/**
		 * Mouse pressed.
		 *
		 * @param arg0 the arg 0
		 */
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		/**
		 * Mouse released.
		 *
		 * @param arg0 the arg 0
		 */
		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
}
