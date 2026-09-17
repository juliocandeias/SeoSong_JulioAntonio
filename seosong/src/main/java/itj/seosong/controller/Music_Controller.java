package itj.seosong.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import itj.seosong.entities.Music;
import itj.seosong.services.Music_Services;

@CrossOrigin
@RestController
@RequestMapping("/songs")
public class Music_Controller {

    private final Music_Services music_services;

    public Music_Controller(Music_Services music_services) {
        this.music_services = music_services;
    }

    @PostMapping
    public Music create(@RequestBody Music music) {
        return music_services.registry(music);
    }

    @GetMapping
    public List<Music> findAll() {
        return music_services.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Music> findById(@PathVariable Long id) {
        return music_services.findById(id);
    }

    @PutMapping("/{id}")
    public Music update(@PathVariable Long id, @RequestBody Music music) {
        return music_services.update(id, music);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        music_services.delete(id);
    }
}