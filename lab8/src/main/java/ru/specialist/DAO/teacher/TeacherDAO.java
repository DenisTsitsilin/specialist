package ru.specialist.DAO.teacher;

import java.util.List;

public interface TeacherDAO {
    List<Teacher> findByName(String name);
}
