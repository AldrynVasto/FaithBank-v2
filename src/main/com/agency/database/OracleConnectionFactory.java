package main.com.agency.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionFactory {
	
	//Caminho, porta e nome da base de dados (SID/Service) que irá ser realizada a conexão
	private static final String JDBC_url = "jdbc:oracle:thin:@localhost:1521:oracleBase"; 
	
	//Usuário do banco 
	private static final String user = "manager";
	
	//Senha do banco
	private static final String password = "bank123";
	
	//Método para obter conexão com o banco de dados Oracle
	public static Connection getConnectionToOracleSQL() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(JDBC_url, user, password);
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("Erro: " + e);
			throw new RuntimeException("Ocorreu um erro ao obter conexão com o banco de dados");
		}
	}
 
}
