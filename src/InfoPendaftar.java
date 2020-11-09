
public class InfoPendaftar {
	public int penggunaId;
	public String penggunaName;
	public int jumlahPendaftar;
	public String kolaboratorId;
	
	public String getPendaftar(int penggunaId) {
		if (penggunaId == this.penggunaId) {
			return this.penggunaName;
		}
		return "";
	}
}
