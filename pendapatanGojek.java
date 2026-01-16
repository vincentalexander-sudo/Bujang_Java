public class pendapatanGojek {
    public static void main(String[] args) {
        int tarif = 15_000;
        byte jumlah = 10;
        int tip = 10_000;
        int hargaBensin = 20_000;
        int jumlahBensin = 2;

        int pendapatanKotor = tarif * jumlah;
        double komisi = pendapatanKotor * 0.2;
        double pendapatanBersih = pendapatanKotor - komisi + tip;
        int totalBensin = hargaBensin * jumlahBensin;
        double gajiPokok = pendapatanBersih - totalBensin;

        System.out.println("===============================");
        System.out.println("=== Gaji Pokok Harian Gojek ===");
        System.out.println("Total Pendapatan Kotor\t\t\t: " + pendapatanKotor);
        System.out.println("Potongan Komisi\t\t\t\t: " + komisi);
        System.out.println("Pendapatan Bersih (Sebelum Bensin)\t: " + pendapatanBersih);
        System.out.println("Total Pengeluaran Bensin\t\t: " + totalBensin);
        System.out.println("Gaji Bersih Harian (Take Home Pay)\t: " + gajiPokok);
        System.out.println("===============================");
    }
}
