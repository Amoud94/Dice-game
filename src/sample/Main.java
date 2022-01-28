package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.entities.*;
//import sample.ihm.gamescreen;
//import sample.ihm.playerscreen;
//import sample.ihm.rollscreen;
import sample.persistence.*;
import sample.utilities.strategy.context;
import sample.utilities.strategy.jdbcStrategie;
import sample.utilities.strategy.xmlStrategie;

import java.util.Iterator;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) throws Exception {
        // launch(args);
        Scanner myObj = new Scanner(System.in);
        String userName;

        // Enter username and press Enter
        System.out.println("Enter username");
        userName = myObj.nextLine();
        joueur j1 = new joueur();
        joueurView v1 = new joueurView(j1);
        j1.addObserver(v1);
        j1.setNom(userName);
        // Selecte Strategy
        System.out.println("Please select your strategy");
        System.out.println("Enter ONE if you want to work with jdbcKit");
        System.out.println("Enter TWO if you want to work with xmlKit");
        int choice = myObj.nextInt();

        switch (choice) {
            case 1:
                System.out.println("JDBC");
                diceGame game = new diceGame() {
                    @Override
                    public void play() throws Exception {
                        context context2 = new context(new jdbcStrategie());
                        context2.executeStrategy(j1);
                    }
                };
                game.play();
                break;
            case 2:
                System.out.println("XML");
                break;
            default:
                // The user input an unexpected choice.
        }




//        joueur j1 = new joueur();
//        joueurView v1 = new joueurView(j1);
//        j1.addObserver(v1);
//        j1.setNom(userName);

//        context context2 = new context(new jdbcStrategie());
//        context2.executeStrategy(j1);


//        context context = new context(new jdbcStrategie());
//        context.executeStrategy(j1,pk);






    }
}
