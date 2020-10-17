package home.train.bootstrapt;

import home.train.model.Professor;
import home.train.model.Student;
import home.train.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class init implements CommandLineRunner {

    private final PersonRepository repository;

    public init(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Student student= new Student();
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setEmail("john@email.com");
        student.setCourse("java");

        Professor professor= new Professor();
        professor.setFirstName("mary");
        professor.setLastName("public");
        professor.setEmail("public@email.com");
        professor.setSpeciality("programming");

        repository.save(student);
        repository.save(professor);

        repository.findAll().forEach(s-> System.out.println(s));
    }
}
