package spdiaz100.hmrc;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class CheckoutTest {

	@Test
	public void withAnEmptyListOfItems_theTotalCost_isZero() {
		String[] listofItems = {};
		Checkout checkout = new Checkout();
		BigDecimal calculateTotalCost = checkout.calculateTotalCost(listofItems);
		assertEquals(BigDecimal.ZERO, calculateTotalCost);
	}
	
	@Test
	public void withAListContainingOneApple_theTotalCost_is60p(){
		String[] listofItems = {"Apple"};
		Checkout checkout = new Checkout();
		BigDecimal calculateTotalCost = checkout.calculateTotalCost(listofItems);
		assertEquals(BigDecimal.valueOf(0.60), calculateTotalCost);
	}
	
	@Test
	public void withAListContainingOneOrange_theTotalCost_is25p(){
		String[] listofItems = {"Orange"};
		Checkout checkout = new Checkout();
		BigDecimal calculateTotalCost = checkout.calculateTotalCost(listofItems);
		assertEquals(BigDecimal.valueOf(0.25), calculateTotalCost);
	}
	
	@Test
	public void withAListContainingUnknownItem_theTotalCost_isZero(){
		String[] listofItems = {"Appange"};
		Checkout checkout = new Checkout();
		BigDecimal calculateTotalCost = checkout.calculateTotalCost(listofItems);
		assertEquals(BigDecimal.ZERO, calculateTotalCost);
	}
	
	@Test
	public void withAListContainingThreeApples_theTotalCost_is1_80(){
		String[] listofItems = {"Apple","Apple","Apple"};
		Checkout checkout = new Checkout();
		BigDecimal calculateTotalCost = checkout.calculateTotalCost(listofItems);
		assertEquals(BigDecimal.valueOf(1.80), calculateTotalCost);
	}

	@Test
	public void withAListContainingThreeOranges_theTotalCost_is0_75(){
		String[] listofItems = {"Orange","Orange","Orange"};
		Checkout checkout = new Checkout();
		BigDecimal calculateTotalCost = checkout.calculateTotalCost(listofItems);
		assertEquals(BigDecimal.valueOf(0.75), calculateTotalCost);
	}

	@Test
	public void withAListContainingThreeApplesAndAnOrange_theTotalCost_is2_05(){
		String[] listofItems = {"Apple","Apple","Orange","Apple"};
		Checkout checkout = new Checkout();
		BigDecimal calculateTotalCost = checkout.calculateTotalCost(listofItems);
		assertEquals(BigDecimal.valueOf(2.05), calculateTotalCost);
	}

}
