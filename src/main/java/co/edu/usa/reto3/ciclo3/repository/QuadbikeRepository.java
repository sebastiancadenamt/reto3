/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.ciclo3.repository;

import co.edu.usa.reto3.ciclo3.model.Quadbike;
import co.edu.usa.reto3.ciclo3.repository.crud.QuadbikeCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sacs8
 */
@Repository
public class QuadbikeRepository {
    
    @Autowired
    private QuadbikeCrudRepository quadbikeCrudRepository;
    
    public List<Quadbike> getAll(){
        return (List<Quadbike>) quadbikeCrudRepository.findAll();
    }
    
    public Optional<Quadbike> getQuadbike(int id) {
        return quadbikeCrudRepository.findById(id);
    }
    
    public Quadbike save(Quadbike quad){
        return quadbikeCrudRepository.save(quad);
    }
    
    
}
