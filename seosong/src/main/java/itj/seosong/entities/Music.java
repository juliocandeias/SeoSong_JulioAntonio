package itj.seosong.entities;
import java.time.Year;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;



@Entity
@Table (name = "Music")
public class Music {
	@Id
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_music;
	
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
