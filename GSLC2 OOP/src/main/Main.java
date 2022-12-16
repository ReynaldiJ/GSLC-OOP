package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.Animal;
import model.Bird;
import model.Cat;
import model.Dog;
import model.Fish;

public class Main {

	Scanner scan = new Scanner(System.in);
	ArrayList<Animal> A = new ArrayList();
	
	public void printMenu() {//print interface menu
		System.out.println("Mini Zoo");
		System.out.println("1. Add new animal");
		System.out.println("2. View animals");
		System.out.println("3. Play with animals");
		System.out.println("4. Release animals");
		System.out.println("5. Exit");
		System.out.println(">> ");
	}
	
	public void addAnimal() {//menambahkan data animal kedalam array list
		String name;
		String type;
		String gender;
		String mood = "Happy";
		String habitat;
		
		do {
			System.out.println("Input name: ");
			name = scan.nextLine();
		}while(name.length()>5);
		
		do {
			System.out.println("Input type: ");
			type = scan.nextLine();
		}while(!type.equals("dog") && !type.equals("cat") && !type.equals("bird") && !type.equals("fish"));
		
		do {
			System.out.println("Input Gender [Male/Female]: ");
			gender = scan.nextLine();
		}while(!gender.equals("Male") && !gender.equals("Female"));
		
		do {
			System.out.println("Input Habitat [Land/Water]: ");
			habitat = scan.nextLine();
		}while(!habitat.equals("Land") && !habitat.equals("Water"));	
		
		if(type.equals("dog")){
			A.add(new Dog(name, gender, mood, habitat));
		}
		else if(type.equals("cat")){
			A.add(new Cat(name, gender, mood, habitat));
		}
		else if(type.equals("bird")){
			A.add(new Bird(name, gender, mood, habitat));
		}
		else if(type.equals("fish")) {
			A.add(new Fish(name, gender, mood, habitat));
		}
	}
	
	public void viewAnimal() {//melihat isi array list
		if(A.isEmpty()) {
			System.out.printf(" %-4s | %-16s | %-10s | %-20s | %-10s | %-10s\n","No","Name","Gender","Type","Mood","Habitat");
			System.out.println("There are no animal currently...");
			return;
		}
		else {
			int counter = 0;
			System.out.printf(" %-4s | %-16s | %-10s | %-20s | %-10s | %-10s\n","No","Name","Gender","Type","Mood","Habitat");
			
			for (Animal animal : A) {
				counter++;
				
				if(animal instanceof Dog) {
					System.out.printf(" %-4d | %-16s | %-10s | %-20s | %-10s | %-10s\n",counter,animal.getName(),animal.getGender(),"Dog",animal.getMood(),animal.getHabitat());
					((Dog)animal).speak();
				}else if(animal instanceof Cat) {
					System.out.printf(" %-4d | %-16s | %-10s | %-20s | %-10s | %-10s\n",counter,animal.getName(),animal.getGender(),"Cat",animal.getMood(),animal.getHabitat());
					((Cat)animal).speak();
				}else if(animal instanceof Bird) {
					System.out.printf(" %-4d | %-16s | %-10s | %-20s | %-10s | %-10s\n",counter,animal.getName(),animal.getGender(),"Bird",animal.getMood(),animal.getHabitat());
					((Bird)animal).speak();
				}else if(animal instanceof Fish) {
					System.out.printf(" %-4d | %-16s | %-10s | %-20s | %-10s | %-10s\n",counter,animal.getName(),animal.getGender(),"Fish",animal.getMood(),animal.getHabitat());
					((Fish)animal).speak();
				}	
			}
		}
	}
	
	private void play() {//memanggil method dan interface dari data yang terdapat di array list
		// TODO Auto-generated method stub
		if(A.isEmpty()) {
			System.out.println("There are no animal currently...");
		}else {
			viewAnimal();
			int idx;
			
			System.out.println("Select Animal [1.."+A.size()+"]: ");
			idx = scan.nextInt();scan.nextLine();
			
			do{
				System.out.println(A.get(idx-1).getName());
				if(A.get(idx-1) instanceof Dog) {
					((Dog)A.get(idx-1)).speak();
					((Dog)A.get(idx-1)).walk();
				}else if(A.get(idx-1)instanceof Cat) {
					((Cat)A.get(idx-1)).speak();
					((Cat)A.get(idx-1)).walk();
				}else if(A.get(idx-1) instanceof Bird) {
					((Bird)A.get(idx-1)).speak();
					((Bird)A.get(idx-1)).fly();
				}else if(A.get(idx-1) instanceof Fish) {
					((Fish)A.get(idx-1)).speak();
					((Fish)A.get(idx-1)).swim();
				}
				
			}while(idx < 1 || idx > A.size());
		}
	}
	
	private void releaseAnimal() {//melepas hewan
		// TODO Auto-generated method stub
		viewAnimal();
		int idx;
		while(!A.isEmpty()) {
			System.out.print("Release Animal [ 1 - "+A.size()+" ]: ");
			idx=scan.nextInt();scan.nextLine();
			if(idx>=0 && idx<=A.size()) {
				if(idx==0) {
					continue;
				}
				else {
					System.out.println("You have successfully released "+A.get(idx-1).getName());
					A.remove(idx-1);
					break;
				}
			}
		}
	}

	public Main(){//driver code
		int menu = 0;
		
		do {
			printMenu();
			menu = scan.nextInt();
			scan.nextLine();
			
			switch(menu) {
			case 1:
				addAnimal();
				break;
			case 2:
				viewAnimal();
				break;
			case 3:
				play();
				break;
			case 4:
				releaseAnimal();
				break;
			}	
		}while(menu!=5);	
	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
