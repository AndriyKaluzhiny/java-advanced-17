package ua.lviv.lgs.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.Dao.UnivercityRepository;
import ua.lviv.lgs.Domain.Univercity;
import ua.lviv.lgs.Service.UnivercityService;

import java.util.List;

@Service
public class UnivercityServiceImpl implements UnivercityService {

    @Autowired
    private UnivercityRepository repository;


    @Override
    public Univercity save(Univercity univercity) {
        return repository.save(univercity);
    }

    @Override
    public List<Univercity> findAll() {
        return repository.findAll();
    }

    @Override
    public Univercity update(Univercity univercity) {
        return repository.save(univercity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Univercity getReferenceById(Integer id) {
        return repository.getReferenceById(id);
    }
}
