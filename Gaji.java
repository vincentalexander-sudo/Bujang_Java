public class Gaji {
    public static void main(String[] args) {
        int gajiPokok = 1_000_000;
        int tunjanganMakan = 500_000;
        byte jumlahAbsen = 5;
        int jumlahLembur = 15;
        int potonganAbsen = 150_000;
        int upahLembur = 40_000;
        double asuransiKesehatan = 0.03;

        int gajiKotor = gajiPokok + tunjanganMakan;
        int potongan = potonganAbsen * jumlahAbsen;
        int upah = upahLembur * jumlahLembur;
        double asuransi = gajiPokok * asuransiKesehatan;
        double gajiBersih = gajiKotor - potongan + upah - asuransi;

        System.out.println("total gaji kotor\t: " + gajiKotor);
        System.out.println("nominal potongan\t: " + potongan);
        System.out.println("total uang lembur\t: " + upah);
        System.out.println("nominal asuransi\t: " + asuransi);
        System.out.println("total gaji bersih\t: " + gajiBersih);
    }
}
