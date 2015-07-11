package model;

/**
 * @author Administrator
 *
 */
public class Room {
	private Integer id;
	private Integer floor;
	private Integer roomType;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	
	public Integer getRoomType() {
		return roomType;
	}
	public void setRoomType(Integer roomType) {
		this.roomType = roomType;
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", floor=" + floor + ", roomType=" + roomType + "]";
	}
	
}
