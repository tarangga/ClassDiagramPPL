
public interface iEditor {
	public Event tambahEvent(String name, int eventId, int kuota, String deskripsi, int kolaboratorId, String link, String kategoriEvent);
    public void editEvent(Event event,String eventName, int kuotaEvent, String deskripsiEvent, boolean eventVerify, String linkEvent, String kategoriEvent);
    public void hapusEvent(Event event);
}
