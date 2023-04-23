package week06;

public class Card {
	
	String name; 
	int value;
	
	Card (String name, int value) {
		this.name = name;
		this.value = value;
	}//end of Card

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void describe() {
		System.out.println(this.name );
	}

}
