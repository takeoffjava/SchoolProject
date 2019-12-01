package com.school.dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDao {

	private static BaseDao baseDAOInstance = null;

	public boolean close_connection(Session sessionScool) {
		try {
			sessionScool.clear();
			sessionScool.flush();
			sessionScool.close();
			return true;
		} catch (Exception expclose_connection) {
			System.out.println(expclose_connection);
		}
		return false;
	}

	public BaseDao() {
	}

	public static BaseDao getInstance() {
		if (baseDAOInstance == null)
			baseDAOInstance = new BaseDao();
		return baseDAOInstance;
	}

	public boolean executeHQLQuery(String hqlQueryCommand, Session sn_School) {
		int response_db = 0;
		try {
			sn_School.beginTransaction();
			response_db = sn_School.createQuery(hqlQueryCommand).executeUpdate();
			sn_School.getTransaction().commit();
			hqlQueryCommand = null;
		} catch (Exception expExecuteQuery) {
			hqlQueryCommand = null;
		}
		close_connection(sn_School);
		return (response_db > 0) ? true : false;
	}
}
