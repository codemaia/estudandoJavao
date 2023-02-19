package entities;

import java.util.Date;

import entities.enums._OrderStatus;

public class OrderStudy {
	
	private Integer id;
	private Date moment;
	private _OrderStatus staus;
	
	public OrderStudy() {
		
	}

	public OrderStudy(Integer id, Date moment, _OrderStatus staus) {
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

	public _OrderStatus getStaus() {
		return staus;
	}

	public void setStaus(_OrderStatus staus) {
		this.staus = staus;
	}

	@Override
	public String toString() {
		return "OrderStudy [id=" + id + ", moment=" + moment + ", staus=" + staus + "]";
	}
	
	
	
	
}
