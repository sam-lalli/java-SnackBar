package snackbar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Working");

        Customer c1 = new Customer("Jane", 45.25);   
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, "food");
        Snack cBar = new Snack("Chocolate Bar", 36, 1.00, "food");
        Snack pretzel = new Snack("Pretzel", 30, 2.00, "food");

        Snack soda = new Snack("Soda", 24, 2.50, "drink");
        Snack water = new Snack("Water", 20, 2.75, "drink");

        //Processing
        
        // Customer 1 (Jane) buys 3 of snack 4 (Soda).
        // Print Customer 1 (Jane) Cash on hand.
        // Print quantity of snack 4 (Soda).
        c1.buySnacks(2.50, 3);
        soda.buySnack(3);
        System.out.println(c1.getCashOnHand());
        System.out.println(soda.getQuantity());

        // Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
        // Print Customer 1 (Jane) Cash on hand.
        // Print quantity of snack 3 (Pretzel).
        c1.buySnacks(2.00, 1);
        pretzel.buySnack(1);
        System.out.println(c1.getCashOnHand());
        System.out.println(pretzel.getQuantity());

        // Customer 2 (Bob) buys 2 of snack 4 (Soda).
        // Print Customer 2 (Bob) Cash on Hand.
        // Print quantity of snack 4 (Soda).
        c2.buySnacks(2.50, 2);
        soda.buySnack(2);
        System.out.println(c2.getCashOnHand());
        System.out.println(soda.getQuantity());

        // Customer 1 (Jane) finds $10.
        // Print Customer 1 (Jane) Cash on Hand.
        c1.addCash(10.00);
        System.out.println(c1.getCashOnHand());

        // Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
        // Print Customer 1 (Jane) Cash on Hand.
        // Print quantity of snack 2 (Chocolate Bar).
        c1.buySnacks(1.00, 1);
        cBar.buySnack(1);
        System.out.println(c1.getCashOnHand());
        System.out.println(cBar.getQuantity());

        // Add 12 more items to snack 3 (Pretzel).
        // Print quantity of snack 3 (Pretzel).
        pretzel.addQuantity(12);
        System.out.println(pretzel.getQuantity());

        // Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
        // Print Customer 2 (Bob) Cash on hand.
        // Print quantity of snack 3 (Pretzel).
        c2.buySnacks(2.00, 3);
        pretzel.buySnack(3);
        System.out.println(c2.getCashOnHand());
        System.out.println(pretzel.getQuantity());


    }
}




// * [ ] Instantiate 5 snacks
//   * [ ] In Vending Machine Food
//     * [ ] 36 Chips at $1.75
//     * [ ] 36 Chocolate Bar at $1.00
//     * [ ] 30 Pretzel at $2.00
//   * [ ] In Vending Machine Drink
//     * [ ] 24 Soda at $2.50
//     * [ ] 20 Water at $2.75
