import java.sql.SQLException;

import model.dao.*;


public class Main {

	public static void main(String[] args) {
		try {
			Database db = new Database();
		}catch (SQLException e){
			System.err.println(e.getStackTrace());
		}finally {
			System.out.println("Funcionou!!!!");
		}

	}

}
