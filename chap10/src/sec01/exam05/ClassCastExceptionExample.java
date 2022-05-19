package sec01.exam05;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		changeDog = new Dog();
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
		Dog dog = (Dog) animal;
	}

}
	
class Animal {}
class Dog extends Aniaml {}
class Cat extends Animal {}
