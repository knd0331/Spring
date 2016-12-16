package ver6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("sonata")
public class Car {

	// component 없을때
	// @Autowired(required=false)
	private Tire tire;

	//
	// public Car(){}
	//
////	@Autowired
//	public Car(Tire tire) {
//
//	}

	@Autowired // 조립
	@Qualifier("koreaTire") // Tire선택
	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public void printCarInfo() {
		System.out.println("현재 차량 장착 타이어:" + tire.getModel());
	}

}
