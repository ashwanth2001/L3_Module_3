package abstract_classes.cities;

public class Boston extends City{

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double tax = population*(growthRate+0.5);
		return tax;
	}

}
