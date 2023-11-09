package com.curso.prueba1;
/*
 * @author Heron
 */
public abstract class Persona {
	public static final int nMaxHoras = 8;
	protected String dni = "";
	protected String nombre;
	protected int nHoras;

	public Persona(String dni, String nombre, int nHoras) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.nHoras = nHoras;
	}
	/*
	 * Método que devuelve las horas de entrada y salida del sujeto
	 */
	abstract String miHorario();
	/*
	 * Método que devuelve lo que hace el sujeto
	 */
	abstract String hacer();

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}
	/*
	 * Método que sirve para establecer las horas del sujeto, si supera las horas máximas no le dejará
	 */
	public void setnHoras(int nHoras) {
		if (nHoras > nMaxHoras) {
			System.out.println("Sólo se pueden 8 horas");
		}else {
			this.nHoras = nHoras;
		}
	}
	/*
	 * Inicializamos el método que devuelve la hora de salida
	 */
	public abstract String calcularHorario(int nHoras);
}
