import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o tamanho da área a ser pintada em metros quadrados (m²): ");
		float area = entrada.nextFloat();
		
		double quantLatas = Math.ceil(area / 108);
		double precoLatas = quantLatas * 80;
		
		double quantGaloes = Math.ceil(area / 21.6);
		double precoGaloes = quantGaloes * 25;
		
		System.out.println("\nPara " + area + " m², você precisará de: \n" + quantLatas + " lata(s) de tinta de 18 litros, resultando em R$ " + precoLatas + ";");
		System.out.println("ou \n" + quantGaloes + " galão(ões) de tinta de 3,6 litros, resultando em R$ " + precoGaloes + ".");
		
		entrada.close();
	}
}