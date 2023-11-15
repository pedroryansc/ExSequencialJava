import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de peixes (em kg) pescados: ");
		float peso = entrada.nextFloat();
		
		float excesso;
		float multa;
		if(peso > 50) {
			excesso = peso - 50;
			multa = excesso * 4;
		} else {
			excesso = 0;
			multa = 0;
		}
		
		System.out.print("Excesso: " + excesso + " kg \nMulta: R$ " + multa);
		
		entrada.close();
	}
}