package uchidb;

import java.util.*;

/**
 * Created by Tyler J.Skluzacek on 1/8/17.
 * Last edited: 1/10/17 @ 6:30pm.
 *
 * Note: Code-example sources cited throughout.
 * Minor-Collaborator: Ricardo Barros Lourenco
 */

public class ContainerMaker<T,S> implements Containers<T,S>{

    //Instantiate Map (newMap) with keys=S and values=T.
    private Map<S, T> newMap;


    // Use HashSet to create and return a set with the elements of tArray.
    public Set<T> initSet(T[] tArray) {
        Set<T> newSet = new HashSet<>(Arrays.asList(tArray));
        return newSet;
    }


    // Use ArrayList to create and return a list with the elements of tArray.
    public List<T> initList(T[] tArray) {
        List<T> newList = new ArrayList<>(Arrays.asList(tArray));
        return newList;
        //Done.
    }


    // Use HashMap to create and return an empty Map s.t. keys=S and values=T.
    public Map<S, T> initEmptyMap() {
        Map<S, T> newMap = new HashMap<>();
        return (newMap);
        //Done
    }


    // Store the map in a local field variable -- often called a setter
    public void storeMap(Map<S, T> mapToStoreInClass) {
        newMap = mapToStoreInClass;
        //Done. DON'T RETURN ANYTHING FOR GOD'S SAKE OR YOU'LL BREAK IT AGAIN, YOU MORON.

    }


    //Choose whether to add key/val pair to map, and if bool=true,
    //  we will overwrite existing value of a key).
    public boolean addToMap(S key, T value, boolean overwriteExistingKey) {

        //If we are not overwriting the existing key, and the map contains the key
        if (overwriteExistingKey!=true && newMap.containsKey(key)) { //use 'containsKey' instead of 'contains' for map.
            return false;
            //Do not add to  map.
        }
        //If we ARE overwriting an existing key AND/OR the key is not already in key-set.
        else {
            newMap.put(key, value); //add key/val pair to map.
            //From: https://www.tutorialspoint.com/java/util/hashmap_put.htm
            return true;
            //Done.
        }
    }

    // Return a value from the stored/local map based on the key
    public T getValueFromMap(S key) {
        return newMap.get(key);
        //From: https://www.tutorialspoint.com/java/java_encapsulation.htm
        //Done.
    }

    // An overloaded function to get a value from the store/local map, but with a default value
    // if the key is not present in the map.
    public T getValueFromMap(S key, T defaultValue) {

        //PASSES TEST: First check to see if key in Map.
        if (!newMap.containsKey(key)) {

            return defaultValue;

        }
        //If does no contain key, return the defaultvalue
        else {
            return newMap.get(key);
        }
        //Done.

    }
}

