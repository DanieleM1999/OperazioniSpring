package it.dstech.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.gestione.Verifica;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping(value  = "/calcolatoreA")
	public ModelAndView checkParameter(@RequestParam("numero1") int numero1,@RequestParam("numero2") int numero2, Model model) {
		Verifica v = new Verifica();
		ModelAndView vista = new ModelAndView("risultato");
		vista.addObject("check", v.addizione(numero1, numero2));
		return vista;
	}
	
	@RequestMapping(value  = "/calcolatoreS")
	public ModelAndView checkParameterS(@RequestParam("numero") int numero1, int numero2, Model model) {
		Verifica v = new Verifica();
		ModelAndView vista = new ModelAndView("risultato");
		vista.addObject("numero", numero1);
		vista.addObject("numero", numero2);
		vista.addObject("checkPal", v.sottrazione(numero1, numero2));
		return vista;
	}
	
	@RequestMapping(value  = "/calcolatoreM")
	public ModelAndView checkParameterM(@RequestParam("numero") int numero1, int numero2, Model model) {
		Verifica v = new Verifica();
		ModelAndView vista = new ModelAndView("risultato");
		vista.addObject("numero", numero1);
		vista.addObject("numero", numero2);
		vista.addObject("checkPal", v.moltiplicazione(numero1, numero2));
		return vista;
	}
	
	@RequestMapping(value  = "/calcolatoreD")
	public ModelAndView checkParameterD(@RequestParam("numero") int numero1, int numero2, Model model) {
		Verifica v = new Verifica();
		ModelAndView vista = new ModelAndView("risultato");
		vista.addObject("numero", numero1);
		vista.addObject("numero", numero2);
		vista.addObject("checkPal", v.sottrazione(numero1, numero2));
		return vista;
	}
	

}
