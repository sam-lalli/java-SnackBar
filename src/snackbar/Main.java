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