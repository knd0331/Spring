package ver2_2;

//�����ڴ� ���� �����Ϸ��� �Ѵ�.
//(������ Ŭ���̾�Ʈ�� ��û�� ó���ؾ��Ѵ�.)
public class Driver {

	public static void main(String[] args) {
		Car myCar = new Car();
//		Tire t = new KoreaTire();
		Tire t = new ChinaTire();

		myCar.setTire(t);// ����

		myCar.printCarInfo();
	}

}
