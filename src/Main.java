import java.sql.SQLException;

import model.dao.*;


public class Main {

	public static void main(String[] args) {
		try {
			new Database();
			System.out.println("Funcionou!!!!");
		}catch (SQLException e){
			System.err.println(e.getStackTrace());
		}

	}

}
