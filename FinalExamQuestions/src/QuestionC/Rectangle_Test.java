package QuestionC;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Rectangle_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Rectangle_Test1() throws IllegalRectangle {
		
		Rectangle r2 = new Rectangle(-5, -10);
		try{
		r2.ComputeArea();}
		catch (IllegalRectangle e){
			System.out.println("Cannot compute area of a negative values!");
		}
	}

	@Test
	public void Rectangle_Test2() throws IllegalRectangle {
		
	
		Rectangle r2 = new Rectangle(5, 10);
		assertTrue(r2.ComputeArea() == 50);
	}
	

}
