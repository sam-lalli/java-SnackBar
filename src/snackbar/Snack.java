package snackbar;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private String vendingMachineId;

    public Snack(String name, int quantity, double cost, String vendingMachineId) {
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

    public String getVendingMachineId() {
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

    public void setVendingMachineId(String vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    public void addQuantity(int num) {
        this.quantity = this.quantity + num;
    }

    public void buySnack(int num) {
        this.quantity = this.quantity - num;
    }


    //     @Override
    // public String toString() {
    //     String rtnStr = "id: " + id + "\n" +
    //     "fname: " + fname + "\n" +
    //     "lname: " + lname + "\n" +
    //     "salary: " + salary + "\n" +
    //     "has401k: " + has401k + "\n" +
    //     "companyId: " + companyId + "\n" +
    //     "healthPlanId: " + healthPlanId;
    //     return rtnStr;
    // }
}