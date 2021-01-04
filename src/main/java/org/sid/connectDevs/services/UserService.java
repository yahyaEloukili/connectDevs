package org.sid.connectDevs.services;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;

import org.sid.connectDevs.entities.User;
import org.sid.connectDevs.exceptions.domain.EmailExistException;
import org.sid.connectDevs.exceptions.domain.EmailNotFoundException;
import org.sid.connectDevs.exceptions.domain.NotAnImageFileException;
import org.sid.connectDevs.exceptions.domain.UserNotFoundException;
import org.sid.connectDevs.exceptions.domain.UsernameExistException;
import org.springframework.web.multipart.MultipartFile;



public interface UserService {
	 User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, UsernameExistException, EmailExistException, MessagingException;

	    List<User> getUsers();

	    User findUserByUsername(String username);

	    User findUserByEmail(String email);

	    User addNewUser(String firstName, String lastName, String username, String email, String role, boolean isNonLocked, boolean isActive, MultipartFile profileImage) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException, NotAnImageFileException;

	    User updateUser(String currentUsername, String newFirstName, String newLastName, String newUsername, String newEmail, String role, boolean isNonLocked, boolean isActive, MultipartFile profileImage) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException, NotAnImageFileException;

	    void deleteUser(String username) throws IOException;

	    void resetPassword(String email) throws MessagingException, EmailNotFoundException;

	    User updateProfileImage(String username, MultipartFile profileImage) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException, NotAnImageFileException;
}
