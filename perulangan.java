public class perulangan {
    public static void main(String[] args) {
        int jumlah = 5;
        int counter = 0;

        System.out.println("Bagian For");
        for (int i = 1; i <= jumlah; i++) {
            System.out.println(i);
        }
        
        System.out.println("");
        System.out.println("Bagian While");
        while(counter <= jumlah){
            if (counter == 3) {
               counter++;
               break;
            }
            System.out.println(counter);
            counter++;
        } 
        System.out.println("Hasil While: " + counter);

        System.out.println("");
        System.out.println("Bagian Do While");
        do { 
            System.out.println(counter);
            counter++;
        } while (counter <= jumlah);
    }
}