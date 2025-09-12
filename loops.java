
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
            int secretNumber;
            int maximumAttempts;
            int attemptsUsed;
            boolean correct;



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
                break;
            }
            sc.close();
        }



    }
}
