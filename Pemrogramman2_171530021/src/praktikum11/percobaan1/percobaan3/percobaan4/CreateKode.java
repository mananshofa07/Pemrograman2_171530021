
package praktikum11.percobaan1.percobaan3.percobaan4;

public class CreateKode {
    
    String ta = "2017-2018";
    String semester = "Gasal";
    String kd_prodi = "153";
    String kode = "01";

    public void set_Kode(){
        // output = "1718115301"
        
        CreateKode cd = new CreateKode();
        String ta1 = cd.ta.substring(2, 4);
        String ta2 = cd.ta.substring(7, 9);
        String smt = cd.semester;
        
       
        
        if(cd.semester.equals("Gasal")){
             smt = "Gasal".replace("Gasal","1");
             System.out.println("OutPut = "+ta1+ta2+smt+cd.kd_prodi+cd.kode);
        }else{
             smt = "Gasal".replace("Gasal","2");
             System.out.println("OutPut = "+ta1+ta2+smt+cd.kd_prodi+cd.kode);
        }
        
        
        
    }
    
    public static void main(String args[]){
        CreateKode sk = new CreateKode();
        sk.set_Kode();
       
        
    }

    void set_Kode(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
