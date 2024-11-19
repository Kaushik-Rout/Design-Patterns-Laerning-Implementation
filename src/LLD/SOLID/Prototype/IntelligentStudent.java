package LLD.SOLID.Prototype;

public class IntelligentStudent extends Student {
    Double iq;

    public IntelligentStudent() {}

    //copy constructor
    public IntelligentStudent(IntelligentStudent student){
        //calls the parent copy constructor and copy all the parent attributes of the IntelligentStudent
        // or else we have to implement getter in parent class and get all the attributes of the parent class and set them
        super(student);
        this.iq = student.iq;
    }
    public void setIq(Double iq) {
        this.iq = iq;
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}

