package src;

import java.util.Scanner;

public class AtividadeRodrigo {
	public static void main(String[] args) {
		
		double notabim1,notabim2,media;
		
		Scanner user = new Scanner(System.in);
		System.out.println("Digite a nota do primeiro bimestre: ");
		notabim1 = user.nextDouble();
		notabim1= notabim1*2;
		
		System.out.println("Digite a nota do segundo bimestre: ");
		notabim2 = user.nextDouble ();
		notabim2 = notabim2*3;
		media = (notabim1+notabim2)/5;
		
		System.out.println ("A nota final do aluno é: "+media);
		
	}

}
