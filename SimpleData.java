import java.util.Scanner;

public class SimpleData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        double height;
        boolean student;
        char initial;
        String continuee;

        while (true) {
            System.out.println("=== DATOS PERSONALES ===\n");

            while (true) {
                System.out.println("Ingrese nombre completo: ");
                name = sc.nextLine().trim();
                if (name.length() >= 1) {
                    break;
                } else {
                    System.out.println("ingrese un nombre valido\n");
                }
            }

            while (true) {
                System.out.println("\nIngrese edad:");
                if (sc.hasNextInt()) {
                    age = sc.nextInt();
                    if (age >= 1 && age <= 120) {
                        break;
                    } else {
                        System.out.println("\nIngrese una edad valida\n");
                    }
                } else {
                    System.out.println("Por favor ingrese un numero valido\n");
                    sc.nextLine();
                }
            }

            while (true) {
                System.out.println("\nIngrese altura en metros:");
                if (sc.hasNextDouble()) {
                    height = sc.nextDouble();
                    if (height >= 0.5 && height <= 3.0) {
                        break;
                    } else {
                        System.out.println("Ingrese una altura valida");
                    }
                } else {
                    System.out.println("Ingrese un numero valido");
                    sc.nextLine();
                }
            }

            while (true) {
                System.out.println("\n¿Es estudiante? (si/no):");
                String response = sc.nextLine().trim().toLowerCase();
                if (response.equals("si")) {
                    student = true;
                    break;
                } else if (response.equals("no")) {
                    student = false;
                    break;
                } else {
                    System.out.println("Respuesta invalida, responde 'si' o 'no'");
                }
            }

            initial = Character.toUpperCase(name.charAt(0));

            System.out.println("\n" + "=".repeat(50));
            System.out.println("        DATOS PERSONALES");
            System.out.println("=".repeat(50));
            System.out.println("Hola, mi nombre es " + name + ", tengo " + age + " años,");

            System.out.println("mido " + height + " metros, "
                    + (student ? "soy estudiante" : "no soy estudiante") + " y mi inicial es "
                    + initial + ".");
            System.out.println("=".repeat(50));

            do {
                System.out.print("Desea volver a ejecutarlo? (si/no): ");
                continuee = sc.nextLine().trim().toLowerCase();
                if (!continuee.equals("si") && !continuee.equals("no")) {
                    System.out.println("\nRespuesta invalida, escriba 'si' o 'no'\n");
                }
            } while (!continuee.equals("si") && !continuee.equals("no"));

            if (continuee.equals("no")) {
                System.out.println("\nHasta pronto!\n");
                break;
            }

        }
    }
}
