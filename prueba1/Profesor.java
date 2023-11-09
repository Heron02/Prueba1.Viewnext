package com.curso.prueba1;

/*
 * @author Heron
 * @see Persona, Empleado
 */
public class Profesor extends Persona implements Empleado {

	private String asignatura;
	private double salario;

	/*
	 * Constructor de Profesor que incluye instancias heredadas de clase Persona y
	 * sus propias instancias
	 */

	public Profesor(String dni, String nombre, int nHoras, String asignatura, double salario) {
		super(dni, nombre, nHoras);
		this.asignatura = asignatura;
		this.salario = salario;
	}

	/*
	 * Método que devuelve un String mostrando el salario del profesor
	 */
	@Override
	public String salario() {
		return "Mi salario es de " + salario;
	}

	/*
	 * Método que devuelve a la hora que empieza y termina la jornada el profesor
	 */
	@Override
	public String miHorario() {
		if (nHoras > nMaxHoras) {
			return "Deberías trabajar menos";
		}

		return "Mi horario es de 7:00 a " + calcularHorario(nHoras);
	}

	/*
	 * Método que devuelve la asignatura impartida por el profesor
	 */
	@Override
	String hacer() {
		return "Yo doy clase de " + asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	/*
	 * Método que devuelve la suma de las horas que debe dar a la hora de entrada en
	 * el caso de los profesores entran a las 7 de la mañana
	 */
	@Override
	public String calcularHorario(int nHoras) {
		int horaEntrada = 7;
		return (horaEntrada + nHoras) + ":00";
	}

}
