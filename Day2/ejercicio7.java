import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número para ver su tabla de multiplicar: ");
		int tabla = sc.nextInt();
		System.out.println("Tabla de multiplicar del " + tabla + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(tabla + " x " + i + " = " + (tabla * i));
		}
		sc.close();
	}
}
