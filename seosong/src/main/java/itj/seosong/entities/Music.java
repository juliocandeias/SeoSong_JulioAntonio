package itj.seosong.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Music")
public class Music {
<<<<<<< HEAD

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "music")
    private List<Playlist> playlist = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "id_Artist", nullable = false)
    private Artist artist;

    @Column(name = "album")
    private String album;

    @Column(name = "year")
    private Integer year;

    @Column(name = "duration")
    private float duration;

    @Column(name = "genre")
    private String genre;

    @Column(name = "name")
    private String name;

    @Column(name = "photo")
    private String photo;

    public Music() {
    }

    public Music(Artist artist, String album, Integer year, float duration, String genre, String name, String photo) {
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
        this.name = name;
        this.photo = photo;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public List<Playlist> getPlaylist() { return playlist; }
    public void setPlaylist(List<Playlist> playlist) { this.playlist = playlist; }

    public Artist getArtist() { return artist; }
    public void setArtist(Artist artist) { this.artist = artist; }

    public String getAlbum() { return album; }
    public void setAlbum(String album) { this.album = album; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    public float getDuration() { return duration; }
    public void setDuration(float duration) { this.duration = duration; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }
}
=======
	@Id
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_music;
	
	@ManyToMany(mappedBy = "music")
	private List<Users> users;
	
	@ManyToMany(mappedBy = "music")
	private List<Playlist> playlist;
	
	@ManyToOne
	@JoinColumn(name = "id_Artist", nullable=false)
	private Artist artist;
	
	@Column (name = "album")
	private String album;
	
	@Column (name = "year")
	private Year year;
	
	@Column (name = "duration")
	private float duration;
	
	@Column (name = "genre")
	private String genre;
	
	@Column (name = "name")
	private String name;
	
	@Lob
	@Column (name = "photo")
	private byte[] photo;
}
>>>>>>> 9c94af7cabdfba896bf64b82746fbf894628b777
