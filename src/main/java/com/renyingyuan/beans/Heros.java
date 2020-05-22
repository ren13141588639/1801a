package com.renyingyuan.beans;

public class Heros {

	private Integer id;
	private String name;
	private Double price ;
	private Integer cid;
	private String uptime;
	private String status;
	private String picurl;
	
	private String cname;

	public Heros(Integer id, String name, Double price, Integer cid, String uptime, String status, String picurl,
			String cname) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.cid = cid;
		this.uptime = uptime;
		this.status = status;
		this.picurl = picurl;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Heros [id=" + id + ", name=" + name + ", price=" + price + ", cid=" + cid + ", uptime=" + uptime
				+ ", status=" + status + ", picurl=" + picurl + ", cname=" + cname + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPicurl() {
		return picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Heros() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
