
package Praktikum10.MetroUI.Praktikum;


class Animal {}
class Mammal extends Animal{}
class cat extends Animal{}

public class Dolphin extends Mammal{
    public static void main(String[] args){
        Mammal m = new Mammal();
        Animal a = m;
        /*Dolphin d =(Dolphin d) a;*/
    }
}
