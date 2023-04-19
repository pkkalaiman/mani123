package com.xworkz.hotel.Service;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.xworkz.hotel.DTO.HotelDTO;
import com.xworkz.hotel.Repository.HotelRepo;

@Service
public class HotelServiceImple implements HotelService {

	@Autowired
	private HotelRepo hotelRepo;

	@Override
	public boolean ValidateAndSave(HotelDTO dto) {
		System.out.println("Running in ValidateAndSave..."+dto);
		boolean saved = this.hotelRepo.Save(dto);
		System.out.println("Saved " + saved);
		return false;
	}

}
