package ver2_2;

//운전자는 차를 운전하려고 한다.
//(서블릿은 클라이언트의 요청을 처리해야한다.)
public class Driver {

	public static void main(String[] args) {
		Car myCar = new Car();
//		Tire t = new KoreaTire();
		Tire t = new ChinaTire();

		myCar.setTire(t);// 조립

		myCar.printCarInfo();
	}

}
