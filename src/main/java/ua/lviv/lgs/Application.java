package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ua.lviv.lgs.Domain.Univercity;
import ua.lviv.lgs.Service.UnivercityService;


@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
        UnivercityService univercityService = ctx.getBean(UnivercityService.class);

        Univercity univercity = new Univercity();

        univercity.setName("testUnivercity");
        univercity.setAddress("test location");
        univercity.setCountOfInstitutes(5);
        univercity.setLevelOfAccreditation(3);
        univercity.setCountOfStudents(3500);


        // CREATE

        System.out.println("Create");

        univercityService.save(univercity);

        // READ FROM DATABASE

        System.out.println("Read");

        System.out.println(univercityService.findAll().toString());

        // UPDATE

        Univercity forUpdate = univercityService.getReferenceById(1);
        forUpdate.setName("UpdatedTestName");
        univercityService.update(forUpdate);

        // DELETE

        univercityService.deleteById(2);


        // READ

        System.out.println("Read");

        System.out.println(univercityService.findAll().toString());


    }
}
