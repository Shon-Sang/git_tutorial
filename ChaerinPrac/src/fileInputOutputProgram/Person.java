package fileInputOutputProgram;

public class Person {
	
	private String name;
	private String hp;
	private String company;
	
	public Person() {
		
	}
	
	public Person(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	public String toTxtString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name);
		sb.append(",");
		sb.append(this.hp);
		sb.append(",");
		sb.append(this.company);
		//sb.append("\n");
		
		return sb.toString();
	}
	
	public String showInfoString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(". ");
		sb.append(this.name);
		sb.append(" ");
		sb.append(this.hp);
		sb.append(" ");
		sb.append(this.company);
		//sb.append("\n");
		
		return sb.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
}
