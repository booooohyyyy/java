package quiz22;

import java.util.LinkedList;
import java.util.List;

public class Product {
	
	//멤버 변수
	private String day;
	private String store;
	private String grade;
	private String detail;
	private String price;
	
	List<Product> list = new LinkedList<>();
	
	//생성자
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String day, String store, String grade, String detail, String price) {
		super();
		this.day = day;
		this.store = store;
		this.grade = grade;
		this.detail = detail;
		this.price = price;
	}


	//getter, setter
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	

}
