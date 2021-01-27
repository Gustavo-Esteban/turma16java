package lista2;

import java.util.*;

public class tarefa3 {

	public static void main(String[] args) {
		/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulto*/
		Scanner ler = new Scanner (System.in);
		
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		
		if (idade < 10)
		{
			System.out.print("Você tem que ter 10 anos para entrar em uma categoria! ");
		}
		else if (idade >= 10 && idade <=14)
		{
			System.out.print("Você se encontra na categoria Infantil!! ");
		}
		else if (idade >=15 && idade <=17)
		{
			System.out.print("Você se encontra na categoria Juvenil!! ");
		}
		else if (idade >=18 && idade <=25)
		{
			System.out.print("Você se encontra na categoria Adulto!! ");
		}
		else
		{
			System.out.print("Você está acima da categoria de Adulto!! ");
		}

	}

}
