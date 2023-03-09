package com.coderscampus;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Assignment7Test  {
	@Test
	void add_AddItemToList_True() {
		var list = new CustomArrayList<>();
		assertTrue(list.add("Items"));
	}
	@Test
	void add_IncreasesAsItemsAreAdded_True() {
		var list = new CustomArrayList<>();
		for (int i = 0; i<20; i++) {
			assertTrue(list.add(i));
		}
		assertEquals(20, list.items.length);
	}

	void add_InsertsNullItem_True() {
		var list = new CustomArrayList<>();
		assertTrue(list.add(null));
		assertEquals(null,list.get(0));
	}
	
	@Test
	void add_AddItemToListAndShiftRight_True() {
		var list = new CustomArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		int index = 1;
		int newItem = 5;
		
		list.add(index, newItem);
		
		assertEquals(5, list.getSize());
		assertEquals(1, (int) list.get(0));
		assertEquals(newItem, (int) list.get(index));
		assertEquals(2, (int) list.get(index + 1));
		assertEquals(3, (int) list.get(index + 2));
		assertEquals(4, (int) list.get(index + 3));
		
	}
	
	@Test
	public void add_AddsItemToIndexThatDoesNotExist_False() {
		var list = new CustomArrayList<>();
	    list.add(1);
	    list.add(2);

	    int newItem = 3;

	    assertThrows(IndexOutOfBoundsException.class, () -> {
	        list.add(5, newItem);
	    });
	}
	@Test
	public void remove_RemovesItemFromGivenIndex_True() {
		var list = new CustomArrayList<>();
		list.add("Item1");
		list.add("Item2");
		list.add("Item3");
		list.add("Item4");
		list.remove(2);
		assertEquals(3, list.getSize());
	}
	
	@Test
	public void remove_RemovesAtIndexThatDoesNotExist_False() {
		var list = new CustomArrayList<>();
	    list.add(1);
	    list.add(2);

	    int newItem = 3;

	    assertThrows(IndexOutOfBoundsException.class, () -> {
	        list.add(5, newItem);
	    });
	}
	
	
	
	
	

}