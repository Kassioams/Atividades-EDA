package insereultimo;

import java.util.Arrays;
import java.util.Scanner;

public class InsereUltimo {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lista = sc.nextLine().split(" ");
		int[] array = toArrayInt(lista);
		sc.close();
		insereUltimo(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void insereUltimo(int[]lista) {
		int ultimo = lista.length -1;
		for (int i = lista.length-2; i >= 0; i-- ) {
			if (lista[ultimo] < lista[i]) {
				swap(lista,ultimo, i);
				ultimo--;
			}else {
				return;
			}
		}
	}
	
	private static int[] toArrayInt(String[] sec) {
		int[] numSec = new int[sec.length];
		for(int i = 0; i < sec.length; i++) {
			numSec[i] = Integer.parseInt(sec[i]);
		}
		return numSec;
	}
	
	public static void swap(int[] array, int i, int j) {
		if (array == null)
			throw new IllegalArgumentException();
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
