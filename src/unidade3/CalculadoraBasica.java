package unidade3;


import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem-vindo à calculadora!");
        System.out.println("Escolha uma operação:");
		
		System.out.println("Digite a operação desejada");
		System.out.println("1.  Soma");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		
		int escolha = scanner.nextInt();
		
		System.out.println("Digite o primeiro número: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = scanner.nextDouble();
		
		double resultado;
		
		switch (escolha) {
		case 1: 
			resultado = num1 + num2;
			break;
		
		case 2: 
			resultado = num1 - num2;
			break; 
		case 3: 
			resultado = num1 * num2;
			break;
		case 4:
			if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: divisão por zero!");
                return;
            }
			break;
									
		
		default:
			throw new IllegalArgumentException("Escolha um valor permitido: " + escolha);
		}
		System.out.println("Resultado: " + resultado);
	}

}
