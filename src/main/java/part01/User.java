package part01;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import javafx.scene.shape.StrokeType;

@Entity
@Table(name="USER_DETAILS_1")
public class User {
	@TableGenerator(name = "Address_Gen", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", pkColumnValue = "Addr_Gen", initialValue = 10000, allocationSize = 100)
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "Address_Gen")
	@Column(name = "USERID")
	private Integer id;
	
	@Column(name = "FULLNAME")
    private String fullname;
	
	@Column(name = "EMAIL")
    private String email;
	
	@Column(name = "USERPASSWORD")
    private String password;
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getFullname() {
        return fullname;
    }
 
    public void setFullname(String fullname) {
        this.fullname = fullname;
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

	@Override
	public String toString() {
		return "User [id=" + id 
				+ ", fullname=" + fullname 
				+ ", email=" + email 
				+ ", password=" + password 
				+ "]";
	}
    
    
}
