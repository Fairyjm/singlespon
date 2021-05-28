package com.yjm.principle.singleresponsibility;

public class SingleResponsibility3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle2 vehicle2 = new Vehicle2();
		vehicle2.runAir("飞机");
		vehicle2.runWater("轮船");
		vehicle2.run("汽车");
}
}
//方案三分析：
//1.这种修改方式对原来的类没有做很大的修改，只是增添了方法。
//2.虽然在类这个级别上没有遵守单一职责原则，但是在方法级别上面仍然遵守单一职责


class Vehicle2 {
	public void run(String vehicle) {
		System.out.println(vehicle+"在公路上运行----");
	}
	
	public void runAir(String vehicle) {
		System.out.println(vehicle+"在天空上运行----");
	}
	
	public void runWater(String vehicle) {
		System.out.println(vehicle+"在水中上运行----");
	}
}
	
	
	
	
	
	
