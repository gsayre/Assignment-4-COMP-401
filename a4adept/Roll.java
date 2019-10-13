package a4adept;

public class Roll implements Sushi{
	
	private String name;
	private IngredientPortion[] roll_ingredients;

	public Roll(String name, IngredientPortion[] roll_ingredients) {
		this.name = name;	
		this.roll_ingredients = roll_ingredients.clone();
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public IngredientPortion[] getIngredients() {
		return roll_ingredients.clone();
	}

	@Override
	public int getCalories() {
		int calories = 0;
		for (int i = 0 ; i < roll_ingredients.length; i++) {
			calories += roll_ingredients[i].getCalories();
		}
		return (int) (calories + 0.5);
	}

	@Override
	public double getCost() {
		double cost = 0;
		for (int i = 0 ; i < roll_ingredients.length; i++) {
			cost += roll_ingredients[i].getCost();
		}
		return  ((int) ((cost * 100.0) +0.5)) / 100.0;
	}

	@Override
	public boolean getHasRice() {
		boolean hasRice = false;
		for (int i = 0 ; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i].getIsRice() == true) {
				hasRice = true;
				return hasRice;
			}
		}
		return hasRice;
	}

	@Override
	public boolean getHasShellfish() {
		boolean hasShellfish = false;
		for (int i = 0 ; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i].getIsShellfish() == true) {
				hasShellfish = true;
				return hasShellfish;
			}
		}
		return hasShellfish;
	}

	@Override
	public boolean getIsVegetarian() {
		boolean isVegetarian = true;
		for (int i = 0 ; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i].getIsVegetarian() == false) {
				isVegetarian = false;
				return isVegetarian;
			}
		}
		return isVegetarian;
	}

}
