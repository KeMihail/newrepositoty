package by.itacademy.keikom.onetask.weight;

import by.itacademy.keikom.onetask.DistanceAndWeight;

public class Ft extends DistanceAndWeight{

	
	private Double ft;
	
	public Ft(Double ft) {
		this.ft = ft;
	}
	@Override
	public void execute() {
		
		System.out.println("метры: " + (ft / 0.3048));
		System.out.println("мили: " + (ft / 0.000189394));
		System.out.println("ярды: " + (ft / 0.333333));
		System.out.println("футы: " + ft);
		
	}

}
