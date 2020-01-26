package fleet;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Registeruser generated by hbm2java
 */
@Entity
@Table(name = "registeruser", catalog = "fleet_management")
public class Registeruser implements java.io.Serializable {

	private int userid;
	private String userfirstname;
	private String userlastname;
	private Date userdob;
	private String userdrivinglicenceno;
	private String useraadharno;
	private String userpassportno;
	private String userphoneno;
	private String useremailid;
	private String userpassword;
	private String useraddress1;
	private String useraddress2;
	//private Set<Booking> bookings = new HashSet<Booking>(0);

	public Registeruser() {
	}

	public Registeruser(int userid) {
		this.userid = userid;
	}

	public Registeruser(int userid, String userfirstname, String userlastname, Date userdob,
			String userdrivinglicenceno, String useraadharno, String userpassportno, String userphoneno,
			String useremailid, String userpassword, String useraddress1, String useraddress2, Set<Booking> bookings) {
		this.userid = userid;
		this.userfirstname = userfirstname;
		this.userlastname = userlastname;
		this.userdob = userdob;
		this.userdrivinglicenceno = userdrivinglicenceno;
		this.useraadharno = useraadharno;
		this.userpassportno = userpassportno;
		this.userphoneno = userphoneno;
		this.useremailid = useremailid;
		this.userpassword = userpassword;
		this.useraddress1 = useraddress1;
		this.useraddress2 = useraddress2;
		//this.bookings = bookings;
	}

	@Id

	@Column(name = "userid", unique = true, nullable = false)
	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Column(name = "userfirstname", length = 256)
	public String getUserfirstname() {
		return this.userfirstname;
	}

	public void setUserfirstname(String userfirstname) {
		this.userfirstname = userfirstname;
	}

	@Column(name = "userlastname", length = 256)
	public String getUserlastname() {
		return this.userlastname;
	}

	public void setUserlastname(String userlastname) {
		this.userlastname = userlastname;
	}

	
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-mm-yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name = "userdob", length = 10)
	public Date getUserdob() {
		return this.userdob;
	}

	public void setUserdob(Date userdob) {
		this.userdob = userdob;
	}

	@Column(name = "userdrivinglicenceno", length = 256)
	public String getUserdrivinglicenceno() {
		return this.userdrivinglicenceno;
	}

	public void setUserdrivinglicenceno(String userdrivinglicenceno) {
		this.userdrivinglicenceno = userdrivinglicenceno;
	}

	@Column(name = "useraadharno", length = 256)
	public String getUseraadharno() {
		return this.useraadharno;
	}

	public void setUseraadharno(String useraadharno) {
		this.useraadharno = useraadharno;
	}

	@Column(name = "userpassportno", length = 256)
	public String getUserpassportno() {
		return this.userpassportno;
	}

	public void setUserpassportno(String userpassportno) {
		this.userpassportno = userpassportno;
	}

	@Column(name = "userphoneno", length = 256)
	public String getUserphoneno() {
		return this.userphoneno;
	}

	public void setUserphoneno(String userphoneno) {
		this.userphoneno = userphoneno;
	}

	@Column(name = "useremailid", length = 256)
	public String getUseremailid() {
		return this.useremailid;
	}

	public void setUseremailid(String useremailid) {
		this.useremailid = useremailid;
	}

	@Column(name = "userpassword", length = 256)
	public String getUserpassword() {
		return this.userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	@Column(name = "useraddress1", length = 256)
	public String getUseraddress1() {
		return this.useraddress1;
	}

	public void setUseraddress1(String useraddress1) {
		this.useraddress1 = useraddress1;
	}

	@Column(name = "useraddress2", length = 256)
	public String getUseraddress2() {
		return this.useraddress2;
	}

	public void setUseraddress2(String useraddress2) {
		this.useraddress2 = useraddress2;
	}

	//@Transient
	//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER/*, mappedBy = "registeruser"*/)
	//@JoinColumn(name= "registeruseruserid", referencedColumnName="userid")
	//public Set<Booking> getBookings() {
	//	return this.bookings;
	//}

	//public void setBookings(Set<Booking> bookings) 
	//{
		//this.bookings = bookings;
	//}

}
