
package Praktikum10.MetroUI.Praktikum;


/** final class QOTD161 {
    
    int xxx;
    void yyy(){
        xxx=1;
    };
    
}
* 
* */

public class QOTD161 {
    
    int xxx;
    void yyy(){
        xxx=1;
    };
    
}

class Bbb extends QOTD161 {
    final QOTD161 finalref = new QOTD161();
    
    final void yyy(){
        System.out.println("Method yyy");
        finalref.xxx  = 12345;
    }
}


/*

pada class QOTD161 harus tidak ada keywoard final, karena jika terdapat keywoard final
maka method tersebut sudah tidak dapat diturunkan lagi

*/