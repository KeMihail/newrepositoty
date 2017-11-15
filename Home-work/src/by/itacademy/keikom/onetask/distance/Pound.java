package by.itacademy.keikom.onetask.distance;

import by.itacademy.keikom.onetask.DistanceAndWeight;

public class Pound extends DistanceAndWeight{

	private Double pound;
	
	public Pound(Double pound) {
		this.pound = pound;
	}
	
	@Override
	public void execute() {
		
		System.out.println("килограмм: " + (pound / 0.453592));
		System.out.println("грамм: " + (pound / 453.592));
		System.out.println("фунт: " + pound);
		System.out.println("карат: " + (pound / 2267.96));
		
	}

}
