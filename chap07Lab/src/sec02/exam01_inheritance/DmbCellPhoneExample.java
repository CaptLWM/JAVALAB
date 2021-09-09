package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);//1,2는 super, 3은 자식
		//다른 생성자가 있기 때문에 자동으로 기본생성자 생성 안됨, 입력해줘야함
		
		//CellPhone의 필드(부모 클래스(superclass))
		System.out.println("모델:"+dmbCellPhone.model);
		System.out.println("색상:"+dmbCellPhone.color);
		
		//DmbCellPhone의 필드(자식 클래스)
		System.out.println("채널:"+dmbCellPhone.channel);
		
		//CellPhone으로부터 상속 받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoce("안녕하세요 저는 홍길동입니다.");
		dmbCellPhone.sendVoice("아 반갑습니다.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb(); 
	}

}
