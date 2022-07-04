package Filters;

import Users.Medic;

public class FilterMedicName implements FilterMedic{
	private String name;
	
	public FilterMedicName(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean find(Medic medic) {
		return medic.getName().equals(name);
	}
}
