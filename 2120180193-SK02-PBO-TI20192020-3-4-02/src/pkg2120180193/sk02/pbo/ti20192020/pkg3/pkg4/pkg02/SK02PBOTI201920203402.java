package pkg2120180193.sk02.pbo.ti20192020.pkg3.pkg4.pkg02;
public class SK02PBOTI201920203402 {

    public static void main(String[] args) {
        lift lift_gedung = new lift();
       
       lift_gedung.kecepatan=5;
       lift_gedung.luas=45;
       
       System.out.println("jenis lift = "+lift_gedung.jenis);
       System.out.println("desain lift = "+lift_gedung.desain);
       System.out.println("kecepatan laju lift = "+lift_gedung.kecepatan);
       System.out.println("luas lift = "+lift_gedung.luas);
    
       lift_gedung.buka();
       lift_gedung.tutup();
       lift_gedung.naik(30);
       lift_gedung.turun(45);
       
       lift lift_gedung2=new lift();
    }
    
}
