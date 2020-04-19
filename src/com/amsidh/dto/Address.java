/**
 * 
 */
package com.amsidh.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author VIRU
 * 
 */
@Embeddable
public class Address {

	@Column(name = "STREET")
	private String street;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "PINCODE")
	private Integer picode;
    
	/**
 * 
 */
	public Address() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param street
	 * @param city
	 * @param state
	 * @param picode
	 */
	public Address(String street, String city, String state, Integer picode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.picode = picode;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the picode
	 */
	public Integer getPicode() {
		return picode;
	}

	/**
	 * @param picode the picode to set
	 */
	public void setPicode(Integer picode) {
		this.picode = picode;
	}

	
}
