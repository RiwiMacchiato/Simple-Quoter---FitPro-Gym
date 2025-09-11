import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Activity 2
        int numberA;
        int numberB;

        System.out.println("\n=== ACTIVIDAD 2 - OPERADORES ARITMETICOS ===\n");

        while (true) {
            System.out.print("Ingrese el primer numero entero: ");
            if (sc.hasNextInt()) {
                numberA = sc.nextInt();
                break;
            } else {
                System.out.println("\nIngrese un numero valido\n");
                sc.nextLine();
            }
        }

        while (true) {
            System.out.print("\nIngrese el segundo numero entero: ");
            if (sc.hasNextInt()) {
                numberB = sc.nextInt();
                break;
            } else {
                System.out.println("\nIngrese un numero valido\n");
                sc.nextLine();
            }
        }

        System.out.println("\nNumeros: A = " + numberA + ", B = " + numberB + "\n");
        System.out.println("Resultados:\n");
        System.out.println("Suma (a + b): " + (numberA + numberB));
        System.out.println("Resta (a - b): " + (numberA - numberB));
        System.out.println("Multiplicacion (a * b): " + (numberA * numberB));
        if (numberB != 0) {
            System.out.println("Division (a / b): " + (numberA / numberB));
            System.out.println("Modulo (a % b): " + (numberA % numberB));
        } else {
            System.out.println("Division (a / b): indefinida (division por cero)");
            System.out.println("Modulo (a % b): indefinido (division por cero)");
        }

        // Activity 3
        System.out.println("\n=== ACTIVIDAD 3 - MAYOR DE EDAD ===\n");

        int age;
        while (true) {
            System.out.print("Ingrese su edad: ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                if (age < 0 || age > 120) {
                    System.out.println("\nIngrese una edad valida\n");
                } else {
                    System.out.println("\n" + (age >= 18) + "\n");
                    break;
                }
            } else {
                System.out.println("\nIngrese un numero valido\n");
                sc.nextLine();
            }
        }

        // Activity 4
        System.out.println("\n=== ACTIVIDAD 4 - OPERADORES LOGICOS ===\n");

        int num1;
        int num2;

        while (true) {
            System.out.print("Ingrese el primer numero entero: ");
            if (sc.hasNextInt()) {
                num1 = sc.nextInt();
                break;
            } else {
                System.out.println("\nIngrese un numero valido\n");
                sc.nextLine();
            }
        }

        while (true) {
            System.out.print("\nIngrese el segundo numero entero: ");
            if (sc.hasNextInt()) {
                num2 = sc.nextInt();
                break;
            } else {
                System.out.println("\nIngrese un numero valido\n");
                sc.nextLine();
            }
        }

        System.out.println("\nNumeros: num1 = " + num1 + ", num2 = " + num2 + "\n");
        System.out.println("Resultados logicos:\n");
        System.out.println("Ambos son positivos (&&): " + (num1 > 0 && num2 > 0));
        System.out.println("Al menos uno es mayor que 100 (||): " + (num1 > 100 || num2 > 100));
        System.out.println("El primero no es igual al segundo (!=): " + (num1 != num2) + "\n");

        sc.close();
    }
}
