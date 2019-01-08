
package Praktikum10.MetroUI.Praktikum;


class QOTD162 {
    public int x = 5;
    
    
}

class Child extends QOTD162 {
    public int x = 10;
    
    public void info(int x){
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}

/*
public class AksesNilai{
   public static void main(String args[]){
        Child c = new Child();
        c.info(15);
    }
}

*/


/*
    class public dalam hanya boleh ada satu dalam satu class
*/
