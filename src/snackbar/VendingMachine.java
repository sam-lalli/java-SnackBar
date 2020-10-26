pacakge snackbar

public class VendingMachine{
    private static int maxId = 0;
    private int id;


    public VendingMachine() {
        maxId++;
        this.id = maxId;
    }

    //Getters 

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setters

    public void setName(String name){
        name = name;
    }
}