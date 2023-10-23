/*
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static String usuario = "root";
    private static String senha = "12345";
    private static String host = "localhost";
    private static String porta = "3306";
    private static String bd = "db_pessoas";

    public static Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?user=" + usuario + "&password=" + senha + "&useTimezone=true&serverTimezone=America/Sao_Paulo");
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

*/

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static String usuario = "avnadmin";
    private static String senha = "AVNS_q-HyD9RPFC93m0KB6qX";
    private static String host = "mysql-pessoas-piresedu.aivencloud.com";
    private static String porta = "17204";
    private static String bd = "db_pessoas";

    public static Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?user=" + usuario + "&password=" + senha + "&useTimezone=true&serverTimezone=America/Sao_Paulo");
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}