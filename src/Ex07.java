import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o valor do lado de um quadrado para calcular sua �rea: ");
		float num = entrada.nextFloat();
		double area = Math.pow(num, 2);
		System.out.print("A �rea do quadrado � igual a " + area + ".");
		
		entrada.close();
	}
}