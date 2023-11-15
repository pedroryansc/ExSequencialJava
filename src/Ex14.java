import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a quantidade que você ganha por hora: ");
		float valor = entrada.nextFloat();
		System.out.print("Insira o número de horas trabalhadas no mês: ");
		float horas = entrada.nextFloat();
		
		double salBruto = valor * horas;
		System.out.println("\nSalário bruto: R$ " + salBruto);
		double impRenda = salBruto * 0.11;
		System.out.println("Imposto de Renda: R$ " + impRenda);
		double inss = salBruto * 0.08;
		System.out.println("INSS: R$ " + inss);
		double sindicato = salBruto * 0.05;
		System.out.println("Sindicato: R$ " + sindicato);
		double salLiquido = salBruto - impRenda - inss - sindicato;
		System.out.print("Salário líquido: R$ " + salLiquido);
		
		entrada.close();
	}
}