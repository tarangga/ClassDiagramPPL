
public class Administrator extends Manusia implements iEditor {
	public String adminName;

	@Override
	public void hapusEvent(Event event) {
		event = null;
	}
	
	private Pelatihan tambahPelatihan(String name, int pelatihanId, String link, String jadwal, String kategori, String deskripsi) {
		Pelatihan pelatihan = new Pelatihan();
		pelatihan.pelatihanName = name;
		pelatihan.pelatihanId = pelatihanId;
		pelatihan.linkPelatihan = link;
		pelatihan.deskripsiPelatihan = jadwal + "\n" + deskripsi;
		pelatihan.kategoriPelatihan = kategori;
		return pelatihan;
	}
	
	private void editPelatihan(Pelatihan pelatihan, String name, int pelatihanId, String link, String jadwal, String kategori, String deskripsi) {
		pelatihan.pelatihanName = name;
		pelatihan.pelatihanId = pelatihanId;
		pelatihan.linkPelatihan = link;
		pelatihan.deskripsiPelatihan = jadwal + "\n" + deskripsi;
		pelatihan.kategoriPelatihan = kategori;
	}
	
	public void verifikasiEvent(Event event) {
		event.eventVerify = true;
	}


	@Override
	public void editEvent(Event event, String eventName, int kuotaEvent, String deskripsiEvent,
			boolean eventVerify, String linkEvent, String kategoriEvent) {
		event.deskripsiEvent = deskripsiEvent;
		event.eventName = eventName;
		event.kuotaEvent = kuotaEvent;
		event.eventVerify = eventVerify;
		event.kategoriEvent = kategoriEvent;
		
	}

	@Override
	public Event tambahEvent(String name, int eventId, int kuotaEvent, String deskripsiEvent, int kolaboratorId,
			String link, String kategoriEvent) {
		Event event = new Event();
		event.deskripsiEvent = deskripsiEvent;
		event.eventName = name;
		event.kuotaEvent = kuotaEvent;
		event.eventVerify = false;
		event.kategoriEvent = kategoriEvent;
		event.linkEvent = link;
		return event;
	}
}
