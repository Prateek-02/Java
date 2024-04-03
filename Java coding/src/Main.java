class Animal {
	void eat() {
		System.out.println("eating");
	}

}

class Dog extends Animal {
	void bark() {
		System.out.println("barking");
	}

}

class BabyDog extends Dog {
	public void weep() {
		System.out.println("weeping");
	}
}

class Main {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.eat();
		Dog bull = new Dog();
		bull.bark();
		BabyDog puppy = new BabyDog();
		puppy.weep();
	}
}