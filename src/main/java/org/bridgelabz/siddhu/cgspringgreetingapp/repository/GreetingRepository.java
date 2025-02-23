package org.bridgelabz.siddhu.cgspringgreetingapp.repository;

import org.bridgelabz.siddhu.cgspringgreetingapp.dto.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}
