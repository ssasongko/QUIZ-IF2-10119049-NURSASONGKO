package quiz.if2.pkg10119049.nursasongko;

/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program Kasir Potong Rambut.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Customer implements CustomerInvoice{
    
    
    private String name;
    private String email;
    private boolean member;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMember(){
        return member;
    }
    
    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public String currentTime() {
       Calendar cal = Calendar.getInstance();
       SimpleDateFormat tanggalIni = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
   
       return tanggalIni.format(cal.getTime());
    }
            
    
}
