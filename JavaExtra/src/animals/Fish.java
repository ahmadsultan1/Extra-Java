package animals;

public abstract class Fish extends Animal implements Swim{

	public Fish(int age, String name, String species, String breed, int size, int weight, int height, boolean nocturanl,
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
	public void movement(){
		
	}
	@Override
	public void respiration(){
		
	}
	@Override
	public int submerge(){
		return 1;
		
	}
	@Override
	public int emerge(){
		return 1;
		
	}
	@Override
	public void growth(){
		
	}
	

}
