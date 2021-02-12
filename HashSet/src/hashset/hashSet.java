package hashset;

import java.util.Arrays;
import java.util.Scanner;

public class hashSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanho = sc.nextInt();
		sc.nextLine();
		String[] entrada = sc.nextLine().split(" ");
		Hash tabela = new Hash(tamanho);

		while(!entrada[0].equals("end")) {
			switch(entrada[0]) {
			case "put":
				int valorPut = Integer.parseInt(entrada[1]);
				tabela.put(valorPut);
				System.out.println(tabela.toString());
				break;

			case "contains":
				int valorContains = Integer.parseInt(entrada[1]);
				System.out.println(tabela.contains(valorContains));
				break;

			case "remove":
				int valorRemove = Integer.parseInt(entrada[1]);
				tabela.remove(valorRemove);
				System.out.println(tabela.toString());
				break;
			default:
				break;
			}
			entrada = sc.nextLine().split(" ");
		}
		sc.close();	
	}
}
class Hash{
	Integer[] array;

	private int hash(Integer valor) {
		return valor % array.length;
	}
	public Hash(Integer tamanho) {
		this.array = new Integer[tamanho];
	}

	public void put(Integer valor) {
		int sondagem = 0;
		int indice;
		while (sondagem < array.length) {
			indice = (hash(valor) + sondagem) % array.length;

			if (array[indice] == null || array[indice] == valor) {
				array[indice] = valor;
				break;
			}
			sondagem ++;	        
		}	 
	}

	public void remove(Integer valor) {
		if (this.contains(valor)) {
			int sondagem = 0;
			for (int i = sondagem; i < array.length; i++) {
				if (array[i] == valor){
					array[i] = null;
					break;
				}
				sondagem ++;
			}
		}
	}

	public boolean contains(Integer valor) {
		int sondagem = 0;
		int indice;
		boolean retorno = false;
		while (sondagem < array.length) {
			indice = (hash(valor) + sondagem) % array.length;

			if (array[indice] == valor) {
				retorno = true;
			}
			sondagem ++;
		}
		return retorno;
	}

	public String toString() {
		return Arrays.toString(array);
	}
}


