package ver1;

//Car ��ü��  Tire ��ü�� ������.
//(Service Ŭ���� ��ü�� DAO ��ü�� �ʿ���)
public class Car {
	
//	private KoreaTire tire;
	private ChinaTire tire;
	
	public Car(){
		//�����ϴ� ��ü�� ���� new Ű����� ����.
//		tire = new KoreaTire();
		tire = new ChinaTire();
	}
	public void printCarInfo(){
		System.out.println("���� ���� ���� Ÿ�̾�:"+tire.getModelChina());
	}

}
