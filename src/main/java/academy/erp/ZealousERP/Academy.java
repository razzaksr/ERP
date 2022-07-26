package academy.erp.ZealousERP;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Academy
{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ano;
	private String name;
	private String address;
	private String institution;
	private long contactno;
	private String email;
	private String course;
	private int courseamount;
	@Temporal(TemporalType.DATE)
	private Date dateofjoined;
	private int firstpaid;
	@Temporal(TemporalType.DATE)
	private Date firstdatepaid;
	@Temporal(TemporalType.DATE)
	private Date datetobepaid;
	@Column(insertable = false)
	private String finalpaid;
	@Column(insertable = false)
	private String certificate;
	@Column(insertable = false)
	private Date dateofcompletion;
	public void setDateofjoined(Date dateofjoined) {
		this.dateofjoined = dateofjoined;
	}
	public void setFirstdatepaid(Date firstdatepaid) {
		this.firstdatepaid = firstdatepaid;
	}
	public void setDatetobepaid(Date datetobepaid) {
		this.datetobepaid = datetobepaid;
	}
	public void setDateofcompletion(Date dateofcompletion) {
		this.dateofcompletion = dateofcompletion;
	}
	@Override
	public String toString() {
		return "Academy [ano=" + ano + ", name=" + name + ", address=" + address + ", Institution=" + institution
				+ ", contactno=" + contactno + ", email=" + email + ", course=" + course + ", courseamount="
				+ courseamount + ", dateofjoined=" + dateofjoined + ", firstpaid=" + firstpaid + ", firstdatepaid="
				+ firstdatepaid + ", datetobepaid=" + datetobepaid + ", finalpaid=" + finalpaid + ", certificate="
				+ certificate + ", dateofcompletion=" + dateofcompletion + "]";
	}
	public long getAno() {
		return ano;
	}
	public void setAno(long ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getCourseamount() {
		return courseamount;
	}
	public void setCourseamount(int courseamount) {
		this.courseamount = courseamount;
	}
	public int getFirstpaid() {
		return firstpaid;
	}
	public void setFirstpaid(int firstpaid) {
		this.firstpaid = firstpaid;
	}
	public String getFinalpaid() {
		return finalpaid;
	}
	public void setFinalpaid(String finalpaid) {
		this.finalpaid = finalpaid;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public Date getDateofjoined() {
		return dateofjoined;
	}
	public Date getFirstdatepaid() {
		return firstdatepaid;
	}
	public Date getDatetobepaid() {
		return datetobepaid;
	}
	public Date getDateofcompletion() {
		return dateofcompletion;
	}
}