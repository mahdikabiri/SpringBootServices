package com.example.newintership.modules.fnd_loockup_names.repository;

import com.example.newintership.modules.fnd_loockup_names.model.FndLookupNames;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@DataJpaTest
public class FndLookupNamesRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private FndLoockupNamesRepository  fndLoockupNamesRepository;

    @Test
    public void whenFind_thenReturnEntity() {
        FndLookupNames f=new FndLookupNames("tesat");
        testEntityManager.persist(f);
        testEntityManager.flush();
        FndLookupNames found=fndLoockupNamesRepository.findByDesFarsiLkpnm(f.getDesFarsiLkpnm());
        assertEquals(found.getDesFarsiLkpnm(), f.getDesFarsiLkpnm());

    }

    }