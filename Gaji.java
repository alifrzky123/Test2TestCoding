public class Gaji{
    public static void cetakln(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args){
        double GajiPokok = 4600897;
        double Tunjangan = 0.1 *GajiPokok;
        double jmlAnak = 4;
        double TunjanganAnak = jmlAnak *0.2 * GajiPokok;
        double bruto = GajiPokok + Tunjangan + TunjanganAnak;
        double Iuran = 0.4*GajiPokok;
        double netto = bruto - Iuran;
        
        cetakln("Gaji Pokok             :       Rp."+GajiPokok);
        cetakln("Jumlah Anak            :          "+jmlAnak+" Anak");
        cetakln("Tunjangan Ortu         :       Rp."+Tunjangan);
        cetakln("Tunjangan Anak         :       Rp."+TunjanganAnak);
        cetakln("Bruto                  :       Rp."+bruto);
        cetakln("Iuran                  :       Rp."+Iuran);
        cetakln("Netto                  :       Rp."+netto);
    }
}