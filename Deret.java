public class Deret{
    public static void cetak(Object obj){
        System.out.print(obj);
    }
    public static void main(String[] args){
        for (int i=1; i<101; i++){
            if(i%2 == 0 && i%3 == 0){
                cetak(" INDONESIA ");
            }
            else if(i%2==0){
                cetak(i);
            }
            else if(i%2==1){
                cetak(" ganjil ");
            }
        }
    }
}