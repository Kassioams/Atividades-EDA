package buildheap;

import java.util.Arrays;
import java.util.Scanner;

public class BuildHeap {
	private static int index;
	private static int[] heap;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] list = sc.nextLine().split(" ");
		int[] array = toArrayInt(list);
		sc.close();
		buildHeap(array);
	}

	private static void buildHeap(int[] array) {
		heap = array;
		index = array.length - 1;

		for (int i = parent(index); i >= 0; i--) {
			heapify(i);
		}

		System.out.println(Arrays.toString(heap));
	}

	private static void heapify(int position) {
		int max = indexMax(position, left(position), right(position));

		if (max != position) {
			swap(heap, position, max);
			heapify(max);
		}
	}

	private static int indexMax(int position, int left, int right) {
		int pos = position;

		if (left < size()) 
			pos = (heap[position] > heap[left]) ? position : left;

		if (right < size()) {
			pos = (heap[pos]> heap[right]) ? pos : right;
		}

		return pos;
	}

	private static int size() {
		return index + 1;
	}

	private static int parent (int pos) {
		return (pos + 1) / 2;
	}

	private static int left (int pos) {
		return (pos * 2 + 1);
	}

	private static int right (int pos) {
		return (pos * 2 + 1) + 1;
	}

	private static int[] toArrayInt(String[] sec) {
		int[] numSec = new int[sec.length];
		for(int i = 0; i < sec.length; i++) {
			numSec[i] = Integer.parseInt(sec[i]);
		}
		return numSec;
	}
	
	private static void swap(int[] array, int i, int j) {
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}
}
