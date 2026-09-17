package itj.seosong.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import itj.seosong.entities.Artist;
import itj.seosong.repositories.Artist_Repository;

@Service
public class Artist_Services {

    private final Artist_Repository repository;

    public Artist_Services(Artist_Repository repository) {
        this.repository = repository;
    }

    public Artist registry(Artist new_artist) {
        return repository.save(new_artist);
    }

    public List<Artist> findAll() {
        return repository.findAll();
    }

    public Optional<Artist> findById(Long id) {
        return repository.findById(id);
    }

    public Artist update(Long id, Artist artist) {
        Artist artist_update = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Artista não encontrado com id: " + id));

        artist_update.setName(artist.getName());
        artist_update.setFormationDate(artist.getFormationDate());
        artist_update.setDescription(artist.getDescription());
        artist_update.setPhoto(artist.getPhoto());

        return repository.save(artist_update);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}