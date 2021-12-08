public class Order {

    private static int count = 0;
    private int ID;
    private double portion;
    private double totalPrice;
    private double price;
    private Food food;
    private double perPrice;
    private String name;


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
        this.perPrice = price;
        this.ID = count;
        count++;
    }


    public void portion (double a) {
        this.portion = a;
    }

    public void increasePortion (double a) {
        portion = portion + a;
    }

    public double checkout() {
        if (food == null) {
            totalPrice = portion * price;
            return totalPrice; 
        }
        else {
            totalPrice = portion * food.getPrice();
            return totalPrice;
        }
    }

    public int getID() {
        return ID;
    }

    public double getPortion() {
        return portion;
    }

    public String toString(){
        return "\n" + "Details for order " + ID + ": "
        + "\n" + name + " (x " + portion + ")"
        + "\n" + "TOTAL = " + totalPrice
        + "\n";
    }
}
