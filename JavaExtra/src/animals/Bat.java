package animals;

public class Bat extends Mammal implements Flying {

	public Bat(int age, String name, String species, String breed, int size, int weight, int height, boolean nocturanl,
			boolean dangerous, boolean endangered) {
		super(age, name, species, breed, size, weight, height, nocturanl, dangerous, endangered);
		this.age=age;
		this.name=name;
		this.species=species;
		this.breed=breed;
		this.size=size;
		this.weight=weight;
		this.height=height;
		this.nocturanl=nocturanl;
		this.dangerous=dangerous;
		this.endangered=endangered;
	}

	@Override
	public String nutrition() {
		return "food";
		
	}

	@Override
	public void flight() {
		
	}

	@Override
	public void landing() {
		
	}

	@Override
	public void takeOff() {
		
	}
	
	@Override
	public void growth(){
		
	}

}
