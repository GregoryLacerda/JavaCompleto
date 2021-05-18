package aulas;

public class FuncsParaStrings {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG ";
		
		String s01 = original.toLowerCase();// para maiusculo
		String s02 = original.toUpperCase();// para minusculo
		String s03 = original.trim();// tira os espaõs antes e depois da string
		String s04 = original.substring(2);// pega a partir do segundo caractere 
		String s05 = original.substring(2, 9);//pega a partir do 2 até o 9
		String s06 = original.replace('a', 'x');// troca o a pelo x
		String s07 = original.replace("abc", "xy");// troca o abc pelo xy
		
		int i = original.indexOf("bc");// pega a primeira posição do bc
		int j = original.lastIndexOf("bc");// pega ultima posição do bc
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		// split recebe um separador e armazena o que for separado em um vetor
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		//acessando as posições do vetor e armazenando nas variaveis
		
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		

	}

}
