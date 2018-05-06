package jpatest.service;

import jpatest.domain.Man;
import jpatest.domain.Woman;
import jpatest.repositories.ManRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManServiceImpl implements ManService {
    @Autowired
    ManRespository manRespository;

    @Override
    public List<Man> findAll() {
        return (List<Man>) manRespository.findAll();
    }

    @Override
    public void addMan(Man man) {
        manRespository.save(man);
    }
}
