package Day2;

import java.util.Scanner;

public class condicionales {

    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);

        // Actividad 5: If - Else
        System.out.print("Ingresa un número entero: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Es positivo");
        } else if (num < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }

        // Actividad 6: If - Else If
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        if (edad < 12) {
            System.out.println("Niño");
        } else if (edad < 18) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }

        // Actividad 7: Switch
        System.out.print("Ingresa un número del 1 al 7: ");
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número fuera de rango");
        }
        sc.close();
    }
}
