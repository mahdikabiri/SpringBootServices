package com.example.newintership.modules.fnd_application_system.repository;

import com.example.newintership.modules.fnd_application_system.model.FndApplicationSystem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class FndApplicationSystemRepositoryTest {
    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private FndApplicationSystemRepository fndApplicationSystemRepository;

    @Test
    public void whenFindByName_thenReturnEmployee() {
        FndApplicationSystem f = new FndApplicationSystem();
        testEntityManager.persist(f);
        testEntityManager.flush();
        FndApplicationSystem found = fndApplicationSystemRepository.findByNamAppShortAppls(f.getNamAppShortAppls());
        assertEquals(found.getNamAppShortAppls(), f.getNamAppShortAppls());
    }
}