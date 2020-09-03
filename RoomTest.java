import java.util.ArrayList;

/**
 * The test class RoomTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RoomTest extends junit.framework.TestCase
{
	private Room room1;
	private Item item1;
	private Item item2;
	private Item item3;

	
    /**
     * Default constructor for test class RoomTest
     */
    public RoomTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
		room1 = new Room("kitchen");
		item1 = new Item("cooker");
		item2 = new Item("fridge");
		item3 = new Item("knife");
		room1.addItem(item1);
		room1.addItem(item2);
		room1.addItem(item3);
	}

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }

    /**
     * Test case method
     * 
     * Test to check that the correct item is returned by getItem
     *
     */
	public void testGetItem()
	{
	    Item target = room1.getItem("fridge");
		assertEquals("fridge", target.getDescription());
	}

}






