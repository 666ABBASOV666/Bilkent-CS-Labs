public class User {

    private static int count = 0;
    private int ID = 0;
    private String name;
    private int age;
    private String orders;
    private int numberOfOrders = 0;
    private String eatenFoods;
    private Food food;
    private String favoriteFood;
    private Order order;
    private int random;
    private boolean isRight;
    private boolean isFree = false;

    public User (String a, int b) {
        this.name = a;
        this.age = b;
        this.ID = count;
        addUser();
        eatenFoods = "";
        orders = "";
    }

    public void addUser() {
        count++;
    }

    public String getName () {
        return name;
    }

    public int getId() {
        return this.ID;
    }

    public boolean eatenFood (Food food) {
        if (this.eatenFoods.contains(food.getName())) {
            isRight = true;
        }
        else {
            isRight = false;
        }
        return isRight;
    }

    public void setFavoriteFood(Food food) {
        this.favoriteFood = food.getName();
    }

    public String FoodOrder (int a) { 
        int numOfFood = 0;

        for(int num = a; a > num;  num++) {
            if(orders.charAt(num) == '-') {
                numOfFood = numOfFood - num;
            }
        }
        return this.orders.substring(a - 1, numOfFood);
    }

    public void addNewOrder(Order order) {
        int max = 9;
        int min = 1;

        if(order.getName().equals(this.favoriteFood)) {
            random = (int) (Math.random() * (max - min)) + min;
            
            if(random < 5) {
              order.isFree(true);
            }
        }

        if(this.eatenFoods.contains(order.getName())) {
            if(eatenFoods == "") {
                eatenFoods = eatenFoods + order.getName();
            }
            
            else {
                eatenFoods = eatenFoods + "-" + order.getName();
            }
        }

        if(orders == "") {
            orders = orders + order.getID();
        }

        else {
            orders = orders + "-" + order.getID();
        }

        numberOfOrders++;

        System.out.println("Adding a new order of " + order.getName() + " to " + getName() + "...\n");
        System.out.println(order.getName() + " is " + getName() + "'s favorite food!");

        if(order.getIsFree() == true) {
            System.out.println("\n" + this.getName() + " won't be paying today.");
        }

        else {
            System.out.println("\n" + this.getName() + " lost the chance.\n");
        }
    }

    public String toString() {
        return "User ID: " + ID + ", User Name: " + name + ", Age: " + age; 
    }

    
}
