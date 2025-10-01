package com.va.week5.multipleInheritance;

public interface WaterVehicle {
	
	default void waterInfo() {
		System.out.println("This is waterInfo.");

	}

}
