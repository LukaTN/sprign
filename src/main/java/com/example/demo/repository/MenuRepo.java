package com.example.demo.repository;
import com.example.demo.entities.TypeMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Menu;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface MenuRepo extends JpaRepository<Menu, Long>{

    List<Menu> findByTypeMenu(TypeMenu typeMenu);

    //List<Menu> findByTypeMenuAndTotalPriceGreaterThan(TypeMenu typeMenu, double amount);

    @Query("SELECT m FROM Menu m JOIN m.composants c WHERE m.typeMenu = :typeMenu GROUP BY m HAVING SUM(c.prix) > :amount")
    List<Menu> findByTypeMenuAndTotalPriceGreaterThan(@Param("typeMenu") TypeMenu typeMenu, @Param("amount") double amount);

    @Query("SELECT m.libelleMenu FROM Menu m JOIN m.composants c WHERE m.typeMenu = :typeMenu GROUP BY m ORDER BY SUM(c.prix)")
    List<String> findMenuNamesByTypeMenuOrderByTotalPrice(@Param("typeMenu") TypeMenu typeMenu);
}


/*
List <project> findbyProjectDetailTechnologie(String technologie){
    return projectRepository.findbyProjectDetailTechnologie(technologie);
}

List <project> findbyEquipesIdEquipe (long id) {
    return projectRepository.findbyEquipesIdEquipe(id);
}

List <project> findEquipeIdEquipeAndProjectDetailDescriptionNotNull (long id){
    return projectRepository.findEquipeIdEquipeAndProjectDetailDescriptionNotNull(id);
}

List <project> findbyEquipesIdEquipeAndEquipesEntreprisesIdEntreprise (long idEquipe, long idEntreprise){
    return projectRepository.findbyEquipesIdEquipeAndEquipesEntreprisesIdEntreprise(idEquipe, idEntreprise);
}

List <project> findbyEquipesSpecialiteAndEquipesEntreprisesAdresse (String specialite, String adresse){
    return projectRepository.findbyEquipesSpecialiteAndEquipesEntreprisesAdresse(specialite, adresse);
}


@Query("select e from Entreprise e join e.equipes eq where eq.specialite = ?1")

@Query("select p from project p where p.projectDetail.cout_provisoire > ?1 and p.projectDetail.technologie = ?2")


@Query("select e from Equipe e join e.projects p where p.projectDetail.technologie = ?1 and p.dateDebut > ?2")*/
