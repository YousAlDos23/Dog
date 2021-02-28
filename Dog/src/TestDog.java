
public class TestDog {
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		
		d1.breed = "Bulldog";
		d1.size = "Large";
		d1.colour ="Laight gray";
		d1.age = 5;
		
		d2.breed = "Beagle";
		d2.size = "Large";
		d2.colour ="Orange";
		d2.age = 6;
		
		d3.breed = "German shepherd";
		d3.size = "Large";
		d3.colour ="White and orange";
		d3.age = 6;
		
		d1.Doginfo();
		d2.Doginfo();
		d3.Doginfo();
		
		
		
		
	}

}
