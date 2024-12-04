package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TruckDao {
    DbConnection dbConnection = new DbConnection();

    public void addTruck(Truck truck){
        Connection conn = dbConnection.Connect();
        String query = Query.insert;

        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, truck.getName());
            pstmt.setString(2, truck.getModel());
            pstmt.setInt(3, truck.getCapacity());
            pstmt.setString(4, truck.getDriver());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Truck getTruckById(int id){
        Connection conn = dbConnection.Connect();
        String query = Query.getTruck;
        Truck truck = new Truck();

        try {
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setInt(1, id);


            ResultSet res = pstmt.executeQuery();
            while(res.next()){
                truck.setId(res.getInt("id"));
                truck.setName(res.getString("name"));
                truck.setModel(res.getString("model"));
                truck.setCapacity(res.getInt("Capacity"));
                truck.setDriver(res.getString("Driver"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return truck;
    }

    public void updateTruck(Truck truck){
        Connection conn = dbConnection.Connect();
        String query = Query.update;

        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, truck.getName());
            pstmt.setString(2, truck.getModel());
            pstmt.setInt(3, truck.getCapacity());
            pstmt.setString(4, truck.getDriver());
            pstmt.setInt(5, truck.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void delete (int id){
        Connection conn = dbConnection.Connect();
        String query = Query.delete;

        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
