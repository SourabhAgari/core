package com.sra.core.exceptions.exercise7;

public class UserService {
    public static void getUser(int id) throws ServiceException{
        try {
            UserRepository.findByUserID(id);
        } catch (SqlException e){
            throw new ServiceException("Error getting user", e);
        }
    }
}
