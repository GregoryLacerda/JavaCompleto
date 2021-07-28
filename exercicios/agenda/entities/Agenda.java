package entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private List<Contato> contatos = new ArrayList<>();

	public Agenda() {

	}

	public void addContato(Contato contato) {
		contatos.add(contato);
	}

	public void removeContato(String nome) {	
		contatos.removeIf(x ->x.getNome().equals(nome));
	}

	public Contato searchContato(String name) {
		
		return contatos.stream().filter(x -> x.getNome().equals(name)).findFirst().orElse(null);
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for (Contato contato : contatos) {
			sb.append(contato);
			sb.append("\n");
		}
		
		
		return "Lista: \n" + sb;
	}
	
}
