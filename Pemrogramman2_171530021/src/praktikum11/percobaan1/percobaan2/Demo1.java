
package praktikum11.percobaan1.percobaan2;


public class Demo1 {
    
    public static void main(String args[]){
        String s = "Pemrograman java";
        String HurufKapital = s.toUpperCase();
        String HurufKecil = s.toLowerCase();
        
        int indexAwal = 12;
        int indexAkhir = 16;
        char[] karakter = new char[indexAkhir-indexAwal];
        s.getChars(indexAwal, indexAkhir, karakter, 0);
        
        byte[] tmp = new byte[s.length()];
        tmp = s.getBytes();
        
        String Trim = s.trim();
        String Sub = s.substring(5, 9);
        String replace1 = s.replace("Pemrograman", "Program");
        String replace2 = "java".replace("v", "w");
        
        System.out.println("Penggunaan toUpperCase() :\t"+ HurufKapital);
        System.out.println("Penggunaan toLowerCase() :\t"+ HurufKecil);
        System.out.println("Penggunaan method CharAt() :\t"+ s.charAt(0));
        System.out.println("Penggunaan method getChars() :\t"+ karakter[0]);
        System.out.println("Penggunaan method getByte() :\t"+ tmp[0]);
        System.out.println("Penggunaan method trim() :\t"+ Trim);
        System.out.println("Penggunaan method substring() :\t"+ Sub);
        System.out.println("Penggunaan mthod replace() :\t"+ replace1+""+replace2);
        
    }
    
}
