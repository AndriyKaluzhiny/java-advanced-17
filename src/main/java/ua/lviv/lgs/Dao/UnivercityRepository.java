package ua.lviv.lgs.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.lgs.Domain.Univercity;

import java.util.List;

@Repository
public interface UnivercityRepository extends JpaRepository<Univercity, Integer>, CrudRepository<Univercity, Integer> {
    Univercity getReferenceById(Integer id);
    void deleteById(Integer id);

}
