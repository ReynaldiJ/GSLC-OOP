package model;

public class Fish extends Animal implements Swim{

	public Fish(String name, String gender, String mood, String habitat) {
		super(name, gender, mood, habitat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Blup blup");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" is swimming");
	}

}
