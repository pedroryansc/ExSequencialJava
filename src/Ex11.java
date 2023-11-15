import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a altura para calcular o peso ideal: ");
		float alt = entrada.nextFloat();
		double pesoIdeal = (72.7 * alt) - 58;
		System.out.print("O peso ideal para uma pessoa com " + alt + " m de altura é " + pesoIdeal + " kg.");
		
		entrada.close();
	}
}