public class Order {

    private int count = 0;
    private int ID = 0;
    private int portion;
    private double totalPrice = 0;
    private Food food;

    public Order (int portion, String name, Double price) {

        this.portion = portion;
        


    }

    public void orderedFood () {
        food.getName();
    }

    public void portion (double a) {
        this.portion = a;
    }

    
}
