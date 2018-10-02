public class DemoifElse{
    public static void main(String[]args){
        double hargabeli = 8000.0;
        double hargajual = 9000.0;

        if(hargajual <= hargabeli ){
            System.out.println("Harga Jual tidak boleh kurang dari harga beli");
        }else{
            System.out.println("Data sudah sesuai");
        }
    }
}