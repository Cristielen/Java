package entities;

public class Individual extends Person {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double taxPayers() {
		if (anualIncome < 2000) {
			return (anualIncome * 0.15) - (healthExpenditures * 0.50);
		} else {
			return (anualIncome * 0.25) - (healthExpenditures * 0.50);
		}

	}

}
