package jeonggeun.spring.collection;

import java.util.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		CollectionBean bean = (CollectionBean)
				factory.getBean("collectionBean");
		Set<String> addressList = bean.getAddressList();
		for (String key : addressList) {
			System.out.println(key);
		}
	}
}