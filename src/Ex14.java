import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a quantidade que voc� ganha por hora: ");
		float valor = entrada.nextFloat();
		System.out.print("Insira o n�mero de horas trabalhadas no m�s: ");
		float horas = entrada.nextFloat();
		
		double salBruto = valor * horas;
		System.out.println("\nSal�rio bruto: R$ " + salBruto);
		double impRenda = salBruto * 0.11;
		System.out.println("Imposto de Renda: R$ " + impRenda);
		double inss = salBruto * 0.08;
		System.out.println("INSS: R$ " + inss);
		double sindicato = salBruto * 0.05;
		System.out.println("Sindicato: R$ " + sindicato);
		double salLiquido = salBruto - impRenda - inss - sindicato;
		System.out.print("Sal�rio l�quido: R$ " + salLiquido);
		
		entrada.close();
	}
}