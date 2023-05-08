package jeonggeun.spring.test03;

public class MyBeanOne implements MyBean {
	
	@Override
	public void sayHello(String name) {
		System.out.println("Hello"+name+"!!!");
		
	}
}
