import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o valor do raio de um c�rculo para calcular sua �rea: ");
		float raio = entrada.nextFloat();
		double area = Math.PI * raio * raio;
		System.out.print("A �rea do c�rculo � igual a " + area + ".");
		
		entrada.close();
	}
}