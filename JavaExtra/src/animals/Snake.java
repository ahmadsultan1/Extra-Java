package animals;

public class Snake extends Reptile {
	public boolean poisonous;
	public boolean venomous;
	
	public Snake(int age, String name, String species, String breed, int size, int weight, int height,
			boolean nocturanl, boolean dangerous, boolean endangered, boolean poisonous, boolean venomous) {
		super(age, name, species, breed, size, weight, height, nocturanl, dangerous, endangered);
		this.poisonous = poisonous;
		this.venomous = venomous;
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
	public void movement(){
		
	}

	public boolean isPoisonous() {
		return poisonous;
	}

	public void setPoisonous(boolean poisonous) {
		this.poisonous = poisonous;
	}

	public boolean isVenomous() {
		return venomous;
	}

	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}
	

}
