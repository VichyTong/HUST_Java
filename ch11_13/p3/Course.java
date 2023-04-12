package homework.ch11_13.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class Course
        extends Object
        implements Cloneable{
    private String courseName;
    private List<Person> students = new ArrayList<>();
    private Person teacher;

    public Course(String courseName, Person teacher){
        this.courseName = courseName;
        if(teacher instanceof Faculty)
            this.teacher = new Faculty(teacher.getName(),teacher.getAge(),((Faculty) teacher).getFacultyId()
            ,((Faculty) teacher).getTitle(),((Faculty) teacher).getEmail());
    }

    public void register(Person s) {
        if (s!= null) {
            if(!students.isEmpty()) {
                for (Person student : students) {
                    if (student == s)
                        return;
                }
            }
            students.add(s);
        }
    }

    public List<Person> getStudents() {
        return students;
    }

    public Person getTeacher() {
        return teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void unregister(Person s) {
        if (students.isEmpty()) {
            return;
        }
        int i = students.indexOf(s);
        if (i!=-1){
            students.remove(i);
        }
    }

    public int getNumberOfStudent(){
        return students.size();
    }

    @Override
    public String toString() {
        String res = "Course:" + "courseName='" + courseName + '\'' + '\n' + teacher.toString();
        for(int i = 0; i < getNumberOfStudent(); i++)
        {
            res += students.get(i).toString();
        }
        res += getNumberOfStudent();
        return res;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Course)
            return Objects.equals(((Course) obj).courseName, this.courseName) && students.containsAll(((Course) obj).students)
                    && teacher.equals(((Course) obj).teacher) && students.size()==((Course) obj).students.size();
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Course newObj = (Course)super.clone();
        newObj.courseName = new String(courseName);
        newObj.students = new ArrayList<Person>();
        for(int i = 0; i< this.students.size(); i++){
            newObj.students.add((Person) this.students.get(i).clone());
        }
        newObj.teacher = (Person)this.teacher.clone();
        return newObj;
    }
}
