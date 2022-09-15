package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import characters.Entity;

class EntityTest {
	Entity entity;
	@BeforeEach
	public void beforeEveryTest() {
		entity = new Entity("Testboi",5,5);
	}
	
	//Tests
	@Test
	void nameChangeTest() {
		fail("Not yet implemented");
	}
	@Test
	void nameGetTest() {
		fail("Not yet implemented");
	}
	@Test
	void healthChangeTest() {
		fail("Not yet implemented");
	}
	@Test
	void healthGetTest() {
		fail("Not yet implemented");
	}
	@Test
	void attackSetTest() {
		fail("Not yet implemented");
	}
	void attackGetTest() {
		fail("Not yet implemented");
	}

}
