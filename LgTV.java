package jeonggeun.spring.polymorphism;

public class LgTV implements TV{
	public LgTV() {
		System.out.println("Lg 객체 생성");
	}
	public void powerOn() {
		System.out.println("LgTV 전원을 킨다");
	}
	public void powerOff() {
		System.out.println("LgTV 전원을 끈다.");
	}
	public void volumeUp() {
		System.out.println("LgTV 볼륨을 올린다.");
	}
	public void volumeDown() {
		System.out.println("LgTV 볼륨을 내린다.");
	}

}
