
// import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            // 1.
            int number;
            int factorial = 1;

            System.out.println("Ingresa el numero del factorial deseado: \n");
            if (sc.hasNextInt()) {

                number = sc.nextInt();

                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }

                System.out.println("El resultado de " + number + "! es: " + factorial);

            } else {
                System.out.println("\nIngresa un numero valido");
            }

            // 2.
            Random rand = new Random();

            int secretNumber = rand.nextInt(100) + 1;
            int maximumAttempts = 10;
            int attemptsUsed = 0;
            boolean correct = false;
            int attempts;

            System.out.println(secretNumber);
            System.out.println("\nAdivina el numero, tienes " + maximumAttempts
                    + " intentos para logar adivinarlo\n");

            while (attemptsUsed < maximumAttempts && !correct) {
                System.out.println("\nIntroduce un numero: ");
                if (!sc.hasNextInt()) {
                    System.out.println("\nIngrese un numero valido");
                    sc.next();
                    continue;
                }

                attempts = sc.nextInt();
                attemptsUsed++;

                if (attempts == secretNumber) {
                    correct = true;
                    System.out.println("\nGanaste, el numero el numero secreto es " + secretNumber
                            + "lo lograste en " + attemptsUsed + "intentos\n");
                } else if (secretNumber > attempts) {
                    System.out.println("\nEl numero secreto es mayor que " + attempts
                            + ", te quedan " + attemptsUsed + "intentos");
                } else {
                    System.out.println("\nEl numero secreto es menor que " + attempts
                            + ", te quedan " + attemptsUsed + "intentos");
                }

                if (!correct) {
                    System.out.println(
                            "\nSe acabaron los intentos, el numero correcto era: " + secretNumber);
                }

            }

            // 3.

            int sum = 0;
            int counter = 0;
            double average;

            System.out.println(
                    "\nIntroduce numeros para conseguir la media, introduce el numero '0' para finalizar");
            while (true) {
                if (!sc.hasNextInt()) {
                    System.out.println("\nIngrese un numero valido");
                    sc.next();
                    continue;
                }

                number = sc.nextInt();
                if (number == 0) {
                    break;
                }

                sum += number;
                counter++;
            }

            if (counter > 0) {
                average = (double) sum / counter;
                System.out.println(average);
            }


            // char[] volwels = {'a', 'e', 'i', 'o', 'u'};

            // String selected = (String) JOptionPane.showInputDialog(null, "Selecciona una
            // opción:",
            // "Select", JOptionPane.QUESTION_MESSAGE, null, volwels, volwels[0]);



            String confirm;
            do {
                System.out.println("\nDesea volver a ejecutarlo? (si/no): ");
                confirm = sc.nextLine();
                if (!confirm.equals("si") && !confirm.equals("no")) {
                    System.out.println("\ningrese una opcion valida");
                }
            } while (!confirm.equals("si") && !confirm.equals("no"));

            if (confirm.equals("no")) {
                System.out.println("\nHasta luego!");
                sc.close();
                break;
            }
        }



    }
}
