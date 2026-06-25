import java.util.ArrayList;

public class Recipes {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    // constructor
    public Recipes(String recipeName, int time){
        this.name = recipeName;
        this.cookingTime = time;
        this.ingredients = new ArrayList<>();
    }


    public void addIngridient(ArrayList<String> array) {
        for (String item: array){
            this.ingredients.add(item);
        }
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public String getRecipeName() {
        return this.name;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }


    public String toString() {
        String message = "";
        // for (String item: this.ingredients) {
        //     message += item + ", ";
        // }
        // return "RecipeName: " + this.name + "\nCooking Time : " + this.cookingTime + "\nRecipeIngredients: " + message;
        return this.name + ", cooking time: "  + this.cookingTime;
    }

    
}

