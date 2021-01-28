package projetojava;

import java.util.*;

public class OredemCrescente {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		 int num, x;
		 
		 System.out.println("Digite um numero: ");
		 num = ler.nextInt();
		 
		 x = num;
		 
		 do  
		 {
			 x = x -1;
			 num = num + x;
		 }while ( x != 0);
		 {
			 System.out.println(num);
		 }
		 
		 
	}

}
