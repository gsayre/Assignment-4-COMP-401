package a4jedi;

public class SeaweedPortion extends IngredientPortionImpl{

private double amount;
	
	public SeaweedPortion(double amount) {
		super(new Seaweed(), amount);
		
		if (amount < 0) {
			throw new RuntimeException("Amount parameter is negative!");
		}
		this.amount = amount;
	}

	@Override
	public IngredientPortion combine(IngredientPortion other) {
		if (other == null) {
			return this;
		}
		if (other.getIngredient().equals(this.getIngredient())) {
			return new SeaweedPortion(this.getAmount() + other.getAmount());
		}
		if (!other.getIngredient().equals(this.getIngredient())) {
			throw new RuntimeException("Not the same Ingredient!");
		}
		return null;
	}

}
