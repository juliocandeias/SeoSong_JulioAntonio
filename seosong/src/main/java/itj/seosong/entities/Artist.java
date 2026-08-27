package itj.seosong.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "Artist")
public class Artist {
	@Id
	@Column (name = "id_artist")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_artist;
	
	@Column (name = "name")
	private String name;
	
	@Column (name = "formation_date")
	private Date formation_date;
	
	@Column (name = "description")
	private String description;
	
	@Lob
	@Column (name = "photo")
	private byte[] photo;
	
	@OneToMany(mappedBy = "artist")
	private List<Music> music;

}
