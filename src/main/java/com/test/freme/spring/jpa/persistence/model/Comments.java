/**
 * 
 */
package com.test.freme.spring.jpa.persistence.model;

import java.util.Date;

import lombok.Data;

/**
 * @author bilonjea
 *
 */
@Data
@Entity
@Table(name = "compte")
public class Comments {
	private static final long serialVersionUID = 1L;
	
	@Id
    @Basic(optional = false)
	private int id;
	
	@Basic(optional = false)
	@Column(name = "MYUSER")
	private String myuser;
	 
	@Basic(optional = false)
	@Column(name = "EMAIL")
	private String email;
	
	@Basic(optional = false)
    @Column(name = "WEBPAGE")
	private String webPage;
    
	@Basic(optional = false)
    @Column(name = "DATUM")
	private Date datum;
    
	@Basic(optional = false)
    @Column(name = "SUMMARY")
	private String summary;
    
	@Basic(optional = false)
    @Column(name = "COMMENTS")
	private String comments;
	
	

}
