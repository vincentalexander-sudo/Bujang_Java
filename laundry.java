public class laundry {
    public static void main(String[] args) {
        int tarif = 50_000;
        byte totalPakaian = 10;
        int hargaDeterjen = 25_000;
        int biayaListrik = 50_000;
        int pelanggan = 10;
        int biayaAdmin = 2000;

        int totalUangCucian = tarif * totalPakaian;
        int totalbiayaAdmin = pelanggan * biayaAdmin;
        int pendapatanKotor = totalUangCucian + biayaAdmin;
        double biayaPerawatan = pendapatanKotor * 0.2;
        int totalDeterjenListrik = hargaDeterjen + biayaListrik;
        double pendapatanBersih = pendapatanKotor - biayaPerawatan - totalDeterjenListrik;

        System.out.println("=================================");
        System.out.println("===      Pendapatan Laundry   ===");
        System.out.println("total uang berat cucian\t\t: " + totalUangCucian);
        System.out.println("total biaya admin\t\t: " + totalbiayaAdmin);
        System.out.println("pendapatan kotor\t\t: " + pendapatanKotor);
        System.out.println("total Biaya Perawatan\t\t: " + biayaPerawatan);
        System.out.println("total Biaya deterjen dan listrik: " + totalDeterjenListrik);
        System.out.println("pendapatan bersih\t\t: " + pendapatanBersih);
        System.out.println("=================================");
    }
}