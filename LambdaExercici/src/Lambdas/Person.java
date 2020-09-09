package Lambdas;

public class Person {

	//Variables de objeto persona y arrayList de personas
	private String name, surname;
	private int age;
	
	
	public Person(String name, String surname, int age) {
		this.name=name;
		this.surname=surname;
		this.age=age;
		
	}
	
	//Métodos del objeto persona
	public String getName() {
		return  name;
	}
	
	public String getSurname() {
		return "Apellido: "+surname;
	}
	
	public String getAge() {
		return "Edad: "+age;
	}
}
