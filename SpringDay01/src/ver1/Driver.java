package ver1;


//운전자는 차를 운전하려고 한다.
//(서블릿은 클라이언트의 요청을 처리해야한다.)
public class Driver {

	public static void main(String[] args) {
		//의존하는 객체를 직접 new 키워드로 생성.
		Car myCar = new Car();
		
		myCar.printCarInfo();
	}

}
