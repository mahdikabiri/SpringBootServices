package com.example.newintership.modules.fnd_application_system.repository;

import com.example.newintership.modules.fnd_application_system.model.FndApplicationSystem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FndApplicationSystemRepository extends JpaRepository<FndApplicationSystem,Long>  {
      FndApplicationSystem findByNamAppShortAppls(String s);


}
