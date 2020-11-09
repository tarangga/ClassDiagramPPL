
public class Manusia {
	public int userid;
	public String email;
	public String password;
	
	public boolean verifyLogin(int userid, String password) {
		if(this.userid == userid) {
			if(password.equals(this.password)) {
				return true;
			}
		}
		
		return false;
	}
}
