package entities;

public class Company extends Person {

	private Integer numberEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double taxPayers() {
		if (numberEmployees > 10) {
			return (anualIncome * 14 / 100) + anualIncome;
		} else {
			return (anualIncome * 16 / 100) + anualIncome;
		}
	}

}
