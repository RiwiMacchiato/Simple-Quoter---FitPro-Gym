package simple.quoter;
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
        
        //Inputs
        
        System.out.println("Ingrese su nombre: ");
        String name = sc.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int age = sc.nextInt();
        
        System.out.println("Ingrese su altura (en metros): ");
        double height = sc.nextDouble();
        
        System.out.println("Ingrese su peso (en kg): ");
        double weight = sc.nextDouble();
        
        System.out.println("Ingrese su plan (basico/plus/premium): ");
        String plan = sc.next();
        
        System.out.println("Primera vez? (true/false): ");
        boolean firstTime = sc.nextBoolean();
        
        sc.close();
        
        
        //1. base price
        double basePrice;
        
        switch (plan.toUpperCase().trim()){
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
        
        //2. discount
        
        double discount = 0;
        
        if (firstTime) {
            
            discount += 0.10;
            
        }
        
        if (age >= 16 && age <= 25){
        
            discount += 0.10;
        
        }
        
        if (discount > 0.20) {
        
            discount = 0.20;
        
        }
        
        double priceFinal = basePrice - (basePrice * discount);
        
        //3. minimum age
        
        if (age < 14) {
        
            System.out.println("No elegible");
        
        } else if (age < 18 ) {
        
            System.out.println("Requiere autorizacion de acudiente");
        
        }


        //4. Calcule 
        
        System.out.println(plan);
        System.out.println(basePrice);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(priceFinal);

    }
    
}
