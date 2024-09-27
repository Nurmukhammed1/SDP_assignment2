

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        if (db1.equals(db2)) {
            System.out.println("Databases are equal");
        }
        else {
            System.out.println("Databases are not equal");
        }

        db1.connect();
        db1.disconnect();
    }
}