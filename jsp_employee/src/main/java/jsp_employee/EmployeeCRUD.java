package jsp_employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeCRUD {
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/jsp";
		String user = "root";
		String pass = "root";
		Connection connection = DriverManager.getConnection(url, user, pass);

		return connection;
	}

	public int signupUser(Employee employee) throws Exception {
		Connection connection = getConnection();

		String query = "insert into employee values(?,?,?,?,?,?,?)";

		PreparedStatement preparedStatement = connection.prepareStatement(query);

		preparedStatement.setInt(1, employee.getId());
		preparedStatement.setString(2, employee.getName());
		preparedStatement.setLong(3, employee.getPhone());
		preparedStatement.setString(4, employee.getEmail());
		preparedStatement.setString(5, employee.getDesignation());
		preparedStatement.setDouble(6, employee.getSalary());
		preparedStatement.setString(7, employee.getPassword());

		int result = preparedStatement.executeUpdate();
		connection.close();

		return result;
	}

	public String getPassword(String email) throws Exception // execption object propogation
	{
		Connection connection = getConnection();
		String query = "select password from employee where email=?";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, email);
		ResultSet resultSet = preparedStatement.executeQuery();
		String password = null;

		while (resultSet.next()) {
			password = resultSet.getString("password");
		}
		connection.close();

		return password;

	}

	public List<Employee> displayEmployeeDetails() throws Exception {
		Connection connection = getConnection();
		String query = "select * from employee";

		PreparedStatement preparedStatement = connection.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();
		List<Employee> list = new ArrayList<Employee>();
		while (resultSet.next()) {
			Employee employee = new Employee();
			employee.setId(resultSet.getInt("id"));
			employee.setName(resultSet.getString("name"));
			employee.setEmail(resultSet.getString("email"));
			employee.setPassword(resultSet.getString("password"));
			employee.setDesignation(resultSet.getString("designation"));
			employee.setPhone(resultSet.getLong("phone"));
			employee.setSalary(resultSet.getDouble("salary"));
			list.add(employee);
		}
		connection.close();
		return list;
	}

	public int deleteUser(int id) throws Exception {

		Connection connection = getConnection();

		String query = "delete from employee where id=?";

		PreparedStatement preparedStatement = connection.prepareStatement(query);

		preparedStatement.setInt(1, id);

		int result = preparedStatement.executeUpdate();
		connection.close();

		return result;
	}

	public int updateUSer(Employee employee) throws Exception {
	    Connection connection = getConnection();

	    String query = "UPDATE employee SET name=?, phone=?, email=?, designation=?, salary=?, password=? WHERE id=?";

	    PreparedStatement preparedStatement = connection.prepareStatement(query);

	    preparedStatement.setString(1, employee.getName());
	    preparedStatement.setLong(2, employee.getPhone());
	    preparedStatement.setString(3, employee.getEmail());
	    preparedStatement.setString(4, employee.getDesignation());
	    preparedStatement.setDouble(5, employee.getSalary());
	    preparedStatement.setString(6, employee.getPassword());
	    preparedStatement.setInt(7, employee.getId());

	    int result = preparedStatement.executeUpdate();
	    connection.close();

	    return result;
	}


	public Employee getEmployeeById(int id) throws Exception {
		
		Connection connection = getConnection();

		String query = "select * from employee where id=?";

		PreparedStatement preparedStatement = connection.prepareStatement(query);

		preparedStatement.setInt(1, id);
		Employee employee = new Employee();
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			
			employee.setId(resultSet.getInt("id"));
			employee.setName(resultSet.getString("name"));
			employee.setEmail(resultSet.getString("email"));
			employee.setPassword(resultSet.getString("password"));
			employee.setDesignation(resultSet.getString("designation"));
			employee.setPhone(resultSet.getLong("phone"));
			employee.setSalary(resultSet.getDouble("salary"));
			
		}
		connection.close();

		return employee;

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
