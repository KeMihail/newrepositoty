package by.itacademy.keikom.onetask.weight;

import by.itacademy.keikom.onetask.DistanceAndWeight;

public class Meter extends DistanceAndWeight{

	private Double meter;
	
	public Meter(Double meter) {
		this.meter = meter;
	}
	
	@Override
	public void execute() {
		
		System.out.println("метры: " + meter);
		System.out.println("мили: " + (meter / 1609.34));
		System.out.println("ярды: " + (meter / 0.9144));
		System.out.println("футы: " + (meter / 0.3048));
	}

}
