package db;

public class MySQLDBUtil {
	private static final String INSTANCE = "YOUR_INSTANCE";
	private static final String PORT_NUM = "YOUR_PORT";
	public static final String DB_NAME = "jupiter";
	private static final String USERNAME = "YOUR_USER_NAME";
	private static final String PASSWORD = "YOUR_USER_PASSWORD";
	// MySQL address on AWS
	public static final String URL = "jdbc:mysql://"
			+ INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD
			+ "&autoReconnect=true&serverTimezone=UTC";


}
