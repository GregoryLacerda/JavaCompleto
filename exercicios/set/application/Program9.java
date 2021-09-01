package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program9 {
	
	static Scanner sc = new Scanner(System.in);
	static Set<Integer> cursoA = new HashSet<>();
	static Set<Integer> cursoB = new HashSet<>();
	static Set<Integer> cursoC = new HashSet<>();
	static Set<Integer> totalAlunos = new HashSet<>();		

	public static void main(String[] args) {			
		
		System.out.print("How many students for course A?");
		int n = sc.nextInt();		
		addAlunos(cursoA,n);
		
		System.out.print("How many students for course B?");
		n = sc.nextInt();		
		addAlunos(cursoB,n);
			
		System.out.print("How many students for course C?");
		n = sc.nextInt();		
		addAlunos(cursoC,n);
		
		
		totalAlunos.addAll(cursoA);
		totalAlunos.addAll(cursoB);
		totalAlunos.addAll(cursoC);
		
		System.out.println("Total de alunos: " + totalAlunos.size());

	}
	
	public static void addAlunos(Set<Integer> curso ,int nAlunos) {
		for (int i = 0; i < nAlunos; i++) {		
			curso.add(sc.nextInt());
			
		}
	}

}
