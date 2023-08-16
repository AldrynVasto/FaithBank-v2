package test.com.agency.database;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.Connection;

import org.junit.Test;

import main.com.agency.database.OracleConnectionFactory;

public class OracleConnectionFactoryTest {

	/*Realizando o teste de conexão com banco de dados utilizando JUnit*/
	@Test
	public void testConnection() {
		try {
			Connection connection = OracleConnectionFactory.getConnectionToOracleSQL();	
			assertNotNull("Conexão não pode ser nula", connection);
		} catch (Exception e) {
			fail("Falha ao estabelecer conexão com o banco de dados");
		}		
	}
}
