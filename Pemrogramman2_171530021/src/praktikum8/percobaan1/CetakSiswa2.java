
package praktikum8.percobaan1;


public class CetakSiswa2 {
    
    public static void main(String args[]){
        siswa data = new siswa();
        data.infosiswa();
        
        data.no_absen = 1;
        System.out.println("No. Absen\t\t: "+data.no_absen);
        
        data.setNis("160001");
        System.out.println("NIS\t\t\t : "+data.nis);
        
        data.setNama("Zidna Aisya Karima");
        System.out.println("Nama Mahasiswa\t\t : "+data.nama_siswa);
        
        data.setTtl("Pekalongan", "14-08-1997");
        System.out.println("Tempat, Tgl Lahir\t: "+data.tmp_lahit +", "+data.tgl_lahir);
        
        data.setNilai(75.5, 80.75);
        System.out.println("Nilai IPA\t\t : "+data.nilai_ipa);
        System.out.println("NIlai IPS\t\t : "+data.nilai_ips);
    }
    
}
