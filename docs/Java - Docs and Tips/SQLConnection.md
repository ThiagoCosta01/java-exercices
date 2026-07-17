# Java-docs
Documentation


Connection conn = null;

try {
  conn = DriverManager.getConnection(SQLurl, User, Password);

  ResultSet rs = conn.createStatemente().executeQuery("SQL COMMAND");

  while(rs.next(){
    syso(rs.getInt("Id")  + rs.getString("Name"));
  } catch(e)
  
} finnally {
conn.close();
rs.close();
}
