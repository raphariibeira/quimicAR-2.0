package com.eventoapp.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class AtomoController {
	
	

	
	
	//HIDROGENIO
	@RequestMapping(value="/HidrogenioChoice", method=RequestMethod.GET)
	public String Hidrogenio() {
		return "atomos/Hidrogenio/HidrogenioChoice";
	}
	
	@RequestMapping(value="/HidrogenioCamera", method=RequestMethod.GET)
	public String Hidrogeniochoice() {
		return "atomos/Hidrogenio/HidrogenioCamera";
	}
	
	//BORO
	@RequestMapping(value="/BoroChoice", method=RequestMethod.GET)
	public String Boro() {
		return "atomos/Boro/BoroChoice";
	}
	
	@RequestMapping(value="/BoroCamera", method=RequestMethod.GET)
	public String Borochoice() {
		return "atomos/Boro/BoroCamera";
	}
	
	//Oxigenio
	@RequestMapping(value="/OxigenioChoice", method=RequestMethod.GET)
	public String Oxigenio() {
		return "atomos/Oxigenio/OxigenioChoice";
	}
	
	@RequestMapping(value="/OxigenioCamera", method=RequestMethod.GET)
	public String Oxigeniochoice() {
		return "atomos/Oxigenio/oxigenioCamera";
	}
	
	//Fosforo
	@RequestMapping(value="/FosforoChoice", method=RequestMethod.GET)
	public String Fosforo() {
		return "atomos/Fosforo/FosforoChoice";
	}
	
	@RequestMapping(value="/FosforoCamera", method=RequestMethod.GET)
	public String Fosforochoice() {
		return "atomos/Fosforo/FosforoCamera";
	}
	
	@RequestMapping(value = "/Pattern-H", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> getImage() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("image/pattern-H.png");
        byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(bytes);
    }
    
    
	
}