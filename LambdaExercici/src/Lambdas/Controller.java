package Lambdas;

import java.util.ArrayList;

public class Controller {
	static ArrayList <Person> people = new ArrayList <Person>();

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

}
}
