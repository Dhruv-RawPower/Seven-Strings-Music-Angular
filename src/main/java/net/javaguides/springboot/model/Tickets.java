package net.javaguides.springboot.model;

import java.text.SimpleDateFormat;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tickets")
public class Tickets {
	
	
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "event_name")
	private String eventName;
	
	@Column(name = "event_date")
	private Date eventDate;
	
	@Column(name = "venue")
	private String venue;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "price")
	private String price;

	@Column(name = "organiser")
	private String organiser;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "image_name")
	private String imageName;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	@Column(name = "video_name")
	private String videoName;

	@Column(name = "video_url")
	private String videoUrl;

	@Column(name = "flag")
	private String flag;
	
	@Column(name = "last_date")
	private Date  lastDate;
	
	
	public Tickets() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getOrganiser() {
		return organiser;
	}

	public void setOrganiser(String organiser) {
		this.organiser = organiser;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}



	public Date getEventDate() {
		return eventDate;
	}



	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}



	public String getFlag() {
		return flag;
	}



	public void setFlag(String flag) {
		this.flag = flag;
	}



	public Date getLastDate() {
		return lastDate;
	}



	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}



	@Override
	public String toString() {
		return "Tickets [id=" + id + ", eventName=" + eventName + ", eventDate=" + eventDate + ", venue=" + venue
				+ ", location=" + location + ", price=" + price + ", organiser=" + organiser + ", description="
				+ description + ", imageName=" + imageName + ", imageUrl=" + imageUrl + ", videoName=" + videoName
				+ ", videoUrl=" + videoUrl + ", flag=" + flag + ", lastDate=" + lastDate + "]";
	}



	public Tickets(long id, String eventName, Date eventDate, String venue, String location, String price,
			String organiser, String description, String imageName, String imageUrl, String videoName, String videoUrl,
			String flag, Date lastDate) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.venue = venue;
		this.location = location;
		this.price = price;
		this.organiser = organiser;
		this.description = description;
		this.imageName = imageName;
		this.imageUrl = imageUrl;
		this.videoName = videoName;
		this.videoUrl = videoUrl;
		this.flag = flag;
		this.lastDate = lastDate;
	}
	
	

}
