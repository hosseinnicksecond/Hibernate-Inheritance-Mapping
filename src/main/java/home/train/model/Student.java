package home.train.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "student")
public class Student extends Person {

    private String course;

    public Student(){super(); }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +'\''+
                "course='" + course + '\'' +
                '}';
    }
}
