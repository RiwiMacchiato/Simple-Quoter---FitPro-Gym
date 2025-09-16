import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inferior, superior;
		do {
			System.out.print("Introduce el límite inferior: ");
			inferior = sc.nextInt();
			System.out.print("Introduce el límite superior: ");
			superior = sc.nextInt();
			if (inferior > superior) {
				System.out.println("El límite inferior debe ser menor o igual al superior. Intenta de nuevo.");
			}
		} while (inferior > superior);

		int sumaDentro = 0;
		boolean igualLimite = false;
		int dentro = 0, fuera = 0;
		int num;
		System.out.println("Introduce números (0 para terminar):");
		do {
			num = sc.nextInt();
			if (num == 0) break;
			if (num == inferior || num == superior) {
				igualLimite = true;
			}
			if (num > inferior && num < superior) {
				sumaDentro += num;
				dentro++;
			} else {
				fuera++;
			}
		} while (true);

		System.out.println("Suma de los números dentro del intervalo (abierto): " + sumaDentro);
		System.out.println("Números fuera del intervalo: " + fuera);
		if (igualLimite) {
			System.out.println("Se ha introducido algún número igual a los límites del intervalo.");
		} else {
			System.out.println("No se ha introducido ningún número igual a los límites del intervalo.");
		}
		sc.close();
	}
}
