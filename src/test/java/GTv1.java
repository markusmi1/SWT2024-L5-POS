

import ee.ut.math.tvt.salessystem.dataobjects.StockItem;
import ee.ut.math.tvt.salessystem.logic.ShoppingCart;
import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO;
import ee.ut.math.tvt.salessystem.dataobjects.SoldItem;
import java.util.List;

public class GTv1 {

	@Test(timeout = 4000)
	public void testGetAll() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    List<SoldItem> list0 = shoppingCart0.getAll();
	    assertTrue(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void testCancelCurrentPurchase() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    shoppingCart0.cancelCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testAddItemAndSubmitCurrentPurchase() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    SoldItem soldItem0 = new SoldItem();
	    shoppingCart0.addItem(soldItem0);
	    shoppingCart0.submitCurrentPurchase();
	}
	@Test(timeout = 4000)
	public void testGetId() throws Throwable {
		Long long0 = Long.valueOf(899L);
		StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
		stockItem0.getId();
		assertEquals("", stockItem0.getName());
		assertEquals(899.0, stockItem0.getPrice(), 0.01);
		assertEquals(204, stockItem0.getQuantity());
		assertEquals("}$", stockItem0.getDescription());
	}

	@Test(timeout = 4000)
	public void testSetId() throws Throwable {
		Long long0 = Long.valueOf(899L);
		StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
		stockItem0.setId(long0);
		assertEquals(204, stockItem0.getQuantity());
		assertEquals("", stockItem0.getName());
		assertEquals(899.0, stockItem0.getPrice(), 0.01);
		assertEquals("}$", stockItem0.getDescription());
	}

	@Test(timeout = 4000)
	public void testGetName() throws Throwable {
		Long long0 = new Long(0L);
		StockItem stockItem0 = new StockItem(long0, "StockItem{id=%d, name='%s'}", "j{8K2f8Y0:jE0", 0L, (-411));
		String string0 = stockItem0.getName();
		assertEquals("StockItem{id=%d, name='%s'}", string0);
		assertEquals((-411), stockItem0.getQuantity());
		assertEquals(0.0, stockItem0.getPrice(), 0.01);
		assertEquals("j{8K2f8Y0:jE0", stockItem0.getDescription());
	}

	@Test(timeout = 4000)
	public void testToString() throws Throwable {
		StockItem stockItem0 = new StockItem();
		String string0 = stockItem0.toString();
		assertEquals("StockItem{id=null, name='null'}", string0);
	}

