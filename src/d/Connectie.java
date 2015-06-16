package d;

import java.sql.*;

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
                System.out.println("IS DIT HHEM ?");
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
        //String naam , int score , int level
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
            System.out.println("ERROR GET HIGHSCORE");
        }
    }
    
    public static void HighScoreOpslaan(String naam , int score, int level) throws SQLException
    {
        Connection connectie = null;
        connectie = Connectie.getConnection();
        Connectie connection = new Connectie();
        
        String organiseerquery = "INSERT INTO Highscore (naam, score,level) VALUES (?, ?, ?)";
        System.out.println("1");
        PreparedStatement statement = connectie.prepareStatement(organiseerquery);
        System.out.println("2");
        statement.setString(1,naam);
        statement.setInt(2, score);
        System.out.println("3");
        statement.setInt(3, level);
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
