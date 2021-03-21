package hu.holyoil.controller;

import hu.holyoil.crewmate.Settler;
import hu.holyoil.neighbour.Asteroid;
import hu.holyoil.skeleton.Logger;

import java.util.ArrayList;
import java.util.List;

public class GameController implements ISteppable  {

    private static GameController gameController;
    private List<Settler> settlers;
    private List<Asteroid> asteroids;

    @Override
    public void Step() { System.out.println("Stepping"); }

    public void CheckWinCondition()  {
        Logger.Log(this,"Checking win condition");
        // todo
        Logger.Return();
    }
    public void CheckLoseCondition()  {
        Logger.Log(this,"Checking loose condition");
        // todo
        Logger.Return();
    }
    public void CheckGameCondition()  {
        Logger.Log(this,"Checking game condition");
        // todo
        Logger.Return(); }

    public void StartGame()  {
        Logger.Log(this,"Starting game");
        // todo
        Logger.Return();
    }
    public void AddAsteroid(Asteroid asteroid)  {
        Logger.Log(this,"Adding Asteroid <" +  Logger.GetName(asteroid)+ ">");
        asteroids.add(asteroid);
        Logger.Return();
    }
    public void RemoveAsteroid(Asteroid asteroid)  {
        Logger.Log(this,"Removing asteroid <" +  Logger.GetName(asteroid)+ ">");
        asteroids.remove(asteroid);
        Logger.Return();
    }
    public void AddSettler(Settler settler)  {
        Logger.Log(this,"Adding settler <" +  Logger.GetName(settler)+ ">");
        settlers.add(settler);
        Logger.Return();
    }
    public void RemoveSettler(Settler settler)  {
        Logger.Log(this,"Removing settler <" +  Logger.GetName(settler)+ ">");
        settlers.remove(settler);
        Logger.Return();
    }

    public static GameController GetInstance() {
        if (gameController == null) {
            gameController = new GameController();
        }
        return gameController;
    }

    private GameController() {
        settlers = new ArrayList<>();
        asteroids = new ArrayList<>();
    }

}
