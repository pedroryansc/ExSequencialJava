import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro n�mero: ");
		float n1 = entrada.nextFloat();
		System.out.print("Insira o segundo n�mero: ");
		float n2 = entrada.nextFloat();
		
		float soma = n1 + n2;
		
		System.out.print("A soma entre os dois n�meros � igual a " + soma + ".");
		
		entrada.close();
	}
}
