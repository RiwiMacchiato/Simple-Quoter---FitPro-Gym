import java.util.Scanner;

public class fundaments {
    public static void main(String[] args) {
        /* 
    // Hola Mundo
        System.out.println("Hello World!");
        int numInt = 10;
        System.out.println(numInt);
        
    // Actividad 1: Declarar variables
       
        String name = "Adrian";
        int age = 20;
        double height = 1.65;
        boolean studiant = true;
        char initial = 'A';
       
        System.out.println("Hola, mi nombre es "+name);
        System.out.println("Tengo "+age+" años");
        System.out.println("Mido "+height+" metros");
        System.out.println("¿Soy estudiante?: "+studiant);
        System.out.println("Mi inicial es "+initial);
       
    // Actividad 2: Operaciones basicas
       
        int a = 22;
        int b = 5;
        
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        double division = (double)  a / b;
        int modulo = a % b;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Modulo: " + modulo);


    //Actividad 3: Obtener edad

        System.out.print("Ingresa tu edad: ");
        Scanner input = new Scanner(System.in);
        String ageInput = input.nextLine();
        if (Integer.parseInt(ageInput) >= 18) {
            System.out.println("Eres mayor de edad: " + true);
        }else{
            System.out.println("Eres mayor de edad: " + false);
        }
        input.close();

    //Actividad 4: Comparar numeros
        System.out.print("Ingresa un numero: ");
        Scanner input1 = new Scanner(System.in);
        String num1 = input1.nextLine();
        int intnum1 = Integer.parseInt(num1);

        System.out.print("Ingresa otro numero: ");
        Scanner input2 = new Scanner(System.in);
        String num2 = input2.nextLine();
        int intnum2 = Integer.parseInt(num2);
        input1.close();
        input2.close();

        if (intnum1 > 0 && intnum2 > 0) {
            System.out.println("Ambos numeros son positivos: " + true);
        }
        if (intnum1 > 100 || intnum2 > 100) {
            System.out.println("Al menos uno de los numeros es mayor a 100: " + true);
        }
        if (intnum1 != intnum2) {
                System.out.println("Los numeros son diferentes: " + true);
        }

   
    //Actividad 5: Numero positivo, negativo o cero
       Scanner input3 = new Scanner(System.in);
       System.out.print("Ingresa un numero: ");
       String num3 = input3.nextLine();
       int intnum3 = Integer.parseInt(num3);
       input3.close();

       if (intnum3 > 0) {
           System.out.println("El numero: " + intnum3 + " es positivo");
       }else if (intnum3 < 0) {
           System.out.println("El numero: " + intnum3 + " es negativo");
       }else{
           System.out.println("El numero es 0");
       }
    
    // Actividad 6: Clasificar por edad
    Scanner input4 = new Scanner(System.in);
    System.out.print("Ingresa tu edad: ");
    String ageInput2 = input4.nextLine();
    int age2 = Integer.parseInt(ageInput2);
    input4.close();

    if (age2 >= 0 && age2 < 12) {
        System.out.println("Eres un niño");

    } else if (age2 >= 12 && age2 <= 17) {
        System.out.println("Eres un adolescente");

    } else if (age2 >= 18 && age2 <= 80) {
        System.out.println("Eres un adulto");
        
    } else {
        System.out.println("Edad no valida");
    }
*/

    // Actividad 7: dia de la semana con switch
    Scanner input5 = new Scanner(System.in);
    System.out.print("Ingresa un numero del 1 al 7: ");
    String dayInput = input5.nextLine();
    int day = Integer.parseInt(dayInput);
    input5.close();

    switch (day) {
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miercoles");
            break;
         case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
            System.out.println("Sabado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default:
            System.out.println("Numero no valido");
        }
    }
}

