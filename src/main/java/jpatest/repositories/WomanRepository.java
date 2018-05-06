package jpatest.repositories;

import jpatest.domain.Woman;
import org.springframework.data.repository.CrudRepository;

public interface WomanRepository extends CrudRepository<Woman,Long> {
}
