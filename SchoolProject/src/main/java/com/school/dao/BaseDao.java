package com.school.dao;

import org.hibernate.Session;

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
}
