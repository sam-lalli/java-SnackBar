package snackbar;

public class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    //Getters and Setters

    //Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCashOnHand(){
        return cashOnHand;
    }

    //Setters

    public void setName(String name){
        this.name = name;
    }

    public void addCash(double cashOnHand, double cash){
        this.cashOnHand = cashOnHand + cash
    }

    public void buySnacks(double cost, double cashOnHand) {
        this.cashOnHand = cashOnHand - cost
    }

}