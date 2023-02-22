package com.newcomb.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MainTest {
	@BeforeAll
	public static void setup() {
		System.out.println("Before All");
	}
	@Test
	public void assertTest() {
		assertTrue(true);
	}
	@ParameterizedTest
	@CsvSource({
		"10,20,30",
		"100,200,300"
	})
	public void paramsTest(int a,int b, int result) {
		assertEquals(result, (a + b));
	}
	@AfterAll
	public static void tearDown() {
		System.out.println("After All");
	}
}
