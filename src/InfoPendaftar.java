
public class InfoPendaftar {
	public int penggunaId;
	public String penggunaName;
	public int jumlahPendaftar;
	public String kolaboratorId;
	
	public void updateInfoPendaftar(int num){
		this.jumlahPendaftar = this.jumlahPendaftar + num;
	}
}
