import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la base (número real): ");
		double base = sc.nextDouble();
		System.out.print("Introduce el exponente (entero positivo): ");
		int exponente = sc.nextInt();
		if (exponente < 0) {
			System.out.println("El exponente debe ser un entero positivo.");
		} else {
			double resultado = 1;
			for (int i = 0; i < exponente; i++) {
				resultado *= base;
			}
			System.out.println(base + " elevado a " + exponente + " es " + resultado);
		}
		sc.close();
	}
}
