public class Konversi{
    public static void cetakln(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args){
        
        int pon = 2;
        int total;

        for (int i=0;i<101;i++){
            total = pon * i;
            cetakln(i+" kg = "+total+" pon");
        }
    }
}