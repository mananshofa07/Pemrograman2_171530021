
package Praktikum10.MetroUI.Praktikum;


public class Percobaan2 {
    
    /** 
     * Main Method
     */
    public static void main(String []args){
        
        System.out.println("\n Program Poimorphis");
        System.out.println("=====================");
        // Membuat objek-objek raut (ekspresi) dari wajah
        BentukWajah objbentuk = new BentukWajah();
        Senyum objsenyum = new Senyum();
        Tertawa objtertawa = new Tertawa();
        Marah objmarah = new Marah();
        Sedih objsedih = new Sedih();
        //polimorphis dari bentuk wajah ada 5 dimulai dari 0-4
        BentukWajah []Bentuk = new BentukWajah[5];
        Bentuk[0]=objbentuk;
        Bentuk[1]=objsenyum;
        Bentuk[2]=objtertawa;
        Bentuk[3]=objmarah;
        Bentuk[4]=objsedih;
        System.out.println("Bentuk [0] : "+Bentuk[0].respons());
        System.out.println("Bentuk [1] : "+Bentuk[1].respons());
        System.out.println("Bentuk [2] : "+Bentuk[2].respons());
        System.out.println("Bentuk [3] : "+Bentuk[3].respons());
        System.out.println("Bentuk [4] : "+Bentuk[4].respons());
        
        
    }
    
}

class BentukWajah{
    public String respons(){
        return("Perhatikan reaksi wajah saya\n");
    }
    
}

class Senyum extends BentukWajah{
    public String respons(){
        return("Senyum Karena Senang\n");
    }
}

class Tertawa extends BentukWajah{
    public String respons(){
        return("Tertawa karena gembira\n");
    }
}

class Marah extends BentukWajah{
    public String respons(){
        return("Kemarahan disebabkan bertengkar\n");
    }
}

class Sedih extends BentukWajah{
    public String respons(){
        return("Sedih disebabkan cemburu\n");
    }
}



