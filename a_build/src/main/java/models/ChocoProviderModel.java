package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ChocoProviderModel {
    private Map<String, Object> chocoProvider;

    /**
     * Constructor
     */
    public ChocoProviderModel() {
        this.chocoProvider = new HashMap<>();
    }
    
    public int createChocoProvider(String providerNumber, String providerName, String providerStreetAddress, String providerCity, String providerState, long providerZip){
        
        ChocoProviderTable usr = new ChocoProviderTable();

        usr.setProviderNumber(providerNumber);
        usr.setProviderName(providerName);
        usr.setProviderStreetAddress(providerStreetAddress);
        usr.setProviderCity(providerCity);
        usr.setProviderState(providerState);
        usr.setProviderZip(providerZip);
        chocoProvider.put(providerNumber, usr);
    
        return 1;
    }
    
    /**
     * Check to find if a user is available
     * @param id
     * @return
     */
    public boolean checkChocoProvider(String id) {
        Iterator it = chocoProvider.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            ChocoProviderTable u = (ChocoProviderTable)pair.getValue();
            if((u.getProviderNumber().equals(id)))
                return false;
        }
        return true;
    }
    
    public int updateChocoProvider(String providerNumber, String providerName, String providerStreetAddress, String providerCity, String providerState, long providerZip){

        ChocoProviderTable usr = (ChocoProviderTable)chocoProvider.get(providerNumber);

        usr.setProviderName(providerName);
        usr.setProviderStreetAddress(providerStreetAddress);
        usr.setProviderCity(providerCity);
        usr.setProviderState(providerState);
        usr.setProviderZip(providerZip);
        chocoProvider.put(providerNumber, usr);
    
        return 1;
    }
    
    public boolean removeChocoProvider(String id) {
        if(!checkChocoProvider(id)) {
            chocoProvider.remove(id);
            return true;    
        }
        return false;
    }
    public List sendElements() {
        List<Object> ret = new ArrayList<>(chocoProvider.values());
        return ret;
    }

    public List sendChocoProvidersId() {
        List<Object> ret = new ArrayList<>(chocoProvider.keySet());
        return ret;
    }

} // Class generated by : Benjamin Haos
