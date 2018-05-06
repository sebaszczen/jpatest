package jpatest.service;

import jpatest.domain.Woman;
import jpatest.repositories.WomanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WomanServiceImpl implements WomanService {
    @Autowired
    WomanRepository womanRepository;

    @Override
    public List<Woman> findAll() {
        return (List<Woman>) womanRepository.findAll();
    }
}
