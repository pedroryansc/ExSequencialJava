import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quanto você ganha por hora em seu trabalho? ");
		float valor = entrada.nextFloat();
		System.out.print("Quantas horas você trabalhou neste mês? ");
		float horas = entrada.nextFloat();
		
		float salario = valor * horas;
		
		System.out.print("Seu salário neste mês é de R$ " + salario + ".");
		
		entrada.close();
	}
}