public class inventaris {
    public static void main(String[] args) {
        byte kapasitas = 12;
        int harga = 1_000_000;
        long nilaiGudang = 1_500_000_000L;
        Integer barangRusak = null;
        int barangAdaRusak = 10;
        Double Rating = 98.9;
        System.out.println("jumlah kapasitas\t: " + kapasitas + " Unit.");
        System.out.println("Harga Per Unit\t\t: Rp." + harga);
        System.out.println("Total Harga Gudang\t: " + nilaiGudang);

        System.out.println("");
        System.out.println("[STATUS AUDIT (PRIMITIF)]");
        System.out.println("Jumlah barang rusak\t: " + barangAdaRusak);
        System.out.println("Sudah periksa");

        System.out.println("");
        System.out.println("[STATUS AUDIT (Buka PRIMITIF)]");
        System.out.println("Jumlah barang rusak\t: " + barangRusak);
        System.out.println("Belum periksa");

        System.out.println("");
        System.out.println("Rating Produk\t\t: " + Rating);
        System.out.println("(Info: Produk baru, belum memiliki ulasan.)");
        System.out.println("");

        System.out.println("Data aset aman, barang tidak ada yang rusak");
    }
}
