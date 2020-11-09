class Teknisi extends Manusia{
    public boolean verifikasiEmailKolaborator(String emailKolaborator, String passwordKolaborator){
        if(this.email == emailKolaborator){
            if(this.password == passwordKolaborator){
                System.out.println("Login berhasil");
                return true;
            }
        }
        else{
            System.out.println("Maaf, email atau password yang Anda masukkan salah");
        }
        return false;

    }
    public boolean verifikasiEmailPengguna(String emailPengguna, String passwordPengguna){
        if(this.email == emailPengguna){
            if(this.password == passwordPengguna){
                System.out.println("Login berhasil");
                return true;
            }
        }
        else{
            System.out.println("Maaf, email atau password yang Anda masukkan salah");
        }
        return false;

    }
}