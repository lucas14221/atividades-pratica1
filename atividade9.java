package teste;
import java.util.Scanner;

public class atividade9 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("diga um numero");
		
		
		int nub1 = numero.nextInt();
		if ( nub1 >= 0 ) {
			
		System.out.println("numero positivo");	
		} else {
			System.out.println("numero negativo");
		}

	}
}
