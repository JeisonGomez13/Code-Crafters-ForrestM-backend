package co.edu.unbosque.CodeCraftersForrestM.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.CodeCraftersForrestM.dao.TrackDAO;
import co.edu.unbosque.CodeCraftersForrestM.model.Track;

@RestController
@RequestMapping("track")
public class TrackAPI {

	@Autowired
	private TrackDAO trackDAO;

	@PostMapping("/guardar")
	public void guardar(@RequestBody Track track) {
		trackDAO.save(track);
	}

	@GetMapping("/listar")
	public List<Track> listar() {
		return trackDAO.findAll();
	}

}
