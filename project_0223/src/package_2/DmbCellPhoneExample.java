package package_2;

class CellPhone {
	//필드
	String model;
	String color;
	
	//메소드	
	void powerOn() { System.out.println("전원을 켭니다."); }	
	void powerOff() { System.out.println("전원을 끕니다."); }
	void bell() { System.out.println("벨이 울립니다."); }	
	void sendVoice(String message) { System.out.println("자기: " + message); }	
	void receiveVoice(String message) { System.out.println("상대방: " + message); }	
	void hangUp() { System.out.println("전화를 끊습니다."); }
        }

class DmbCellPhone extends CellPhone {
	int channel; //필드
	
	//생성자
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	} 
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
         }

public class DmbCellPhoneExample { //단 여러개의 부모 클래스를 상속 받능 수 없습니다.
	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
	DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
	
	//CellPhone으로부터 상속 받은 필드
	System.out.println("모델: " + dmbCellPhone.model);
	System.out.println("색상: " + dmbCellPhone.color);
	
	//DmbCellPhone의 필드
	System.out.println("채널: " + dmbCellPhone.channel);
	
	//CellPhone으로부터 상속 받은 메소드 호출
	dmbCellPhone.powerOn();
	dmbCellPhone.bell();
	dmbCellPhone.sendVoice("여보세요");
	dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
	dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
	dmbCellPhone.hangUp();

	//DmbCellPhone의 메소드 호출
	dmbCellPhone.turnOnDmb();
	dmbCellPhone.changeChannelDmb(12);
	dmbCellPhone.turnOffDmb();
	}
}
