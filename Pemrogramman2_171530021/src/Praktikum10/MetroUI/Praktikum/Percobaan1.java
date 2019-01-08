
package Praktikum10.MetroUI.Praktikum;


public class Percobaan1 {
    protected String name;
    protected String address;
    
    /** 
     * Default constructor
     */
    
    public Percobaan1 (){
        System.out.println("Inside Person : Constructor");
        name = "";
        address = "";
    }
    
    /** 
     * COnstructor dengan dua parameter
     */
    
    public Percobaan1 ( String vname, String vaddress){
        this.name = vname;
        this.address = vaddress;
    }
    
    /** 
     * Method accessor
     */
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setName (String vname){
        this.name = vname;
    }
    
    public void setAddress(String vaddress){
        this.address = vaddress;
    }
}
