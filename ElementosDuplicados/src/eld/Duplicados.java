package eld;

import java.util.scanner;

public class duplicados {
	
	public static void main(string[] args) {
		scanner sc = new scanner(system.in);
		
		string sequencia = "";
		sequencia = sc.nextline();
		string[] arraysequencia = sequencia.split(" ");
		
		system.out.println(verificaduplicados(arraysequencia));
		
		sc.close();
 	}
	
	private static boolean verificaduplicados(string[] sequencia) {
		boolean x = false;
		for(int i = 0; i < sequencia.length - 1; i++) {
			if(integer.parseint(sequencia[i]) == integer.parseint(sequencia[i + 1])) {
				
				x = true;
			}
		}
		return x;
	}
}
