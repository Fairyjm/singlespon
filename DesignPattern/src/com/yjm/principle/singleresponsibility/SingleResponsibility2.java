package com.yjm.principle.singleresponsibility;

public class SingleResponsibility2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoadVehicle roadVehicle = new RoadVehicle();
		roadVehicle.run("Ħ�г�");
		roadVehicle.run("����");
		
		 AirVehicle airVehicle = new  AirVehicle();
		 airVehicle.run("�ɻ�");
	}
}
//�������ķ�����
//1.���ص�һְ��ԭ��
//2.�����������Ķ��ܴ󣬼�����ֽ⣬ͬʱ�޸Ŀͻ���
//3.ֱ���޸�vehicle�࣬�Ķ��Ĵ����Ƚ���==>������



class RoadVehicle{
	public void run(String vehicle ) {
		System.out.println(vehicle+"�ڹ�·����--");
		}
}
class AirVehicle{
	public void run(String vehicle ) {
		System.out.println(vehicle+"���������--");
		}
}
class WaterVehicle{
	public void run(String vehicle ) {
		System.out.println(vehicle+"��ˮ������--");
		}
}
	
