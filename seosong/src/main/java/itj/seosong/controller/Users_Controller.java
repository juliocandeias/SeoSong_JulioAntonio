package itj.seosong.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import itj.seosong.services.Users_Services;
import itj.seosong.entities.Users;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class Users_Controller {
	
	private final Users_Services users_services;

	public Users_Controller (Users_Services users_services) {
		this.users_services = users_services;
		
	}
	
	@PostMapping
	public Users create(@RequestBody Users users) {
		return users_services.registry(users);
	}
	
	@GetMapping
	public List<Users> findAll() {
		return users_services.findAll();
	}
	
	@GetMapping("/{id}") 
	public Optional<Users> findById(@PathVariable Long id) {
		return users_services.findById(id);
	}
	
	@PutMapping("/{id}")
	public Users update(
			@PathVariable Long id,
			@RequestBody Users user) {
		return users_services.update(id,user);
	}

	@DeleteMapping("/{id}")
	public void delete (@PathVariable Long id) {
		users_services.delete(id);
	}
}
