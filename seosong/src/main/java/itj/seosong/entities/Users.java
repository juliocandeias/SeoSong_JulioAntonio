package itj.seosong.entities;
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


@Entity
@Table (name = "Users")
public class Users {


@Id
@Column (name = "id_users", unique=true, nullable=false)
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id_users;

@OneToMany(mappedBy = "users")
private List<Playlist> Playlist;

@Column (name = "email", unique=true, nullable=false, length=150)
private String email;

@Column (name = "password", nullable=false)
private String password;

@Column (name = "name", nullable=false)
private String name;

@Column (name = "birth_date")
private LocalDate birthdate;

@Column (name = "cep",length = 9)
private String cep;

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
