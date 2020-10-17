package home.train.bootstrap;

import home.train.model.Professor;
import home.train.model.Student;
import home.train.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;

public class init implements CommandLineRunner {

    private final PersonRepository repository;

    public init(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Student student= new Student();
        student.setFirstName("john");
        student.setLastName("Doe");
        student.setEmail("john@emaol.com");
        student.setCourse("java");

        repository.save(student);

        Professor professor= new Professor();
        professor.setFirstName("mary");
        professor.setLastName("public");
        professor.setEmail("public@email.com");
        professor.setSpeciality("programming");

        repository.save(professor);

    }
}
