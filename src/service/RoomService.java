package service;

import model.Room;

public interface RoomService extends BaseService<Room> {
	public boolean isRegisted(Integer roomId);
}
