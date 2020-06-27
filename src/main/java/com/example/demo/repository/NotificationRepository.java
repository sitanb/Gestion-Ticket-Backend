package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.DevEquipe;
import com.example.demo.model.Notification;
@RepositoryRestResource
public interface NotificationRepository extends JpaRepository<Notification, String> {
	List<Notification>findAll();
	
	 @Transactional
	    @Modifying
	    @Query(value = "update notification set etat_notification=?3 where id_ass = ?1 and code_projet = ?2 ",nativeQuery = true)
	    void updateUsingSingleQuery(String idAss,String codeProjet,String etatNotification);
	 
	 @Transactional
	    @Modifying
	    @Query(value = "delete from notification where id_ass = ?1 and code_projet = ?2 ",nativeQuery = true)
	    void deleteUsingSingleQuery(String idAss,String codeProjet);
		
}
