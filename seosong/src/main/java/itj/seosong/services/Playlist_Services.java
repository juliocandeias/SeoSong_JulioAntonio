package itj.seosong.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import itj.seosong.entities.Music;
import itj.seosong.entities.Playlist;
import itj.seosong.repositories.Music_Repository;
import itj.seosong.repositories.Playlist_Repository;

@Service
public class Playlist_Services {
	


    private final Playlist_Repository repository;
    private final Music_Repository musicRepository;

    public Playlist_Services(Playlist_Repository repository, Music_Repository musicRepository) {
        this.repository = repository;
        this.musicRepository = musicRepository;
    }

    public Playlist registry(Playlist new_playlist) {
        return repository.save(new_playlist);
    }

    public List<Playlist> findAll() {
        return repository.findAll();
    }

    public Optional<Playlist> findById(Long id) {
        return repository.findById(id);
    }

    public Playlist update(Long id, Playlist playlist) {

        Playlist playlist_update = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Playlist não encontrada com id: " + id));

        playlist_update.setName(playlist.getName());
        playlist_update.setPhoto(playlist.getPhoto());
        playlist_update.setMusic(playlist.getMusic());

        return repository.save(playlist_update);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
    
    public Playlist addMusic(Long playlistId, Long musicId) {
        Playlist playlist = repository.findById(playlistId)
            .orElseThrow(() -> new EntityNotFoundException("Playlist não encontrada com id: " + playlistId));

        Music music = musicRepository.findById(musicId)
            .orElseThrow(() -> new EntityNotFoundException("Música não encontrada com id: " + musicId));

        playlist.getMusic().add(music);
        return repository.save(playlist);
    }

    public Playlist removeMusic(Long playlistId, Long musicId) {
        Playlist playlist = repository.findById(playlistId)
            .orElseThrow(() -> new EntityNotFoundException("Playlist não encontrada com id: " + playlistId));

        playlist.getMusic().removeIf(m -> m.getId().equals(musicId));
        return repository.save(playlist);
    }
}