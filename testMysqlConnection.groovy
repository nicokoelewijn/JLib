import groovy.sql.Sql

def call(String url, String user, String password) {
    try {
        // Establish connection to the MySQL database
        def sql = Sql.newInstance(url, user, password, 'com.mysql.cj.jdbc.Driver')

        // Execute a simple query to verify connection
        sql.eachRow('SELECT 1') { row ->
            echo "Connection successful: ${row[0]}"
        }

        // Close the connection
        sql.close()
    } catch (Exception e) {
        // Handle connection failure
        echo "Failed to connect to MySQL: ${e.message}"
    }
}
