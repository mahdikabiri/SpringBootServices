package com.example.newintership.modules.fnd_lookup_rel_tables.repository;

import com.example.newintership.modules.fnd_loockup_names.model.FndLookupNames;
import com.example.newintership.modules.fnd_lookup_rel_tables.model.FndLookupRelTables;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@DataJpaTest
public class FndLookupRelTablesRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private FndLookupRelTablesRepository fndLookupRelTables;


    @Test
    public void whenFind_thenReturnEntity() {
        FndLookupRelTables f=new FndLookupRelTables("tesat");
        testEntityManager.persist(f);
        testEntityManager.flush();
        FndLookupRelTables found=fndLookupRelTables.findByNamTableLkprt(f.getNamTableLkprt());
        assertEquals(found.getNamTableLkprt(), f.getNamTableLkprt());


    }

}