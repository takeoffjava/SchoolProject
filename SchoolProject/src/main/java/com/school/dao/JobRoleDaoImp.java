package com.school.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.bean.Job_Role;
import com.school.daointerface.JobRoleDao;

@Repository
public class JobRoleDaoImp implements JobRoleDao {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addJobRole(Job_Role jobRole) {
		Session session = sessionFactory.getCurrentSession();
		boolean is_Saved = false;
		try {
			session.beginTransaction();
			session.saveOrUpdate(jobRole);
			session.getTransaction().commit();
			is_Saved = true;
		} catch (Exception exp) {
			System.out.println(exp);
		} finally {
			BaseDao.getInstance().close_connection(session);

		}
		return is_Saved;

	}

}
