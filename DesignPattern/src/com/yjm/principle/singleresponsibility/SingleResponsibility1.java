package com.yjm.principle.singleresponsibility;

public class SingleResponsibility1 {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run("Ħ�г�");
		vehicle.run("����");
		vehicle.run("�ɻ�");
	}
}

//��ͨ������
//��ʽ1
//��ʽ1��run�����У�Υ���˵�һְ��ԭ�򣬽���������ݽ�ͨ�������з�����ͬ���ֽ�ɲ�ͬͬ�༴�ɣ�
class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle+"�ڹ�·������----");
	}
}