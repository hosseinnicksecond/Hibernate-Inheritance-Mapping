package home.train.bootstrapt;

import home.train.model.Professor;
import home.train.model.Student;
import home.train.repository.ProfessorRepository;
import home.train.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class init implements CommandLineRunner {

    private final StudentRepository studentRepository;
    private final ProfessorRepository professorRepository;

    public init(StudentRepository repository, ProfessorRepository professorRepository) {
        this.studentRepository = repository;
        this.professorRepository = professorRepository;
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

//        studentRepository.save(student);
//        professorRepository.save(professor);

        System.out.println("**************");
        studentRepository.findAll().forEach(s-> System.out.println(s));
    }
}
