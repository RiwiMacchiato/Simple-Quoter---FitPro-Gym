import java.util.Scanner;

public class fitProGym {
    public static void main(String[] args) {
        System.out.println("Bienvenido a FitPro Gym");

        Scanner inputGym = new Scanner(System.in);

    System.out.print("Ingresa tu nombre: ");
    String name = inputGym.nextLine();

    System.out.print("Ingresa tu edad: ");
    int age = inputGym.nextInt();

    System.out.print("Ingresa tu altura en metros, ejemplo (1,75): ");
    double height = inputGym.nextDouble();

    System.out.print("Ingresa tu peso en kg, ejemplo (72,5): ");
    double weight = inputGym.nextDouble();

    inputGym.nextLine();
    
    System.out.print("¿Es tu primera vez en el gym? (si/no): ");
    String firstTime = inputGym.nextLine();
    
    System.out.print("Elige tu plan (BASICO, PLUS, PREMIUM): ");
    String plan = inputGym.nextLine().toUpperCase();

    // Reglas de negocio
    double basePrice = 0.0;
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
            System.out.println("Plan no valido");
    }

    // Edad minima
    if (age >= 1 && age < 14) {
        System.out.println("No elegible");
    } else if (age < 18) {
        System.out.println("Requiere autorizacion de acudiente");
    }else if (age < 1 || age > 80){
        System.out.println("Edad invalida");
    }

    // Descuentos
    double discount = 0.0;

    if (firstTime == "si") {
        discount += 0.10;
    }
    if (age >= 16 && age <= 25) {
        discount += 0.10;
    }

    double finalPrice = basePrice - (basePrice * discount);

    // Cálculo BMI
    double bmi = weight / (height * height);
    String categoryBMI;
    if (bmi < 18.5) {
        categoryBMI = "Bajo peso";
    } else if (bmi < 25) {
        categoryBMI = "Normal";
    } else if (bmi < 30) {
        categoryBMI = "Sobrepeso";
    } else {
        categoryBMI = "Obesidad";
    }

    // Resultado final
    System.out.println("\n--- Cotización FitPro Gym ---");
    System.out.println("Nombre: " + name);
    System.out.println("Plan elegido: " + plan);
    System.out.println("Precio base: $" + basePrice);
    System.out.println("Descuento aplicado: " + discount * 100 + "%");
    System.out.println("Precio final: $" + finalPrice);
    System.out.println("Categoría BMI: " + categoryBMI);

    inputGym.close();
    }
    
}
