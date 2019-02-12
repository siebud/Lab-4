
public class EquipmentTest {

	public void constructorTest() throws AssertException {
		String belt = "Grappling hook/2,5.0,15.0, a fun tool for scaling things and scaring siblings";
		Equipment hook = new Equipment(belt);
		
		Assert.assertEquals("Grappling hook", hook.getName());
		Assert.assertEquals(2, hook.getCount());
		Assert.assertEquals(5.0, hook.getTotalWeight());
		Assert.assertEquals(15.0, hook.getTotalPrice());
		Assert.assertEquals(" a fun tool for scaling things and scaring siblings", hook.getDescription());
	}
	
	public void equalsTest() throws AssertException {
		String belt = "Grappling hook/2,5.0,15.0, a fun tool for scaling things and scaring siblings";
		String compare = "Grappling hook/2,5.0,15.0, a fun tool for scaling things and scaring siblings";
		
		Assert.assertEquals(true, belt.contentEquals(compare));
	}
	public void equalsTestNot() throws AssertException {
		String belt = "Grappling hook/2,5.0,15.0, a fun tool for scaling things and scaring siblings";
		String compare2 = "Leaf blower/1,15.0,7.5,good for clearing yards";
		
		Assert.assertEquals(false, belt.contentEquals(compare2));
	}
}
