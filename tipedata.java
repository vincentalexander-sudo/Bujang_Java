public class tipedata {
    public static void main(String[] args) {
        
        byte iniByte = 100;
        short iniShort = 10000;
        int iniInt = 1000000000;
        float iniFloat = 10.24F;
        double iniDouble = 10.24;
        int hexInt = 0xA132B;
        int binInt = 0b01010101;
        int Angka = 1_00_00;
        short Inishort1 = iniByte;
        float Inifloat1 = iniInt;
        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniDouble);
        System.out.println(iniFloat);
        System.out.println(hexInt);
        System.out.println(binInt);
        int credit = 1_000_000; 
        System.out.println("Saldo Credit: " + credit);
        System.err.println(Angka);
        System.out.println(Inifloat1);
        System.out.println(Inishort1);
    }
}
