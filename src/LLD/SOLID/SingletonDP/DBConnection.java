package LLD.SOLID.SingletonDP;

import java.util.concurrent.locks.Lock;

public class DBConnection {
    String username;
    String password;
    String url;
    Long port;
    private static DBConnection DBinstance=null;

    private DBConnection(){}

    public static DBConnection getDBinstance(){
        if(DBinstance==null){
            synchronized(DBConnection.class){
                if(DBinstance==null){
                    DBinstance=new DBConnection();
                }
            }
        }
        return DBinstance;
    }
}
