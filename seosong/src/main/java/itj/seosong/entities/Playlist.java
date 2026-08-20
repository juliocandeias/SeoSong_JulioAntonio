package itj.seosong.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
	
	private Long id_users;
	
	@Lob
	@Column (name = "photo")
	private byte[] photo;
}
