package co.edu.unbosque.CodeCraftersForrestM.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.CodeCraftersForrestM.dao.StationDAO;
import co.edu.unbosque.CodeCraftersForrestM.model.Station;

@RestController
@RequestMapping("station")
public class StationAPI {
	
	@Autowired
	private StationDAO stationDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Station station) {
		stationDAO.save(station);
	}
	
	@GetMapping("/listar")
	public List<Station> listar(){
		return stationDAO.findAll();
	}

}
