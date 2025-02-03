class DatabaseConnection:
    def connect(self):
        return "Connected to Database"

class ConnectionPool:
    def __init__(self, pool_size):
        self.pool_size = pool_size
        self.pool = [DatabaseConnection() for _ in range(pool_size)]

    def get_connection(self):
        if self.pool:
            return self.pool.pop()
        else:
            return DatabaseConnection()  # If pool is empty, create a new connection

    def return_connection(self, connection):
        self.pool.append(connection)

# Usage
pool = ConnectionPool(pool_size=2)
conn1 = pool.get_connection()
print(conn1.connect())  # Output: Connected to Database

pool.return_connection(conn1)
conn2 = pool.get_connection()
print(conn2.connect())  # Output: Connected to Database
