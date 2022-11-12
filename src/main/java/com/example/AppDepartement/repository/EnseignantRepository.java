package com.example.AppDepartement.repository;

import com.example.AppDepartement.entities.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long>{

   @Query(value = "select * from t_enseignant e where e.departement_id =:idDep",nativeQuery = true)
   public List<Enseignant> findEnseignantByDepartement(@Param(value = "idDep") Long id);

   @Query(value = "select * from t_enseignant e  where e.grade =:gradeEns",nativeQuery = true)
   public List<Enseignant> findEnseignantByGrade(@Param(value = "gradeEns") String grade);

   @Query(value = "select * from t_enseignant e where e.departement_id =:idDep AND e.grade=:gradeEns",nativeQuery = true)
   public List<Enseignant> findEnseignantByDepartementAndGrade(@Param(value = "idDep") Long id, @Param(value = "gradeEns") String grade);

}
