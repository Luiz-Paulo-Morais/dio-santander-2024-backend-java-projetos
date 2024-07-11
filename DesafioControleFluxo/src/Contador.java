import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		int parametroUm = 0;
		int parametroDois = 0;
		
		
		try {
			System.out.println("Digite o primeiro parâmetro");
			parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			parametroDois = terminal.nextInt();
			
		} catch (InputMismatchException e) {
			// imprimir dados invalidos
			System.out.println("Dados invalidos, insira somente numeros inteiros positivos");
		}
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();

		}      
		int contagem = parametroDois - parametroUm;
		System.out.println("A diferenca entre os parametros e: " + contagem);
		//realizar o for para imprimir os números com base na variável contagem
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);

		}
	}

}
