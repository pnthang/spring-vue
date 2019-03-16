package ca.gtem.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	private String code;
	private String title;
    private String author;
    private String publisher;
    private int copies;
    
    
    public Book() {		
		this.title = "";
		this.author = "";
		this.publisher = "";
		this.copies = 0;
	}
    
	/**
	 * @param title
	 * @param author
	 * @param publisher
	 * @param copies
	 */
	public Book(String title, String author, String publisher, int copies) {		
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.copies = copies;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the copies
	 */
	public int getCopies() {
		return copies;
	}
	/**
	 * @param copies the copies to set
	 */
	public void setCopies(int copies) {
		this.copies = copies;
	}
    
    
}
