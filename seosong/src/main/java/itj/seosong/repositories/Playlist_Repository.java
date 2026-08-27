package itj.seosong.repositories;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;
import itj.seosong.entities.Playlist;

@Repository
public interface Playlist_Repository extends JpaRepository<Playlist,Long> {

}
