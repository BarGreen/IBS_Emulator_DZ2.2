package ru.compas.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import ru.compas.logic.Compas;
import ru.compas.logic.CompasModel;

@RestController
public class Controller {
	public static final CompasModel compasModel = CompasModel.getInstance();
	public Map<String, String> model;
	
	@PostMapping(value = "/import_data", consumes = "application/json", produces = "application/text")
	public String createPet(@RequestBody Compas compas) {
		String response = "Данные получены";
		return response;
	}
	
	@GetMapping(value = "/get_data", consumes = "application/json", produces = "application/json")
	public Map<String, String> getData(@RequestBody Map.Entry<String, Integer> id) {
		compasModel.roza_vetrov(id.getValue());
		model.put("Side", compasModel.roza_vetrov(id.getValue()));
		return model;
	}
	
}
