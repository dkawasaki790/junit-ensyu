package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1(){
		ItemStock itemStock = new ItemStock();
		Item item = new Item("item", 100);
		assertEquals(0, itemStock.getNum(item), "TC1:期待値と実際の結果が異なります");
	}
	@Test
	void test2(){
		Item water = new Item("水", 300);
		ItemStock itemStock = new ItemStock();
		itemStock.add(water);
		assertEquals(1, itemStock.getNum(water), "TC2:期待値と実際の結果が異なります");
	}
	@Test
	void test3() {
		Item water = new Item("水", 300);
		ItemStock itemStock = new ItemStock();
		itemStock.add(water);
		assertEquals(1, itemStock.getNum(water), "TC3:期待値と実際の結果が異なります");
	}
	@Test
	void test4(){
		Item water = new Item("水", 300);
		ItemStock itemStock = new ItemStock();
		itemStock.add(water);
		itemStock.add(water);
		assertEquals(2, itemStock.getNum(water), "TC4:期待値と実際の結果が異なります");
	}
	@Test
	void test5(){
		Item water = new Item("水", 300);
		Item cola = new Item("コーラ",500);
		ItemStock itemStock = new ItemStock();
		itemStock.add(water);
		itemStock.add(cola);
		assertEquals(1, itemStock.getNum(cola), "TC5:期待値と実際の結果が異なります");
	}
}
