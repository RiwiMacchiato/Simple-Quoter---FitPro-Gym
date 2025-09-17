import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Patron en piramide");
            System.out.println("2. Inverso de un numero");
            System.out.println("3. Juego de adivinanza");
            System.out.println("4. Frecuencia de palabras");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            while (!sc.hasNextInt()) {
                System.out.print("Opcion invalida. Ingrese un numero: ");
                sc.next();
            }
            option = sc.nextInt();

            switch (option) {
                case 1:
                    Pyramid pyramid = new Pyramid();
                    pyramid.run();
                    break;
                case 2:
                    ReverseNumber reverseNumber = new ReverseNumber();
                    reverseNumber.run();
                    break;
                case 3:
                    GuessGame guessGame = new GuessGame();
                    guessGame.run();
                    break;
                case 4:
                    WordFrequency wordFrequency = new WordFrequency();
                    wordFrequency.run();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }
        } while (option != 0);

        sc.close();
    }

}
