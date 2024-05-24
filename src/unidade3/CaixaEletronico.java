package unidade3;

import javax.swing.JOptionPane;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		int saque;
		double notas100, notas50, notas10;
		int resto;
		
		saque = Integer.parseInt(JOptionPane.showInputDialog("Qual valor do saque?"));
		
		if (saque%10 == 0) // valor informado está correto 
		{
			notas100 = Math.floor(saque/100);
			resto = saque % 100;
			notas50 = Math.floor(resto/50);
			resto = resto % 50;
			notas10 = Math.floor(resto/10);
			
			if (notas100 > 0)
				System.out.println("O número de notas de cem="+notas100);
			if (notas100 > 0)
				System.out.println("O número de notas de cinquenta="+notas50);
			if (notas100 > 0)
				System.out.println("O número de notas de dez="+notas10);
		}
		else
			System.out.println("Valor informando do saque está incorreto! ");

	}

}
