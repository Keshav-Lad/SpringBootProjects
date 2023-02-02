package modelV1.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="register_user")

public class RegisterUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name="email")
	@Email
	@NotBlank(message="Please Enter Valid Enter")
	private String email;
	
	@NotBlank(message="Please Enter Valid Password")
	private String password;
	
	@NotBlank(message="Please Enter Address")
	private String address;
	
	@NotBlank(message="plase Enter City")
	private String city;
	
	@NotBlank(message="Please Select State")
	private String state;
	
	public RegisterUser() {
		
	}
	
	public RegisterUser(long id, String email, String password, String address, String city, String state) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.address = address;
		this.city = city;
		this.state = state;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "RegisterUser [id=" + id + ", email=" + email + ", password=" + password + ", address=" + address
				+ ", city=" + city + ", state=" + state + "]";
	}

	
}
