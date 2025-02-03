import java.util.Stack;

class ObjectPool {
    private Stack<DatabaseConnection> availableConnections = new Stack<>();
    
    public ObjectPool(int initialSize) {
        for (int i = 0; i < initialSize; i++) {
            availableConnections.push(new DatabaseConnection());
        }
    }

    public DatabaseConnection borrowObject() {
        if (!availableConnections.isEmpty()) {
            return availableConnections.pop();
        } else {
            return new DatabaseConnection();  // Create new if pool is empty
        }
    }

    public void returnObject(DatabaseConnection connection) {
        availableConnections.push(connection);
    }
}

class DatabaseConnection {
    // Simulating database connection
    public void connect() {
        System.out.println("Connected to Database");
    }
}

public class ObjectPoolPatternExample {
    public static void main(String[] args) {
        ObjectPool pool = new ObjectPool(2);
        
        DatabaseConnection connection1 = pool.borrowObject();
        connection1.connect();  // Output: Connected to Database
        
        pool.returnObject(connection1);
        
        DatabaseConnection connection2 = pool.borrowObject();
        connection2.connect();  // Output: Connected to Database
    }
}
