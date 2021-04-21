package exercicio_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas?");
		
		hora = sc.nextInt();
		
		if (hora > 00 && hora < 5) {
			System.out.println("Boa madrugada!!");
		}
		else if (hora < 12 && hora > 4) {
			System.out.println("Bom dia!!");
		}
		else if (hora > 12 && hora < 18) {
			System.out.println("Boa tarde!!");
		}
		
		else {
			System.out.println("Boa noite!!");
		}
		
		sc.close();

	}

}
