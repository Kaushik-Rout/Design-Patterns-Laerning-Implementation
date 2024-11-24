package LLD.SOLID.PrototypeDP;

public class Client {
    public static void main(String[] args) {
        //filling the default attributes throught Student registry
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        // using the registry and giving just the unique details
        Student Anurag = studentRegistry.get("Gold").clone();
        Anurag.setName("Anurag");
        Anurag.setAge(24);
        Anurag.setPsp(78.5);

        IntelligentStudent Kaushik = (IntelligentStudent) studentRegistry.get("Elite Batch").clone();
        Kaushik.setName("Kaushik");
        Kaushik.setAge(24);
        Kaushik.setPsp(98.5);
        Kaushik.setIq(93.9);

    }
    private static void fillRegistry(StudentRegistry studentRegistry){
        //for normal student
        Student normalStudent = new Student();
        normalStudent.setBatch("Gold");
        normalStudent.setAvgBatchPSP(75.6);
        studentRegistry.registry("Gold Batch", normalStudent);

        //for intelligent student
        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setBatch("Elite");
        intelligentStudent.setAvgBatchPSP(98.4);
        studentRegistry.registry("Elite Batch", intelligentStudent);

    }
}
