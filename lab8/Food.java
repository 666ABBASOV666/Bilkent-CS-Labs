public class Food {

    private String name;
    private int calories;
    private String ingredients  = "";
    private double price;
    private String type;
    private boolean equals;
    private boolean doesContain;
    

    public Food (String a, int b) {
        this.name = a;
        this.price = b;
    }

    public Food (String a, String b, int c, String d, int e) {
        this.name = a;
        this.ingredients = b;
        this.calories = c;
        this.type = d;
        this.price = e;
    }

    public String getName() {
        return name;
    }


    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients (String a) {
        this.ingredients = a;
    }

    public void addIngredients (String newIngredient) {
        ingredients = ingredients + "," + newIngredient;
    }

    public void addNewIngredients (String i) {
        ingredients = ingredients + ", " + i;
    }

    public boolean equals (Food food) {
        if (this.name == food.name && this.ingredients == food.ingredients) {
            equals = true;
        }
        else {
            equals = false;
        }

        return equals;
    }

    public boolean doesContain (String ingredient) { 
        
        if (this.ingredients.contains(ingredient)) {
            doesContain = true;
        }
        else {
            doesContain = false;
        }
        return doesContain;
    }

    public void setCalories (int a) {
        this.calories = a;
    }

    public void setType (String a) {
        this.type = a;
    }

    public double getPrice () {
        return price;
    }
 
    public String toString () {
        return this.name + " is a " + this.type + " dish." +
        "\n" + "It includes " + this.ingredients + " ." +
        "\n" + "Single portion contains " + this.calories + " calories." +
        "\n" + "Single serving cost = " + this.price +
        "\n";
    }


    
}
