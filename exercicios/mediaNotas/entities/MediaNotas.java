package entities;

import java.util.ArrayList;
import java.util.List;

public class MediaNotas {
	
	private List<Integer> notas = new ArrayList<>();
	
	public MediaNotas() {
		
	}
	
	public void addNota(int nota) {
		notas.add(nota);
	}	
	
	public Double media() {		
		double nums = 0;
		
		for (Integer notas : notas) {
			nums += notas;
		}
		
	  	return nums / notas.size();
	}	
}
