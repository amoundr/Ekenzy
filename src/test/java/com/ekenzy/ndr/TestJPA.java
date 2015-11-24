package com.ekenzy.ndr;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ekenzy.ndr.dao.IekenzyDAO;
import com.ekenzy.ndr.dao.entities.Entreprise;
import com.ekenzy.ndr.dao.entities.Role;
import com.ekenzy.ndr.dao.entities.SecteurActivite;
import com.ekenzy.ndr.dao.entities.Ville;
import com.ekenzy.ndr.dao.entities.Zone;
import com.ekenzy.ndr.dao.entities.ecommerce.Categorie;
import com.ekenzy.ndr.dao.entities.socialnt.Message;
import com.ekenzy.ndr.dao.entities.socialnt.Note;
import com.ekenzy.ndr.metier.IekenzyMetier;

public class TestJPA {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		try{
			
			ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
			IekenzyMetier metier = (IekenzyMetier) context.getBean("metier");
			//IekenzyDAO dao =  (IekenzyDAO) context.getBean("dao");
			
			//dao.addEntreprise(new Entreprise("Ekenzy", "dataminer", "ekenzy@", "password")); 
			
			/*Entreprise et = new Entreprise("username", "username2", "ekenzy", "test", "gmail", true) ;
			
			
			Ville ville = new Ville("Rabat");
			
			Zone  zone  = new Zone("irfane") ;
			
			Role role   = new Role("ENTREPRISE") ;
			
			SecteurActivite secteur = new SecteurActivite("COMMERCE");	
			
			metier.addVille(ville) ;
		    metier.addZone(zone);
		    metier.addRole(role);
		    metier.addSecteur(secteur); 
			
		    zone.setVille(ville) ;
			ville.getZones().add(zone) ;
			
			
			
			et.setVille(ville);
			et.getRoles().add(role) ;
			et.setSecteur(secteur);
			
			metier.addEntreprise(et); 
			
			Entreprise e = metier.getEntreprise(new Long(1)) ;
			
			System.out.println(e.toString());  */
		    
			/* Test Ville and Zone 
			Ville v = new Ville("RABAT");
			
			metier.addVille(v);
			
			List<Zone> zones = metier.listZone();
			
			Zone z1 = new Zone("fadeza") ;
			metier.addZone(z1,new Long(1));
			Zone z2 = new Zone("fadeza2") ; 
			metier.addZone(z2 , new Long(1));
			
			List<Zone> zones2 = metier.listZone();
			
			assertTrue( zones.size() + 2 == zones2.size());
			*/
			
			//assertTrue(e != null);
			/********test Zone *************
			Zone z = metier.getZone(new Long(1));
			SecteurActivite sect = metier.getSecteur(new Long(1));
			
			Entreprise e = new Entreprise("afterINfos", "description", "email", "password", true);
			metier.addEntreprise(e, metier.getZone(new Long(1)).getIdZone(), metier.getSecteur(new Long(1)).getIdSecteur());
			
			assertTrue(metier.getEntreprise(new Long(1)) != null);
			
			/********test Zone *************/
			
			//metier.sendMessage("test message envoye par 3 a 1 " , new Long(3) , new Long(1) ) ;
			/*
			List<Message>  msgs = (List<Message>) metier.listMessages(new Long(1) , new Long(3));
			
			for ( Message m : msgs)
			{
				System.out.println("ce message est envoye par " + m.getEmetteur().getNom() + " a " + m.getRecepteur().getNom() + "  date : " + m.getDate());
			}	
			//*/
		//	metier.sendMessage("test message envoye par 2 a 1 autre 4" , new Long(2) , new Long(1) ) ;
				
		  /************* Abonnement List*************
			
		    List<Entreprise> entps = metier.getListAbonnee(new Long(1));
		    
		    System.out.println("list abonnee");
		    for ( Entreprise es : entps)
		    	System.out.println(es.getNom() + "   id : "+ es.getId());
		    
		    
		    
		    
		    List<Entreprise> entpstt = metier.getListAbonne(new Long(1));
		    
		    System.out.println("list abonnement");
		    for ( Entreprise est : entpstt)
		    	System.out.println(est.getNom() + "   id : "+ est.getId());
		    
		    
		    List<Entreprise> entps24 = metier.getListNouvauxAbonnee(new Long(1));
		    
		    System.out.println("list nouvaux abonnee");
		    for ( Entreprise en : entps24)
		    	System.out.println(en.getNom() + "   id : "+ en.getId());
			
		  /************* Abonnement List*************/		
			
		  /************* Gestion Note *************/	 	
			
		//	metier.ajouterNote(2L, 1L, 5);
			/*Note n = (Note) metier.recupererNote(1L, 2L);
			Note n2 = (Note) metier.recupererNote(2L, 1L);
			System.out.println("Note = "+n.getNote());
			System.out.println("Note 2 = "+n2.getNote());
			
			metier.modifierNote(1L, 2L, 10);
			Note n1 = (Note) metier.recupererNote(1L, 2L);
			System.out.println("Note modifiee = "+n1.getNote());*/
			
			/*metier.ajouterNote(12L, 1L, 6);
			System.out.println("note : "+ metier.getEntreprise(1L).getNote() );*/
			
			/* String mc = "m";
			
			List<Entreprise> ents = metier.entrepriseParMotCle(mc);
			
			for (Entreprise e : ents)
				System.out.println("nome " + e.getNom());
			System.out.println("hhhhhhhhhhhhhhhh");  */
			
			
			
			/**  Test ECOMMERCE  ***/
			
			//Categorie c1 = new Categorie("Ordinateurs", "PC DEQS") ;
				
			
			assertTrue(true);
			
			
		}catch(Exception e){
			
			assertTrue(e.getMessage(), false);
		}
	}

}
