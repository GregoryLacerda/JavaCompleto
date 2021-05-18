package aulas;
import java.util.Locale;

public class PrintfeLocale {

	public static void main(String[] args) {
		
		int y = 32; 
		System.out.println(y);
		
		double x = 10.35784;
		System.out.println(x);
		
		//controla o numero de casas decimais
		System.out.printf("%.2f%n", x);		
		System.out.printf("%.4f%n", x);	

		//muda a localidade para que em vez de virgula a separação seja um ponto
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);		
		
		//para juntar varios elementos
		System.out.println("Resultado: " + x +" Metros");
		
		//cocatenar elmentos com o printf e  ja formata para aparecer apenas com duas casas
		System.out.printf("Resultado: %.2f metros%n", x);
		
		//Marcador de ponto flutuante: %f, inteiro: %d, texto: %s e quebra de linha%n
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		//junta as variaveis em uma mesma mensagem formatada
		System.out.printf("%s tem %d anos e ganha R$ %.2f reias%n",nome, idade, renda);
		
	}

}
