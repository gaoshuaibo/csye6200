/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataManagement;

import Business.Business;
import Business.ConfigureBusiness;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;

/**
 *
 * @author Alex
 */
public class DatabaseFactory {

    private static final String FILENAME = "DataBank.db4o"; // path to the data store
    private static DatabaseFactory databaseFactory;

    public synchronized static DatabaseFactory getInstance() {
        if (databaseFactory == null) {
            databaseFactory = new DatabaseFactory();
        }
        return databaseFactory;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(Business.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(Business system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }

    public synchronized void storeSystem() {
        storeSystem(Business.getInstance()); //default save the Business singleton
    }

    public Business retrieveSystem() {
        ObjectContainer conn = createConnection();
        ObjectSet<Business> systems = conn.query(Business.class); // Change to the object you want to save
        Business system;
        if (systems.size() == 0) {
            system = ConfigureBusiness.Initialize();  // If there's no System in the record, create a new one
        } else {
            system = systems.get(systems.size() - 1);
            Business.setBusiness(system);
            Business.setIsFirstTimeRunning(false);
        }
        conn.close();
        return system;
    }
}
