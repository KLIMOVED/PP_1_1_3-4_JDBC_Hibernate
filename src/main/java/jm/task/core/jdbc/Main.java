package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();//Создание таблицы

        userDao.saveUser("Ivan", "Ivanov", (byte) 15);//Добавление первого юзера
        userDao.saveUser("Sergey", "Smirnov", (byte) 25);//Добавление второго юзера
        userDao.saveUser("Olga", "Sidorova", (byte) 18);//Добавление третьего юзера
        userDao.saveUser("Maria", "Petrova", (byte) 40);//Добавление четвертого юзера

        userDao.getAllUsers();//Получение всех юзеров из БД
        userDao.cleanUsersTable();//Очистка таблицы юзеров
        userDao.dropUsersTable();//Удаление таблицы
    }
}
