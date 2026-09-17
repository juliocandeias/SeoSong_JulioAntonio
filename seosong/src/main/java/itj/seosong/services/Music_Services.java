package itj.seosong.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import itj.seosong.entities.Music;
import itj.seosong.repositories.Music_Repository;

@Service
public class Music_Services {

    private final Music_Repository repository;

    public Music_Services(Music_Repository repository) {
        this.repository = repository;
    }

    public Music registry(Music new_music) {
        return repository.save(new_music);
    }

    public List<Music> findAll() {
        return repository.findAll();
    }

    public Optional<Music> findById(Long id) {
        return repository.findById(id);
    }

    public Music update(Long id, Music music) {
        Music music_update = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Música não encontrada com id: " + id));

        music_update.setArtist(music.getArtist());
        music_update.setAlbum(music.getAlbum());
        music_update.setYear(music.getYear());
        music_update.setDuration(music.getDuration());
        music_update.setGenre(music.getGenre());
        music_update.setName(music.getName());
        music_update.setPhoto(music.getPhoto());

        return repository.save(music_update);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}