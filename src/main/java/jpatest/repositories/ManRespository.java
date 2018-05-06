package jpatest.repositories;

import jpatest.domain.Man;
import org.springframework.data.repository.CrudRepository;

public interface ManRespository extends CrudRepository<Man,Long> {
}
