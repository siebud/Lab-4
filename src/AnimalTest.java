/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    public void constructorTest() throws AssertException
    {
    	Animal animal1 = new Animal("blue", "leo", 10.5,2.1);
    	
    	Assert.assertEquals("blue", animal1.getColor());
        Assert.assertEquals("leo", animal1.getName());
        Assert.assertEquals(10.5, animal1.getWeight(), 0.01);
        Assert.assertEquals(2.1, animal1.getHeight(), 0.01);
    }
    
    public void toStringTest() throws AssertException {
    	Animal animal1 = new Animal("blue", "leo", 10.5,2.1);
    	Assert.assertEquals("leo, a blue-colored animal. 10.5 pounds, 2.1 inches\n", animal1.toString());
    }
    
    public void equalsTestNot() throws AssertException {
    	Animal animal1 = new Animal("blue", "leo", 10.5,2.1);
    	Animal animal2 = new Animal("green", "hamlet", 5.3, 20.0);
    	
    	Assert.assertEquals(false, animal1.equals(animal2));
    }
    
    public void equalsTest() throws AssertException {
    	Animal animal1 = new Animal("blue", "leo", 10.5,2.1);
    	Animal animal3 = new Animal("blue", "leo", 10.5,2.1); 
    	
    	Assert.assertEquals(true, animal1.equals(animal3));
    }
}

