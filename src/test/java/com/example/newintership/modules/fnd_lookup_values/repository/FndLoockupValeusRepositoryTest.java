package com.example.newintership.modules.fnd_lookup_values.repository;

import com.example.newintership.modules.fnd_lookup_values.model.FndLookupValeus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@DataJpaTest
public class FndLoockupValeusRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private FndLoockupValeusRepository fndLoockupValeusRepository;

    @Test
    public void whenFind_thenReturnEntity(){
        FndLookupValeus f=new FndLookupValeus("test");
        testEntityManager.persist(f);
        testEntityManager.flush();
        FndLookupValeus found=fndLoockupValeusRepository.findByValLookupLkpvl(f.getValLookupLkpvl());
        assertEquals(found.getValLookupLkpvl(),f.getValLookupLkpvl());
    }
}