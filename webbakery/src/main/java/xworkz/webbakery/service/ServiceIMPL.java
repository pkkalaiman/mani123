package xworkz.webbakery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xworkz.webbakery.DTO.BakeryDTO;
import xworkz.webbakery.repository.RepoIMPL;

@Service
public class ServiceIMPL implements Servicee {

	@Autowired
	RepoIMPL repoIMPL;

	@Override
	public boolean validateAndSave(BakeryDTO dto) {
		System.out.println("Running validateAndSave....");
		boolean saved = this.repoIMPL.save(dto);
		System.out.println("Saved..." + saved);
		return false;
	}

}
