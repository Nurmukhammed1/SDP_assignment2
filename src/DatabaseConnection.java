

public class DatabaseConnection {
    private static DatabaseConnection instanse;

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        if (instanse == null) {
            synchronized (DatabaseConnection.class) {
                if (instanse == null) {
                    instanse = new DatabaseConnection();
                }
            }
        }
        return instanse;
    }

    public void connect() {
        System.out.println("Connected to database");
    }

    public void disconnect() {
        System.out.println("Disconnected from database");
    }
}
