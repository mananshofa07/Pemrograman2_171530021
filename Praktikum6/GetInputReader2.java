import java.io.*;

public class GetInputReader2{
    public static void main(String[]args)throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String nim="", nama="",tempat="", tgllahir="";
        System.out.print("Masukan Nama anda = ");
            nama = dataIn.readLine();
        System.out.print("Masukan Nim anda = ");
            nim = dataIn.readLine();
        System.out.print("Masukan Tempat Lahir anda = ");
            tempat = dataIn.readLine();
        System.out.print("Masukan Tanggal lahir anda = ");
            tgllahir = dataIn.readLine();

        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("Selamat Datang "+ nama);
        System.out.println("Nim     : "+ nim);
        System.out.println("Tempat Lahir    : "+ tempat);
        System.out.println("Tanggal Lahir   : "+ tgllahir);
        
    }
}