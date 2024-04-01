package ee.ut.math.tvt.salessystem.dataobjects;

import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;

public class GTv3 {

	@Test(timeout = 4000)
	public void testGetId() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 389);
	    soldItem0.getId();
	    assertEquals(389, (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testSetId() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = new Long(0L);
	    soldItem0.setId(long0);
	    assertEquals(0L, (long) soldItem0.getId());
	}

	@Test(timeout = 4000)
	public void testGetName() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    String string0 = soldItem0.getName();
	    assertNull(string0);
	}

	@Test(timeout = 4000)
	public void testGetPrice() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    double double0 = soldItem0.getPrice();
	    assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testToString() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    String string0 = soldItem0.toString();
	    assertEquals("SoldItem{id=null, name='null'}", string0);
	}

	@Test(timeout = 4000)
	public void testGetStockItem() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    StockItem stockItem0 = soldItem0.getStockItem();
	    assertNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void testGetSum() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setPrice(245.82064175486);
	    Integer integer0 = new Integer(2551);
	    soldItem0.setQuantity(integer0);
	    double double0 = soldItem0.getSum();
	    assertEquals(627088.4571166479, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testSetName() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setName((String) null);
	    assertNull(soldItem0.getName());
	}

	@Test(timeout = 4000)
	public void testGetQuantity() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 1362);
	    Integer integer0 = soldItem0.getQuantity();
	    assertEquals(1362, (int) integer0);
	}

	@Test(timeout = 4000)
	public void testSetStockItem() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = new Long(3605L);
	    StockItem stockItem0 = new StockItem(long0, "", "", 262.9161255, 2);
	    soldItem0.setStockItem(stockItem0);
	    assertEquals(262.9161255, stockItem0.getPrice(), 0.01);
	}

}