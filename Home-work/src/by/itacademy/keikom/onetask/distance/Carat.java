package by.itacademy.keikom.onetask.distance;

import by.itacademy.keikom.onetask.DistanceAndWeight;

public class Carat extends DistanceAndWeight {

	private Double carat;
	
	public Carat (Double carat) {
		this.carat = carat;
	}
	
	@Override
	public void execute() {
		
		System.out.println("килограмм: " + (carat / 0.0002));
		System.out.println("грамм: " + (carat / 0.2));
		System.out.println("фунт: " + (carat / 0.000440925));
		System.out.println("карат: " + carat);
		
	}

}
