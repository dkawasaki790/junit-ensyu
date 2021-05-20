package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

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
	void testIncrement1() {
		Counter.Counter();
		int num =Counter.increment();
		assertEquals(1, num, "TC1:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
	}
	@Test
	void testIncrement2() {
		Counter.Counter();
		Counter.increment();
		int num =Counter.increment();
		assertEquals(2, num, "TC2:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
		
	}
	@Test
	void testIncrement3() {
		Counter.Counter();
		for(int i=1; i<=50; i++) {
			Counter.increment();
		}
		int num =Counter.increment();
		assertEquals(51, num, "TC3:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
		
	}

}
