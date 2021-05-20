package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CounterTest {
	
	@Nested
	@DisplayName("初期状態の場合")
	class test1 {
		Counter sut;

		@BeforeEach
		void setUp() throws Exception {
			sut = new Counter();
		}
		
		@Test
		@DisplayName("incrementで1が取得できる")
		void test1_1() {
			assertEquals(1, sut.increment());
		}
		
	}

	@Nested
	@DisplayName("1回実行後")
	class test2 {
		Counter sut;

		@BeforeEach
		void setUp() throws Exception {
			sut = new Counter();
			sut.increment();
		}
		
		@Test
		@DisplayName("incrementで2が取得できる")
		void test2_1() {
			assertEquals(2, sut.increment());
		}
		
	}

	@Nested
	@DisplayName("50回実行後")
	class test3 {
		Counter sut;

		@BeforeEach
		void setUp() throws Exception {
			sut = new Counter();
			for (int i = 0; i < 50; i++) {
				sut.increment();
			}
		}
		
		@Test
		@DisplayName("incrementで51が取得できる")
		void test3_1() {
			assertEquals(51, sut.increment());
		}
		
	}


//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}
//
//	@BeforeEach
//	void setUp() throws Exception {
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//	}
//
//	@Test
//	void testIncrement1() {
//		Counter counter = new Counter();
//		int num =counter.increment();
//		assertEquals(1, num, "TC1:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
//	}
//	@Test
//	void testIncrement2() {
//		Counter counter = new Counter();
//		counter.increment();
//		int num =counter.increment();
//		assertEquals(2, num, "TC2:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
//		
//	}
//	@Test
//	void testIncrement3() {
//		Counter counter = new Counter();
//		for(int i=1; i<=50; i++) {
//			counter.increment();
//		}
//		int num =counter.increment();
//		assertEquals(51, num, "TC3:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
//		
//	}

}
