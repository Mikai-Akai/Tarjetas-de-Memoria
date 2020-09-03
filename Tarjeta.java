/*
 * Asignatura: Programacion Interactiva
 * Estudiante: Andres Pineda
 * Codigo: 1843660
 * Periodo Academico: 2020-2
 */
package memoryCards;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Tarjeta extends JButton{
	private int valor = 1;
	private boolean revelado = false;
	private ImageIcon imagenFinal;
	
	/**
	 * Gets the valor.
	 *
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}
	public void setValor(int entrada) {
		this.valor = entrada;
		imagenFinal = new ImageIcon("src/imagenes/"+entrada+".png");
		Icon icono = new ImageIcon(imagenFinal.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		this.setIcon(icono);
		this.setBackground(Color.BLACK);
		this.setVisible(true);
		this.setSize(200, 200);
	}
	public void cambiarImagen(boolean aviso) {
		if(revelado == false) {
			if (aviso) {
				setValor(valor);
			}else {
				this.setIcon(null);
			}
		}
	}
}
