public class array {
    public static void main(String[] args) {
        String[] arrayString = new String[3];
        arrayString[0] = "Vincent";
        arrayString[1] = "Alexander";
        arrayString[2] = arrayString[0] + " " + arrayString[1];

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        int[] arrayInt = new int[]{
            90,80,70,60,50
        };

        System.out.println(arrayInt.length);
        long[] arrayLong = {
            10L,20L,30L,40L,50L,60L
        };
        System.out.println(arrayLong.length);

        String[] userName = {
            "Nagisa", "Honoka"
        };

        System.out.println(userName[0]);
        System.out.println(userName[1]);
        userName[0] = "Saki";
        System.out.println(userName[0]);

        String[][] daftarTim = {
            {"Saki", "Mai"} ,
            {"Nozomi", "Rin", "Urara", "Komachi", "Karen"}
        };
        System.out.println(daftarTim[0][1]);
        System.out.println(daftarTim[1][3]);
    }
}