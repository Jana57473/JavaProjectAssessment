import java.sql.*;

public class TransactionHandlingDemo {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db"; // Use your database file or connection string

        try (Connection conn = DriverManager.getConnection(url)) {
            // Make sure auto-commit is off for transactions
            conn.setAutoCommit(false);

            int fromId = 1; // Example account IDs
            int toId = 2;
            int amount = 100;

            try {
                // Debit from source account
                PreparedStatement debit = conn.prepareStatement(
                    "UPDATE accounts SET balance = balance - ? WHERE id = ?"
                );
                debit.setInt(1, amount);
                debit.setInt(2, fromId);
                debit.executeUpdate();

                // Credit to destination account
                PreparedStatement credit = conn.prepareStatement(
                    "UPDATE accounts SET balance = balance + ? WHERE id = ?"
                );
                credit.setInt(1, amount);
                credit.setInt(2, toId);
                credit.executeUpdate();

                // Commit transaction
                conn.commit();
                System.out.println("Transfer successful!");

            } catch (SQLException e) {
                // Rollback transaction on error
                System.out.println("Transfer failed, rolling back. Reason: " + e.getMessage());
                conn.rollback();
            } finally {
                conn.setAutoCommit(true);
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
