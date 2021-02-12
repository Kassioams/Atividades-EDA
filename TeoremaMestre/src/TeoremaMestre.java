import java.util.Scanner;

class TeoremaMestre {
	 
	 public static void main(String[ ] args) {
		 Scanner sc =  new Scanner(System.in);
		 String[] sec = sc.nextLine().split(" ");
		  int a = Integer.parseInt(sec[0]);
		  int b = Integer.parseInt(sec[1]);
		  int ord = Integer.parseInt(sec[2]);
		  sc.close();
		 
		  double log = (Math.log(a)/ Math.log(b));
		  
		  if (ord == log) {
			  System.out.println("T(n) = theta(n**" + ord + " * log n)");
			  //T(n) = theta(n**2 * log n)
		  }
		  else if(ord > log) {
			  System.out.println("T(n) = theta(n**" + ord + ")"); 
			  //T(n) = theta(n**3) 
		  }
		  else if (ord < log) {
			  System.out.println("T(n) = theta(n**" + ord + " * log n)");
			  //T(n) = theta(n**2 * log n)
		}
	 }
}
