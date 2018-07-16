package com.sun.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sun.entity.SaveData;

@Transactional
@Repository
public class UserAccountDao extends BaseDao{

	public List<SaveData> loadGame(String name) {
		List<SaveData> savePointList =  new ArrayList<>();
		final StringBuilder str = new StringBuilder();
		str.append(" SELECT * FROM save_point ");
		str.append(" WHERE user_account_id IN ( ");
		str.append(" 	SELECT id FROM user_account ");
		str.append(" 	WHERE name = :name ");
		str.append(" ) ");
		
		SQLQuery query = this.sessionFactory.getCurrentSession().createSQLQuery(str.toString());
		query.setParameter("name",name);
		query.addEntity(SaveData.class);
		
		List resultList = query.list();
		
		for (int i = 0; i < resultList.size(); i++) {
			SaveData sp = (SaveData)resultList.get(i);
			savePointList.add(sp);
		}
		
		return savePointList;
	}
	
}
