
public class Administrator extends Manusia implements iEditor {
	public String adminName;

	@Override
	public void tambahEvent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editEvent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Event hapusEvent() {
		Event event = null;
		return event;
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
}
