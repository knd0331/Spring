package ver1_2;

public class Car {
	
	private Tire tire;
	
	public Car(){
		tire = new KoreaTire();
//		tire = new ChinaTire();
	}
	
	public void printCarInfo(){
		System.out.println("���� ���� ���� Ÿ�̾�:"+tire.getModel());
	}
}
