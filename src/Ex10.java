import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número inteiro: ");
		int n1 = entrada.nextInt();
		System.out.print("Insira o segundo número inteiro: ");
		int n2 = entrada.nextInt();
		System.out.print("Insira o número real: ");
		float n3 = entrada.nextFloat();
		
		System.out.println("\nProduto do dobro do primeiro com a metade do segundo: " + (n1 * 2) * (n2 / 2));
		System.out.println("Soma do triplo do primeiro com o terceiro: " + ((n1 * 3) + n3));
		System.out.println("Terceiro elevado ao cubo: " + Math.pow(n3, 3));
		
		entrada.close();
	}
}