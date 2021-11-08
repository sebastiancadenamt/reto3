/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.reto3.ciclo3.service;

import co.edu.usa.reto3.ciclo3.model.Quadbike;
import co.edu.usa.reto3.ciclo3.repository.QuadbikeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sacs8
 */
@Service
public class QuadbikeService {
    
    @Autowired
    private QuadbikeRepository quadbikeRepository;
    
    public List<Quadbike> getAll(){
        return quadbikeRepository.getAll();
    }
    
    public Optional<Quadbike> getQuadbike(int id){
        return quadbikeRepository.getQuadbike(id);
    }
    
    public Quadbike save(Quadbike quad){
        if(quad.getId()==null){
            return quadbikeRepository.save(quad);
        } else{
            Optional<Quadbike> quadaux=quadbikeRepository.getQuadbike(quad.getId());
            if(quadaux.isEmpty()){
                return quadbikeRepository.save(quad);
            } else{
                return quad;
            }
        }
    }
    
}
