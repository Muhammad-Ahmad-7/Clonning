public class Student {
    String name;
    int age;
    int rollNum;

    CollegeInfo clg;
    public Student(String name, int age, int rollNum,CollegeInfo clg) {
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.clg = clg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNum=" + rollNum +
                ", clg=" + clg +
                '}';
    }

    @Override
    public Student clone(){
        return new Student(this.name,this.age,this.rollNum,this.clg.clone());
    }
}
