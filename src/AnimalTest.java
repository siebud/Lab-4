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
}

