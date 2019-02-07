
public class ZooTest {
	Zoo try3 = new Zoo(2);
		Animal i = new Animal ("blue", "Frank", 23.1, 11.9);
	
	public void capacityTest() throws AssertException {
		Zoo try1 = new Zoo(0);
		// capacity should be 0
		 Assert.assertEquals(0, try1.getCapacity());
		 
		 Zoo try2 = new Zoo(10);
		 Assert.assertEquals(10, try2.getCapacity());
		}

	public void getTotalHeightTest() throws AssertException {
		
		Animal j = new Animal ("purple", "Bill", 298.3, 89.3);
		Animal k = new Animal("cyan", "Ryan", 7.1, 8.0);
		try3.addAnimal(i);
		try3.addAnimal(j);
		try3.addAnimal(k);
		
		 Assert.assertEquals(109.2, try3.getTotalHeight());
	}
		
	public void toStringTest() throws AssertException {
		Zoo try4 = new Zoo(2);
		try4.addAnimal(i);
		 Assert.assertEquals("These animals live in the zoo: \nFrank, a blue-colored animal. 23.1 pounds, 11.9 inches\n", try4.toString());
	}
		
	
}
