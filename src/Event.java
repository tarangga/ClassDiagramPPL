
public class Event {
	public String eventName;
	public int eventId;
	public int kuotaEvent;
	public String deskripsiEvent;
	public int kolaboratorId;
	public String linkEvent;
	public String kategoriEvent;
	public boolean eventVerify;
	
	public String daftarEvent() {
		return this.linkEvent;
	}
	
}