	@Test(timeout = 4000)
	public void testGetPrice() throws Throwable {
		Long long0 = new Long(0L);
		StockItem stockItem0 = new StockItem(long0, "StockItem{id=%d, name='%s'}", "j{8K2f8Y0:jE0", 0L, (-411));
		double double0 = stockItem0.getPrice();
		assertEquals((-411), stockItem0.getQuantity());
		assertEquals("j{8K2f8Y0:jE0", stockItem0.getDescription());
		assertEquals("StockItem{id=%d, name='%s'}", stockItem0.getName());
		assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testSetDescription() throws Throwable {
		StockItem stockItem0 = new StockItem();
		stockItem0.setDescription("");
		assertEquals(0, stockItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testSetPrice() throws Throwable {
		Long long0 = Long.valueOf(899L);
		StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
		stockItem0.setPrice(899L);
		assertEquals("}$", stockItem0.getDescription());
		assertEquals("", stockItem0.getName());
		assertEquals(204, stockItem0.getQuantity());
		assertEquals(899.0, stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testSetQuantity() throws Throwable {
		Long long0 = Long.valueOf(899L);
		StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
		stockItem0.setQuantity(0);
		assertEquals(0, stockItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetDescription() throws Throwable {
		Long long0 = Long.valueOf(899L);
		StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
		String string0 = stockItem0.getDescription();
		assertEquals(204, stockItem0.getQuantity());
		assertEquals("}$", string0);
		assertEquals("", stockItem0.getName());
		assertEquals(899.0, stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testSetName() throws Throwable {
		Long long0 = Long.valueOf(899L);
		StockItem stockItem0 = new StockItem(long0, "", "}$", 899L, 204);
		assertEquals("", stockItem0.getName());
		stockItem0.setName("}$");
		assertEquals(204, stockItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetQuantity() throws Throwable {
		Long long0 = new Long(0L);
		StockItem stockItem0 = new StockItem(long0, "StockItem{id=%d, name='%s'}", "j{8K2f8Y0:jE0", 0L, (-411));
		int int0 = stockItem0.getQuantity();
		assertEquals((-411), int0);
		assertEquals("j{8K2f8Y0:jE0", stockItem0.getDescription());
		assertEquals(0.0, stockItem0.getPrice(), 0.01);
		assertEquals("StockItem{id=%d, name='%s'}", stockItem0.getName());
	}
	@Test(timeout = 4000)
	public void testGetId1() throws Throwable {
		StockItem stockItem0 = new StockItem();
		SoldItem soldItem0 = new SoldItem(stockItem0, 389);
		soldItem0.getId();
		assertEquals(389, (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testSetId1() throws Throwable {
		SoldItem soldItem0 = new SoldItem();
		Long long0 = new Long(0L);
		soldItem0.setId(long0);
		assertEquals(0L, (long) soldItem0.getId());
	}

	@Test(timeout = 4000)
	public void testGetName1() throws Throwable {
		SoldItem soldItem0 = new SoldItem();
		String string0 = soldItem0.getName();
		assertNull(string0);
	}

	@Test(timeout = 4000)
	public void testGetPrice1() throws Throwable {
		SoldItem soldItem0 = new SoldItem();
		double double0 = soldItem0.getPrice();
		assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testToString1() throws Throwable {
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
	public void testSetName1() throws Throwable {
		SoldItem soldItem0 = new SoldItem();
		soldItem0.setName((String) null);
		assertNull(soldItem0.getName());
	}

	@Test(timeout = 4000)
	public void testGetQuantity1() throws Throwable {
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
	@Test(timeout = 4000)
	public void testBeginTransaction() throws Throwable {
		InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
		inMemorySalesSystemDAO0.beginTransaction();
	}

	@Test(timeout = 4000)
	public void testRollbackTransaction() throws Throwable {
		InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
		inMemorySalesSystemDAO0.rollbackTransaction();
	}

	@Test(timeout = 4000)
	public void testCommitTransaction() throws Throwable {
		InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
		inMemorySalesSystemDAO0.commitTransaction();
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningStockItemWhereGetPriceIsPositive() throws Throwable {
		InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
		StockItem stockItem0 = inMemorySalesSystemDAO0.findStockItem(3L);
		assertEquals("Beer sauseges", stockItem0.getDescription());
		assertEquals(12, stockItem0.getQuantity());
		assertNotNull(stockItem0);
		assertEquals("Frankfurters", stockItem0.getName());
		assertEquals(15.0, stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testFindStockItems() throws Throwable {
		InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
		List<StockItem> list0 = inMemorySalesSystemDAO0.findStockItems();
		assertEquals(4, list0.size());
	}

	@Test(timeout = 4000)
	public void testSaveStockItem() throws Throwable {
		InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
		Long long0 = Long.getLong("StockItem{id=%d, name='%s'}", 1L);
		StockItem stockItem0 = new StockItem(long0, "StockItem{id=%d, name='%s'}", "StockItem{id=%d, name='%s'}", 1L, 717);
		inMemorySalesSystemDAO0.saveStockItem(stockItem0);
		assertEquals("StockItem{id=%d, name='%s'}", stockItem0.getName());
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningNull() throws Throwable {
		InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
		StockItem stockItem0 = inMemorySalesSystemDAO0.findStockItem(0L);
		assertNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void testSaveSoldItem() throws Throwable {
		InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
		SoldItem soldItem0 = new SoldItem();
		inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
		assertNull(soldItem0.getQuantity());
	}

}