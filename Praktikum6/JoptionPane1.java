import javax.swing.JOptionPane;

public class JoptionPane1{
    public static void main(String[]args){
        String nim="", nama="",tempat="", tgllahir="";
        
        nim = JOptionPane.showInputDialog("Inputkan Nim anda : ");
        nama = JOptionPane.showInputDialog("Inputkan Nama anda : ");
        tempat = JOptionPane.showInputDialog("Inputkan Tempat anda : ");
        tgllahir = JOptionPane.showInputDialog("Inputkan Tgl Lahir anda : ");

        String msg = "Hello "+ nim + " !";
        JOptionPane.showMessageDialog(null, msg);
        String msg2 = "Hello "+ nama + " !";
        JOptionPane.showMessageDialog(null, msg2);
        String msg3 = "Hello "+ tempat + " !";
        JOptionPane.showMessageDialog(null, msg3);
        String msg4 = "Hello "+ tgllahir + " !";
        JOptionPane.showMessageDialog(null, msg4);
    }

}