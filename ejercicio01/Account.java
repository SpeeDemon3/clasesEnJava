package ejercicio01;

public class Account {
	
	// Atributos
	
	private String accountHolder;
	private double amount;
	
	// Constructor
	
	public Account(String accountHolder, double amount) {
		this.accountHolder = accountHolder;
		this.amount = amount;
	}
	
	// Set & Get + toString
	
	public String getAccountHolder() {
		return this.accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Name of the owner [" + this.accountHolder + "] | Amount [" + this.amount + "]");
		
		return sb.toString();
		
	}
	
	// Metodos especiales
	
	/**
	 * Metodo para ingresar una cantidad de dinero en la cuenta,
	 * comprobando primero si la cantidad es positiva
	 * @param money -> Cantidad a ingresar
	 */
	public void depositMoney(double money) {
		// Si la cantidad el mayor que 0 se añade a la cuenta
		if (money > 0) {
			this.amount += money;
		}
		
	}
	
	/**
	 * Metodo para retirar dinero comprobando si al 
	 * retirar dicha cantidad la cuenta se queda en negativo 
	 * asignamdole un valor de 0, en caso contrario se 
	 * resta la cantidad y actualiza la cuenta 
	 * @param money -> Cantidad a retirar 
	 */
	public void withdrawals(double money) {
		
		// Guardo el resultado de la comprobacion en una variable booleana
		boolean checkTotalMoney = (this.amount - money) < 0;
		
		
		// Si la variable es true
		if (checkTotalMoney) {
			// Asigno a la cantidad de la cuenta 0
			this.amount = 0.0;
			
		} else {
			// En caso contrario resto la retirada de la cuenta
			this.amount -= money;
		}
		
	}
	
	
	
}
