package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicio, horaFim, tempoPartida;

		horaInicio = sc.nextInt();
		horaFim = sc.nextInt();
		
		if (horaInicio < horaFim) {
			tempoPartida = horaFim - horaInicio;
		} else {
			tempoPartida = 24 - horaInicio + horaFim;
		}
		
		System.out.println(tempoPartida);
	}

}
