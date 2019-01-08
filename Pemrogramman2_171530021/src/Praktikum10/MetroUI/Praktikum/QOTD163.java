
package Praktikum10.MetroUI.Praktikum;

class A {
    
    private final void Bergerak(){
        System.out.println("Animasi Berjalan");
    }
    
}

public class QOTD163 extends A{
    public final void Bergerak(){
        System.out.println("Bergerak");
    }
    
    public static void main(String args[]){
        new QOTD163().Bergerak();
    }
}
