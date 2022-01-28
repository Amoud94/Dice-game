package sample.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class highScore implements Serializable {

    public List<entry> listEntries = new ArrayList<entry>();

    private static highScore single_instance = null;

    public static highScore getInstance()
    {
        if (single_instance == null)
            single_instance = new highScore() {

                @Override
                public void load() {

                }

                @Override
                public void save() {

                }
            };

        return single_instance;
    }

    public  void add(entry e){
        listEntries.add(e);
    }
    public Iterator elements(){
        return listEntries.iterator();
    }
    public abstract void load();
    public abstract void save();

}
