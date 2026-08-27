package itj.seosong.repositories;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import itj.seosong.entities.Artist;


@Repository
public interface Artist_Repository extends JpaRepository<Artist,Long> {

}
