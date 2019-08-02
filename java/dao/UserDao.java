package dao;

import model.Appuser;

public interface UserDao {
	
	Appuser findById(int id);

	Appuser findUserByUsername(String username);
	
    boolean isUsernameUnique(Integer id, String username);
    
    void saveIn(Appuser appuser) ;
}