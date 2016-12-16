package test02_interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Sample implements InitializingBean, DisposableBean {

	public Sample() {
		System.out.println("Sample ������");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Sample�� �������̽� �޼ҵ�:afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Sample�� �������̽� �޼ҵ�:destroy()");
	}

}
