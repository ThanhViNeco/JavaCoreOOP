package secion15.model;

public class Person {
	public String nameString;
	public int tuoi;
	public int id ;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Person(String nameString, int tuoi) {
		super();
		this.nameString = nameString;
		this.tuoi = tuoi;
	} 
	public Person() {}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p2 = ((Person) obj);

			if (p2.getTuoi() == this.tuoi) {
				return true;
			}
			else if (p2.getNameString().equals(this.nameString)) {
				System.out.println("Ten giong nhau.");
			}
			else {
				return false;
			}
		} else
			return false;
		return false;

	}

}
