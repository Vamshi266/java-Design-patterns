
interface Color {
	String getColor();
}

class Red implements Color {
	public String getColor() {
		return "Red";
	}
}

class Blue implements Color {
	public String getColor() {
		return "Blue";
	}
}

interface Animal {
	String getAnimal();

	String makeSound();
}

class Duck implements Animal {
	@Override
	public String getAnimal() {
		return "Duck";
	}

	@Override
	public String makeSound() {
		return "squeks";
	}

}

class Dog implements Animal {
	@Override
	public String getAnimal() {
		return "Dog";
	}

	@Override
	public String makeSound() {
		return "bow bow!";
	}
}

class FactoryProvider {
	public static AbstractFactory createFactory(String factoryType) {
		if ("Animal".equalsIgnoreCase(factoryType))
			return new AnimalFactory();
		else if ("Color".equalsIgnoreCase(factoryType))
			return new ColorFactory();

		return null;
	}
}

interface AbstractFactory<T> {
	T create(String type);
}

class AnimalFactory implements AbstractFactory<Animal> {

	public Animal create(String animalType) {
		if ("Dog".equalsIgnoreCase(animalType))
			return new Dog();
		else if ("Duck".equalsIgnoreCase(animalType))
			return new Duck();

		return null;
	}
}

class ColorFactory implements AbstractFactory<Color> {
	public Color create(String colorType) {
		if ("Red".equalsIgnoreCase(colorType))
			return new Red();
		else if ("Blue".equalsIgnoreCase(colorType))
			return new Blue();

		return null;
	}
}

public class AbstractFactoryExample {
	public static void main(String[] args) {
		AbstractFactory<Animal> animalFactory = FactoryProvider.createFactory("Animal");

		Animal animal = animalFactory.create("Dog");

		System.out.println("Animal type : " + animal.getAnimal());
		System.out.print("Animal sound : " + animal.makeSound());
	}
}
