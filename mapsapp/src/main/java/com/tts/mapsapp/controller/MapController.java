package com.tts.mapsapp.controller;

import com.tts.mapsapp.models.Location;
import com.tts.mapsapp.service.MapService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MapController {

	@Autowired
	MapService mapService;

	@GetMapping("/")
	public String getDefaultMap(Model model) {

		model.addAttribute(new Location());

		return "index";
	}

	@PostMapping("/home")
	public String getMapForLocation(Location location, Model model) {

		mapService.addCoordinates(location);
		model.addAttribute(location);

		return "index";
	}

	@GetMapping("/random")
	public String getRandomCity(Model model) {

		Location location = new Location();

		location = mapService.getRandomLocation(location);

		mapService.addCoordinates(location);

		model.addAttribute(location);

		return "index";
	}

}
