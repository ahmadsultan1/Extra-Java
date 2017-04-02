package animals;

import org.junit.Assert;
import org.junit.Test;

public class TestingMethods {

	@Test
	public void testGetSetAge() {
		int b = 10;
		Bat a = new Bat(b, null, null, null, 0, 0, 0, false, false, false);
		a.setAge(10);
		int age = a.getAge();
		Assert.assertEquals(b, age);	
	}
	
	@Test
	public void testGetSetName(){
		String b = "jeff";
		Bat a = new Bat(0, b, null, null, 0, 0, 0, false, false, false);
		a.setName("jeff");
		String name = a.getName();
		Assert.assertSame(b, name);
	}
	@Test
	public void testGetandSetspecies(){
		String b = "Dog";
		Bat a = new Bat(0, null, b, null, 0, 0, 0, false, false, false);
		a.setSpecies("Dog");
		String species =a.getSpecies();
		Assert.assertSame(b, species);
	}
	@Test
	public void testGetAndSetBreed(){
		String b = "husky";
		Bat a = new Bat(0, null, null, b, 0, 0, 0, false, false, false);
		a.setBreed("husky");
		String breed = a.getBreed();
		Assert.assertSame(b, breed);
	}
	@Test
	public void testGetAndSetSize(){
		int b = 1;
		Bat a = new Bat(0, null, null, null, b, 0, 0, false, false, false);
		a.setSize(1);
		int size= a.getSize();
		Assert.assertEquals(b, size);
		
	}
	@Test
	public void testGetAndSetWeight(){
		int b = 1;
		Bat a = new Bat(0, null, null, null, 0, b, 0, false, false, false);
		a.setWeight(1);
		int weight= a.getWeight();
		Assert.assertEquals(b, weight);
	}
	@Test
	public void testGetAndSetheight(){
		int b = 1;
		Bat a = new Bat(0,
				null, null, null, 0, 0, b, false, false, false);
		a.setHeight(1);
		int height= a.getHeight();
		Assert.assertEquals(b, height);
	}
	@Test
	public void testGetAndSetNocturanl(){
		boolean b = true;
		Bat a = new Bat(0, null, null, null, 0, 0, 0, true, false, false);
		a.setNocturanl(true);
		boolean nocturanl= a.isNocturanl();
		Assert.assertEquals(b, nocturanl);
	}
	@Test
	public void testGetAndSetDangerous(){
		boolean b = true;
		Bat a = new Bat(0, null, null, null, 0, 0, 0, false, true, false);
		a.setDangerous(true);
		boolean dangerous = a.isDangerous();
		Assert.assertEquals(b, dangerous);
	}
	@Test
	public void testIsAndSetEndangered(){
		boolean b = true;
		Bat a = new Bat(0, null, null, null, 0, 0, 0, false, false, true);
		a.setEndangered(true);
		boolean endangered = a.isEndangered();
		Assert.assertEquals(b, endangered);
	}
	@Test
	public void testIsAndSetPoisonous(){
		boolean b = true;
		Snake a = new Snake(0, null, null, null, 0, 0, 0, false, false, false, b, false);
		a.setPoisonous(true);
		boolean poisonous = a.isPoisonous();
		Assert.assertEquals(b, poisonous);
	}
	@Test
	public void testIsAndSetVenomous(){
		boolean b = true;
		Snake a = new Snake(0, null, null, null, 0, 0, 0, false, false, false, false, b);
		a.setVenomous(true);
		boolean venomous = a.isVenomous();
		Assert.assertEquals(b, venomous);
	}
	@Test
	public void testSubmerge(){
		int k =1;
		Crocodile a = new Crocodile(0, null, null, null, 0, 0, 0, false, false, false);
		int submerge = a.submerge();
		Assert.assertEquals(k, submerge);
		
	}
	@Test
	public void testEmerge(){
		int j = 1;
		Penguin a = new Penguin(0, null, null, null, 0, 0, 0, false, false, false);
		int emerge = a.emerge();
		Assert.assertSame(j, emerge);
	}
	@Test
	public void testFloat(){
		int y = 1;
		Penguin a = new Penguin(0, null, null, null, 0, 0, 0, false, false, false);
		int FLoat = a.Float();
		Assert.assertEquals(y, FLoat);
	}
	@Test
	public void testingNutrition(){
		String b = "food";
		Snake a = new Snake(0, null, null, null, 0, 0, 0, false, false, false, false, false);
		String nutrition = a.nutrition();
		Assert.assertSame(b, nutrition);

	}
	@Test
	public void testAmp(){
		int p =1;
		Amphibian a= new Amphibian(0, null, null, null, 0, 0, 0, false, false, false);
		int Float = a.Float();
		Assert.assertEquals(p, Float);
	}
	@Test
	public void testAmp1(){
		int t = 1;
		Amphibian a = new Amphibian(0, null, null, null, 0, 0, 0, false, false, false);
		int emerge = a.emerge();
		Assert.assertEquals(t, emerge);
		
	}
	@Test
	public void testAmp2(){
		int k =1;
		Amphibian a = new Amphibian(0, null, null, null, 0, 0, 0, false, false, false);
		int submerge = a.submerge();
		Assert.assertEquals(k, submerge);
		
	}
	@Test 
	public void testAmp3(){
		String b = "bugs";
		Amphibian a = new Amphibian(0, null, null, null, 0, 0, 0, false, false, false);
		String nutrition = a.nutrition();
		Assert.assertEquals(b, nutrition);
	}
	@Test
	public void testAnimalSetDan(){
		boolean b = true;
		Cat a = new Cat(0, null, null, null, 0, 0, 0, false, false, true);
		a.setDangerous(true);
		boolean dangerous = a.isDangerous();
		Assert.assertEquals(b, dangerous);
	}

}
