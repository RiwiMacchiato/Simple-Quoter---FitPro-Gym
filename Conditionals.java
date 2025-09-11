import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Activity 5
        int number;
        while (true) {
            System.out.println("\n=== ACTIVIDAD 5 ===");
            System.out.print("Ingrese un numero entero: ");
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                if (number > 0) {
                    System.out.println("\nEl numero es positivo\n");
                    break;
                } else if (number < 0) {
                    System.out.println("\nEl numero es negativo\n");
                    break;
                } else {
                    System.out.println("\nEl numero es cero\n");
                    break;
                }
            } else {
                System.out.println("\nIngrese un numero valido\n");
                sc.nextLine();
            }
        }

        // Activity 6
        int age;
        while (true) {
            System.out.println("\n=== ACTIVIDAD 6 ===");
            System.out.print("Ingrese edad: ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                if (age < 0 || age > 120) {
                    System.out.println("\nIngrese una edad valida\n");
                } else if (age < 12) {
                    System.out.println("\nCategoria: Nino\n");
                    break;
                } else if (age <= 17) {
                    System.out.println("\nCategoria: Adolescente\n");
                    break;
                } else {
                    System.out.println("\nCategoria: Adulto\n");
                    break;
                }
            } else {
                System.out.println("\nIngrese un numero valido\n");
                sc.nextLine();
            }
        }

        // Activity 7
        while (true) {
            System.out.println("\n=== ACTIVIDAD 7 ===");
            System.out.print("Ingrese un numero del 1 al 7 (1=Lunes, 7=Domingo): ");
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                switch (number) {
                    case 1:
                        System.out.println("\nLunes\n");
                        break;
                    case 2:
                        System.out.println("\nMartes\n");
                        break;
                    case 3:
                        System.out.println("\nMiercoles\n");
                        break;
                    case 4:
                        System.out.println("\nJueves\n");
                        break;
                    case 5:
                        System.out.println("\nViernes\n");
                        break;
                    case 6:
                        System.out.println("\nSabado\n");
                        break;
                    case 7:
                        System.out.println("\nDomingo\n");
                        break;
                    default:
                        System.out.println("\nNumero invalido. Ingrese un numero del 1 al 7.\n");
                        continue;
                }
                break;
            } else {
                System.out.println("\nIngrese numero valido\n");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
