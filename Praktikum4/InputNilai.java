import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputNilai {
    public static void main(String[] args){
        String nim="";
        String nama_mhs="";
        String matakuliah="";
        float  nilai_lain2 = 0;
        float nilai_uts = 0;
        float nilai_uas = 0;
        float nilai_akhir = 0;

        BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));   

        System.out.print("Masukan NIM : ");
        try{
            nim = dataInput.readLine();
        }catch( IOException ex){
            System.out.println("error!" + ex);
        } 

        System.out.print("Masukan Nama Mahasiswa : ");
        try{
            nama_mhs = dataInput.readLine();
        }catch( IOException ex){
            System.out.println("error!" + ex);
        }

        System.out.print("Masukan Nama Mata Kuliah : ");
        try{
            matakuliah = dataInput.readLine();
        }catch( IOException ex){
            System.out.println("error!" + ex);
        }
        System.out.print("Masukan Nilai Lain-Lain : ");
        try{
            nilai_lain2 = Float.parseFloat(dataInput.readLine());
        }catch( IOException ex){
            System.out.println("error!" + ex);
        }   
        System.out.print("Masukan Nilai UTS : ");
        try{
            nilai_uts = Float.parseFloat(dataInput.readLine());
        }catch( IOException ex){
            System.out.println("error!" + ex);
        }  
        System.out.print("Masukan Nilai UAS: ");
        try{
            nilai_uas = Float.parseFloat(dataInput.readLine());
        }catch( IOException ex){
            System.out.println("error!" + ex);
        }  

        nilai_akhir = (0.4F * nilai_lain2) + (0.3F * nilai_uts) + (0.3F * nilai_uas); 

        System.out.println("");
        System.out.println("\t--------------------");
        System.out.println("\t--------------------"); 
        System.out.println("\tNim                = " + nim);
        System.out.println("\tNama Mhs           = " + nama_mhs); 
        System.out.println("\tMataKuliah         = " + matakuliah);
        System.out.println("\tNilai Lain2        = " + nilai_lain2);
        System.out.println("\tNilai UTS          = " + nilai_uts);
        System.out.println("\tNilai UAS          = " + nilai_uas);
        System.out.println("\tNilai Akhir        = " + nilai_akhir);
        if(nilai_akhir>=80){
                System.out.println("\tAnda Mendapatkan Grade A");
            }else if(nilai_akhir>=76 && nilai_akhir<=79){
                System.out.println("\tAnda Mendapatkan Grade AB");
            }else if(nilai_akhir>=71 && nilai_akhir<=75){
                System.out.println("\tAnda Mendapatkan Grade B");
            }else if(nilai_akhir>=66 && nilai_akhir<=70){
                System.out.println("\tAnda Mendapatkan Grade BC");
            }else if(nilai_akhir>=61 && nilai_akhir<=65){
                System.out.println("\tAnda Mendapatkan Grade C");
            }else if(nilai_akhir>=56 && nilai_akhir<=60){
                System.out.println("\tAnda Mendapatkan Grade CD");
            }else if(nilai_akhir>=51 && nilai_akhir<=55){
                System.out.println("\tAnda Mendapatkan Grade D");
            }else if(nilai_akhir<=50){
                System.out.println("\tAnda Mendapatkan Grade E");
            }
    }

}