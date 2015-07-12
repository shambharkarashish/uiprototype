package com.food.court.model;

/**
 * <code>MenuItem</code> represents the Model for
 * menu items shown in the example.
 * 
 * @author Tushar Joshi <tushar_joshi@persistent.co.in>
 *
 */
public class MenuItem {
	private String id;
	private String url;
	private String name;
	private String category;
	private String imagepath;

	/**
	 * Id is a lowercase word without space.
	 * 
	 * @return current id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Id is a lowercase word without space.
	 * 
	 * @param id can be null
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Just the id for now.
	 * 
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Just the id for now.
	 * 
	 * @param url only the last part of the url hence only id
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Representation of the item.
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Representation of the item as a word
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Category like Starters, Snacks, Desserts
	 * 
	 * @return
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Category like Starters, Snacks, Desserts
	 * 
	 * @param category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Current image path.
	 * 
	 * @return
	 */
	public String getImagepath() {
		return imagepath;
	}

	/**
	 * needs a image file name without path.
	 * 
	 * @param imagepath
	 */
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

}
