package com.company.HashTable;

public class SimpleHashtable {
    private StoredEmployee hashtable[];
    public SimpleHashtable(){
        hashtable = new StoredEmployee[10];
    }

    public void put(Employee employee, String key){
        int hashedKey = hashkey(key);

        if(occupied(hashedKey)){
            int stopIndex = hashedKey;
            if(hashedKey == hashtable.length-1){
                hashedKey = 0;
            }
            else{
                hashedKey++;
            }
            while(occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey++;
            }
        }
        if(occupied(hashedKey)){
            System.out.println("Sorry, there's already an employee at position "+ hashedKey);
        }
        else{
            hashtable[hashedKey] = new StoredEmployee(employee, key);
        }
    }

    public Employee get(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1)
            return null;
        return hashtable[hashedKey].employee;
    }

    public Employee remove(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }
        Employee removedEmployee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;

        StoredEmployee[] oldHashtable = hashtable;
        hashtable = new StoredEmployee[oldHashtable.length];
        for(int i=0; i<oldHashtable.length; i++){
            if(oldHashtable[i] != null){
                put(oldHashtable[i].employee, oldHashtable[i].key);
            }
        }
        return removedEmployee;
    }

    public int findKey(String key){
        int hashedKey = hashkey(key);
        if(occupied(hashedKey) && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if(hashedKey == hashtable.length-1){
            hashedKey = 0;
        }
        else{
            hashedKey++;
        }

        while(occupied(hashedKey) && hashedKey != stopIndex && !hashtable[hashedKey].key.equals(key)){
            hashedKey = (hashedKey+1)%hashtable.length;
        }

        if(occupied(hashedKey) && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        else{
            return -1;
        }
    }

    private int hashkey(String key){
        return key.length() % hashtable.length;
    }

    private boolean occupied(int index){
        return hashtable[index] != null;
    }

    public void printTable(){
        for(int i=0; i<hashtable.length; i++){
            if(hashtable[i]==null){
                System.out.println("Empty");
            }
            else {
                System.out.println(hashtable[i].employee);
            }
        }
    }
}
