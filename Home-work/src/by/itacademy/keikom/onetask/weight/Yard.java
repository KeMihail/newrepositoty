package by.itacademy.keikom.onetask.weight;

import by.itacademy.keikom.onetask.DistanceAndWeight;

public class Yard extends DistanceAndWeight{

	private Double yard;
	
	public Yard(Double yard) {
		this.yard = yard;
	}
	
	@Override
	public void execute() {
		
		System.out.println("метры: " + (yard / 0.9144));
		System.out.println("мили: " + (yard / 0.000568182));
		System.out.println("ярды: " + yard);
		System.out.println("футы: " + (yard / 3));
	}

}
