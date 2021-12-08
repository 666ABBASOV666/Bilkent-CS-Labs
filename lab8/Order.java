public class Order {

    private static int count = 0;
    private int ID;
    private double portion;
    private double totalPrice;
    private String orderedFood;
    private double price;
    private Food food;
    private User user;
    private double singlePrice;
    private String name;
    private double checkout;
    private boolean isCheckOut = false;
    private boolean isRight;
    private boolean isFree; 

    public Order (int portion, Food food) {

        this.portion = portion;
        this.name = food.getName();
        this.ID = count;
        this.food = food;
        count++;
    }

    public Order (int portion, String name, int price) { 
        this.portion = portion;
        this.name = name;
        this.singlePrice = price;
        this.ID = count;
        count++;
    }


    public void portion (double a) {
        this.portion = a;
    }

    public void increasePortion (double a) {
        portion = portion + a;
    }

    public Double checkout() {
        if (food == null) {
            totalPrice = portion * price;
            isCheckOut = true;
            return totalPrice;
             
        }
        else {
            totalPrice = portion * food.getPrice();
            isCheckOut = true;
            return totalPrice;
            
        }
    }

    public int getID() {
        return ID;
    }

    public double getPortion() {
        return portion;
    }

    public String getName() {
        return name;
    }

    public void isFree (boolean a) {
        this.isFree = a;
    }

    public boolean getIsFree () {
        return this.isFree;
    }

    public String toString() {

        if (isCheckOut == false) {
            return ">> Warning: This order is incomplete." 
            + "\n" + "Details for order " + ID + ": "
            + "\n" + name + " (x " + portion + ")"
            + "\n" + "TOTAL = " + totalPrice
            + "\n" + "\n";
        }
        else {
            return "\n" + "Details for order " + ID + ": "
            + "\n" + name + " (x " + portion + ")"
            + "\n" + "TOTAL = " + totalPrice
            + "\n" + "\n";
        }   
    }
}
