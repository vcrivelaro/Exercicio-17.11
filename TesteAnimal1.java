package Familia38;

import java.util.Scanner;

public class TesteAnimal1 {
	public static void main(String[] args) {
		
		Cavalo1 cavalo = new Cavalo1();
		Cachorro1 cachorro = new Cachorro1();
		Preguica1 preguica = new Preguica1();
		
		Animal1 animal = null;
		
		int op;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\n\t\tEscolha um animal!!");
		
		System.out.println("1- Cavalo");
		System.out.println("2- Cachorro");
		System.out.println("3- Pregui�a");
		op = ler.nextInt(); 
		
		switch(op)
		{
		case 1: animal = cavalo; break;
		case 2: animal = cachorro; break;
		case 3: animal = preguica; break;
		default :
			System.out.println("Op��o inv�lida!");
		}
		if (animal!=null)
		{
			animal.barulho("!");
		}

	}

}
