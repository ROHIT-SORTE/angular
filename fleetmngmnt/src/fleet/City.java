package fleet;
// Generated 20 Jan, 2020 2:21:04 PM by Hibernate Tools 3.2.2.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * City generated by hbm2java
 */
@Entity
@Table(name = "city", catalog = "fleet_management")
public class City implements java.io.Serializable {

	private int cityid;
	
	/*private State state;*/
	private String cityname;
	private Set<Hub> hubs = new HashSet<Hub>(0);

	public City() {
	}

	public City(int cityid/*, State state*/) {
		this.cityid = cityid;
		/*this.state = state;*/
	}

	public City(int cityid/*, State state*/, String cityname, Set<Hub> hubs) {
		this.cityid = cityid;
		/*this.state = state;*/
		this.cityname = cityname;
		this.hubs = hubs;
	}

	@Id

	@Column(name = "cityid", unique = true, nullable = false)
	public int getCityid() {
		return this.cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	/*@Transient
	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name = "statestateid", nullable = false)
	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}*/

	@Column(name = "cityname", length = 256)
	public String getCityname() {
		return this.cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	//@Transient
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER/*, mappedBy = "city"*/)
	@JoinColumn(name = "citycityid", referencedColumnName="cityid")
	public Set<Hub> getHubs() {
		return this.hubs;
	}

	public void setHubs(Set<Hub> hubs) {
		this.hubs = hubs;
	}

}
