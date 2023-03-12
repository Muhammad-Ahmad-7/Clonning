public class Main {
    public static void main(String[] args) {
        CollegeInfo clg = new CollegeInfo("GCU",01);
        Student std = new Student("Ali",15,01,clg);
        //CollegeInfo clg2 =  clg.clone();
        Student std1;
        std1 = std.clone();
        //clg2.collegeName = "PGC";
        std1.clg.collegeName="PGC";
        std1.name = "Bilal";
        System.out.println("This is Copy:   "+std1);

        System.out.println("This is Original:   "+std);
    }
}
