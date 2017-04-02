package animals;

public abstract class Animal implements LivingThings{
	public int age;
	public String name;
	public String species;
	public enum enclosure{}
	public String breed;
	public int size;
	public int weight;
	public int height;
	public boolean nocturanl;
	public boolean dangerous;
	public boolean endangered;
	public Animal(int age, String name, String species, String breed, int size, int weight, int height,
			boolean nocturanl, boolean dangerous, boolean endangered) {
		this.age = age;
		this.name = name;
		this.species = species;
		this.breed = breed;
		this.size = size;
		this.weight = weight;
		this.height = height;
		this.nocturanl = nocturanl;
		this.dangerous = dangerous;
		this.endangered = endangered;
	}
	@Override
	public void excretion(){
		
	}
	@Override
	public void reprodiuction(){
		
	}
	@Override
	public void respiration(){
		
	}
	@Override
	public void movement(){
		
	}
	@Override
	public void sensitivity(){
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isNocturanl() {
		return nocturanl;
	}
	public void setNocturanl(boolean nocturanl) {
		this.nocturanl = nocturanl;
	}
	public boolean isDangerous() {
		return dangerous;
	}
	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}
	public boolean isEndangered() {
		return endangered;
	}
	public void setEndangered(boolean endangered) {
		this.endangered = endangered;
	}
	
	
	

}
