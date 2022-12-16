package model;

public abstract class Animal {
	private String name;
	private String Gender;
	private String Mood;
	private String Habitat;
	
	public Animal(String name, String gender, String mood, String habitat) {
		super();
		this.name = name;
		this.Gender = gender;
		this.Mood = mood;
		this.Habitat = habitat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getMood() {
		return Mood;
	}

	public void setMood(String mood) {
		Mood = mood;
	}

	public String getHabitat() {
		return Habitat;
	}

	public void setHabitat(String habitat) {
		Habitat = habitat;
	}
	
	public abstract void speak();


}
