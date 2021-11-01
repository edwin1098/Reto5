/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5.Repositorio;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reto5.Modelo.Game;
import reto5.Interface.InterfaceGame;

/**
 *
 * @author USUARIO
 */
@Repository
public class GameRepositorio {
      @Autowired
    private InterfaceGame crud;
    

    public List<Game> getAll(){
        return (List<Game>) crud.findAll();       
    }
    
    public Optional <Game> getGame(int id){
        return crud.findById(id);
    }
    
    public Game save(Game finca){
        return crud.save(finca);
    }
     public void delete(Game finca){
        crud.delete(finca);
    }
    
}
