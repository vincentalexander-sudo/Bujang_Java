

public class Listrik {
    public static void main(String[] args) {
        int meteranBulanLalu = 1_500;
        int meteranBulanIni = 2_000;
        int tarif = 1000;
        int biayaBeban = 50_000;
        double pajak = 0.1;
        int Admin = 2_500;

        int totalPemakaian = meteranBulanIni - meteranBulanLalu;
        long biayaPemakaian = (totalPemakaian * tarif) + biayaBeban;
        double biayaPajak = biayaPemakaian * pajak;
        double biayaAdmin = biayaPemakaian + Admin;
        double totalBiaya = biayaPemakaian + biayaPajak + biayaAdmin;

        System.out.println("total pemakaian listrik (kWh)\t: " + totalPemakaian);
        System.out.println("biaya pemakaian sebelum pajak\t: " + biayaPemakaian);
        System.out.println("nominal pajak yang dikenakan\t: " + biayaPajak);
        System.out.println("biaya admin\t\t\t: " + biayaAdmin);
        System.out.println("total Biaya\t\t\t: " + totalBiaya);
    }
}
