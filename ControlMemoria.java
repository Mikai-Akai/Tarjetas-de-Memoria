/*
 * Asignatura: Programacion Interactiva
 * Estudiante: Andres Pineda
 * Codigo: 1843660
 * Periodo Academico: 2020-2
 */
package memoryCards;

import java.util.ArrayList;
import java.util.Collections;

// TODO: Auto-generated Javadoc
/**
 * The Class ControlMemoria.
 */
public class ControlMemoria {
	
	/** The nivel. */
	private int nivel = 1;
	
	/** The ganar. */
	@SuppressWarnings("unused")
	private boolean ganar = false;
	
	/** The tablero. */
	private ArrayList<Tarjeta> tablero;
	
	/** The columnas. */
	private int filas, columnas;
	
	/**
	 * Instantiates a new control memoria.
	 */
	public ControlMemoria() {
		tablero = new ArrayList<Tarjeta>(0);
	}
	
	/**
	 * Sets the nivel.
	 *
	 * @param nivelEntrada the new nivel
	 */
	public void setNivel(int nivelEntrada) {
		this.nivel = nivelEntrada;
		switch(nivel){
		case 1:
			filas = 2;
			columnas = 2;
			construyeTablero(1);
			break;
		case 2:
			filas = 2;
			columnas = 3;
			construyeTablero(2);
			break;
		case 3:
			filas = 2;
			columnas = 4;
			construyeTablero(3);
			break;
		case 4: 
			filas = 2;
			columnas = 5;
			construyeTablero(4);
			break;
		case 5:
			filas = 3;
			columnas = 4;
			construyeTablero(5);
			break;
		}
	}
	
	/**
	 * Construye tablero.
	 *
	 * @param nivelElegido the nivel elegido
	 */
	public void construyeTablero(int nivelElegido) {
		Tarjeta auxiliar;
		for(int i = 0; i<2;i++) {
			for(int j = 1; j <= filas*columnas/2;j++) {
				auxiliar = new Tarjeta();
				auxiliar.setValor(j);
				tablero.add(auxiliar);
			}
		}
		Collections.shuffle(tablero);
	}
	
	/**
	 * Gets the filas.
	 *
	 * @return the filas
	 */
	public int getFilas() {
		return filas;
	}
	
	/**
	 * Gets the columnas.
	 *
	 * @return the columnas
	 */
	public int getColumnas() {
		return columnas;
	}
	
	/**
	 * Gets the tablero.
	 *
	 * @param i the i
	 * @return the tablero
	 */
	public Tarjeta gettablero(int i) {
		return tablero.get(i);
	}
	
}
