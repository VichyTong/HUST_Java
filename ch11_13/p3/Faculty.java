package homework.ch11_13.p3;

import java.util.Objects;

public class Faculty extends Person{
    private int facultyId;
    private String title;
    private String email;
    public Faculty(){}
    public Faculty(String name, int age, int facultyId, String title, String email){
        setName(name);
        setAge(age);
        this.facultyId = facultyId;
        this.title = title;
        this.email = email;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Faculty:" +
                super.toString() +
                "facultyId=" + facultyId +
                ", title='" + title + '\'' +
                ", email='" + email + '\'';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Faculty newObj = (Faculty)super.clone();
        newObj.facultyId = this.facultyId;
        newObj.title = new String(title);
        newObj.email = new String(email);
        return newObj;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Faculty)
            return ((facultyId == ((Faculty) obj).facultyId) && Objects.equals(email,((Faculty) obj).email)
                    &&  Objects.equals(title,((Faculty) obj).title) && (super.equals(obj)));
        return false;
    }

}
