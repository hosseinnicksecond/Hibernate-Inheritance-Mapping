package home.train.repository;

import home.train.model.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor,Integer> {
}
