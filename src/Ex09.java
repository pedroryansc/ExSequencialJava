import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a temperatura em graus Fahrenheit para convertê-la para Celsius: ");
		float tempF = entrada.nextFloat();
		double tempC = (tempF - 32) / 1.8;
		System.out.print(tempF + " °F = " + tempC + " °C");
		
		entrada.close();
	}
}