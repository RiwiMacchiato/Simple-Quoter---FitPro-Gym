package Day2;

import java.util.Scanner;

public class Actividad1 {

    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre = "";
        while (nombre.isEmpty()) {
            System.out.print("Ingrese su nombre: ");
            nombre = sc.nextLine().trim();
            if (nombre.isEmpty()) {
                System.out.println("Nombre no puede estar vacío.");
            }
        }

        int edad = 0;
        while (true) {
            System.out.print("Ingrese su edad: ");
            if (sc.hasNextInt()) {
                edad = sc.nextInt();
                if (edad > 0){
                    if(edad < 14){
                        System.out.println("No elegible.");
                        return;
                    } else {
                        break;
                    }
                } else System.out.println("Edad debe ser positiva.");
            } else {
                System.out.println("Edad inválida. Intente de nuevo.");
                sc.next();
            }
        }

        double altura = 0.0;
        while (true) {
            System.out.print("Ingrese su altura en metros: ");
            if (sc.hasNextDouble()) {
                altura = sc.nextDouble();
                if (altura > 0.5 && altura < 3.0) break;
                else System.out.println("Altura fuera de rango (0.5-3.0m).");
            } else {
                System.out.println("Altura inválida. Intente de nuevo.");
                sc.next();
            }
        }

        double peso = 0.0;
        while (true) {
            System.out.print("Ingrese su peso en kg: ");
            if (sc.hasNextDouble()) {
                peso = sc.nextDouble();
                if (peso > 20 && peso < 400) break;
                else System.out.println("Peso fuera de rango (20-400kg).");
            } else {
                System.out.println("Peso inválido. Intente de nuevo.");
                sc.next();
            }
        }

        sc.nextLine(); // limpiar buffer
        String plan = "";
        while (true) {
            System.out.print("Ingrese el plan (BASICO, PLUS, PREMIUM): ");
            plan = sc.nextLine().trim().toUpperCase();
            if (plan.equals("BASICO") || plan.equals("PLUS") || plan.equals("PREMIUM")) break;
            else System.out.println("Plan inválido. Escriba BASICO, PLUS o PREMIUM.");
        }

        Boolean primeraVez = null;
        while (primeraVez == null) {
            System.out.print("¿Es su primera vez? (true/false): ");
            String input = sc.nextLine().trim().toLowerCase();
            if (input.equals("true")) primeraVez = true;
            else if (input.equals("false")) primeraVez = false;
            else System.out.println("Respuesta inválida. Escriba true o false.");
        }

        // Reglas de elegibilidad
        if (edad < 18) {
            System.out.println("Requiere autorización de acudiente.");
        }

        // Precio base
        double precioBase = 0.0;
        switch (plan) {
            case "BASICO": precioBase = 80.0; break;
            case "PLUS": precioBase = 120.0; break;
            case "PREMIUM": precioBase = 180.0; break;
        }

        // Descuentos
        double descuento = 0.0;
        if (primeraVez) descuento += 0.10;
        if (edad >= 16 && edad <= 25) descuento += 0.10;
        if (descuento > 0.20) descuento = 0.20;

        double precioFinal = precioBase * (1 - descuento);

        // BMI
        double bmi = peso / (altura * altura);
        String categoriaBMI = "";
        if (bmi < 18.5) categoriaBMI = "Bajo peso";
        else if (bmi < 25) categoriaBMI = "Normal";
        else if (bmi < 30) categoriaBMI = "Sobrepeso";
        else categoriaBMI = "Obesidad";

        // Resultado final
        System.out.println("\n--- Cotización FitPro Gym ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Plan elegido: " + plan);
        System.out.printf("Precio base: $%.2f\n", precioBase);
        System.out.printf("Descuento aplicado: %.0f%%\n", descuento * 100);
        System.out.printf("Precio final: $%.2f\n", precioFinal);
        System.out.println("Categoría BMI: " + categoriaBMI);
        
    }
}
