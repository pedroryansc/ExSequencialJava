import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quanto voc� ganha por hora em seu trabalho? ");
		float valor = entrada.nextFloat();
		System.out.print("Quantas horas voc� trabalhou neste m�s? ");
		float horas = entrada.nextFloat();
		
		float salario = valor * horas;
		
		System.out.print("Seu sal�rio neste m�s � de R$ " + salario + ".");
		
		entrada.close();
	}
}