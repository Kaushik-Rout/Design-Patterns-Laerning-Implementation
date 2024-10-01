package LLD.SOLID.BuilderDP;

public class Student {

    private String name;
    private int age;
    private double psp;
    private String batch;
    private int gradYear;
    private String univName;
    private int rollNumber;

    private Student(BuilderDP builder){
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.batch = builder.getBatch();
        this.gradYear = builder.getGradYear();
        this.univName = builder.getUnivName();
        this.rollNumber = builder.getRollNumber();
    }

// to get the builder object by the client
    public static BuilderDP getBuilder(){
        return new BuilderDP();
    }

    static class BuilderDP {
        // to get all the data from the client, not interacting with the Student class directly
        private String name;
        private int age;
        private double psp;
        private String batch;
        private int gradYear;
        private String univName;
        private int rollNumber;

        public String getName() {
            return name;
        }
        // return type -> BuilderDP : cause we return the object to add further parameters : refer client class.
        public BuilderDP setName(String name) {
            this.name = name;
            //returning the builder object
            return this;
        }

        public int getAge() {
            return age;
        }

        public BuilderDP setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public BuilderDP setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public BuilderDP setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public BuilderDP setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public BuilderDP setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public BuilderDP setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }
        //Creating a Student object with all the data od client
        public Student build(){
            if(this.getGradYear()>2024){
                throw new RuntimeException("The graduation ear should be <= 2024");
            }
            return new Student(this);
        }
    }
}
