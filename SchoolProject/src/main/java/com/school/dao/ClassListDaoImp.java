package com.school.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.bean.Class_List;
import com.school.daointerface.ClassListDao;

@Repository
public class ClassListDaoImp implements ClassListDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean addClass(Class_List classList) {
		Session session = sessionFactory.getCurrentSession();
		boolean is_Saved = false;
		try {
			session.beginTransaction();
			session.saveOrUpdate(classList);
			session.getTransaction().commit();
			is_Saved = true;
		} catch (Exception exp) {
			System.out.println(exp);
		} finally {
			BaseDao.getInstance().close_connection(session);

		}
		return is_Saved;

	}

	@Override
	public boolean updateClass(Class_List classList) {
		Session session = sessionFactory.getCurrentSession();
		boolean is_Updated = false;
		try {
			session.beginTransaction();
			String stringUpdateClassList = "update Class_List C set C.class_Name=:cname,C.class_Updated_Date=now() where C.class_Id=:cId";
			Query queryUpdateClassList = session.createQuery(stringUpdateClassList);
			queryUpdateClassList.setString("cname", classList.getClass_Name());
			queryUpdateClassList.setInteger("cId", classList.getClass_Id());
			is_Updated = queryUpdateClassList.executeUpdate() == 0 ? true : false;
			session.getTransaction().commit();
		} catch (Exception exp) {
			System.out.println(exp);
		} finally {
			BaseDao.getInstance().close_connection(session);
		}
		return is_Updated;

	}

	@Override
	public Class_List findClassById(int classId) {
		Session session = sessionFactory.getCurrentSession();
		List<Class_List> class_List = null;
		try {
			Criteria criteria = session.createCriteria(Class_List.class);
			criteria.add(Restrictions.eq("class_Id", classId));
			class_List = criteria.list();

		} catch (Exception exp) {
			System.out.println(exp);
		} finally {
			BaseDao.getInstance().close_connection(session);
		}

		return class_List.size() > 0 ? class_List.get(0) : null;
	}

	@Override
	public List<Class_List> findAllClassList() {
		Session session = sessionFactory.getCurrentSession();
		List<Class_List> class_List = null;
		try {
			String stringClassList = "From Class_List";
			class_List = session.createQuery(stringClassList).list();

		} catch (Exception exp) {
			System.out.println(exp);
		} finally {
			BaseDao.getInstance().close_connection(session);
		}

		return class_List.size() > 0 ? class_List : null;
	}

	public boolean updateAllClass(Class_List newclass_List, Class_List existclass_List) {
		Session session = sessionFactory.getCurrentSession();
		boolean is_Updated = false;
		try {
			session.beginTransaction();
			newclass_List = (Class_List) session.merge(existclass_List);
			is_Updated = newclass_List != null ? true : false;
			if (is_Updated)
				session.update(newclass_List);
			session.getTransaction().commit();
		} catch (Exception exp) {
			System.out.println(exp);
		} finally {
			BaseDao.getInstance().close_connection(session);
		}
		return is_Updated;
	}

}
