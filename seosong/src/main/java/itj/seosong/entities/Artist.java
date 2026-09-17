package itj.seosong.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Artist")
public class Artist {

    @Id
    @Column(name = "id_artist")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "formation_date")
    private Date formationDate;

    @Column(name = "description")
    private String description;

    @Column(name = "photo")
    private String photo;

    @OneToMany(mappedBy = "artist")
    private List<Music> music = new ArrayList<>();

    public Artist() {
    }

    public Artist(String name, Date formationDate, String description, String photo) {
        this.name = name;
        this.formationDate = formationDate;
        this.description = description;
        this.photo = photo;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getFormationDate() { return formationDate; }
    public void setFormationDate(Date formationDate) { this.formationDate = formationDate; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }

    public List<Music> getMusic() { return music; }
    public void setMusic(List<Music> music) { this.music = music; }
}