package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ItemStockTest {
	@Nested
	@DisplayName("初期状態の場合")
	class test1 {
		ItemStock sut;
		Item book;

//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}

		@BeforeEach
		void setUp() throws Exception {
			book = new Item("book", 3800);
			sut = new ItemStock();
		}

		@AfterEach
		void tearDown() throws Exception {
		}
		@Test
		@DisplayName("初期状態でgetNum(book)で0")
		void test1_1() {
			assertEquals(0, sut.getNum(book));
		}
	
		@Test
		@DisplayName("add(book)後getNum(book)で1")
		void test1_2() {
			sut.add(book);
			assertEquals(1, sut.getNum(book));
		}
	}
	@Nested
	@DisplayName("bookが1回追加されている場合")
	class test2 {
		ItemStock sut;
		Item book;
		@BeforeEach
		void setUp() throws Exception {
			book = new Item("book", 3800);
			sut = new ItemStock();
			sut.add(book);
		}
		
		@Test
		@DisplayName("getNum(book)で1を返す")
		void test2_1() {
			assertEquals(1, sut.getNum(book));
		}
		
		@Test
		@DisplayName("add(book)後getNum(book)で2")
		void test2_2() {
			sut.add(book);
			assertEquals(2, sut.getNum(book));
		}
		
		@Test
		@DisplayName("add(bike)後getNum(bike)で1,getNum(book)も1")
		void test2_3() {
			Item bike = new Item("bike", 100000);
			sut.add(bike);
			assertEquals(1, sut.getNum(bike));
			assertEquals(1, sut.getNum(book));
		}
		
		
	}

//	@Test
//	void test1(){
//		ItemStock itemStock = new ItemStock();
//		Item item = new Item("item", 100);
//		assertEquals(0, itemStock.getNum(item), "TC1:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
//	}
//	@Test
//	void test2(){
//		Item water = new Item("��", 300);
//		ItemStock itemStock = new ItemStock();
//		itemStock.add(water);
//		assertEquals(1, itemStock.getNum(water), "TC2:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
//	}
//	@Test
//	void test3() {
//		Item water = new Item("��", 300);
//		ItemStock itemStock = new ItemStock();
//		itemStock.add(water);
//		assertEquals(1, itemStock.getNum(water), "TC3:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
//	}
//	@Test
//	void test4(){
//		Item water = new Item("��", 300);
//		ItemStock itemStock = new ItemStock();
//		itemStock.add(water);
//		itemStock.add(water);
//		assertEquals(2, itemStock.getNum(water), "TC4:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
//	}
//	@Test
//	void test5(){
//		Item water = new Item("��", 300);
//		Item cola = new Item("�R�[��",500);
//		ItemStock itemStock = new ItemStock();
//		itemStock.add(water);
//		itemStock.add(cola);
//		assertEquals(1, itemStock.getNum(cola), "TC5:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
//	}
}
