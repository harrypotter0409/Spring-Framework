package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="APPUSER")
public class Appuser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Size(min=3, max=50)
	@Column(name = "FIRSTNAME", nullable = false)
	private String firstname;
	public String getFirstname() {
		return this.firstname;
	}

	@Size(min=3, max=50)
	@Column(name = "SURNAME", nullable = false)
	private String surname;
	public String getSurname() {
		return this.surname;
	}

	@NotNull
	@DateTimeFormat(pattern="dd.MM.yyyy")
	@Column(name = "BIRTHDATE", nullable = false)
	private Date birthdate;
	public Date getBirthdate() {
		return this.birthdate;
	}

	@Column(name = "GENDER", nullable = false)
	private String gender;
	public String getGender() {
		return this.gender;
	}
	@Column(name = "EMAIL", nullable = false)
	private String email;
	public String getEmail() {
		return this.email;
	}
	@Column(name = "USERNAME", nullable = false)
	private String username;
	public String getUsername() {
		return this.username;
	}
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	public String getPassword() {
		return this.password;
	}

}
