package com.ead.app.Repository;

import com.ead.app.Model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Long> {
      @Query(value = "SELECT * FROM candidate WHERE name LIKE %:name%", nativeQuery = true)
      List<Candidate> findCandidateByName(@Param("name") String name);
}
