package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import model.Room;
import service.RoomService;
@Controller
@Scope("prototype")
public class RoomAction extends BaseAction<Room> implements RequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource
	private RoomService roomService;
	private Map<String, Object> request;

	private Integer roomId;
	
	private InputStream inputStream;
	
	
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public void validateDoAddRoom(){
		Integer id = model.getId();
		if(roomService.isRegisted(id)){
			addFieldError("id", "这个房间已经存在啦~~~");
		}
	}
	/*
	 * 跳转添加房间页面
	 */
	public String toAddRoomPage(){
		return "addRoomPage";
	}
	/*
	 * 添加房间
	 */
	public String doAddRoom(){
		roomService.saveEntity(model);
		return SUCCESS;
	}
	/*
	 * 查询房间
	 */
	public String doListRoom(){
		String hql = null;
		List<Room> rooms = null;
		if(model.getId() == null||model.getId().equals("")){
			hql = "from Room r where r.floor like '%"+ model.getFloor() +"%' and r.roomType like '%"+ model.getRoomType() +"%'";
			
		}else{
			
//			hql = "from Room r where r.id like '%"+ model.getId() +"%' and r.floor like '%"+ model.getFloor() +"%' and r.roomType like '%"+ model.getRoomType() +"%'";
			hql = "from Room r where r.id like '%"+ model.getId() +"%' and r.floor like '%"+ model.getFloor() +"%' and r.roomType like '%"+ model.getRoomType() +"%'";
		}
		rooms = roomService.findEntityByHQl(hql);
		request.put("rooms", rooms);
		System.out.println(hql);
		return "listRoom";
	}
	public String toFindRoomPage(){
		return "toFindRoomPage";
	}
	
	/*
	 * 删除房间
	 */
	public String doDeleteRoom(){
		String hql = "delete from Room r where r.id = ?";
		 try {
			 System.out.println(roomId);
			 roomService.batchEntityByHQL(hql, roomId);
			inputStream = new ByteArrayInputStream("1".getBytes("UTF-8"));
		} catch (Exception e) {
			try {
				inputStream = new ByteArrayInputStream("0".getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return "delete";
	}
	
	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request = arg0;
	}
}
