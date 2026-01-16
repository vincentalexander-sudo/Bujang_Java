public class RentalPS {
    public static void main(String[] args) {
        int hargaPerjam = 10_000;
        byte durasiMain = 5;
        int hargaStick = 5000;
        byte stickDisewa = 3;
        int Hargamakanan = 5000;
        byte jumlahMakanan = 5;
        int Hargaminuman = 2000;
        byte jumlahMinuman = 5;
        double asuransi = 0.02;
        int diskon = 5000;

        int jamMain = hargaPerjam * durasiMain;
        int stick = hargaStick * stickDisewa;
        int biayaMakanan = Hargamakanan * jumlahMakanan;
        int biayaMinuman = Hargaminuman * jumlahMinuman;

        int totalBiayaSewaAlat = jamMain + stick; 
        int totalMakanandanMinuman = biayaMakanan + biayaMinuman;
        double nominalAsuransi = totalBiayaSewaAlat * asuransi;
        double totalTagihanKotor = totalBiayaSewaAlat + totalMakanandanMinuman + nominalAsuransi;
        double totalTagihanBersih = totalTagihanKotor - diskon;

        System.out.println("---------------------------------");
        System.out.println("===    Harga Sewa Rental PS   ===");
        System.out.println("total biaya sewa alat\t:" + totalBiayaSewaAlat);
        System.out.println("total belanja makanan\t:" + totalMakanandanMinuman);
        System.out.println("nominal biaya asuransi\t:" + nominalAsuransi);
        System.out.println("total tagihan kotor\t:" + totalTagihanKotor);
        System.out.println("total tagihan bersih\t:" + totalTagihanBersih);
        System.out.println("---------------------------------");
    }
}
