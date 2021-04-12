package com.company.HashTable;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
    private LinkedList<StoredEmployee>[] hashtable;
    public ChainedHashTable(){
        hashtable = new LinkedList[10];
        for(int i=0; i < hashtable.length; i++){
            hashtable[i] = new LinkedList<>();
        }
    }

    public void put(Employee employee, String key){
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(employee, key));
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        while(iterator.hasNext()){
            employee = iterator.next();
            if(iterator.next().key.equals(key)){
                return employee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        int index = -1;
        while(iterator.hasNext()){
            employee = iterator.next();
            index++;
            if(iterator.next().key.equals(key)){
                break;
            }
        }
        if(employee == null){
            return null;
        }
        else{
            hashtable[hashedKey].remove(index);
            return employee.employee;
        }
    }

    public int hashKey(String key){
        return key.length() % hashtable.length;
    }


}
