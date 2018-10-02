import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputReader1 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));  

        String nim="", nama="";

        System.out.print("Masukan Nama Anda : ");

        try{
            nama = dataIn.readLine();
        }catch( IOException e){
            System.out.println("error!");
        }

        System.out.print("Masukan Nim Anda : ");

        try{
            nim = dataIn.readLine();
        }catch( IOException e){
            System.out.println("error!");
        }

        System.out.println("");
        System.out.println("\t--------------------");
        System.out.println("\t--------------------");
        System.out.println("\tSelamat Datang " + nama);
        System.out.println("\tNim          " + nim);
    
    }

}