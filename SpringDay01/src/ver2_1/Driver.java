package ver2_1;


//�����ڴ� ���� �����Ϸ��� �Ѵ�.
//(������ Ŭ���̾�Ʈ�� ��û�� ó���ؾ��Ѵ�.)
public class Driver {

	public static void main(String[] args) {
		//Car ��ü�� �����ϴ� Ÿ�̾ü�� �ܺο��� ������.
		KoreaTire t  = new KoreaTire();
//		ChinaTire t = new ChinaTire();
		Car myCar = new Car(t);
		
		myCar.printCarInfo();
	}

}
