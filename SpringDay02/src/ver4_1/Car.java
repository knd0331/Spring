package ver4_1;


public class Car {
	
	private Tire tire;
	
	public Car(Tire tire) {
		this.tire = tire;
	}


	public void printCarInfo() {
		System.out.println("���� ���� ���� Ÿ�̾�:" + tire.getModel());
	}

}
