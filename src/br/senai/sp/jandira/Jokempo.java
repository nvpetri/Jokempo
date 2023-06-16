package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class Jokempo {

	public static void main(String[] args) {

		System.out.println("*********************************");
		System.out.println("          J O K E N P Ô");
		System.out.println("*********************************");
		System.out.println();
		System.out.println(" F A Ç A - S U A - E S C O L H A");
		System.out.println();
		System.out.println(" 1 - Pedra");
		System.out.println(" 2 - Papel");
		System.out.println(" 3 - Tesoura");
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println();

		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		int resultado = teclado.nextInt();
		int number = random.nextInt(3) + 1;
		String choi = "";
		String pcChoi = "";

		if (resultado <= 3) {
			if (resultado == 1) {
				choi = "Pedra";
			} else if (resultado == 2) {
				choi = "Papel";
			} else if (resultado == 3) {
				choi = "Tesoura";
			}
			if (number == 1) {
				pcChoi = "Pedra";
			} else if (number == 2) {
				pcChoi = "Papel";
			} else if (number == 3) {
				pcChoi = "Tesoura";
			}
			System.out.println("Você escolheu ----> " + choi);
			System.out.println("O PC escolheu ----> " + pcChoi);

			if (choi == pcChoi) {
				System.out.println("EMPATE!!");
			} else if (resultado == 1 && number == 3 || resultado == 2 && number == 1
					|| resultado == 3 && number == 2) {
				System.out.println("Você venceu!");
			} else {
				System.out.println("Você perdeu!");
			}

		} else {
			System.out.println("Algo de errado não está certo... Você não inseriu um número válido");
		}

	}

}
