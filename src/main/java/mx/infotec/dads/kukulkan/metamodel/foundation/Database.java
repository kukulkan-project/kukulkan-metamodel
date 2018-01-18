package mx.infotec.dads.kukulkan.metamodel.foundation;

import java.io.Serializable;

import mx.infotec.dads.kukulkan.metamodel.util.PKGenerationStrategy;

/**
 * Database Configuration
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class Database implements Serializable {

    private static final long serialVersionUID = 1L;

    private DatabaseType databaseType;

    private PKGenerationStrategy globalGenerationType;

    public Database(){
        
    }
    
    public Database(DatabaseType databaseType, PKGenerationStrategy globalGenerationType) {
        this.databaseType = databaseType;
        this.globalGenerationType = globalGenerationType;
    }

    public PKGenerationStrategy getGlobalGenerationType() {
        return globalGenerationType;
    }

    public void setGlobalGenerationType(PKGenerationStrategy globalGenerationType) {
        this.globalGenerationType = globalGenerationType;
    }

    public DatabaseType getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(DatabaseType databaseType) {
        this.databaseType = databaseType;
    }
}
