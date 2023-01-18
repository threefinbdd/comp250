/**
 * FlowerShop.java
 * 
 * The following code is a break down to demonstrate
 * how to utilize Files as Input and Output.
 * 
 * The Flowers.txt is a tabular entry of the FlowerShop's
 * inventory.  The inventory is organized in the format:
 * FlowerType Cost_SingleFlower Cost_BouquetOfFlowers
 * 
 * Your task will be to create a Java program to sell 
 * flowers based on the Flowers.txt types and prices.
 * 
 * If a customer wants to purchase a count of flowers
 * that exceeds the cost of a bouquet, your program should
 * ask if they would prefer the bouquet purchase.
 * 
 * For example:
 * Roses are individually $1.50 whereas a bouquet is $10.
 * If a customer tries to purchase 7 individual Roses, 
 * which add up to $10.50, the program should ask if the
 * customer would prefer a Bouquet to save $0.50.
 *
 * If a customer tries to purchase 14 individual roses, 
 * the program should ask if the customer would prefer
 * two (2) Bouquets.
 * 
 * You are welcome to use any data structure to store
 * the read in data.
 *
 * For instance, you may use an n-dimensional Array to represent 
 * the entire FlowerShop's Inventory.
 * - Index@[0] would be the String representation of the FlowerType
 * - Index@[1] would be the Double representation of the Cost_SingleFlower
 * - Index@[2] would be the Double representation of the Cost_BouquetOfFlowers
 *
 * To extrapolate the above, 
 * [0][1] would be a Rose's Individual Cost.
 * [2][2] would be a Hydrangea's Cost_BouquetOfFlowers
 */

 class FlowerShop{

    public public static void main(String[] args) {
        // 1.  Read in Text File

        // 2.  Store Information of Text File

        // 3.  Print Inventory Menu to User
        System.out.println("Thank you for visiting the Flower Shop!");
        System.out.println("A list of our current blooming flowers are:  ");

        // 4.  Begin Loop for Receipt generation

            // 5.  Prompt User what flower they would like to purchase

            // 6.  Prompt User quantity of flower

            // 7.  Conditional:  Suggest a Bouquet based on Quantity * Individual Cost

            // 8.  Write the below format to Receipt Output File:
            //     "[FlowerType] [Individual or Bouquet] x[Quantity] [TotalCost]"

            // 9.  Prompt User if they would like to purchase another flower        
            //      -if Yes, loop back to 4)

        // 10. Save and Close Written Receipt Output File

        // 11. Exit program
        System.out.println("Have a nice day, see you again next time!");
    }

 }