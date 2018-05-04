package com.sun.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sun.entity.SavePoint;

@Transactional
@Repository
public class SavePointDao extends BaseDao{

	public List<SavePoint> loadGame(String name) {
		List<SavePoint> savePointList =  new ArrayList<>();
		final StringBuilder str = new StringBuilder();
		str.append(" SELECT * FROM save_point ");
		str.append(" WHERE user_account_id IN ( ");
		str.append(" 	SELECT id FROM user_account ");
		str.append(" 	WHERE name = :name ");
		str.append(" ) ");
		
		SQLQuery query = this.sessionFactory.getCurrentSession().createSQLQuery(str.toString());
		query.setParameter("name",name);
		query.addEntity(SavePoint.class);
		
		List resultList = query.list();
		
		for (int i = 0; i < resultList.size(); i++) {
			SavePoint sp = (SavePoint)resultList.get(i);
			savePointList.add(sp);
		}
		
		return savePointList;
	}
	
}
