package jeonggeun.spring.lifecycle;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		
		System.out.println("5.�ʱ�ȭ ���� �� ���� ó���� ����");
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("8.�ʱ�ȭ �Ŀ� �� ���� ó���� ����");
		return bean;
	}

}
