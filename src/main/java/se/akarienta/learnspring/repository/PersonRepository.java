package se.akarienta.learnspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.akarienta.learnspring.model.PersonModel;

import java.util.List;

public interface PersonRepository extends JpaRepository<PersonModel, Long> {
    List<PersonModel> findByLastName(String lastName);
}
