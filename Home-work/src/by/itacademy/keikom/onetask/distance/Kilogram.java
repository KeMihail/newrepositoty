package by.itacademy.keikom.onetask.distance;

import by.itacademy.keikom.onetask.DistanceAndWeight;

public class Kilogram extends DistanceAndWeight{

	private Double kilogram;
	
	public Kilogram(Double kilogram) {
		this.kilogram = kilogram;
	}
	
	@Override
	public void execute() {
		
		System.out.println("килограмм: " + kilogram);
		System.out.println("грамм: " + (kilogram / 1000));
		System.out.println("фунт: " + (kilogram / 2.20462));
		System.out.println("карат: " + (kilogram / 5000));
	}

}
