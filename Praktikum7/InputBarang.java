import java.io.*;

public class InputBarang{
    public static void main(String[]args){
        BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));

        String kdbarang="", nmbrg="", databarang="";
        int no=0, ulang=0, cetak=0, jmlbrg=0;

        System.out.println("--------------------------");
        System.out.println("    Toko Masih Harapan      ")
        System.out.println("--------------------------");

        do{
            no++;
            System.out.println("Item : "+no);

            System.out.println("Kode Barang : ");
                kdbarang = Input.readLine();

            System.out.println("Nama Barang : ");
                nmbrg = Input.readLine();

            System.out.println("Jumlah Barang : ");
                jmlbrg = integer.parseint(Input.readLine());

            databarang = databarang+"\nNo. "+no+"\nKode Barang :"+kdbarang+ 
            "\nNama Barang : "+nmbrg+"\n Jumlah Barang : "+jmlbrg+"\n";

            System.out.print("Apakah anda akan menginputkan lagi? \n1. Ya \n2. Tidak 
            \nJawab : ");
                ulang = integer.parseint(Input.readLine());
            
        }while(ulang==1);
        System.out.print("Apakah anda akan mencetak data data barang masuk? \n\n1. Ya \n2. Tidak 
            \nJawab : ");
                cetak = integer.parseint(Input.readLine));

        if(cetak==1){
            System.out.println(==== Data Barang masuk ====);
            System.out.println(databarang);
        }
    }
}