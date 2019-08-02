package dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Appuser;

@Repository("userDao")
@Transactional
public class UserDaoImpl extends AbstractDao<Integer, Appuser> implements UserDao{

	public Appuser findById(int id) {
		return getByKey(id);
	}

	public Appuser findUserByUsername(String username) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("username", username));
		return (Appuser) criteria.uniqueResult();
	}

	public boolean isUsernameUnique(Integer id, String username) {
		Appuser appuser = findUserByUsername(username);
//		return ( appuser == null || ((id != null) && (appuser.getId() == id)));
		return true;
	}

	public void saveIn(Appuser appuser) {

	}


	//TODO

}
