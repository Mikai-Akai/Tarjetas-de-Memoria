/*
 * Asignatura: Programacion Interactiva
 * Estudiante: Andres Pineda
 * Codigo: 1843660
 * Periodo Academico: 2020-2
 */
package memoryCards;

import java.awt.EventQueue;

import javax.swing.UIManager;

// TODO: Auto-generated Javadoc
/**
 * The Class PrincipalJuegoMemoria.
 */
public class PrincipalJuegoMemoria {

	/**
	 * The main method.
	 *solicita la creacion y activacion de la interfaz grafica
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String className = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(className);
			}
		catch (Exception e) {
			
		}
			EventQueue.invokeLater(new Runnable() {
			public void run() {
				@SuppressWarnings("unused")
				GUIJuegoMemoria juego = new GUIJuegoMemoria();
				}
			});	
	}

}
