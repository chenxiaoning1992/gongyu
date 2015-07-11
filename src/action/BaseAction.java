package action;

import java.lang.reflect.ParameterizedType;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public abstract class BaseAction<T> extends ActionSupport implements ModelDriven<T>, Preparable {

	/**
	 * getModel是重点
	 */
	private static final long serialVersionUID = 1L;
	public T model;
	
	public BaseAction() {
		try {
			ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
			Class clazz = (Class) parameterizedType.getActualTypeArguments()[0];
			model = (T) clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	public  T getModel(){
		return model;
		
	}
	public void prepare() throws Exception {
		
	}

}
