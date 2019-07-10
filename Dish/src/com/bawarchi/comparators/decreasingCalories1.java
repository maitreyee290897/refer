package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;

public class decreasingCalories1 implements Comparator<Dish>{
	@Override
	public int compare(Dish a,Dish b) {
		return (int)(b.getCalories() - a.getCalories());
		//return Integer.valueOf(b.getCalories()).compareTo(a.getCalories());
	}
}