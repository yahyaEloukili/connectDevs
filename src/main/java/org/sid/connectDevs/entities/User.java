package org.sid.connectDevs.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class User implements Serializable{

	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false,updatable = false)
	private Long id;
	@Column(nullable = false,updatable = false,unique = true)
	private String userId;
	@Column(unique = true)
	private String username;
	@Column(unique = true)
	@NotBlank(message = "Please enter a valid email")
	@Email(message = "Please enter a valid email")
	private String email;
	
	@NotBlank(message = "Password is required")
	private String password;
	
	private String firstName;
	private String lastName;



	private String profileImageUrl;
	private Date lastLoginDate;
	private Date lastLoginDateDisplay;
	@CreationTimestamp
	private Date joinDate;
	private String role;
	private boolean isActive;
	private boolean isNotLocked;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
