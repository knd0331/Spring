package ver6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("sonata")
public class Car {

	// component ������
	// @Autowired(required=false)
	private Tire tire;

	//
	// public Car(){}
	//
////	@Autowired
//	public Car(Tire tire) {
//
//	}

	@Autowired // ����
	@Qualifier("koreaTire") // Tire����
	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public void printCarInfo() {
		System.out.println("���� ���� ���� Ÿ�̾�:" + tire.getModel());
	}

}
