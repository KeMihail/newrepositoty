package by.itacademy.keikom.onetask.weight;

import by.itacademy.keikom.onetask.DistanceAndWeight;

public class Mile extends DistanceAndWeight{

	private Double mile;
	
	public Mile(Double mile) {
		this.mile = mile;
	}
	
	@Override
	public void execute() {
		
		System.out.println("метры: " + (mile / 1609.34));
		System.out.println("мили: " + mile);
		System.out.println("ярды: " + (mile / 1760));
		System.out.println("футы: " + (mile / 5280));
	}

}
