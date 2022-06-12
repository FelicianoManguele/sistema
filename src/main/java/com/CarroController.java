package com;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import antlr.collections.List;



@RestController
public class CarroController {
    
    CarroRepository repository;
/*
    @GetMapping("/Carro")
     public List<Carro> getAllCarros(){
        return repository.findAll();
    }
 */
    @GetMapping("/Carro/{id}")
    public Carro getCarroById (@PathVariable Long id){
            return repository.getById(id);
    }

    @PostMapping("/Carro")
    public  Carro saveCarro(@RequestBody Carro carro){
        return  repository.save(carro);
    }
    @DeleteMapping("/Carro/{id}")
    public void deleteCarro(@PathVariable Long id){
        repository.deleteById(id);
    }

    
}
