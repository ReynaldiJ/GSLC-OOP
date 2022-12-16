package model;

public class Cat extends Animal implements Walk {

	public Cat(String name, String gender, String mood, String habitat) {
		super(name, gender, mood, habitat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Meow meow");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" is walking");
	}

}
