import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o nome do aluno: ");
		String nome = entrada.nextLine();
		
		System.out.print("Insira a nota do 1º bimestre de " + nome + ": ");
		float nota1 = entrada.nextFloat();
		System.out.print("Insira a nota do 2º bimestre de " + nome + ": ");
		float nota2 = entrada.nextFloat();
		System.out.print("Insira a nota do 3º bimestre de " + nome + ": ");
		float nota3 = entrada.nextFloat();
		System.out.print("Insira a nota do 4º bimestre de " + nome + ": ");
		float nota4 = entrada.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.print("A média do aluno " + nome + " foi " + media + ".");
		
		entrada.close();
	}
}