package insertionsortrecursivo;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortRecursivo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lista = sc.nextLine().split(" ");
		int[] array = toArrayInt(lista);
		insertionSortRec(array, 1);
		sc.close();
	}
	
	public static void insertionSortRec(int[] array, int i) {
		if (i > array.length-1) {
			return;
		}
		int iAtual = i;
		int iAnterior = i - 1;
		while(iAnterior >= 0 && array[iAtual] < array[iAnterior]) {
			swap(array, iAtual, iAnterior);
			iAnterior--;
			iAtual--;
		}
		System.out.println(Arrays.toString(array));
		insertionSortRec(array, i+1);
	
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
