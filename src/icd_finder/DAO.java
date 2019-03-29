/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icd_finder;

import java.sql.Connection ;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author alcorn
 */
public class DAO {
	private Connection conn = null;
	/**
	 *
	 * @throws Exception
	 */
	public DAO(final String dbName) throws Exception {
		Class.forName("org.hsqldb.jdbcDriver");
		conn = DriverManager.getConnection("jdbc:hsqldb:res:"
		                                   + dbName,    // filenames
		                                   "sa",        // username
		                                   "");         // password
	}

	/**
	 *
	 * @param dbName
	 * @return
	 * @throws Exception
	 */
	public Connection getConnection() {
		return conn;
	}
	public void shutdown() throws SQLException {

		Statement st = conn.createStatement();

		// db writes out to files and performs clean shuts down
		// otherwise there will be an unclean shutdown
		// when program ends
		st.execute("SHUTDOWN");
		conn.close();    // if there are no other open connection
		conn = null;
	}


}
