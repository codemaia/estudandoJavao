package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class OrderStudy {
	
	private Integer id;
	private Date moment;
	private OrderStatus staus;
	
	public OrderStudy() {
		
	}

	public OrderStudy(Integer id, Date moment, OrderStatus staus) {
		this.id = id;
		this.moment = moment;
		this.staus = staus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStaus() {
		return staus;
	}

	public void setStaus(OrderStatus staus) {
		this.staus = staus;
	}

	@Override
	public String toString() {
		return "OrderStudy [id=" + id + ", moment=" + moment + ", staus=" + staus + "]";
	}
	
	
	
	
}
