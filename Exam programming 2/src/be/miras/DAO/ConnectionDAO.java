/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.miras.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shaun
 */
public class ConnectionDAO implements AutoCloseable {
    // JDBC driver name and database URL

    static final String DB_URL = "jdbc:mysql://localhost:3306/eindopdrachtshaunvercauteren";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    private Connection connection;
    private Statement statement;
    private ResultSet resultset;

    public ConnectionDAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet executeQuery(String Query) {
        try {
            this.statement = this.connection.createStatement();
            this.resultset = statement.executeQuery(Query);
            return resultset;

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet executeUpdate(String Query) {
        try {
            this.statement = this.connection.createStatement();
            int rows = statement.executeUpdate(Query, Statement.RETURN_GENERATED_KEYS);
            return statement.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void close() throws Exception {
        this.resultset.close();
        this.statement.close();
        this.connection.close();
    }
}
