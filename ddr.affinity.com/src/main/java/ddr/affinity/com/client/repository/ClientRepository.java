package ddr.affinity.com.client.repository;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.support.MongoRepositoryFactory;
import org.springframework.transaction.annotation.Transactional;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.connection.Connection;

@Transactional
public class ClientRepository extends MongoClient{

	public static Connection getConnection(){
		Connection conn=null;
		MongoClient mongoClient=null;
		
		try{   
		
        // To connect to mongodb server
        conn= (Connection) new MongoClient( "localhost" , 27017 );
			
        // Now connect to your databases
        DB db = mongoClient.getDB( "test" );
        System.out.println("Connect to database successfully");
		
        
        //boolean auth = db.authenticate("", "");
        //System.out.println("Authentication: "+auth);         
			
        //DBCollection coll = db.getCollection("mycol");
        //System.out.println("Collection mycol selected successfully");
			
        //DBCursor cursor = coll.find();
        //int i = 1;
		/*	
        while (cursor.hasNext()) { 
           System.out.println("Inserted Document: "+i); 
           System.out.println(cursor.next()); 
           i++;
        }*/
			
     }catch(Exception e){
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
     }
	return conn;
	}
}
