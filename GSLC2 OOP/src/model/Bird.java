package model;

public class Bird extends Animal implements Fly{

	public Bird(String name, String gender, String mood, String habitat) {
		super(name, gender, mood, habitat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Chirp chirp");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" is flying");
	}

}
