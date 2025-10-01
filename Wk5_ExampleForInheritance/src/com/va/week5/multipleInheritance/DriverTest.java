package com.va.week5.multipleInheritance;

public class DriverTest {

	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.waterInfo();
		
		
		WaterVehicle s2 = new Sample();
		s2.waterInfo();
		// can only access interface specific method only..
		

		LandVehicle l1 = new Sample();
		l1.landInfo();
		
		
	}
}
