package LLD.SOLID.BuilderDP;

public class Client {
    public static void main(String[] args) {

// while Builder class is outside
//        BuilderDP builder = Student.getBuilder();
//
//        builder.setName("Kaushik");
//        builder.setGradYear(2021);
//        builder.setAge(24);
//        builder.setBatch("Dec 23 Batch");
//        builder.setPsp(99.8);
//        builder.setRollNumber(707);
//        builder.setUnivName("SRM");
//
//        // to make student object and transfer the data
//        Student student = builder.build();

        Student student = Student.getBuilder()
                .setAge(24)
                .setName("Kaushik")
                .setUnivName("SRM")
                .setRollNumber(21)
                .setBatch("Dec 23 Batch")
                .setGradYear(2021)
                .setPsp(99.8)
                .build();

        System.out.println(student);

    }
}
