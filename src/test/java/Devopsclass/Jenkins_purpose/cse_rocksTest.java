package Devopsclass.Jenkins_purpose;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cse_rocksTest {
	cse_rocks cal = new cse_rocks();
	@Test
	void test() {
		int result = cal.add(2,3);
		assertEquals(5,result);
	}

}
