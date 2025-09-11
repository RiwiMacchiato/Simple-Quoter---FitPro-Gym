import java.util.Scanner;

/**
 *
 * @author javaspringboot
 */
public class SimpleQuoter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n====================================");
            System.out.println("          COTIZADOR FITPRO");
            System.out.println("====================================\n");

            // Inputs
            String name;
            while (true) {
                System.out.print("Ingrese su nombre: ");
                name = sc.nextLine().trim();
                if (name.length() > 1) {
                    break;
                } else {
                    System.out.println("\nIngrese un nombre valido\n");
                }
            }

            int age;
            while (true) {
                System.out.print("Ingrese edad: ");
                if (sc.hasNextInt()) {
                    age = sc.nextInt();
                    sc.nextLine();
                    if (age >= 0 && age <= 120) {
                        break;
                    } else {
                        System.out.println("\nIngrese una edad valida\n");
                    }
                } else {
                    System.out.println("\nIngrese un numero valido\n");
                    sc.nextLine();
                }
            }

            double height;
            while (true) {
                System.out.print("Ingrese su altura (en metros): ");
                if (sc.hasNextDouble()) {
                    height = sc.nextDouble();
                    sc.nextLine();
                    if (height >= 0 && height <= 3) {
                        break;
                    } else {
                        System.out.println("\nIngrese una altura valida\n");
                    }
                } else {
                    System.out.println("\nIngrese un numero valido\n");
                    sc.nextLine();
                }
            }

            double weight;
            while (true) {
                System.out.print("Ingrese su peso (en kg): ");
                if (sc.hasNextDouble()) {
                    weight = sc.nextDouble();
                    sc.nextLine();
                    if (weight >= 0 && weight <= 230) {
                        break;
                    } else {
                        System.out.println("\nIngrese un peso valido\n");
                    }
                } else {
                    System.out.println("\nIngrese un numero valido\n");
                    sc.nextLine();
                }
            }

            String plan;
            while (true) {
                System.out.print("Ingrese su plan (BASICO / PLUS / PREMIUM): ");
                plan = sc.nextLine().trim().toUpperCase();
                if (plan.equals("BASICO") || plan.equals("PLUS") || plan.equals("PREMIUM")) {
                    break;
                } else {
                    System.out.println("\nIngrese un plan valido\n");
                }
            }

            String response;
            do {
                System.out.print("Es su primera vez? (si/no): ");
                response = sc.nextLine().trim().toLowerCase();
                if (!response.equals("si") && !response.equals("no")) {
                    System.out.println("\nRespuesta invalida, escriba 'si' o 'no'\n");
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
                    System.out.println("\nPlan invalido\n");
                    return;
            }

            // 2. discount
            double discount = 0;
            if (firstTime)
                discount += 0.10;
            if (age >= 16 && age <= 25)
                discount += 0.10;
            if (discount > 0.20)
                discount = 0.20;

            double priceFinal = basePrice - (basePrice * discount);

            // 3. minimum age
            if (age < 14) {
                System.out.println("\nNo elegible para la membresia.\n");
            } else if (age < 18) {
                System.out.println("\nRequiere autorizacion de acudiente.\n");
            }

            // 4. BMI Calculation
            double bmi = weight / (height * height);
            String bmiCategory;

            if (bmi < 18.5) {
                bmiCategory = "Bajo peso";
            } else if (bmi < 25) {
                bmiCategory = "Normal";
            } else if (bmi < 30) {
                bmiCategory = "Sobrepeso";
            } else {
                bmiCategory = "Obesidad";
            }

            // 5. Final Result
            System.out.println("\n=======         RESULTADO         =======");
            System.out.println("Nombre: " + name);
            System.out.println("Plan elegido: " + plan);
            System.out.println("Precio base: $" + basePrice);
            System.out.println("Descuento aplicado: " + (discount * 100) + "%");
            System.out.println("Precio final: $" + priceFinal);
            System.out.println("Categoria BMI: " + bmiCategory);
            System.out.println("==========================================\n");

            String continuee;
            do {
                System.out.println("Desea volver a ejecutarlo? (si/no): ");
                continuee = sc.nextLine();
                if (!continuee.equals("si") && !continuee.equals("no")) {
                    System.out.println("\nRespuesta invalida. escruba 'si' o 'no'\n");
                }
            } while (!continuee.equals("si") && !continuee.equals("no"));

            if (continuee.equals("no")) {
                System.out.println("Hasta pronto!\n");
                break;
            }
        }

        sc.close();
    }
}
