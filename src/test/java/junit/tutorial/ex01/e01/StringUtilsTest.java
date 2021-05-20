package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

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
	void test1() {
		String word = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", word, "TC1:期待値と実際の結果が異なります");
	}
	@Test
	void test2() {
		String word = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", word, "TC2:期待値と実際の結果が異なります");
	}
	@Test
	void test3() {
		String word = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", word, "TC3:期待値と実際の結果が異なります");
	}


}
