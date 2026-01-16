public class primitif {
    public static void main(String[] args) {
        
        int umur = 25;
        Integer umurInteger = umur;
        System.out.println(umurInteger);
        Byte umurByte = umurInteger.byteValue();
        System.out.println(umurByte);
        Short umurShort = umurByte.shortValue();
        System.out.println(umurShort);
        Long umurLong = umurShort.longValue();
        System.out.println(umurLong);
        Float umurFloat = umurLong.floatValue();
        System.out.println(umurFloat);
        Double umurDouble = umurFloat.doubleValue();
        System.out.println(umurDouble);
    }
}