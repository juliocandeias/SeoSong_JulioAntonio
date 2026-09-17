package itj.seosong.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import itj.seosong.entities.Artist;
import itj.seosong.services.Artist_Services;

@CrossOrigin
@RestController
@RequestMapping("/artists")
public class Artist_Controller {

    private final Artist_Services artist_services;

    public Artist_Controller(Artist_Services artist_services) {
        this.artist_services = artist_services;
    }

    @PostMapping
    public Artist create(@RequestBody Artist artist) {
        return artist_services.registry(artist);
    }

    @GetMapping
    public List<Artist> findAll() {
        return artist_services.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Artist> findById(@PathVariable Long id) {
        return artist_services.findById(id);
    }

    @PutMapping("/{id}")
    public Artist update(@PathVariable Long id, @RequestBody Artist artist) {
        return artist_services.update(id, artist);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        artist_services.delete(id);
    }
}