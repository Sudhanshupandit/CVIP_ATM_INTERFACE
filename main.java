package atm;

import java.lang.System.Logger;
import java.sql.SQLException;

public class main {
	public static void main(String[] args) throws InterruptedException, SQLException {
		Logger login = new Logger();
		((Object) login).loginView();
	}
}