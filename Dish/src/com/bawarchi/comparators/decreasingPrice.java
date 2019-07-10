package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;

public class decreasingPrice implements Comparator<Dish>{
	public int compare(Dish a,Dish b) {
		return (int)(a.getPrice() - b.getPrice());
	}
}