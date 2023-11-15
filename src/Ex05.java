import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um valor em metros para convertê-lo para centímetros: ");
		float num = entrada.nextFloat();
		System.out.print("O valor de " + num + " m é igual a " + num * 100 + " cm.");
		
		entrada.close();
	}
}