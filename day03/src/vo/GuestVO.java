package vo;

public class GuestVO {
	private int guestNumber;
	private String guestName;
	private String guestBirth;
	
	public GuestVO() {;}
	
	public int getGuestNumber() {
		return guestNumber;
	}
	public void setGuestNumber(int guestNumber) {
		this.guestNumber = guestNumber;
	}
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
	
	@Override
	public String toString() {
		return guestNumber + "," + guestName + "," + guestBirth;
	}
	
}
