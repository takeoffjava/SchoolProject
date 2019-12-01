package com.school.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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

	public boolean updateJobRole(Job_Role jobRole) {
		Session session = sessionFactory.getCurrentSession();
		boolean is_Updated = false;
		try {
			session.beginTransaction();
			String stringUpdateJobRole = "update Job_Role J set J.job_Name=:jname,J.job_Updated_Date=now() where J.job_Id=:jId";
			Query queryUpdateJobRole = session.createQuery(stringUpdateJobRole);
			queryUpdateJobRole.setString("jname", jobRole.getJob_Name());
			queryUpdateJobRole.setInteger("jId", jobRole.getJob_Id());
			is_Updated = queryUpdateJobRole.executeUpdate() == 0 ? true : false;
			session.getTransaction().commit();
		} catch (Exception exp) {
			System.out.println(exp);
		} finally {
			BaseDao.getInstance().close_connection(session);
		}
		return is_Updated;

	}

	public Job_Role findJobRoleById(int jobId) {
		Session session = sessionFactory.getCurrentSession();
		List<Job_Role> job_Role_List = null;
		try {
			Criteria criteria = session.createCriteria(Job_Role.class);
			criteria.add(Restrictions.eq("job_Id", jobId));
			job_Role_List = criteria.list();

		} catch (Exception exp) {
			System.out.println(exp);
		} finally {
			BaseDao.getInstance().close_connection(session);
		}

		return job_Role_List.size() > 0 ? job_Role_List.get(0) : null;
	}

	@Override
	public List<Job_Role> findAllJobRoles() {
		Session session = sessionFactory.getCurrentSession();
		List<Job_Role> job_Role_List = null;
		try {
			String stringJobRoles = "From Job_Role";
			job_Role_List = session.createQuery(stringJobRoles).list();

		} catch (Exception exp) {
			System.out.println(exp);
		} finally {
			BaseDao.getInstance().close_connection(session);
		}

		return job_Role_List.size() > 0 ? job_Role_List : null;
	}

	@Override
	public boolean updateAllJobRole(Job_Role newJobRole, Job_Role existJobRole) {
		Session session = sessionFactory.getCurrentSession();
		boolean is_Updated = false;
		try {
			session.beginTransaction();
			/*
			 * Job_Role newJobRoleToUpdate=session.get(Job_Role.class,
			 * newJobRole.getJob_Id()); existJobRole.setIs_Active(newJobRole.isIs_Active());
			 */
			newJobRole = (Job_Role) session.merge(existJobRole);
			is_Updated = newJobRole != null ? true : false;
			if (is_Updated)
				session.update(newJobRole);
			session.getTransaction().commit();
		} catch (Exception exp) {
			System.out.println(exp);
		} finally {
			BaseDao.getInstance().close_connection(session);
		}
		return is_Updated;
	}

}
