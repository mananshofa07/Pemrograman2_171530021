
package praktikum8.percobaan1;


public class siswa {
    
    int no_absen;
    String nis, nama_siswa, tmp_lahit, tgl_lahir;
    double nilai_ipa, nilai_ips;
    
    public void infosiswa(){
        System.out.println("------------- DATA SISWA --------------");
    }
    
    public void setNis(String i){
        nis = i;
    }
    
    public void setNama(String i){
        nama_siswa = i;
    }
    
    public void setTtl(String i, String j){
        tmp_lahit = i;
        tgl_lahir = j;
    }
    
    public void setNilai(double nipa, double nips){
        nilai_ipa = nipa;
        nilai_ips = nips;
    }
    
    
}
