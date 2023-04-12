package homework.ch11_13.p3;


import java.util.Objects;

public class Student extends Person{
    private int studentId;
    private String department;//院系
    private String classNo;//班级
    public Student(){

    }
    public Student(String name, int age, int studentId, String department, String classNo){
        setName(name);
        setAge(age);
        this.studentId = studentId;
        this.department = department;
        this.classNo = classNo;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getClassNo() {
        return classNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student:" +
                super.toString() +
                ", studentId=" + studentId +
                ", department='" + department + '\'' +
                ", classNo='" + classNo + '\'' ;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student newObj = (Student)super.clone();
        newObj.studentId = this.studentId;
        newObj.department = department;
        newObj.classNo = classNo;
        return newObj;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student)
            return ((studentId == ((Student) obj).studentId) && Objects.equals(classNo,((Student) obj).classNo)
                    && Objects.equals(department,((Student) obj).department) && (super.equals(obj)));

        return false;
    }

}
