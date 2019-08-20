package com.game.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController {
	//Starting my test game
	@GetMapping("/")
	public ModelAndView play() {
		ModelAndView modelView = new ModelAndView("play");
		return modelView;
	}
	
	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView modelView = new ModelAndView("home");
		return modelView;
	}
	
	@GetMapping("/lose")
	public ModelAndView lose() {
		ModelAndView modelView = new ModelAndView("lose");
		return modelView;
	}
	
	@GetMapping("/door")
	public ModelAndView door() {
		ModelAndView modelView = new ModelAndView("door");
		return modelView;
	}
}