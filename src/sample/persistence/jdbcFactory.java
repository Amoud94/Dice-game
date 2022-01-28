package sample.persistence;

import sample.entities.entry;
import sample.entities.highScore;
import sample.persistence.dbMetier.dbInteraction;

import java.sql.ResultSet;
import java.util.Iterator;

public class jdbcFactory extends highScore {
    public jdbcFactory() {
        dbInteraction.connect();
    }

    @Override
    public void load()  {
        String sql = "Select name ,score from HighScore";
        ResultSet data = dbInteraction.select(sql);
        try {
            while (data.next()){
                this.add(new entry(data.getString(1),data.getInt(2)));
            }
        }catch (Exception e){
            System.out.println(e);
        }


    }

    @Override
    public void save() {
        Iterator i = this.elements();
        while (i.hasNext()){
            entry e = (entry)i.next();
            int score = e.getScore();
            String name = e.getNom();
            String sql = "insert into HighScore (name,score) values ('" + name + "','"+score+"')";
            dbInteraction.Maj(sql);
        }
    }
}
