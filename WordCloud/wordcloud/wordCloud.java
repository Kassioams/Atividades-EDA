package wordcloud;

import java.util.Scanner;

public class wordCloud {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] entrada = sc.nextLine().split(" ");
		String palavra = sc.nextLine();
		
		while(!palavra.equals("fim")) {
				System.out.println(frequencia(entrada, palavra));
				palavra = sc.nextLine();
			}
		}

	public static int frequencia(String[] entrada, String palavra) {
			int contador = 0;
			for (int i = 0; i < entrada.length; i++) {
				if(entrada[i].equals(palavra)) {
					contador++;
				}
			}
			return contador;
		}
	}

