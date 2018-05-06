package jpatest.service;

import jpatest.domain.Woman;
import org.springframework.stereotype.Service;

import java.util.List;

public interface WomanService {
    List<Woman>findAll();
}
