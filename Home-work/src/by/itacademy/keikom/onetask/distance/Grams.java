package by.itacademy.keikom.onetask.distance;

import by.itacademy.keikom.onetask.DistanceAndWeight;

public class Grams extends DistanceAndWeight {

	private Double grams;
	
	public Grams(Double grams) {
		this.grams = grams;
	}
	
	@Override
	public void execute() {
		
		System.out.println("килограмм: " + (grams / 0.001));
		System.out.println("грамм: " + grams);
		System.out.println("фунт: " + (grams / 0.00220462));
		System.out.println("карат: " + (grams / 5));
		
	}

}
