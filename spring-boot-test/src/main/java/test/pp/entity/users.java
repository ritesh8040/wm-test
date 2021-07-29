package test.pp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;  

@Entity
@Table
public class users {

	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	
	 @OneToMany(
		        cascade = CascadeType.ALL,
		        orphanRemoval = true
		    )
	private List<Cabs> cabs = new ArrayList<>();
	

	public List<Cabs> getCabs() {
		return cabs;
	}

	public void setCabs(List<Cabs> cabs) {
		this.cabs = cabs;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}
	
	
	
}
