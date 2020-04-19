/**
 * 
 */
package com.amsidh.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author VIRU
 * 
 */
@Entity(name = "UserDetails")
@Table(name = "USER_DETAILS")
public class UserDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "USERNAME")
	private String userName;

	@ElementCollection
	// below annotation is used to name the join table and join column properly
	// otherwise join table will create with name UserDetails_addresses and the
	// join column name will be userId_addresses
	@JoinTable(name = "USER_ADDRESS", joinColumns = { @JoinColumn(name = "USER_ID") })
	// for adding primary key to USER_ADDRESS table otherwise not required below
	// to annotation and these annotation are hibernate annotation not jpa
	// annotation
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns = { @Column(name = "ADDRESS_ID") }, generator = "hilo-gen", type = @Type(type = "long"))
	private List<Address> addresses;

	/**
	 * 
	 */
	public UserDetails() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userId
	 * @param userName
	 * @param addresses
	 */
	public UserDetails(Integer userId, String userName, List<Address> addresses) {
		this.userId = userId;
		this.userName = userName;
		this.addresses = addresses;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the addresses
	 */
	public List<Address> getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses
	 *            the addresses to set
	 */
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
