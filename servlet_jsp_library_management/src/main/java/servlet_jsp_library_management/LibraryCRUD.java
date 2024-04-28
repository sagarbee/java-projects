package servlet_jsp_library_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibraryCRUD {

	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/librarydb";
		String user = "root";
		String pass = "root";
		Connection connection = DriverManager.getConnection(url, user, pass);

		return connection;
	}

	public int registerNewUser(User user) throws Exception {
		Connection connection = getConnection();

		String query = "insert into user values(?,?,?,?,?)";

		PreparedStatement preparedStatement = connection.prepareStatement(query);

		preparedStatement.setInt(1, user.getId());
		preparedStatement.setString(2, user.getName());
		preparedStatement.setLong(3, user.getPhone());
		preparedStatement.setString(4, user.getEmail());
		preparedStatement.setString(5, user.getPassword());

		int result = preparedStatement.executeUpdate();

		connection.close();

		return result;
	}

	public String getPassword(String email) throws Exception {

		Connection connection = getConnection();

		String query = "select password from user where email =?";

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

	public List<Book> displayBooks() throws Exception {
		Connection connection = getConnection();
		String query = "select * from book";

		PreparedStatement preparedStatement = connection.prepareStatement(query);

		ResultSet resultSet = preparedStatement.executeQuery();
		List<Book> list = new ArrayList<Book>();
		while (resultSet.next()) {
			Book book = new Book();
			book.setId(resultSet.getInt("id"));
			book.setName(resultSet.getString("name"));
			book.setAuthor(resultSet.getString("author"));
			book.setGenere(resultSet.getString("genere"));
			book.setPrice(resultSet.getDouble("price"));
			list.add(book);
		}
		connection.close();
		return list;
	}


	public int updateBook(Book book) throws Exception {

		Connection connection = getConnection();

		String query = "update book set name=?, author =?, genere=?, price=? where id=? ";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, book.getName());
		preparedStatement.setString(2, book.getAuthor());
		preparedStatement.setString(3, book.getGenere());
		preparedStatement.setDouble(4, book.getPrice());
		preparedStatement.setInt(5, book.getId());

		int result = preparedStatement.executeUpdate();
		connection.close();
		return result;
	}

	public Book getBookById(int id) throws Exception 
	{
		Connection connection = getConnection();

		String query = "SELECT * FROM book WHERE id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		Book book = new Book();
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next())
		{
			book.setId(resultSet.getInt("id"));
			book.setName(resultSet.getString("name"));
			book.setAuthor(resultSet.getString("author"));
			book.setGenere(resultSet.getString("genere"));
			book.setPrice(resultSet.getDouble("price"));
		}
		connection.close();
		return book;
	}

	public int deleteBook(int id) throws Exception {
		
		Connection connection = getConnection();
		String query ="delete from book where id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		int result = preparedStatement.executeUpdate();
		connection.close();
		return result;
	}

	public int addBook(Book book) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String query ="insert into book set id=?, name=?, author=?, genere=?, price=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, book.getId());
		preparedStatement.setString(2, book.getName());
		preparedStatement.setString(3, book.getAuthor());
		preparedStatement.setString(4, book.getGenere());
		preparedStatement.setDouble(5, book.getPrice());
		
		int res = preparedStatement.executeUpdate();
		
		connection.close();
		return res;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
