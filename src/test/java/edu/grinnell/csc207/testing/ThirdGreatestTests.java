package edu.grinnell.csc207.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import net.jqwik.api.*;
import net.jqwik.api.constraints.*;

public class ThirdGreatestTests {

	@Test
	public void exampleUnitTest() {
		int[] arr = { 3, 8, 4, 7, 2 };
		assertEquals(4, Functions.thirdGreatest(arr));
	}

	@Test
	public void duplicateTest() {
		int[] arr = { 5, 5, 5, 8, 9 };
		assertEquals(5, Functions.thirdGreatest(arr));
	}

	@Test
	public void descendingTest() {
		int[] arr = { 5, 4, 3, 2, 1 };
		assertEquals(3, Functions.thirdGreatest(arr));
	}

	@Test
	public void ascendingTest() {
		int[] arr = { 1, 2, 3, 4, 5 };
		assertEquals(3, Functions.thirdGreatest(arr));
	}

	@Property
	public boolean examplePropertyTest(@ForAll @IntRange(min = 1, max = 1000) int sz,
			@ForAll int k) {
		int[] arr = new int[sz];
		for (int i = 0; i < sz; i++) {
			arr[i] = k;
		}
		return Functions.thirdGreatest(arr) == k;
	}

	@Property
	public boolean increasingArray(@ForAll @IntRange(min = 3, max = 1000) int sz,
			@ForAll int start) {

		int[] arr = new int[sz];
		for (int i = 0; i < sz; i++) {
			arr[i] = start + i;
		}
		return Functions.thirdGreatest(arr) == arr[sz - 3];
	}

	@Property
	public boolean lengthOne(@ForAll int k) {
		int[] arr = new int[1];
		arr[0] = k;
		return Functions.thirdGreatest(arr) == k;
	}
}
