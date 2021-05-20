package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

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
	void test() throws FileNotFoundException {
		
		InputStream input = getClass().getResourceAsStream("Employee.txt");
		List<Employee> actual = Employee.load(input);
		Employee employee = actual.get(0);
		assertAll("csv",
				() -> assertEquals(1, actual.size()),
				() -> assertEquals("Ichiro", employee.getFirstName()),
				() -> assertEquals("Tanaka", employee.getLastName()),
				() -> assertEquals("ichiro@example.com", employee.getEmail())
			);
		

//		InputStream input = getClass().getResourceAsStream("Employee.txt");
//		List<Employee> list = Employee.load(input);
//					
//		List<String> expectedResults = Arrays.asList("Ichiro","Tanaka","ichiro@example.com");
//		assertEquals(expectedResults.get(0),list.get(0),"TC:不正です");
//		assertEquals(expectedResults.get(1),list.get(1),"TC:不正です");
//		assertEquals(expectedResults.get(2),list.get(2),"TC:不正です");

	}
}
