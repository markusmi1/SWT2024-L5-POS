
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;
import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

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

}