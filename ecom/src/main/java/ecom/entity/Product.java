package ecom.entity;

import javax.persistence.Entity;                 //java persistence api(do one type job)
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
    private int cost;
    private String cerateDate;
    private String stauts;  
	private int costForYou;
	private String image;
	private String companyName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getCerateDate() {
		return cerateDate;
	}
	public void setCerateDate(String cerateDate) {
		this.cerateDate = cerateDate;
	}
	public String getStauts() {
		return stauts;
	}
	public void setStauts(String stauts) {
		this.stauts = stauts;
	}
	public int getCostForYou() {
		return costForYou;
	}
	public void setCostForYou(int costForYou) {
		this.costForYou = costForYou;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
		}
	

	


