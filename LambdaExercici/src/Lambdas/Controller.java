package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Controller {
	static ArrayList <Person> people = new ArrayList <Person>();
	static ArrayList <Person> peopleSelected = new ArrayList <Person>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Objetos persona creados para el ejercicio e imputados a la lista people
		people.add(new Person("Ana","López", 45));
		people.add(new Person("Ada","Colau", 58));
		people.add(new Person("Pere","Sànchez", 39));
		people.add(new Person("Esther","Riba", 32));
		people.add(new Person("Amador","Jurado", 49));
		people.add(new Person("Luis","Collado", 42));
		people.add(new Person("Núria","Coll", 45));
		people.add(new Person("Mónica","Jurado", 43));
		
		
		//Itireación e impresión sobre arrayList de personas
		
		for (int i=0; i<people.size(); i++) {
			Person e= people.get(i);
			System.out.println(e.getName());
			System.out.println(e.getSurname());
			System.out.println(e.getAge());
		}
		

				
			//Con predicates	
				//Declaración de condiciones
				Predicate <Person> startsWithA = a -> a.getName().startsWith("A");
				Predicate<Person> threeLetters = b -> b.getName().length() == 3;
						
				System.out.println("Solución imprimir nombres de los nombres que empiezancon A y tienen tres letras:");
				people.stream().filter(startsWithA).filter(threeLetters).forEach((z) -> System.out.println(z.getName()));	
						
	
	}
}



/*
//Lambda para listar el contenido de la array
people.stream().forEach(a->System.out.println(a.getName()));


//Lambda para listar nombres que empiezan por A
//System.out.println("Nombres que empiezan por A mayúscula ");
	//	people.stream().
		//		filter(c -> c.getName().charAt(0) == 'A')
			//			.forEach(c -> System.out.println(c));
		
	//System.out.println("Nombres de tres caracteres ");
		
	//Lambda imprimo todos
		//people.stream().forEach(a -> System.out.println(a.getName()));
		
	//Lambda imprimo nombres de cinco letras
		people.stream().filter(a -> a.getName().length() > 5).forEach(System.out::println);

*/