package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;

public class increasingCalories implements Comparator<Dish>{
	@Override
	public int compare(Dish a,Dish b) {
		return (int)(a.getCalories() - b.getCalories());
	}
}