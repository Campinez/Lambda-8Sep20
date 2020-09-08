package Lambdas;

import java.util.ArrayList;

public class Controller {
	static ArrayList <Person> people = new ArrayList <Person>();
	static ArrayList <Person> peopleSelected = new ArrayList <Person>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Objetos persona creados para el ejercicio e imputados a la lista people
		people.add(new Person("Ana","L�pez", 45));
		people.add(new Person("Ada","Colau", 58));
		people.add(new Person("Pere","S�nchez", 39));
		people.add(new Person("Esther","Riba", 32));
		people.add(new Person("Amador","Jurado", 49));
		people.add(new Person("Luis","Collado", 42));
		people.add(new Person("N�ria","Coll", 45));
		people.add(new Person("M�nica","Jurado", 43));
		
		
		//Itireaci�n e impresi�n sobre arrayList de personas
		
		for (int i=0; i<people.size(); i++) {
			Person e= people.get(i);
			System.out.println(e.getName());
			System.out.println(e.getSurname());
			System.out.println(e.getAge());
		}
		
		/*
		//Lambda para listar el contenido de la array
		people.stream().forEach(a->System.out.println(a.getName()));
		
	*/
		//Lambda para listar nombres que empiezan por A
		//System.out.println("Nombres que empiezan por A may�scula ");
			//	people.stream().
				//		filter(c -> c.getName().charAt(0) == 'A')
					//			.forEach(c -> System.out.println(c));
				
			System.out.println("Nombres de tres caracteres ");
				people.stream().filter(c -> c.getName().length() >5).forEach(c -> System.out.println(c.getName()));

								
	
	}
}
