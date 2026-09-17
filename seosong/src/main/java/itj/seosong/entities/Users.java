package itj.seosong.entities;
<<<<<<< HEAD

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
=======
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

>>>>>>> 9c94af7cabdfba896bf64b82746fbf894628b777

@Entity
@Table(name = "Users")
public class Users {

    @Id
    @Column(name = "id_users", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "user")
    private List<Playlist> playlist = new ArrayList<>();

    @Column(name = "email", unique = true, nullable = false, length = 150)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "birth_date")
    private Date birthDate;

<<<<<<< HEAD
    @Column(name = "cep", length = 9)
    private String cep;
=======
@Column (name = "birth_date")
private LocalDate birthdate;
>>>>>>> 9c94af7cabdfba896bf64b82746fbf894628b777

    @Column(name = "photo")
    private String photo;

<<<<<<< HEAD
    public Users() {
    }

    public Users(String email, String password, String name, Date birthDate, String cep, String photo) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.birthDate = birthDate;
        this.cep = cep;
        this.photo = photo;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public List<Playlist> getPlaylist() { return playlist; }
    public void setPlaylist(List<Playlist> playlist) { this.playlist = playlist; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }
}
=======
@Lob
@Column (name = "photo")
private byte[] photo;

@ManyToMany
@JoinTable(
		name = "favorites",
		joinColumns = @JoinColumn(name = "Users_id"),
		inverseJoinColumns = @JoinColumn(name = "Music_id")
		)
private List<Music> music; 
}
>>>>>>> 9c94af7cabdfba896bf64b82746fbf894628b777
