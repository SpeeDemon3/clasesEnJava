package ejercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre de la persona:");
		
		String name = sc.nextLine();
		
		System.out.println("Introduce la edad de la persona:");
		
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Introduce el sexo:");
		
		char sex = sc.nextLine().charAt(0);
		
		System.out.println("Introduce el peso con decimales:");
		
		float weight = sc.nextFloat();
		
		System.out.println("Introduce la altura con decimales:");
		
		float height = sc.nextFloat();
		
		Person person1 = new Person(name, age, sex, weight, height);
		
		Person person2 = new Person(name, age, sex);
		
		Person person3 = new Person();
		
		person3.setName("Arya");
		person3.setAge(4);
		person3.setSex('M');
		person3.setWeight(20.00f);
		person3.setHeight(1.07f);
		
		// Compruebo si cada persona esta en su peso ideal
		
//		System.out.println(person1.calculateBMI(weight, height));
//		
//		System.out.println(person2.calculateBMI(person2.getWeight(), person2.getHeight()));
//		
//		System.out.println(person3.calculateBMI(person3.getWeight(), person3.getHeight()));
		
		// Combruebo si son mayores de edad
		
//		System.out.println(person1.isOlder(age));
//		System.out.println(person2.isOlder(person2.getAge()));
//		System.out.println(person3.isOlder(person3.getAge()));
		
		System.out.println(person1);
		
	}

}
