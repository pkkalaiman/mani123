package xworkz.webbakery.repository;

import org.springframework.stereotype.Repository;

import xworkz.webbakery.DTO.BakeryDTO;

@Repository
public class RepoIMPL implements Repo {

	@Override
	public boolean save(BakeryDTO dto) {
		System.out.println("Running in Save");
		return false;
	}

}
