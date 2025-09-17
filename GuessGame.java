import java.util.Scanner;

public class GuessGame {
    public void run() {
        Scanner sc = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Juego de adivinanza!");
        System.out.println("Descubre el numero entre 1 y 100.");

        do {
            System.out.print("Ingrese su numero (0 para salir): ");
            while (!sc.hasNextInt()) {
                System.out.print("Valor invalido. Ingrese un numero: ");
                sc.next();
            }
            guess = sc.nextInt();
            sc.nextLine();

            if (guess == 0) {
                System.out.println("Saliendo del juego. El numero era: " + secretNumber);
                break;
            }

            attempts++;

            if (guess == secretNumber) {
                System.out.println(" Adivinaste en " + attempts + " intentos.");
            } else {
                int difference = Math.abs(guess - secretNumber);
                if (difference <= 5) {
                    System.out.println("Muy cerca!");
                } else if (guess < secretNumber) {
                    System.out.println("El numero es mayor.");
                } else {
                    System.out.println("El numero es menor.");
                }
            }
        } while (guess != secretNumber);
        System.out.println("Oprima 'Enter' para continuar");
        sc.nextLine();
    }
}
