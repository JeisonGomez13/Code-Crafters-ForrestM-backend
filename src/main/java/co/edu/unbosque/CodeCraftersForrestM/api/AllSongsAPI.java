package co.edu.unbosque.CodeCraftersForrestM.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.unbosque.CodeCraftersForrestM.dao.AllSongsDAO;
import co.edu.unbosque.CodeCraftersForrestM.model.AllSongs;

@RestController
@RequestMapping("allSongs")
public class AllSongsAPI {
	
	@Autowired
	private AllSongsDAO allsongsDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody AllSongs allsongs) {
		allsongsDAO.save(allsongs);
	}
	
	@GetMapping("/listar")
	public List<AllSongs> listar(){
		return allsongsDAO.findAll();
	}

}
