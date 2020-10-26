package snackbar;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }


    //Getters and Setters

    //Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return cost * quantity;
    }

    // Setters 

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    public void setQuantity(int quantity, int num) {
        this.quantity = quantity + num;
    }

    public void buySnack(Snack, int num) {
        this.Snack = Snack.quantity - num;
    }
}