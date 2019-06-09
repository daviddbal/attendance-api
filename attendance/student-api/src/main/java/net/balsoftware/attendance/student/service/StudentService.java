package net.balsoftware.attendance.student.service;

public class StudentService {

    // TODO - MAKE DAO LIBRARY PROJECT
    private final DAOManager daoManager;

    public String getStudentById(int id) {
        return daoManager.getStudentById(id);
    }
}
