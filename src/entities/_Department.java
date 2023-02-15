package entities;

public class _Department {
	
	private String name;
	
	public _Department() {
		
	}
	
	public _Department (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
}
