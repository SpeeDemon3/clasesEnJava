package ejercicio02;

import java.util.Random;

/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class Person {

	// Atributos
	
	private String name = "";
	private int age = 0;
	private String dni;
	private char sex = 'H';
	private float weight = 0.0f;
	private float height = 0.0f;
	
	// Constructores
	
	public Person() {
		this.dni = generateDNI();
	}
	
	public Person(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.dni = generateDNI();
	}
	
	public Person(String name, int age, char sex, float weight, float height) {
		this.name = name;
		this.age = age;
		this.dni = generateDNI();
		this.sex = sex;
		this.weight = weight;
		this.height = height;
	}
	
	// Set & Get

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDni() {
		return dni;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public char getSex() {
		return sex;
	}
	
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	
	/**
	 * Metodo para modificar el sexo,
	 * comprobando si el valor introducido esta dentro del los parametros
	 * permitidos, en caso sontrario se le asignara 'H'
	 * @param sex -> Sexo de la persona
	 */
	public void setSex(char sex) {
		
		if (sex == 'H' || sex == 'M') {
			this.sex = sex;
		} else {
			this.sex = 'H';
		}
		
	}
	
	
	// Metodos especiales calculateBMI
	
	/**
	 * Metodo para comprovar el indici de masa corporal de
	 * la persona
	 * @param weight -> peso de la persona
	 * @param height -> altura de la persona
	 * @return -> [-1] si el peso es correcto, [0] si esta por debajo del peso ideal, [1] si tiene sobrepeso
	 */
	public int calculateBMI(float weight, float height) {
		// Guardo en una variable la operacion
		float formula = (float) (weight / (Math.pow(height, 2)));
		// Variable para retornar el resultado
		int result = 0;
		
		if (formula < 20) { // Si el valor es menor que 20
			result = -1;
		} else if (formula > 25) { // Si el valor es may
			result = 1;
		}
		
		return result;
	}
	
	/**
	 * Metodo para comprobar si la persona
	 * es mayor de edad
	 * @param age -> Edad de la persona
	 * @return -> True si es mayor de edad, False si es menor de edad
	 */
	public boolean isOlder(int age) {
		
		boolean verification = false;
		
		if (age >= 18) {
			verification = true;
		}
		
		return verification;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Name [" + this.name + "] Age [" + this.age + "] DNI [" + this.dni + "]\n");
		sb.append("Sex [" + this.sex + "] Weight [" + this.weight + "] Height [" + this.height + "]");
		
		return sb.toString();
	}
	
	/**
	 * Metodo accesible solo desde la clase
	 * para generar el DNI
	 * @return -> Dni generado
	 */
	private String generateDNI() {
		// Caracteres para generar el DNI
		char[] characters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		Random random = new Random();
		// Obtengo un numero aleatorio
		int numberRandom = random.nextInt(1, 100000000);
		
		// Obtengo la posicicon de la letra
		int characterPosition = numberRandom % 23; 
		
		// Convierto a String
		String dni = numberRandom + "-" +characters[characterPosition] + "";
		
		return dni;
		
	}
	
	
}
