package itj.seosong.repositories;
import org.springframework.stereotype.Repository;

import itj.seosong.entities.User;

import org.springframework.data.jpa.repository.*;

@Repository
public interface User_Repository extends JpaRepository<User,Long>
{}
