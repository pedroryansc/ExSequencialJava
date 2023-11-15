import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o tamanho da �rea a ser pintada em metros quadrados (m�): ");
		float area = entrada.nextFloat();
		
		double quantLatas = Math.ceil(area / 54);
		double preco = quantLatas * 80;
		
		System.out.print("Para " + area + " m�, voc� precisar� de " + quantLatas + " lata(s) de tinta, resultando em R$ " + preco + ".");
		
		entrada.close();
	}
}