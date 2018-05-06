package jpatest.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Man {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToMany(mappedBy = "manList")
    private List<Woman>womanList;
    private String name;

}
