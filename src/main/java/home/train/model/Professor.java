package home.train.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "professor")
public class Professor extends Person {

    private String speciality;

    public Professor(){}

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString()+'\''+
                "speciality='" + speciality + '\'' +
                '}';
    }
}
