package d;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connectie
{
    private static Connection databaseConnectie;
    public static Connection getConnection()
    {
        if(databaseConnectie == null)
        {
            try
            {          
                String connectString = "jdbc:mysql://meru.hhs.nl:3306/14111071";
                databaseConnectie = DriverManager.getConnection(connectString, "14111071", "Thahkiethi");
            }
            catch (SQLException ex)
            {
                System.out.println("error");
            }
        }
        return databaseConnectie;
    }   
    
    public static ResultSet fetchQuery(String query) throws SQLException
    {
        Connection connectie = getConnection();
        Statement statement = connectie.createStatement();
        statement.execute(query);
        ResultSet resultSet = statement.getResultSet();
        return resultSet;
    }
    
    public static void getHighScores()
    {
        Connectie connection = new Connectie();
        int id;
        int score;
        String naam;
        
        try
        {        
            String query = "SELECT * FROM Highscore ORDER BY score DESC;";
            ResultSet statement = connection.fetchQuery(query);
            
            while(statement.next())
            {
                id = statement.getInt("id");
                score = statement.getInt("score");
                naam = statement.getString("naam");
                System.out.println("id: " + id + " - score: " + score + " - naam: " + naam);
            }
        }
        catch (SQLException ex)
        {
            System.out.println("Error");
        }
    }
    
    public static void HighScoreOpslaan() throws SQLException
    {
        Connection connectie = Connectie.getConnection();
        
        String organiseerquery = "INSERT INTO Highscore (naam, score) VALUES (?, ?)";
        PreparedStatement statement = connectie.prepareStatement(organiseerquery);
        statement.setString(1, naam);
        statement.setInt(2, score);
        int rows = statement.executeUpdate();
        if(rows != 1)
        {
            System.out.println("Kan score niet toevoegen");
        }
        else
        {
            System.out.println("Score toegevoegd");;
        }
    }
}
