package aulas;
import java.util.Scanner;

public class ScannerEntradaDados {

	public static void main(String[] args) {

		// Scanner é uma class para coletar as informações
		Scanner sc = new Scanner(System.in);

		String x;
		//Lê apenas uma palavra digitada
		x = sc.next();

		System.out.println("Você digitou: " + x);

		int y;
		// para coletar dados inteiros
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);

		double z;
		// para coletar dados com ponto flutuantes
		z = sc.nextDouble();
		System.out.println("Você digitou: " + z);

		// para ler um caracter
		char i;
		i = sc.next().charAt(0);
		System.out.println("Você digitou: " + i);

		// para ler um texto até a quebra de linha:
		String s1, s2, s3;

		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
