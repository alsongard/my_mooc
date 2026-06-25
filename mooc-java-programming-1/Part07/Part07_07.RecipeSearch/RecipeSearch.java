
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File to read:");
        String fileName = scan.nextLine();

        ArrayList<Recipes> allRecipes = readRecipesFromFile(fileName);


        while(true) {
            System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient");
            
            System.out.println();
            System.out.println("Enter command:");
            String command = scan.nextLine();

            if (command.equals("stop")) {
                return;
            } else if (command.equals("list")){
                System.out.println("Recipes:");
                for (Recipes item: allRecipes) {
                    System.out.println(item);
                }
                System.out.println();
            } else if (command.startsWith("find name")) {
                System.out.println("Searched word: ");
                String searchedWorld  = scan.nextLine();
                System.out.println();
                System.out.println("Recipes:");
                for (Recipes item: allRecipes) {
                    if (item.getRecipeName().toLowerCase().contains(searchedWorld.toLowerCase())){
                        System.out.println(item);
                    }
                }
                System.out.println();
                
            } else if (command.startsWith("find cooking")) {
                System.out.println("Max coooking time:");
                int cookingTime = Integer.valueOf(scan.nextLine());
                System.out.println();
                System.out.println("Recipes: ");
                for (Recipes item: allRecipes) {
                    if (item.getCookingTime() <= cookingTime){
                        System.out.println(item);
                    }
                }
                System.out.println();
            } else if (command.startsWith("find ingredient")) {
                System.out.println("Ingredient: ");
                String searchIngredient = scan.nextLine();

                System.out.println();
                System.out.println("Recipes: ");
                for (Recipes item: allRecipes) {
                    for (String itemIngredient: item.getIngredients()) {
                        // System.out.println("itemIngredient: " + itemIngredient);
                        if (itemIngredient.equals(searchIngredient)) {
                            // System.out.println("Match: " + itemIngredient + " & " + searchIngredient);
                            System.out.println(item);
                        }
                    }
                    // if(item.getIngredients().contains(ingredient)){
                    //     System.out.println(item);
                    // }
                }
                System.out.println();
            }

        }
    }


    public static ArrayList<Recipes> readRecipesFromFile(String file) {

        ArrayList<Recipes> allRecipes = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()){
                String recipeName = scanner.nextLine();
                int recipeTime = Integer.valueOf(scanner.nextLine());
                ArrayList<String> recipeIngredients = new ArrayList<>();
                
                while(scanner.hasNextLine()) {
                    String currentIngredient = scanner.nextLine();
                    if (currentIngredient.isEmpty()) {
                        break;
                    }
                    recipeIngredients.add(currentIngredient);
                }

                Recipes newRec = new Recipes(recipeName, recipeTime);
                newRec.addIngridient(recipeIngredients);
                allRecipes.add(newRec);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());

        }

        return allRecipes;
    }
    

}

