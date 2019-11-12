package nl.foodbook.websiteBackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import nl.foodbook.websiteBackend.domain.Component;

@Repository
public interface ComponentRepository extends CrudRepository<Component, Long> {



}
