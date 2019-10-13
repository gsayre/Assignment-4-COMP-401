package a4adept;

import a4adept.Sashimi.SashimiType;

public class Nigiri implements Sushi {

	public enum NigiriType {TUNA, SALMON, EEL, CRAB, SHRIMP};
	NigiriType type;
	final double MeatAmount = 0.75; 
	final double RiceAmount = 0.5;
	private IngredientPortion SushType;
	private IngredientPortion RiceType;
	
	public Nigiri(NigiriType type) {
		this.type = type;
	}
	
	@Override
	public String getName() {
		IngredientPortion[] Ingredients = new IngredientPortion[1];
		if (type.equals(NigiriType.TUNA) ) {
			SushType = new TunaPortion(MeatAmount);
			Ingredients[0] = SushType;
			return Ingredients[0].getIngredient().getName() + " " + "nigiri";
		}else if (type.equals(NigiriType.SALMON)) {
			SushType = new SalmonPortion(MeatAmount);
			Ingredients[0] = SushType;
			return Ingredients[0].getIngredient().getName() + " " + "nigiri";
		}else if (type.equals(NigiriType.EEL)) {
			SushType = new EelPortion(MeatAmount);
			Ingredients[0] = SushType;
			return Ingredients[0].getIngredient().getName() + " " + "nigiri";
		} else if (type.equals(NigiriType.CRAB)) {
			SushType = new CrabPortion(MeatAmount);
			Ingredients[0] = SushType;
			return Ingredients[0].getIngredient().getName() + " " + "nigiri";
		} else {
			SushType = new ShrimpPortion(MeatAmount);
			Ingredients[0] = SushType;
			return Ingredients[0].getIngredient().getName() + " " + "nigiri";
		}
	}

	@Override
	public IngredientPortion[] getIngredients() {
		IngredientPortion[] Ingredients = new IngredientPortion[2];
		if (type.equals(NigiriType.TUNA) ) {
			Ingredients[0] = new TunaPortion(MeatAmount);
			Ingredients[1] = new RicePortion(RiceAmount);
			return Ingredients.clone();
		}else if (type.equals(NigiriType.SALMON)) {
			Ingredients[0] = new SalmonPortion(MeatAmount);
			Ingredients[1] =  new RicePortion(RiceAmount);
			return Ingredients.clone();
		}else if (type.equals(NigiriType.EEL)) {
			Ingredients[0] = new EelPortion(MeatAmount);
			Ingredients[1] =  new RicePortion(RiceAmount);
			return Ingredients.clone();
		} else if (type.equals(NigiriType.CRAB)) {
			Ingredients[0] = new CrabPortion(MeatAmount);
			Ingredients[1] = new RicePortion(RiceAmount);
			return Ingredients.clone();
		} else {
			Ingredients[0] = new ShrimpPortion(MeatAmount);
			Ingredients[1] = new RicePortion(RiceAmount);
			return Ingredients.clone();
		}
	}

	@Override
	public int getCalories() {
		IngredientPortion[] Ingredients = new IngredientPortion[2];
		double calSum = 0;
		if (type.equals(NigiriType.TUNA) ) {
			SushType = new TunaPortion(MeatAmount);
			Ingredients[0] = SushType;
			RiceType = new RicePortion(RiceAmount);
			Ingredients[1] = RiceType;
			calSum = Ingredients[0].getCalories() + Ingredients[1].getCalories();
			return  (int) ((calSum) + 0.5);
		}else if (type.equals(NigiriType.SALMON)) {
			SushType = new SalmonPortion(MeatAmount);
			Ingredients[0] = SushType;
			RiceType = new RicePortion(RiceAmount);
			Ingredients[1] = RiceType;
			calSum = Ingredients[0].getCalories() + Ingredients[1].getCalories();
			return  (int) ((calSum) + 0.5);
		}else if (type.equals(NigiriType.EEL)) {
			SushType = new EelPortion(MeatAmount);
			Ingredients[0] = SushType;
			RiceType = new RicePortion(RiceAmount);
			Ingredients[1] = RiceType;
			calSum = Ingredients[0].getCalories() + Ingredients[1].getCalories();
			return  (int) ((calSum) + 0.5);
		} else if (type.equals(NigiriType.CRAB)) {
			SushType = new CrabPortion(MeatAmount);
			Ingredients[0] = SushType;
			RiceType = new RicePortion(RiceAmount);
			Ingredients[1] = RiceType;
			calSum = Ingredients[0].getCalories() + Ingredients[1].getCalories();
			return  (int) ((calSum) + 0.5);
		} else {
			SushType = new ShrimpPortion(MeatAmount);
			Ingredients[0] = SushType;
			RiceType = new RicePortion(RiceAmount);
			Ingredients[1] = RiceType;
			calSum = Ingredients[0].getCalories() + Ingredients[1].getCalories();
			return  (int) ((calSum) + 0.5);
		}
	}

