package com.yjm.principle.singleresponsibility;

public class SingleResponsibility3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle2 vehicle2 = new Vehicle2();
		vehicle2.runAir("�ɻ�");
		vehicle2.runWater("�ִ�");
		vehicle2.run("����");
}
}
//������������
//1.�����޸ķ�ʽ��ԭ������û�����ܴ���޸ģ�ֻ�������˷�����
//2.��Ȼ�������������û�����ص�һְ��ԭ�򣬵����ڷ�������������Ȼ���ص�һְ��


class Vehicle2 {
	public void run(String vehicle) {
		System.out.println(vehicle+"�ڹ�·������----");
	}
	
	public void runAir(String vehicle) {
		System.out.println(vehicle+"�����������----");
	}
	
	public void runWater(String vehicle) {
		System.out.println(vehicle+"��ˮ��������----");
	}
}
	
	
	
	
	
	
