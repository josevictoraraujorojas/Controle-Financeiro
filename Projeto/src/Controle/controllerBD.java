package Controle;

import java.sql.Connection;
import java.sql.DriverManager;

import static java.lang.Class.*;

public class controllerBD {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/controle_financeiro";

    /**
     * Cria uma conexão com o banco de dados MySQL utilizando o nome de usuário e senha fornecidos
     * @return uma conexão com o banco de dados
     * @throws Exception
     */

    public static Connection createConnectionToMySQL() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Conectado com sucesso!");
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        return connection;
    }

    public static void main(String[] args) throws Exception{
        Connection con = createConnectionToMySQL();
        if(con != null){
            System.out.println("Conexão obtida com sucesso!" + con);
            con.close();
        }

    }
}
