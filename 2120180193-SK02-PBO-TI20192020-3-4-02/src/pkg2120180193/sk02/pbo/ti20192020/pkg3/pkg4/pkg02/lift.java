package pkg2120180193.sk02.pbo.ti20192020.pkg3.pkg4.pkg02;

public class lift {
    //porperty 
    String jenis = "penumpang";
    String desain= "sederhana";
    int kecepatan ;
    int luas;
    
    
    //method
    void buka (){
       System.out.println("buka");
    }
    
    void tutup (){
        System.out.println ("tutup");
    }
    void naik (int waktu){
        System.out.println ("naik = "+waktu);
    }
    void turun (int waktu){
        System.out.println ("turun = " +waktu);
    }
}
