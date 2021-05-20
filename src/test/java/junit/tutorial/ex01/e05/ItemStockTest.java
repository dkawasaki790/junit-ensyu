package junit.tutorial.ex01.e05;

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
		ItemStock.getNum(name);
	}
	@Test
	void test2(){
		ItemStock.add(Item name);
		ItemStock.getNum(Item name);
	}
	@Test
	void test3(){
		ItemStock.getNum(Item name);
	}
	@Test
	void test4(){
		ItemStock.add(Item name);
		ItemStock.getNum(Item name);
	}
	@Test
	void test5(){
		ItemStock.add(Item name);
		ItemStock.getNum(Item name);
	}

}
