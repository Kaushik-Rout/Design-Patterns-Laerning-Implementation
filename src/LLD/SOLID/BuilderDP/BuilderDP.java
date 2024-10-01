package LLD.SOLID.BuilderDP;

//public class BuilderDP {
//    // to get all the data from the client, not interacting with the Student class directly
//    private String name;
//    private int age;
//    private double psp;
//    private String batch;
//    private int gradYear;
//    private String univName;
//    private int rollNumber;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public double getPsp() {
//        return psp;
//    }
//
//    public void setPsp(double psp) {
//        this.psp = psp;
//    }
//
//    public String getBatch() {
//        return batch;
//    }
//
//    public void setBatch(String batch) {
//        this.batch = batch;
//    }
//
//    public int getGradYear() {
//        return gradYear;
//    }
//
//    public void setGradYear(int gradYear) {
//        this.gradYear = gradYear;
//    }
//
//    public String getUnivName() {
//        return univName;
//    }
//
//    public void setUnivName(String univName) {
//        this.univName = univName;
//    }
//
//    public int getRollNumber() {
//        return rollNumber;
//    }
//
//    public void setRollNumber(int rollNumber) {
//        this.rollNumber = rollNumber;
//    }
//    //Creating a Student object with all the data od client
//    public Student build(){
//        if(this.getGradYear()>2024){
//            throw new RuntimeException("The graduation ear should be <= 2024");
//        }
//        return new Student(this);
//    }
//}
