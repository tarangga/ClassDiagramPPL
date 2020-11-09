
public class Kolaborator extends Manusia implements iEditor {

	@Override
	public Event tambahEvent(String name, int eventId, int kuota, String deskripsi, int kolaboratorId, String link,
			String kategoriEvent) {
		Event event = new Event();
		event.deskripsiEvent = deskripsi;
		event.eventName = name;
		event.kuotaEvent = kuota;
		event.eventVerify = false;
		event.kategoriEvent = kategoriEvent;
		event.linkEvent = link;
		return event;
	}

	@Override
	public void editEvent(Event event, String eventName, int kuotaEvent, String deskripsiEvent, boolean eventVerify,
			String linkEvent, String kategoriEvent) {
		event.deskripsiEvent = deskripsiEvent;
		event.eventName = eventName;
		event.kuotaEvent = kuotaEvent;
		event.eventVerify = eventVerify;
		event.kategoriEvent = kategoriEvent;
		
		
	}

	@Override
	public void hapusEvent(Event event) {
		event = null;		
	}
	
	public void register(int userId, String email, String password, String kolaboratorName){
		  Register Register = new Register();
		  Register.kolaboratorId = userId;
		  Register.kolaboratorPass = password;
		  Register.kolaboratorName = kolaboratorName;
		  return Register;
		 }

}
