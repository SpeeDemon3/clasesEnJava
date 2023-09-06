package ejercicio01;
/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class Main {

	public static void main(String[] args) {

		Account account1 = new Account("Antonio", 60000.00);

		// Cuenta inicial
		System.out.println(account1.toString());
		
		
		account1.depositMoney(-421.00);
		account1.depositMoney(30.00);
		// Cuenta despues de hacer un ingreso
		System.out.println(account1.toString());

		account1.withdrawals(30.00);
		// Cuenta despues de sacar 30.00
		System.out.println(account1.toString());

		account1.withdrawals(100000.00);
		// Cuenta despues de sacar mas dinero del que contiene la cuenta
		System.out.println(account1.toString());

				
	}

}
