package com.example.demo.repository;
import com.example.demo.entities.TypeMenu;
import org.springframework.data.domain.Limit;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Menu;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepo extends JpaRepository<Menu, Long>{

    List<Menu> findByTypeMenuAndPrixTotalGreaterThan(TypeMenu typeMenu, Float prixTotalIsGreaterThan, Limit limit);

    @Query("select m.libelleMenu from Menu m where m.typeMenu = :typeMenu order by m.prixTotal asc")
    List <Menu> findByTypeMenuAndOrderByPrixTotal(String typeMenu);

    @Query("select m.libelleMenu from Menu m  join m.composants c where c.detailComposant  = :typeComposant")
    List <Menu> findByTypeComposant(String typeComposant);
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
