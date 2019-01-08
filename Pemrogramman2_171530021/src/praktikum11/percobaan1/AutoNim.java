
package praktikum11.percobaan1;


public class AutoNim {
    
    public static void main(String args[]){
        // NIM : Tahun Masuk + Kode Prodi + Nomor Urut Registrasi
        String ta = "2015";
        String kode_Prodi = "153";
        String no_reg = "0001";
        String nim;
        
        nim = ta.substring(2, 9)+ kode_Prodi + no_reg;
        System.out.println("NIM : "+ nim);
    }
    
}
