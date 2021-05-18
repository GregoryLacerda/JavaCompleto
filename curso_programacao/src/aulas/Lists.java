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
		
		//adicionado valor na posição 2
		list.add(2, "Marco");
		
		// imprimindo o tamanho da lista
		System.out.println(list.size());
		
		//for each da lista
		for (String x : list) {
			System.out.println(x);
		}
		
		
		//removendo da lista o valor que tem M no inicio com função lambda 
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		
		System.out.println("---------------------");
		
		//pegando o index(posição) do valor Bob
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		//pegando o index(posição) do valor Marco, retorna -1 pois não mais marco na lista
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		
		System.out.println("---------------------");
		
		//filtrando para uma nova lista apenas os valores que começam com A, usando lambda e filter função do java 8
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		
		System.out.println("---------------------");
		
		//pegando o primeiro valor que começa a letra especificada e salvando na variavel. 
		//Se não exitir um valor iniciando com ela, retorna Null. função lambda também
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}