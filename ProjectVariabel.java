public class ProjectVariabel {
    public static void main(String[] args) {
        String missionName = "\"Rainbow Hope \"";
        final String location = "Hagukumi City";
        byte memberCount = 5;
        var firstMember = "Cure Yell";
        var secondMember = "Cure Ange";
        var thirdMember = "Cure Etoile";
        var fourthMember = "Cure Cure Macherie";
        var fiveMember = "Cure Amour";
        var fullMember = firstMember + " , " + secondMember + " , " + thirdMember + " , " + fourthMember + " , " + fiveMember;
        int enemenyCount = 100_00;
        long totalDamage = 100_00_00_00L;
        double successRate = 99.9;
        char bossRank = 'A';
        boolean isBossDefeated = true;
        int reportId = 0xA18C;
        System.out.println("==========================================");
        System.out.println("Operation\t\t: " + missionName);
        System.out.println("Location\t\t: " + location);
        System.out.println("Jumlah Anggota\t\t: " + memberCount);
        System.out.println("Anggota\t\t\t: " + fullMember);
        System.out.println("Jumlah musuh\t\t: " + enemenyCount);
        System.out.println("Keseluruhan Kekuatan\t: " + totalDamage);
        System.out.println("Kemungkinan Sukses\t: " + successRate);
        System.out.println("Peringkat Boss\t\t: " + bossRank);
        System.out.println("Boss defeated\t\t: " + isBossDefeated);
        System.out.println("Report Id\t\t: " + reportId);
        System.out.println("==========================================");
    }
}
