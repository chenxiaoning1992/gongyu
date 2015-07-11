package dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import dao.BaseDAO;

public abstract class BaseDaoImpl<T> implements BaseDAO<T> {
	
	//注入sessionfactory
	@Resource
	private SessionFactory sessionFactory;
	
	private Class<T> clazz;
	
	public BaseDaoImpl() {
		ParameterizedType parameterizedType =  (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class<T>) parameterizedType.getActualTypeArguments()[0];
	}
	
	public void saveEntity(T t) {
		sessionFactory.getCurrentSession().save(t);
	}

	public void saveOrUpdateEntity(T t) {

		sessionFactory.getCurrentSession().saveOrUpdate(t);
	}

	public void updateEntity(T t) {
		sessionFactory.getCurrentSession().update(t);

	}

	public void deleteEntity(T t) {
		
		sessionFactory.getCurrentSession().delete(t);
	}
	
	/**
	 * 按照HQL语句进行批量更新
	 */
	public void batchEntityByHQL(String hql, Object... objects) {
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		for (int i = 0; i < objects.length; i++) {
			query.setParameter(i, objects[i]);
		}
		query.executeUpdate();
	}

	public T loadEntity(Integer id) {
		return (T) sessionFactory.getCurrentSession().load(clazz, id);
	}

	public T getEntity(Integer id) {
		return (T) sessionFactory.getCurrentSession().get(clazz, id);
	}

	public List<T> findEntityByHQl(String hql, Object... objects) {
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		for (int i = 0; i < objects.length; i++) {
			query.setParameter(i, objects[i]);
		}
		return query.list();
	}

}
