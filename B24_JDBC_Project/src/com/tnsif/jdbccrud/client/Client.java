package com.tnsif.jdbccrud.client;

import java.sql.SQLException;

import com.tnsif.jdbccrud.service.Service;

public class Client {

	public static void main(String[] args) throws SQLException {
		Service service=new Service();
        //service.addStudent();
        //service.getStudents();
        //service.updateStudent();
        //service.deleteStudnet();
        //service.getStudents();
        service.storedProcedure();
        //service.closeSession();
	}

}