	@Override
	public double getCost() {
		IngredientPortion[] Ingredients = new IngredientPortion[2];
		double costSum = 0;
		if (type.equals(NigiriType.TUNA) ) {
			SushType = new TunaPortion(MeatAmount);
			Ingredients[0] = SushType;
			RiceType = new RicePortion(RiceAmount);
			Ingredients[1] = RiceType;
			costSum = Ingredients[0].getCost() + Ingredients[1].getCost();
			return  ((int) (((costSum) * 100.0) + 0.5)) / 100.0;
		}else if (type.equals(NigiriType.SALMON)) {
			SushType = new SalmonPortion(MeatAmount);
			Ingredients[0] = SushType;
			RiceType = new RicePortion(RiceAmount);
			Ingredients[1] = RiceType;
			costSum = Ingredients[0].getCost() + Ingredients[1].getCost();
			return  ((int) (((costSum) * 100.0) + 0.5)) / 100.0;
		}else if (type.equals(NigiriType.EEL)) {
			SushType = new EelPortion(MeatAmount);
			Ingredients[0] = SushType;
			RiceType = new RicePortion(RiceAmount);
			Ingredients[1] = RiceType;
			costSum = Ingredients[0].getCost() + Ingredients[1].getCost();
			return  ((int) (((costSum) * 100.0) + 0.5)) / 100.0;
		} else if (type.equals(NigiriType.CRAB)) {
			SushType = new CrabPortion(MeatAmount);
			Ingredients[0] = SushType;
			RiceType = new RicePortion(RiceAmount);
			Ingredients[1] = RiceType;
			costSum = Ingredients[0].getCost() + Ingredients[1].getCost();
			return  ((int) (((costSum) * 100.0) + 0.5)) / 100.0;
		} else {
			SushType = new ShrimpPortion(MeatAmount);
			Ingredients[0] = SushType;
			RiceType = new RicePortion(RiceAmount);
			Ingredients[1] = RiceType;
			costSum = Ingredients[0].getCost() + Ingredients[1].getCost();
			return  ((int) (((costSum) * 100.0) + 0.5)) / 100.0;
		}
	}

	@Override
	public boolean getHasRice() {
		if (type.equals(NigiriType.TUNA) ) {
			SushType = new TunaPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return  SushType.getIsRice() || RiceType.getIsRice();
		}else if (type.equals(NigiriType.SALMON)) {
			SushType = new SalmonPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsRice() || RiceType.getIsRice();
		}else if (type.equals(NigiriType.EEL)) {
			SushType = new EelPortion(MeatAmount);
			SushType = new RicePortion(RiceAmount);
			return SushType.getIsRice() || RiceType.getIsRice();
		} else if (type.equals(NigiriType.CRAB)) {
			SushType = new CrabPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsRice() || RiceType.getIsRice();
		} else {
			SushType = new ShrimpPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsRice() || RiceType.getIsRice();
		}
	}

	@Override
	public boolean getHasShellfish() {
		if (type.equals(NigiriType.TUNA) ) {
			SushType = new TunaPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return  SushType.getIsShellfish() || RiceType.getIsShellfish();
		}else if (type.equals(NigiriType.SALMON)) {
			SushType = new SalmonPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsShellfish() || RiceType.getIsShellfish();
		}else if (type.equals(NigiriType.EEL)) {
			SushType = new EelPortion(MeatAmount);
			SushType = new RicePortion(RiceAmount);
			return SushType.getIsShellfish() || RiceType.getIsShellfish();
		} else if (type.equals(NigiriType.CRAB)) {
			SushType = new CrabPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsShellfish() || RiceType.getIsShellfish();
		} else {
			SushType = new ShrimpPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsShellfish() || RiceType.getIsShellfish();
		}
	}

	@Override
	public boolean getIsVegetarian() {
		if (type.equals(NigiriType.TUNA) ) {
			SushType = new TunaPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return  SushType.getIsVegetarian() && RiceType.getIsVegetarian();
		}else if (type.equals(NigiriType.SALMON)) {
			SushType = new SalmonPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsVegetarian() && RiceType.getIsVegetarian();
		}else if (type.equals(NigiriType.EEL)) {
			SushType = new EelPortion(MeatAmount);
			SushType = new RicePortion(RiceAmount);
			return SushType.getIsVegetarian() && RiceType.getIsVegetarian();
		} else if (type.equals(NigiriType.CRAB)) {
			SushType = new CrabPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsVegetarian() && RiceType.getIsVegetarian();
		} else {
			SushType = new ShrimpPortion(MeatAmount);
			RiceType = new RicePortion(RiceAmount);
			return SushType.getIsVegetarian() && RiceType.getIsVegetarian();
		}
	}

}
