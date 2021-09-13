package sec03.exam01_equals;

public class Member {
	public String id;
	public int sno;
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {//비교할 대상
		if(obj instanceof Member) {
			Member member = (Member) obj;//형변환
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno;
	}
	
	
}
