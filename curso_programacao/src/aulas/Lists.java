package aulas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {
	public static void main(String[] args) {
		//como se declara uma lista
		List<String> list = new ArrayList<>();
		
		//adicionado valores a lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//adicionado valor na posi��o 2
		list.add(2, "Marco");
		
		// imprimindo o tamanho da lista
		System.out.println(list.size());
		
		//for each da lista
		for (String x : list) {
			System.out.println(x);
		}
		
		
		//removendo da lista o valor que tem M no inicio com fun��o lambda 
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		
		System.out.println("---------------------");
		
		//pegando o index(posi��o) do valor Bob
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		//pegando o index(posi��o) do valor Marco, retorna -1 pois n�o mais marco na lista
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		
		System.out.println("---------------------");
		
		//filtrando para uma nova lista apenas os valores que come�am com A, usando lambda e filter fun��o do java 8
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		
		System.out.println("---------------------");
		
		//pegando o primeiro valor que come�a a letra especificada e salvando na variavel. 
		//Se n�o exitir um valor iniciando com ela, retorna Null. fun��o lambda tamb�m
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}