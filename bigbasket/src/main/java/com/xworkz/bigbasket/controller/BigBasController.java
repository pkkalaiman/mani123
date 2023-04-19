package com.xworkz.bigbasket.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bigbasket.DTO.BigBasDTO;
import com.xworkz.bigbasket.service.BigBasService;

@Controller
@RequestMapping("/BigBass")
public class BigBasController {

	@Autowired
	private BigBasService bigBasService;

	List<String> prodect = Arrays.asList("phone", "Saree", "Washing Missin", "HeirBuds", "T-Shirts", "I-phone");
	List<String> places = Arrays.asList("Bangalore", "Tamilnadu", "America", "Australiyaa");

	public BigBasController() {
		System.out.println("Created :" + this.getClass().getSimpleName());
	}

	@GetMapping
	public String onBigBass(Model model) {
		System.out.println("Running in onBigBass.....");

		model.addAttribute("prodect", prodect);
		model.addAttribute("places", places);
		return "BigBasket";
	}

	@PostMapping
	public String onBasket(BigBasDTO dto, Model model) {
		System.out.println("Created in onPostMapping in onBasket" + dto);

		Set<ConstraintViolation<BigBasDTO>> violation = this.bigBasService.ValidateAndSave(dto);
		System.out.println(violation);

		if (violation.isEmpty()) {
			System.out.println("No violation controller go to success page");
			return "Success";
		}
		System.out.println("violation in controller...");
		model.addAttribute("error", violation);
		model.addAttribute("prodect", prodect);
		model.addAttribute("places", places);
		model.addAttribute("dto", dto);
		return "BigBasket";
	}

}
