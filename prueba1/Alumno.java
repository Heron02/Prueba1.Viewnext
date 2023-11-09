package com.curso.prueba1;
/*
 * @author Heron
 * @see Persona, Empleado
 */
public class Alumno extends Persona{
	
	public static final int MAX_EDAD = 18;
	private int edad;
	private String curso;
	
	public Alumno(String dni, String nombre, int nHoras, int edad, String curso) {
		super(dni, nombre, 6);
		this.edad = edad;
		this.curso = curso;
	}
	/*
	 * Método que devuelve el horario del alumno
	 */
	@Override
	String miHorario() {
		if(nHoras>nMaxHoras) {
			return "Deberías estudiar menos";
		}
		
		return "Mi horario es de 8:00 a " + calcularHorario(nHoras) ;
	}
	/*
	 * Método que devuelve el curso del Alumno
	 */
	@Override
	String hacer() {
		if( edad> MAX_EDAD) {
			return "Estas viejo ya para esto";
		}
		return "Estoy haciendo " + curso + " a los " + edad + " años";
	}
	/*
	 * Método que devuelve la hora de salida del alumno
	 */
	@Override
	public String calcularHorario(int nHoras) {
		int horaEntrada = 8;
		return (horaEntrada + nHoras) + ":00";
	}
	
	
}
