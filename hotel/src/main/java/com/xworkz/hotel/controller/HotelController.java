package com.xworkz.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.hotel.DTO.HotelDTO;
import com.xworkz.hotel.Service.HotelService;

@Controller
@RequestMapping("/Hotel")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	public HotelController() {
		System.out.println("Created :" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onHotel(HotelDTO dto, Model model) {
		System.out.println("Running in onHotel PostMethod.........");

//		model.addAttribute("hotelName", dto.getHotelName());
//		model.addAttribute("dishName", dto.getDishName());
//		model.addAttribute("type", dto.getType());
//		model.addAttribute("price", dto.getPrice());
//		model.addAttribute("quantity", dto.getQuantity());
//		model.addAttribute("id", dto.getId()); 

		//model.addAttribute("food", dto);
		boolean saved = this.hotelService.ValidateAndSave(dto);
		System.out.println("Saved :" + saved);

		return "index";
	}

}
