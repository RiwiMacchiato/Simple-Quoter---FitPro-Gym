package Day1;

public class operadores {
	public static void main(String[] args) {
		// Actividad 2
		int a = 10;
		int b = 5;
		System.out.println("Suma: " + (a + b));
		System.out.println("Resta: " + (a - b));
		System.out.println("Multiplicación: " + (a * b));
		System.out.println("División: " + ((double)a / b));
		System.out.println("Módulo: " + (a % b));

		// Actividad 3
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Ingresa tu edad: ");
		int edad = sc.nextInt();
		System.out.println(edad >= 18);

		// Actividad 4
		System.out.print("Ingresa el primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Ingresa el segundo número: ");
		int num2 = sc.nextInt();
		System.out.println("Ambos son positivos: " + (num1 > 0 && num2 > 0));
		System.out.println("Al menos uno es mayor que 100: " + (num1 > 100 || num2 > 100));
		System.out.println("El primero no es igual al segundo: " + (num1 != num2));
		sc.close();
	}
}
