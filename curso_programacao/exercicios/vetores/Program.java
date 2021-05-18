package vetores;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Estudantes[] vect = new Estudantes[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int alugueis = sc.nextInt();
		
		
		for (int i = 0; i < alugueis; i++) {
			
			int num = i + 1;
						
			System.out.println("Aluguel #" + num +":");
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			
			System.out.print("Numero do Quarto: ");
			int quarto = sc.nextInt();
			System.out.println();
			
			vect[quarto] = new Estudantes(nome, email);							
			
		}
		
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < vect.length; i++) {
			
			if (vect[i] != null ){
				System.out.println(i + ": " + vect[i]);				
			}
			
		}
		
	}

}
