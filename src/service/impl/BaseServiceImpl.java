package service.impl;

import java.util.List;

import javax.annotation.Resource;

import dao.BaseDAO;
import service.BaseService;

public abstract class BaseServiceImpl<T> implements BaseService<T> {
	
	private BaseDAO<T> dao;
	
	


	@Resource
	public void setDao(BaseDAO<T> dao) {
		this.dao = dao;
	}

	public void saveEntity(T t) {
		dao.saveEntity(t);
	}

	@Override
	public void saveOrUpdateEntity(T t) {
		dao.saveOrUpdateEntity(t);
	}

	@Override
	public void updateEntity(T t) {
		dao.updateEntity(t);
	}

	@Override
	public void deleteEntity(T t) {
		dao.deleteEntity(t);
	}

	@Override
	public void batchEntityByHQL(String hql, Object... objects) {
		dao.batchEntityByHQL(hql, objects);
	}

	@Override
	public T loadEntity(Integer id) {
		return dao.loadEntity(id);
	}

	@Override
	public T getEntity(Integer id) {
		return dao.getEntity(id);
	}

	@Override
	public List<T> findEntityByHQl(String hql, Object... objects) {
		return dao.findEntityByHQl(hql, objects);
	}

}
