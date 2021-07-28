package application;

import java.util.Scanner;

import entities.Agenda;
import entities.Contato;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Agenda contatos = new Agenda();
		
		System.out.print("Quantos contatos deseja adicionar? ");
		int nums = sc.nextInt();
		
		System.out.println("Escreva as infos dos contatos: ");		
		for (int i = 1; i <= nums; i++) {			
			
			System.out.println("Contato #"+ i);
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("E-mail: ");
			String email = sc.next();
						
			contatos.addContato(new Contato(nome, email));			
		}
		
		System.out.print("Digite o nome do contato que deseja remover: ");
		String nome = sc.next();
		
		contatos.removeContato(nome);
		
		System.out.println(contatos);			
		
		
		System.out.print("Digite o nome do contato que deseja buscar:");
		nome = sc.next();
		
		System.out.println(contatos.searchContato(nome));
		
		System.out.println(contatos);
		
	}

}
