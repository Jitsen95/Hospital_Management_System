package com.HMS.User.Controller;

import com.HMS.User.Dto.UserDto;
import com.HMS.User.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/add")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto) {
		return new ResponseEntity<UserDto>(userService.createUser(userDto), HttpStatus.CREATED);
	}

	@GetMapping("/byId/{userId}")
	public ResponseEntity<UserDto> findById(@PathVariable("userId") String userId) {
		return new ResponseEntity<>(userService.findById(userId), HttpStatus.FOUND);
	}
	@GetMapping("/byUserId/{userId}")
	public UserDto findByUserId(@PathVariable("userId") String userId) {
		return userService.findById(userId);
	}

	@GetMapping("/all")
	public ResponseEntity<List<UserDto>> findAllUsers(
			@RequestParam (value="pageNumber",defaultValue="0",required=false) int pageNumber,
			@RequestParam (value="pageSize",defaultValue="5",required=false)int pageSize) {
		return new ResponseEntity<>(userService.findAllUser(pageNumber,pageSize), HttpStatus.FOUND);
	}

	@PutMapping("/update/{userId}")
	public ResponseEntity<UserDto> updateUser(@PathVariable("userId") String userId, @RequestBody UserDto userDto) {
		return new ResponseEntity<>(userService.updateUser(userDto, userId), HttpStatus.OK);
	}

	@DeleteMapping("/remove/{userId}")
	public ResponseEntity<String> deleteUserById(@PathVariable("userId") String userId) {
		return new ResponseEntity<>(userService.deleteUserById(userId), HttpStatus.OK);

	}

	@GetMapping("/byName/{firstName}")
	public ResponseEntity<List<UserDto>> findByFirstName(@PathVariable("firstName") String firstName) {
		return new ResponseEntity<List<UserDto>>(userService.findByFirstName(firstName), HttpStatus.FOUND);
	}
	@GetMapping("/byemail/{email}")
	public ResponseEntity<UserDto>findUserByEmail(@PathVariable("email") String email){
		return new ResponseEntity<UserDto>(userService.findByEmail(email),HttpStatus.FOUND);
	}
	@GetMapping("/byMobile/{mobile}")
	public ResponseEntity<UserDto>findUserByMobile(@PathVariable("mobile") Long mobile){
		return new ResponseEntity<UserDto>(userService.findByMobile(mobile),HttpStatus.FOUND);
	}
	
	@GetMapping("/byCity/{city}")
	public ResponseEntity<List<UserDto>> findByCity(@PathVariable("city") String city) {
		return new ResponseEntity<List<UserDto>>(userService.findByCity(city), HttpStatus.FOUND);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
