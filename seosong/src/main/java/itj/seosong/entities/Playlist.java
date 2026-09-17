package itj.seosong.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import itj.seosong.entities.Users;

@Entity
@Table(name = "Playlist")
public class Playlist {

    @Id
    @Column(name = "id_playlist")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_users", nullable = false)
    private Users user;

    @Column(name = "photo")
    private String photo;

    @ManyToMany
    @JoinTable(
            name = "music_playlist",
            joinColumns = @JoinColumn(name = "Playlist_id"),
            inverseJoinColumns = @JoinColumn(name = "Music_id")
    )
    private List<Music> music = new ArrayList<>();

    public Playlist() {
    }

    public Playlist(String name, Users user, String photo, List<Music> music) {
        this.name = name;
        this.user = user;
        this.photo = photo;
        this.music = music;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Users getUser() { return user; }
    public void setUser(Users user) { this.user = user; }

    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }

    public List<Music> getMusic() { return music; }
    public void setMusic(List<Music> music) { this.music = music; }

}