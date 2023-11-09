package com.curso.prueba1;
/*
 * @author Heron
 * @version 1.0
 */
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		 * Creamos los dos sujetos, uno alumno y otro profesor
		 */
		Persona prof1 = new Profesor("12345634S", "Paco", 7, "Francés", 20000);
		Persona alum1 = new Alumno("43234522G", "Miguelito", 6 , 19, "1ºESO");
		//Añadimos los sujetos a un arraylist para mejor manejo
		ArrayList<Persona> pers = new ArrayList<Persona>();
		pers.add(prof1);
		pers.add(alum1);
		//Recorremos la lista ejecutando sus respectivos métodos
		for (int i = 0; i < pers.size(); i++) {
			Persona p = pers.get(i);
			if(p instanceof Profesor) {
				System.out.println("Hola soy un profesor");
				System.out.println(((Profesor) p).salario());
			} else {
				System.out.println("Hola soy un alumno");
			}
			System.out.println(p.hacer());
			System.out.println(p.miHorario());
		}
		//Podremos por ejemplo obtener el dni del sujeto, como también otros datos
		System.out.println(prof1.getDni());
	}

}
