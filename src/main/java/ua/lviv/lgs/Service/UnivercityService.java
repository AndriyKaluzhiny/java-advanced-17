package ua.lviv.lgs.Service;

import org.springframework.context.annotation.ComponentScan;
import ua.lviv.lgs.Domain.Univercity;

import java.util.List;

public interface UnivercityService {
    Univercity save(Univercity univercity);
    List<Univercity> findAll();
    Univercity update(Univercity univercity);
    void deleteById(Integer id);
    Univercity getReferenceById(Integer id);
}
