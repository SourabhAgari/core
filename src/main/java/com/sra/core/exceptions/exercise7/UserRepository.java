package com.sra.core.exceptions.exercise7;

public class UserRepository {
    public static void findByUserID(int id) throws SqlException {
        if (id < 0) {
            throw new SqlException("Invalid id");
        }
        else if(id == 99) {
            throw new SqlException("User not found");
        }
        System.out.println("User found: User#" + id);
    }
}
