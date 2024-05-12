package co.edu.unbosque.CodeCraftersForrestM.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.CodeCraftersForrestM.model.Track;

public interface TrackDAO extends JpaRepository<Track, Integer> {

}
