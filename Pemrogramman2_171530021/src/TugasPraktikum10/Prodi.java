
package TugasPraktikum10;


class Prodi {
    public String kd_prodi;
    public String prodi;

    public Prodi( ) {
        
    }

    public String getKd_prodi() {
        return kd_prodi;
    }

    public void setKdprodi_(String kd_prodi) {
        this.kd_prodi = kd_prodi;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    
}

class Matakuliah extends Prodi{
    public String kd_matkul;
    public String nama_matkul;
    public String kd_dosen;
    public String nama_dosen;
        
        public Matakuliah(){
           
        }

    public String getKd_matkul() {
        return kd_matkul;
    }

    public void setKd_matkul(String kd_matkul) {
        this.kd_matkul = kd_matkul;
    }

    public String getNama_matkul() {
        return nama_matkul;
    }

    public void setNama_matkul(String nama_matkul) {
        this.nama_matkul = nama_matkul;
    }

    public String getKd_dosen() {
        return kd_dosen;
    }

    public void setKd_dosen(String kd_dosen) {
        this.kd_dosen = kd_dosen;
    }

    public String getNama_dosen() {
        return nama_dosen;
    }

    public void setNama_dosen(String nama_dosen) {
        this.nama_dosen = nama_dosen;
    }
        
        public void pilihmatkul(){
        }
}

class mahasiswa extends Prodi{
    public String nim;
    public String nama_mahasiswa;
    
    public mahasiswa(){
    
    }

    public String getNama_mahasiswa() {
        return nama_mahasiswa;
    }

    public void setNama_mahasiswa(String nama_mahasiswa) {
        this.nama_mahasiswa = nama_mahasiswa;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
    
}

class nilaimatakuliah extends Matakuliah{
    mahasiswa mhs;
}






