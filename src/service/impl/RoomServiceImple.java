package service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.BaseDAO;
import model.Room;
import model.User;
import service.RoomService;
import util.ValidateUtil;
@Service("roomService")
public class RoomServiceImple extends BaseServiceImpl<Room>implements RoomService {
	@Resource(name="roomDao")
	public void setDao(BaseDAO<Room> dao) {
		super.setDao(dao);
	}
	
	/**
	 * 检查房间是否是否已经存在
	 */
	public boolean isRegisted(Integer roomId) {
		String hql = "from Room r where r.id = ?";
		List<Room> room = this.findEntityByHQl(hql, roomId);
		return !(ValidateUtil.isEmpty(room));
	}

}
