package jeonggeun.spring.polymorphism;
public class SamsungTV implements TV{
	private Speaker speaker;
	private int price;
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() �޼ҵ� ȣ��");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("setPrice() �޼ҵ� ȣ��");
		this.price = price;
	}
	public SamsungTV() {
		System.out.println("SamsungTV ��ü ����");
	} 
	
	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV ��ü ���� : ������ ������");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV ��ü ���� : ������ ������ : ���߸���");
		this.speaker = speaker;
		this.price = price;
	}
	public Speaker getSpeaker() {
		return speaker;
	}
	public void powerOn() {
		System.out.println("SamsungTV ������ Ų��. (���� :"+price+")");
	}
	public void powerOff() {
		System.out.println("SamsungTV ������ ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}

}
