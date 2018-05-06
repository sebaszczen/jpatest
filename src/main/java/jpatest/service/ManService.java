package jpatest.service;

import jpatest.domain.Man;
import jpatest.domain.Woman;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ManService {
    List<Man> findAll();
    void addMan(Man man);
}
