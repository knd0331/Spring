package ver5;

import org.springframework.stereotype.Component;

@Component("sonata")
public class Car {
	
	private Tire tire;
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}


	public void printCarInfo() {
		System.out.println("���� ���� ���� Ÿ�̾�:" + tire.getModel());
	}

}
