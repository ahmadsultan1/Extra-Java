package animals;

public class Penguin extends Bird implements Swim {

	public Penguin(int age, String name, String species, String breed, int size, int weight, int height,
			boolean nocturanl, boolean dangerous, boolean endangered) {
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
		this.submerge();
		this.emerge();
		this.nutrition();
		this.Float();
	}

	@Override
	public String nutrition() {
		return "fish";
		
	}

	@Override
	public int submerge() {
		return 1;
		
	}

	@Override
	public int emerge() {
		return 1;
		
	}

	@Override
	public int Float() {
		return 1;
		
	}
	
	@Override
	public void takeOff(){
		
	}

}
