package action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import model.Room;
import service.RoomService;
@Controller
@Scope("prototype")
public class RoomAction extends BaseAction<Room>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource
	private RoomService roomService;

	public void validateDoAddRoom(){
		Integer id = model.getId();
		if(roomService.isRegisted(id)){
			addFieldError("id", "这个房间已经存在啦~~~");
		}
	}
	public String toAddRoomPage(){
		return "addRoomPage";
	}
	public String doAddRoom(){
		roomService.saveEntity(model);
		return SUCCESS;
	}
}
