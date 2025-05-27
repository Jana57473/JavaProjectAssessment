import java.sql.*;

public class StudentDAODemo {
    private Connection conn;

    public StudentDAODemo(String url) throws SQLException {
        conn = DriverManager.getConnection(url);
    }

    // Insert a new student
    public void insertStudent(String name, int age) throws SQLException {
        String sql = "INSERT INTO students (name, age) VALUES (?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.executeUpdate();
            System.out.println("Inserted student: " + name);
        }
    }

    // Update an existing student's name by id
    public void updateStudent(int id, String newName) throws SQLException {
        String sql = "UPDATE students SET name = ? WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, newName);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("Updated student ID " + id + " to name: " + newName);
            else
                System.out.println("No student found with ID: " + id);
        }
    }

    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db"; // Change if using MySQL

        try {
            StudentDAODemo dao = new StudentDAODemo(url);

            // Insert a new student
            dao.insertStudent("Eve", 21);

            // Update the name of student with id 1
            dao.updateStudent(1, "Alice Smith");

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
