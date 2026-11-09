package pkg1;

import java.util.Objects;

public class CityObj {

	String name;
	double population;
	String famousSweet;

	public CityObj(String name, double population, String famousSweet) {
		this.name = name;
		this.population = population;
		this.famousSweet = famousSweet;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Population: " + population + ", Famous Sweet: " + famousSweet;
	}

	@Override
	public int hashCode() {
		return 100;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof CityObj) {
			CityObj c = (CityObj) o;
			return Objects.equals(this.name, c.name) && Objects.equals(this.population, c.population)
					&& Objects.equals(this.famousSweet, c.famousSweet);
		}
		return false;
	}

}
