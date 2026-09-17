package itj.seosong.services;
<<<<<<< HEAD

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import itj.seosong.entities.Users;
import itj.seosong.repositories.Users_Repository;

@Service
public class Users_Services {

    private final Users_Repository repository;

    public Users_Services(Users_Repository repository) {
        this.repository = repository;
    }

    public Users registry(Users new_users) {
        return repository.save(new_users);
    }

    public List<Users> findAll() {
        return repository.findAll();
    }

    public Optional<Users> findById(Long id) {
        return repository.findById(id);
    }

    public Users update(Long id, Users user) {
        Users user_update = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado com id: " + id));

        // ajuste os campos abaixo de acordo com os atributos reais da sua entidade Users
        user_update.setName(user.getName());
        user_update.setEmail(user.getEmail());
        user_update.setPassword(user.getPassword());
        user_update.setPhoto(user.getPhoto());

        return repository.save(user_update);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
=======
import itj.seosong.entities.Users;
import itj.seosong.repositories.Users_Repository;

public class Users_Services {
	
	private final Users_Repository repository;
	
	public Users_Services(Users_Repository repository) {
		this.repository = repository;
	}
	
	public void registry(Users new_users) {
		repository.save(new_users);
	}

}
>>>>>>> 9c94af7cabdfba896bf64b82746fbf894628b777
