package vo;

public class GuestVO {

	private String guestName;
	private String guestBirth;
	private int guestNumber;
	
	
	public GuestVO() {;}
	
	
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getGuestBirth() {
		return guestBirth;
	}
	public void setGuestBirth(String guestBirth) {
		this.guestBirth = guestBirth;
	}
	public int getGuestNumber() {
		return guestNumber;
	}
	public void setGuestNumber(int guestNumber) {
		this.guestNumber = guestNumber;
	}


	@Override
	public String toString() {
		return "GuestVO [guestName=" + guestName + ", guestBirth=" + guestBirth + ", guestNumber=" + guestNumber + "]";
	}
	
	
	
	
}
