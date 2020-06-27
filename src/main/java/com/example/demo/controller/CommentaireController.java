package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Commentaire;
import com.example.demo.service.CommentaireService;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CommentaireController {
@Autowired
	
	private CommentaireService commService;

//ajouter commentaire

	 @PostMapping(path="/commentaire")
	 public Commentaire creerCommentaire(@Valid @RequestBody Commentaire newComm)
	 {
	    return commService.saveCommentaire(newComm);
	  }
	 
	 //afficher commentaire
	 
	 @GetMapping(path="/commentaires")
		
		public List<Commentaire>getCommentaires()
		{
			return commService.getCommentaires();
		}
	 
	 //modifier commentaire
	 
	 @PutMapping(path="/commentaire/{idComm}")
	 public Commentaire update(@PathVariable(name="idComm") String idComm,@RequestBody Commentaire g) 
	 {
		g.setIdComm(idComm);
		 return commService.updating(g);
}
	 //supprimer commentaire
	 
	 @DeleteMapping(path="/commentaire/{idComm}")
	 public void delete(@PathVariable(name="idComm") String idComm)
	 {
		 commService.deleting(idComm);
	 }
}
