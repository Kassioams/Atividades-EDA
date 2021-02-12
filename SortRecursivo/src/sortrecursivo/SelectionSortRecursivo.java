package sortrecursivo;

import java.util.Arrays;
import java.util.Scanner;


class SelectionSortRecursivo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lista = sc.nextLine().split(" ");
		int[] array = toArrayInt(lista);
		recursiveSelectionSort(array, 0);
		sc.close();
	}
	
	public static void recursiveSelectionSort(int[] array, int i) {
		if( i > array.length -1) {
			return;
		}
		int iMenor = i;
		boolean troca = false;
		for (int j = i+1; j <= array.length -1; j++) {
			if (array[j] < array[iMenor]) {
				iMenor = j;
				troca = true;
			}
		}
		if (troca) {
			swap(array, i, iMenor);
		
		}
		System.out.println(Arrays.toString(array));
		
		if (i < array.length -2){
			recursiveSelectionSort(array,i+1);
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
