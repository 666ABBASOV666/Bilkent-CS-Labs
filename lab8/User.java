public class User {

    private static int count = 0;
    private int ID = 0;
    private String name;
    private int age;
    private Order orders;
    private int numberOfOrders = 0;
    private String eatenFoods;
    private boolean equals;
    private Food favoriteFood;

    public User (String a, int b) {
        this.name = a;
        this.age = b;
        this.ID = count;
        count++;
    }

    public void addUser() {
        count++;
        ID++;
    }

    public void setFavoriteFood (Food food) {
        this.favoriteFood = food;
    }   

    public String toString() {
        return "User ID: " + ID + ", User Name: " + name + ", Age: " + age; 
    }

    public void addNewOrder (Order order) {
        this.orders = order;
    }

    
}
