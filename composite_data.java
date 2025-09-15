import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class composite_data {
    public static void main(String[] args) {
        /*
         * // Ejercicios de Arrays
         * // 1
         * int[] numbers = {10,20,30,40,50};
         * 
         * // 2
         * for (int number : numbers){
         * System.out.println((number * 2));
         * }
         * 
         * // 3
         * Scanner input = new Scanner(System.in);
         * int [] inputNumbers = new int [6];
         * for (int inputNumber = 0; inputNumber < inputNumbers.length; inputNumber++){
         * System.out.print("Ingresa el numero " + (inputNumber + 1)+ ": ");
         * inputNumbers[inputNumber] = input.nextInt();
         * }
         * 
         * System.out.println("\nLos numeros ingresados fueron: ");
         * for (int number : inputNumbers) {
         * System.out.println(number);
         * }
         * input.close();

         // Ejercicios de ArraysList

         ArrayList<String> friends = new ArrayList<>();
         friends.add("Diego");
         friends.add("Carolina");
         friends.add("Esteban");
         friends.add("David");

         for (int i = 0; i < friends.size(); i ++ ){
            System.out.println("Hola! "+ friends.get(i));
         }

         // Ejercicios de HashMap
         HashMap<Integer, String> students = new HashMap<>();
         students.put(1, "Isabella");
         students.put(2, "Adrian");
         students.put(3, "Alesis");
         students.put(4, "Carolina");
         students.put(5, "Maria");

         for (var entry : students.entrySet()) {
             System.out.println("Documento: " + entry.getKey() + " → Nombre: " + entry.getValue());
         }

        // Bucles
        // 1
        Scanner inputFactorial = new Scanner(System.in);
        System.out.print("Ingresa un numero para calcular su factorial: ");
        int factorial = inputFactorial.nextInt();
        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            System.out.println("Multiplicando " + result + " * " + i + " = " + (result * i));
            result = result * i;
        }
        System.out.println("El factorial de " + factorial + " es: " + result);

        // 2
        Scanner inputAdivinar = new Scanner(System.in);
        
        Random random = new Random();
        System.out.println("Intenta adivinar un numero un numero entre 1 y 100, tienes 10 intentos para adivinar ");
        int numeroSecreto =  10;//random.nextInt(100) + 1;
        boolean adivinado = false;
        for (int i = 0; i < 10; i++){
            System.out.print("Ingresa un numero: ");
            int numeroUsuario = inputAdivinar.nextInt();

            if (numeroUsuario == numeroSecreto) {
                adivinado = true;
                System.out.println("¡Felicidades! Adivinaste el numero en " + (i+1) + " intentos.");
                break;
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El numero secreto es MAYOR. Te quedan " + (9 - i) + " intentos.");
            } else {
                System.out.println("El numero secreto es MENOR. Te quedan " + (9 - i) + " intentos.");
            }
            
        }
        if (!adivinado) {
            System.out.println("\n Se acabaron los intentos. El número era: " + numeroSecreto);
        }

        //3
        Scanner input0 = new Scanner(System.in);
        boolean flag = false;
        int sum = 0;
        int quantity = 0;
        do {
            System.out.print("Ingresa un numero, para detener ingresa 0:  ");
            int numUser = input0.nextInt();

            if (numUser == 0) {
            System.out.println("\nTe has detenido..");
                flag = true;
            }else{
                sum += numUser;
                quantity++;
                
            }


        } while (!flag);
        if (quantity > 0) {
        double media = (double) sum / quantity;
        System.out.println("Suma total: " + sum);
        System.out.println("Media: " + media);
    };


    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa la cantidad de numeros que vas a ingresar: ");
    int numbersQuantity = input.nextInt();
    int [] inputNumbers = new int [numbersQuantity];
    for (int inputNumber = 0; inputNumber < inputNumbers.length; inputNumber++){
         System.out.print("Ingresa el numero " + (inputNumber + 1)+ ": ");
         inputNumbers[inputNumber] = input.nextInt();
         }
    
    int greater = 0;
    int minor = 0;
    int equal = 0;
    System.out.println("\nLos numeros ingresados fueron: ");
    for (int number : inputNumbers) {
        if (number > 0) {
            greater++;
        } else if (number < 0) {
            minor++;
        } else {
            equal++;
        }
    }
    System.out.println("\nLa cantidad de numeros mayores a 0 es: "+ greater);
    System.out.println("La cantidad de numeros menores a 0 es: " + minor);
    System.out.println("La cantidad de numeros iguales a 0 es: " + equal);
      
//5
Scanner inputVocal = new Scanner(System.in);

char[] vocales = { 'a', 'e', 'i', 'o', 'u'};

char caracter;

System.out.println("Ingresa caracteres (espacio para salir):");

do {
    System.out.print("Caracter: ");
    caracter = Character.toLowerCase(inputVocal.nextLine().charAt(0));

    if (caracter == ' ') {
        System.out.println("Programa terminado");
        break;
        
    }

    if (caracter != ' ') {
        boolean vocal = false;

        // recorrer array de vocales
        for (char v : vocales) {
            if (caracter == v) {
                vocal = true;
                break;
            }
        }

        if (vocal) {
            System.out.println("VOCAL");
        } else {
            System.out.println("NO VOCAL");
        }
    }

    } while (caracter != ' ');
    Scanner inputPares = new Scanner(System.in);

    // 6
    System.out.print("Ingresa el primer numero: ");
    int inicio = inputPares.nextInt();

    System.out.print("Ingresa el segundo numero: ");
    int fin = inputPares.nextInt();

    System.out.println("\nNumeros pares entre " + inicio + " y " + fin + ":");

    for (int i = inicio; i <= fin; i++) {
        if (i % 2 == 0) { 
            System.out.println(i);
        }
    }

    // 7
    Scanner inputTabla = new Scanner(System.in);

    System.out.print("Tabla de multiplicar - Ingresa un numero: ");
    int numero = inputTabla.nextInt();

    System.out.println("\nTabla de multiplicar del " + numero + ":");
    for (int i = 1; i <= 10; i++) {
        System.out.println(numero + " * " + i + " = " + (numero * i));
    }
        
// 8

        Scanner input = new Scanner(System.in);

        int limiteInferior;
        int limiteSuperior;

        do {
            System.out.print("Ingresa el limite inferior: ");
            limiteInferior = input.nextInt();

            System.out.print("Ingresa el limite superior: ");
            limiteSuperior = input.nextInt();

            if (limiteInferior >= limiteSuperior) {
                System.out.println("El limite inferior debe ser menor que el superior. Intentalo de nuevo.\n");
            }
        } while (limiteInferior >= limiteSuperior);

        int numero;
        int sumaDentro = 0;
        int fueraIntervalo = 0;
        boolean igual = false;

        do {
            System.out.print("Ingresa un numero o 0 para salir: ");
            numero = input.nextInt();

            if (numero != 0) {
                if (numero > limiteInferior && numero < limiteSuperior) {
                    sumaDentro += numero;
                } else {
                    fueraIntervalo++;
                }

                if (numero == limiteInferior || numero == limiteSuperior) {
                    igual = true;
                }
            }

        } while (numero != 0);

        // Resultados
        System.out.println("\nResultados:");
        System.out.println("Suma de numeros dentro del intervalo: " + sumaDentro);
        System.out.println("Cantidad de numeros fuera del intervalo: " + fueraIntervalo);

        if (igual) {
            System.out.println("Se introdujo al menos un numero igual a los limites del intervalo.");
        } else {
            System.out.println("No se introdujo ningún numero igual a los limites.");
        }

    // 9
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa la base (real): ");
        double base = input.nextDouble();

        System.out.print("Ingresa el exponente (entero positivo): ");
        int exponente = input.nextInt();

        if (exponente <= 0) {
            System.out.println("El exponente debe ser un numero entero positivo.");
        } else {
            double resultado = 1;

            for (int i = 1; i <= exponente; i++) {
                resultado *= base;
            }

            System.out.println("\n Resultado: " + base + " ^" + exponente + " = " + resultado);
        }
            */

        // 10
        // Tablas del 1 al 5
        for (int num = 1; num <= 5; num++) {
            System.out.println("\nTabla del " + num + ":");

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }

    }
}
