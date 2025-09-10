// package simple.quoter;

import java.util.Scanner;

/**
 *
 * @author javaspringboot
 */
public class SimpleQuoter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            // Inputs

            System.out.println("Ingrese su nombre: ");
            String name = sc.nextLine();

            int age;
            while (true) {
                System.out.println("Ingrese edad: ");
                if (sc.hasNextInt()) {
                    age = sc.nextInt();
                    sc.nextLine();
                    if (age >= 0 && age <= 130) {
                        break;
                    } else {
                        System.out.println("Ingrese una edad valida");
                    }
                } else {
                    System.out.println("Ingrese un numero valido");
                    sc.nextLine();
                }
            }

            double height;
            while (true) {
                System.out.println("Ingrese su altura (en metros): ");
                if (sc.hasNextDouble()) {
                    height = sc.nextDouble();
                    sc.nextLine();
                    if (height >= 0 && height <= 3) {
                        break;
                    } else {
                        System.out.println("Ingrese una altura valida");
                    }
                } else {
                    System.out.println("Ingrese un numero valido");
                    sc.nextLine();
                }

            }

            double weight;
            while (true) {
                System.out.println("Ingrese su peso (en kg): ");
                if (sc.hasNextDouble()) {
                    weight = sc.nextDouble();
                    sc.nextLine();
                    if (weight >= 0 && weight <= 230) {
                        break;
                    } else {
                        System.out.println("Ingrese un peso valido");
                    }
                } else {
                    System.out.println("Ingrese un numero valido");
                    sc.nextLine();
                }
            }


            String plan;
            while (true) {
                System.out.println("Ingrese su plan (basico/plus/premium): ");
                plan = sc.nextLine().trim().toUpperCase();
                if (plan.equalsIgnoreCase("BASICO") || plan.equalsIgnoreCase("PLUS")
                        || plan.equalsIgnoreCase("PREMIUM")) {
                    break;
                } else {
                    System.out.println("Ingrese un plan correctamente");
                }

            }

            String response;
            do {
                System.out.println("Primera vez? (si/no): ");
                response = sc.nextLine().trim().toLowerCase();
                if (!response.equals("si") && !response.equals("no")) {
                    System.out.println("Respuesta invalida, escriba 'si' o 'no'");
                }
            } while (!response.equals("si") && !response.equals("no"));

            boolean firstTime = response.equals("si");


            // 1. base price
            double basePrice;

            switch (plan) {
                case "BASICO":
                    basePrice = 80.0;
                    break;
                case "PLUS":
                    basePrice = 120.0;
                    break;
                case "PREMIUM":
                    basePrice = 180.0;
                    break;
                default:
                    System.out.println("Plan invalido (basico/plus/premium)");
                    return;
            }

            // 2. discount

            double discount = 0;

            if (firstTime) {
                discount += 0.10;
            }
            if (age >= 16 && age <= 25) {
                discount += 0.10;
            }
            if (discount > 0.20) {
                discount = 0.20;
            }

            double priceFinal = basePrice - (basePrice * discount);

            // 3. minimum age
            if (age < 14) {
                System.out.println("No elegible");
            } else if (age < 18) {
                System.out.println("Requiere autorizacion de acudiente");
            }


            // 4. BMI Calculation

            double bmi = weight / (height * height);
            String bmiCategoty;


            if (bmi < 18.5) {
                bmiCategoty = "Bajo peso";
            } else if (bmi < 25) {
                bmiCategoty = "Normal";
            } else if (bmi < 30) {
                bmiCategoty = "Sobrepeso";
            } else {
                bmiCategoty = "obesidad";
            }

            // 5. Final Result

            System.out.println("Nombre: " + name);
            System.out.println("Plan elegido: " + plan);
            System.out.println("Precio base: " + basePrice);
            System.out.println("Descuento aplicado: " + (discount * 100) + "%");
            System.out.println("Precio final: " + priceFinal);
            System.out.println("Categoria BMI: " + bmiCategoty);


            System.out.println("\nPresione 'no' para salir o cualquier tecla para continuar: ");
            String continuar = sc.nextLine().trim().toLowerCase();
            if (continuar.equals("no")) {
                break;
            }
        }

        sc.close();
    }

}
