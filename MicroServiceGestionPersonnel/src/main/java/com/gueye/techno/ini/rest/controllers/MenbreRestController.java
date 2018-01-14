package com.gueye.techno.ini.rest.controllers;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gueye.techno.ini.repo.MembreRepo;
import com.gueye.techno.ini.entities.Membre;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class MenbreRestController {
	@Autowired
private MembreRepo membreRepo;
	private static Logger logger = LogManager.getLogger(MenbreRestController.class);
	@RequestMapping(method=RequestMethod.GET, path="/membre",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Membre> getAllMembre(){
		if(logger.isDebugEnabled()) logger.debug("Appel getAllMembre sans parametre via uri /membre");
		return (List<Membre>) this.membreRepo.findAll();
	}
}
