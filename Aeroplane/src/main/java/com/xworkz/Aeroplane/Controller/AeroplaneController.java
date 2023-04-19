package com.xworkz.Aeroplane.Controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.Aeroplane.DTO.AeroplaneDTO;
import com.xworkz.Aeroplane.Entity.AeroplaneEntity;
import com.xworkz.Aeroplane.Service.AeroplaneService;

@Controller
@RequestMapping("/")
public class AeroplaneController {

	@Autowired
	private AeroplaneService aeroplaneService;

	private List<String> country = Arrays.asList("TamilNadu", "Bangalore", "America", "England", "Singapoor", "Ooty");

	private List<String> types = Arrays.asList("Devolopment", "Buisiness", "LifStyle", "Employblecity", "All couries");

	public AeroplaneController() {
		System.out.println("Created :" + this.getClass().getSimpleName());
	}

	@GetMapping("/Aeroplane")
	public String onAeroplame(Model model) {
		System.out.println("Running in onAeroplane...");

		model.addAttribute("country", country);
		model.addAttribute("types", types);
		return "Aeroplane";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running search for id :" + id);

		AeroplaneEntity dto = this.aeroplaneService.finById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not Found");
		}
		return "Search";
	}

	@PostMapping("/Aeroplane")
	public String onAeroplane(AeroplaneDTO dto, Model model) {
		System.out.println("Running in onPostAeroplane...");
		System.out.println(dto);
		Set<ConstraintViolation<AeroplaneDTO>> violation = aeroplaneService.ValidateAndSave(dto);

		if (violation.isEmpty()) {
			System.out.println("no Violation Controller go to Success Pagee...");
			return "Success";
		}
		System.err.println("violation is Controller");
		model.addAttribute("country", country);
		model.addAttribute("types", types);
		model.addAttribute("error", violation);
		model.addAttribute("Validate Dto", dto);
		return "Aeroplane";
	}
}
