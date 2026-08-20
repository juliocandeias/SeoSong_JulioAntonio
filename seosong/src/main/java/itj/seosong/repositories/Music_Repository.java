package itj.seosong.repositories;
import org.springframework.stereotype.Repository;

import itj.seosong.entities.Music;

import org.springframework.data.jpa.repository.*;

@Repository
public interface Music_Repository extends JpaRepository<Music,Long> {

}
