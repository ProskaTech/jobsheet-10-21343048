package jobsheet10;

/**
 *
 * Created by 21343048_Ghenta Alif Alde
 */

public class Aktor {
    String nama;
    int umur;
    
    Aktor(String n,int u){ //aktor adalah constructor
        nama=n;
        umur=u;
    }
    
    void tampilAktor(){
        System.out.println("Namaku : "+ nama);
        System.out.println("Umurku : "+ umur +" tahun");
    }
    
    public static void main(String[] args){
        Aktor a;
        a = new Aktor("madun",13);
        a.tampilAktor();
        System.out.println("==========");
        
        a = new Aktor("mamat",14);
        a.tampilAktor();
        System.out.println("==========");
    }
}
