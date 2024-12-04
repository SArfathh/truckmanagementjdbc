package org.example;

public class Query {
    public static String insert = "insert into trucks (name, model, capacity, driver) values (?,?,?,?)";
    public static String update = "update trucks set name = ? , model = ?, capacity = ?, driver = ? where id = ?";
    public static String getTruck = "select * from trucks where id = ?";
    public static String delete = "delete from trucks where id = ?" ;
}
