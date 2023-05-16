package jeonggeun.spring.polymorphism;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@Component("tv")
public class LgTV implements TV{
	
	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("Lg ��ü ����");
	}
	public void powerOn() {
		System.out.println("LgTV ������ Ų��");
	}
	public void powerOff() {
		System.out.println("LgTV ������ ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}