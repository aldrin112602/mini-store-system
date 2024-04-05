import java.util.*;
public class Main {   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
        int bags = 10, shoes = 20, shirt = 20, jeans = 10, gloves = 5;  
        double cost[] = { 25.45, 67.64, 43.23, 24.12, 12.34 };
        System.out.println("Stocks:\t\t\t||Cost:");
        System.out.println("Bags - 10\t\t||PHP" + cost[0]);
        System.out.println("Shoes - 20\t\t||PHP" + cost[1]);
        System.out.println("Shirt - 20\t\t||PHP" + cost[2]);
        System.out.println("Jeans - 10\t\t||PHP" + cost[3]);
        System.out.println("Gloves - 5\t\t||PHP" + cost[4]);
        double subtotal = 0, total = 0;
        while(true) {
         System.out.println("What would you like to buy?");
         String buy = in.nextLine();
         while(true) {
         System.out.println("How many?"); 
            int quantity = in.nextInt();
            if(buy.equals("bag") || buy.equals("bags") || buy.equals("Bag") || buy.equals("Bags") || buy.equals("BAG") || buy.equals("BAGS")) {
               if(quantity > bags) {
                  System.out.println("Not enough stock. Try again");      
                } else {
                  subtotal = cost[0] * quantity; 
                   break;
                }
                 
            } else if(buy.equals("shoe") || buy.equals("shoes") || buy.equals("Shoe") || buy.equals("Shoes") || buy.equals("SHOE") || buy.equals("SHOES")) {
               if(quantity > shoes) {
                  System.out.println("Not enough stock. Try again");      
                } else {
                  subtotal = cost[1] * quantity; 
                   break;
                }
            } else if(buy.equals("shirt") || buy.equals("shirts") || buy.equals("Shirt") || buy.equals("Shirts") || buy.equals("SHIRT") || buy.equals("SHIRTS")) {
                if(quantity > shirt) {
                  System.out.println("Not enough stock. Try again");      
                } else {
                  subtotal = cost[2] * quantity; 
                   break;
                }
            } else if(buy.equals("jean") || buy.equals("jeans") || buy.equals("Jean") || buy.equals("Jeans") || buy.equals("JEAN") || buy.equals("JEANS")) {
                if(quantity > jeans) {
                  System.out.println("Not enough stock. Try again");      
                } else {
                  subtotal = cost[3] * quantity; 
                   break;
                }
            } else if(buy.equals("glove") || buy.equals("gloves") || buy.equals("Glove") || buy.equals("Gloves") || buy.equals("GLOVE") || buy.equals("GLOVES")) {
                if(quantity > gloves) {
                  System.out.println("Not enough stock. Try again");      
                } else {
                  subtotal = cost[4] * quantity; 
                   break;
                }
            }
           }
            total += subtotal;
            System.out.println("Subtotal: PHP" + subtotal);
            System.out.println("Would you like to buy again? (Y/N):");
            in.nextLine();
            String op = in.nextLine();
            if(op.equals("N") || op.equals("n")) {
                break;
            }
            
            
            
        }
        System.out.println("The total is: PHP" + total);
        System.out.print("Input payment: PHP");
        int payment = in.nextInt();
        System.out.println("Your change is: " + (payment - total));
        in.nextLine();
        System.out.println("Would you like to make another transaction? (Y/N): ");
        String op = in.nextLine();
            if(op.equals("N") || op.equals("n")) {
                System.out.println("Thank you come again!");
                break;
            }
    }
        in.close();
    
  }
}
