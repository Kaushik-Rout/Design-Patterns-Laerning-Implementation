package LLD.SOLID.PrototypeDP;

public class Student implements PrototypeDP<Student>{
    private String name;
    private int age;
    private String batch;
    private Double psp;
    private Double avgBatchPSP;

    //have to make default constructor to make a copy constructor
    public Student(){

    }

    // copy constructor
    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
        this.psp = student.psp;
        this.avgBatchPSP = student.avgBatchPSP;
    }

    @Override
    public Student clone() {
        return null;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setBatch(String batch){
        this.batch = batch;
    }

    public void setPsp(Double psp){
        this.psp = psp;
    }

    public void setAvgBatchPSP(Double avgBatchPSP){
        this.avgBatchPSP = avgBatchPSP;
    }
}
