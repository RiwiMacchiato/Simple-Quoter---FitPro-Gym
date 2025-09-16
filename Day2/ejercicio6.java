import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		int num2 = sc.nextInt();

		System.out.println("Números pares entre " + num1 + " y " + num2 + ":");
		int inicio = Math.min(num1, num2);
		int fin = Math.max(num1, num2);
		for (int i = inicio; i <= fin; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
