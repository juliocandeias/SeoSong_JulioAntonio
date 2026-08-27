package itj.seosong.entities;

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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Playlist")
public class Playlist {
	@Id
	@Column (name = "id_playlist")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_playlist;
	
	@Column (name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "id_users", nullable=false)
	private Users users;
	
	@Lob
	@Column (name = "photo")
	private byte[] photo;
	
	@ManyToMany
	@JoinTable(
			name = "music_playlist",
			joinColumns = @JoinColumn(name = "Playlist_id"),
			inverseJoinColumns = @JoinColumn(name = "Music_id")
			)
	private List<Music> music; 
}
