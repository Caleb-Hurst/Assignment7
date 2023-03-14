package com.coderscampus;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList {
	private int size = 0;
	Object[] items = new Object[10];

	@Override
	public boolean add(Object item) {
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
		items[size] = item;
		size++;
		return true;

	}

	@Override
	public boolean add(int index, Object item) throws IndexOutOfBoundsException {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index out of range: " + index);
		}
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
		for (int i = size; i > index; i--) {
			items[i] = items[i - 1];
		}
		items[index] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
				count++;
			}
		}
		return count;
	}

	@Override
	public Object get(int index) {
		T input = (T) items[index];
		return input;
	}

	@Override
	public Object remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index out of range " + index);
		}
		Object removedItem = items[index];
		for (int i = index; i < size-1; i++) {
			items[i] = items[i + 1];
		}
		size--;
		items[size] = null;
		return removedItem;
	}

}
