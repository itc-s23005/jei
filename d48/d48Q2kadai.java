// s23005
// ポリモフィズムの課題 

class Animal {
	public void makeSound() {
		System.out.println("動物の音");
	}
	public void test(){
		System.out.println("テスト出力");
	}
}

class Dog extends Animal {
	public void makeSound() {
		System.out.println("ワンワン");
	}
}

class Cat extends Animal {
	public void makeSound() {
		System.out.println("ニャー");
	}
}

public class d48Q2kadai {
	public static void main(String[] args) {
		Animal a = new Dog();
		Animal b = new Cat();
		a.makeSound();
		a.test();
		b.makeSound();
	}
}

