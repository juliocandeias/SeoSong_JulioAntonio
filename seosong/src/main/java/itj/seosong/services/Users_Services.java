package itj.seosong.services;
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
