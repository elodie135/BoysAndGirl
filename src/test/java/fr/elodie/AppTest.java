package fr.elodie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class AppTest {

	/**
	 * Rigorous Test.
	 */
	@Test
	void testApp() {
		assertEquals("Hello World", App.helloBoyAndGirl());
	}

	void testJoseph() {
		assertEquals("Hello Joseph", App.helloBoyAndGirl());
	}
}
