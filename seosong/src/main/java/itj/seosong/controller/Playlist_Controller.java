package itj.seosong.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itj.seosong.entities.Playlist;
import itj.seosong.services.Playlist_Services;

@CrossOrigin
@RestController
@RequestMapping("/playlists")
public class Playlist_Controller {

    private final Playlist_Services playlist_services;

    public Playlist_Controller(Playlist_Services playlist_services) {
        this.playlist_services = playlist_services;
    }

    @PostMapping
    public Playlist create(@RequestBody Playlist playlist) {
        return playlist_services.registry(playlist);
    }

    @GetMapping
    public List<Playlist> findAll() {
        return playlist_services.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Playlist> findById(@PathVariable Long id) {
        return playlist_services.findById(id);
    }

    @PutMapping("/{id}")
    public Playlist update(
            @PathVariable Long id,
            @RequestBody Playlist playlist) {

        return playlist_services.update(id, playlist);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        playlist_services.delete(id);
    }
    
    @PostMapping("/{playlistId}/songs/{songId}")
    public Playlist addSong(@PathVariable Long playlistId, @PathVariable Long songId) {
        return playlist_services.addMusic(playlistId, songId);
    }

    @DeleteMapping("/{playlistId}/songs/{songId}")
    public Playlist removeSong(@PathVariable Long playlistId, @PathVariable Long songId) {
        return playlist_services.removeMusic(playlistId, songId);
    }
}