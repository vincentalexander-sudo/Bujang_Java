public class itemCollector {
    public static void main(String[] args) {
        byte level = 9;
        int price = 1_000_000;
        boolean islimited = true;
        Integer stockOwnedAda = 5;
        Integer stockOwnedGaAda = null;
        Long collectionIdAda = 0xA235CL;
        Long collectionIdGaAda = null;

        System.out.println("=====================================");
        System.out.println("=     Precure Item Collection       =");
        System.out.println("Level Barang\t: " + level);
        System.out.println("Harga Barang\t: Rp." + price);
        System.out.println("Status Limited\t: " + islimited);

        System.out.println(" ");
        System.out.println("(Jika Memiliki barangnya) ");
        System.out.println("Jumlah Stock\t: " + stockOwnedAda);
        System.out.println("Nomor seri\t: " + collectionIdAda);

        System.out.println(" ");
        System.out.println("(Jika tidak Memiliki barangnya) ");
        System.out.println("Jumlah Stock\t: " + stockOwnedGaAda);
        System.out.println("Nomor seri\t: " + collectionIdGaAda);
        System.out.println("=====================================");
    }
}
