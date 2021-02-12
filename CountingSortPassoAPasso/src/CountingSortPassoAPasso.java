import java.util.Arrays;
import java.util.Scanner;

public class CountingSortPassoAPasso {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[] seq = entrada.nextLine().split(" ");
		int maior = entrada.nextInt();
		int menor = entrada.nextInt();
		entrada.nextLine();
		int[] numSeq = toArrayInt(seq);
		entrada.close();
		countingSort(numSeq, maior, menor);
	}
	
	private static void countingSort(int[] seq, int k, int menor) {
		int acrescimo = menor * -1;
		int[] arrayOrdenacao = new int[k + acrescimo +1];
		int[] arrayFinal = new int[seq.length];
		
		for(int i : seq) {
			arrayOrdenacao[i + acrescimo]++;
			System.out.println(Arrays.toString(arrayOrdenacao));
		}
		
		for(int i = 1 ; i < arrayOrdenacao.length; i++) {
			arrayOrdenacao[i] += arrayOrdenacao[i-1];
		}
		System.out.println("Cumulativa do vetor de contagem - " + Arrays.toString(arrayOrdenacao));
		
		for(int i = seq.length-1; i >= 0; i-- ) {
			arrayFinal[arrayOrdenacao[seq[i] + acrescimo]-1] = seq[i];
			arrayOrdenacao[seq[i]+acrescimo]--;
		}
		System.out.println(Arrays.toString(arrayOrdenacao));
		
		for(int i = 0; i < seq.length; i++) {
			seq[i] = arrayFinal[i];
		}
		System.out.println(Arrays.toString(seq));
		
	}
		
	public static int[] toArrayInt(String[] sec) {
		int[] numSec = new int[sec.length];
		for(int i = 0; i < sec.length; i++) {
			numSec[i] = Integer.parseInt(sec[i]);
		}
		return numSec;
	}
	
	public static void swap(int[] v, int i, int j) {
		if (v == null)
			throw new IllegalArgumentException();

		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
}

