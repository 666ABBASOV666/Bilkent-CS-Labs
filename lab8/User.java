public class User {

    private static int count = 0;
    private int ID = 0;
    private String name;
    private int age;
    private String orders;
    private int numberOfOrders = 0;
    private String eatenFoods;
    private boolean equals;

    public User (String a, int b) {
        this.name = a;
        this.age = b;
    }

    public void addUser() {
        count++;
        ID++;
    }

    
}
