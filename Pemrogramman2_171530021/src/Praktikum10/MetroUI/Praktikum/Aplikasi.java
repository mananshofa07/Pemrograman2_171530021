
package Praktikum10.MetroUI.Praktikum;


class Indux {
    
    Indux(){}
    protected void metode1(){
        System.out.println("Induk : Methode 1");
    }
    
}

class Anak extends Indux{
    Anak(){}
    public void Metode1(){
        System.out.println("Anak Methode 1");
    }
    
}


public class Aplikasi {
    public static void main(String args[]){
        Anak o = new Anak() ; o.metode1();
    }
}

