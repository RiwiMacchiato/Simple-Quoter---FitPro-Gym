import java.util.Random;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            // 1.
            System.out.println("\n" + "=".repeat(50));
            System.out.println("         EJERCICIO 1 - FACTORIAL");
            System.out.println("=".repeat(50));
            
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
            System.out.println("\n" + "=".repeat(50));
            System.out.println("         EJERCICIO 2 - ADIVINA EL NUMERO");
            System.out.println("=".repeat(50));
            
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
                            + " lo lograste en " + attemptsUsed + " intentos\n");
                } else if (secretNumber > attempts) {
                    System.out.println("\nEl numero secreto es mayor que " + attempts
                            + ", te quedan " + (maximumAttempts - attemptsUsed) + " intentos");
                } else {
                    System.out.println("\nEl numero secreto es menor que " + attempts
                            + ", te quedan " + (maximumAttempts - attemptsUsed) + " intentos");
                }
            }

            // Show final message if attempts ran out
            if (!correct && attemptsUsed >= maximumAttempts) {
                System.out.println(
                        "\nSe acabaron los intentos, el numero correcto era: " + secretNumber);
            }

            // 3.
            System.out.println("\n" + "=".repeat(50));
            System.out.println("         EJERCICIO 3 - SUMA Y MEDIA");
            System.out.println("=".repeat(50));
            
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
                System.out.println("Suma: " + sum);
                System.out.println("Media: " + average);
            } else {
                System.out.println("No se introdujeron numeros.");
            }

            // 4.
            System.out.println("\n" + "=".repeat(50));
            System.out.println("         EJERCICIO 4 - CONTEO POSITIVOS/NEGATIVOS/CERO");
            System.out.println("=".repeat(50));
            
            int totalNumbers, inputNumber;
            int positiveCount = 0, negativeCount = 0, zeroCount = 0;

            do {
                System.out.println("\nCuantos numeros desea introducir?");
                if (!sc.hasNextInt()) {
                    System.out.println("\nIngrese un numero valido");
                    sc.next();
                    continue;
                }

                totalNumbers = sc.nextInt();

                if (totalNumbers <= 0) {
                    System.out.println("\nDebe introducir al menos un numero");
                }
            } while (totalNumbers <= 0);

            System.out.println("\nIntroduzca " + totalNumbers + " numeros:");

            for (int i = 0; i < totalNumbers; i++) {
                System.out.println("Numero " + (i + 1) + ": ");
                if (!sc.hasNextInt()) {
                    System.out.println("\nIngrese un numero valido");
                    sc.next();
                    i--; // Repeat this iteration
                    continue;
                }

                inputNumber = sc.nextInt();

                if (inputNumber > 0) {
                    positiveCount++;
                } else if (inputNumber < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            }

            System.out.println("\nResultados:");
            System.out.println("Numeros mayores que 0: " + positiveCount);
            System.out.println("Numeros menores que 0: " + negativeCount);
            System.out.println("Numeros iguales a 0: " + zeroCount);

            // 5.
            System.out.println("\n" + "=".repeat(50));
            System.out.println("         EJERCICIO 5 - VALIDADOR DE VOCALES");
            System.out.println("=".repeat(50));
            
            String inputLine;
            char character;

            System.out.println("\nIntroduzca caracteres (espacio para terminar):");
            sc.nextLine();

            while (true) {
                System.out.print("Caracter: ");
                inputLine = sc.nextLine();

                if (inputLine.equals(" ") || inputLine.isEmpty()) {
                    break;
                }

                if (inputLine.length() > 1) {
                    System.out.println("Por favor, introduzca solo un caracter");
                    continue;
                }

                character = inputLine.toLowerCase().charAt(0);

                if (character == 'a' || character == 'e' || character == 'i' || character == 'o'
                        || character == 'u') {
                    System.out.println("VOCAL");
                } else {
                    System.out.println("NO VOCAL");
                }
            }

            // 6.
            System.out.println("\n" + "=".repeat(50));
            System.out.println("         EJERCICIO 6 - NUMEROS PARES EN RANGO");
            System.out.println("=".repeat(50));
            
            int lowerLimit, upperLimit;

            System.out.println("\nIntroduzca el primer numero:");
            if (!sc.hasNextInt()) {
                System.out.println("\nIngrese un numero valido");
                sc.next();
                continue;
            }
            lowerLimit = sc.nextInt();

            System.out.println("Introduzca el segundo numero:");
            if (!sc.hasNextInt()) {
                System.out.println("\nIngrese un numero valido");
                sc.next();
                continue;
            }
            upperLimit = sc.nextInt();

            // Ensure lowerLimit is actually lower
            if (lowerLimit > upperLimit) {
                int temp = lowerLimit;
                lowerLimit = upperLimit;
                upperLimit = temp;
            }

            System.out.println("\nNumeros pares entre " + lowerLimit + " y " + upperLimit + ":");
            boolean foundEven = false;

            for (int i = lowerLimit; i <= upperLimit; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    foundEven = true;
                }
            }

            if (!foundEven) {
                System.out.println("No hay numeros pares en este rango");
            } else {
                System.out.println(); // New line after numbers
            }

            // 7.
            System.out.println("\n" + "=".repeat(50));
            System.out.println("         EJERCICIO 7 - TABLA DE MULTIPLICAR");
            System.out.println("=".repeat(50));
            
            int tableNumber;

            System.out.println("\nIntroduzca el numero para mostrar su tabla de multiplicar:");
            if (!sc.hasNextInt()) {
                System.out.println("\nIngrese un numero valido");
                sc.next();
                continue;
            }
            tableNumber = sc.nextInt();

            System.out.println("\nTabla de multiplicar del " + tableNumber + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
            }

            // 8.
            System.out.println("\n" + "=".repeat(50));
            System.out.println("         EJERCICIO 8 - INTERVALO CON VALIDACIONES");
            System.out.println("=".repeat(50));
            
            int intervalLower = 0, intervalUpper = 0, intervalInput;
            int intervalSum = 0;
            int numbersOutside = 0;
            boolean equalToLimits = false;
            boolean validInput = false;

            // Request interval limits with validation
            do {
                validInput = false;

                System.out.println("\nIntroduzca el limite inferior del intervalo:");
                if (!sc.hasNextInt()) {
                    System.out.println("\nIngrese un numero valido");
                    sc.next();
                    continue;
                }
                intervalLower = sc.nextInt();

                System.out.println("Introduzca el limite superior del intervalo:");
                if (!sc.hasNextInt()) {
                    System.out.println("\nIngrese un numero valido");
                    sc.next();
                    continue;
                }
                intervalUpper = sc.nextInt();

                if (intervalLower >= intervalUpper) {
                    System.out.println("El limite inferior debe ser menor que el superior.");
                } else {
                    validInput = true;
                }
            } while (!validInput);

            System.out.println("\nIntroduzca numeros (0 para terminar):");

            while (true) {
                System.out.print("Numero: ");
                if (!sc.hasNextInt()) {
                    System.out.println("\nIngrese un numero valido");
                    sc.next();
                    continue;
                }

                intervalInput = sc.nextInt();

                if (intervalInput == 0) {
                    break;
                }

                // Check if equal to limits
                if (intervalInput == intervalLower || intervalInput == intervalUpper) {
                    equalToLimits = true;
                }

                // Check if inside interval (open interval: lower < x < upper)
                if (intervalInput > intervalLower && intervalInput < intervalUpper) {
                    intervalSum += intervalInput;
                } else {
                    numbersOutside++;
                }
            }

            System.out.println(
                    "\nResultados del intervalo (" + intervalLower + ", " + intervalUpper + "):");
            System.out.println("Suma de numeros dentro del intervalo: " + intervalSum);
            System.out.println("Numeros fuera del intervalo: " + numbersOutside);

            if (equalToLimits) {
                System.out.println(
                        "Se introdujo al menos un numero igual a los limites del intervalo");
            } else {
                System.out
                        .println("No se introdujo ningun numero igual a los limites del intervalo");
            }

            // 9.
            System.out.println("\n" + "=".repeat(50));
            System.out.println("         EJERCICIO 9 - POTENCIA SIN OPERADOR");
            System.out.println("=".repeat(50));
            
            double base;
            int exponent;
            double result = 1.0;

            System.out.println("\nIntroduzca la base (numero real):");
            if (!sc.hasNextDouble()) {
                System.out.println("\nIngrese un numero valido");
                sc.next();
                continue;
            }
            base = sc.nextDouble();

            System.out.println("Introduzca el exponente (numero entero positivo):");
            if (!sc.hasNextInt()) {
                System.out.println("\nIngrese un numero valido");
                sc.next();
                continue;
            }
            exponent = sc.nextInt();

            if (exponent < 0) {
                System.out.println("El exponente debe ser positivo");
                continue;
            }

            // Calculate power using multiplication
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }

            System.out.println("\nResultado: " + base + "^" + exponent + " = " + result);

            // 10.
            System.out.println("\n" + "=".repeat(50));
            System.out.println("         EJERCICIO 10 - TABLAS MULTIPLES (1-5)");
            System.out.println("=".repeat(50));
            
            System.out.println("\nTablas de multiplicar del 1 al 5:");

            for (int table = 1; table <= 5; table++) {
                System.out.println("\n--- Tabla del " + table + " ---");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(table + " x " + i + " = " + (table * i));
                }
            }

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
