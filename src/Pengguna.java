public class Pengguna extends Manusia {

    public String penggunaName;
    
    public void cari(String keyword ){
        //
    }
    

    public String daftarPelatihan(Pelatihan pelatihan){
         return pelatihan.linkPelatihan;
         
   }
    
     public String daftarEvent(Event event){
          return event.linkEvent;
         
   }
    

    public void isiFormulirEvent(String penggunaName, String email ){
        this.penggunaName = penggunaName;
        this.email  = email;
        
    }
    
}
