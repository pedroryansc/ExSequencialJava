import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char genero = 'a';
		while(genero != 'F' && genero != 'f' && genero != 'M' && genero != 'm') {
			System.out.print("Insira seu gênero (F para feminino; M para masculino): ");
			genero = entrada.nextLine().charAt(0);
		}
		System.out.print("Insira a altura para calcular o peso ideal: ");
		float alt = entrada.nextFloat();
		
		double pesoIdeal;
		String pessoa;
		if(genero == 'F') {
			pesoIdeal = (62.1 * alt) - 44.7;
			pessoa = "uma mulher";
		} else {
			pesoIdeal = (72.7 * alt) - 58;
			pessoa = "um homem";
		}
		
		System.out.print("\nO peso ideal para " + pessoa + " com " + alt + " m de altura é " + pesoIdeal + " kg.");
		
		entrada.close();
	}
}