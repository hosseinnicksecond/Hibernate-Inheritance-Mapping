package home.train.repository;

import home.train.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository<T extends Person> extends CrudRepository<T, Integer> {
}
