package com.seduc2.princesas.service;

import com.seduc2.princesas.entity.Princesa;
import com.seduc2.princesas.repository.PrincesaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.sql.ClientInfoStatus;
import java.util.List;

@Service
public class PrincesaService {

    private final PrincesaRepository repository;

    public PrincesaService(PrincesaRepository repository) {
        this.repository = repository;
    }
    public void cadastrar (Princesa p){
        repository.save(p);
}
    public List<Princesa> mostrar(){
        return repository.findAll();
    }
    //deletar
    public void deletar(int id){
        repository.deleteById(id);
    }
    //alterar
    @Transactional
    public void alterar(int id, Princesa p){
        Princesa princesa = repository.getReferenceById(id);
        princesa.setNome(p.getNome());
        princesa.setIdade(p.getIdade());
        princesa.setReino(p.getReino());
        princesa.setMascote(p.getMascote());
        princesa.setPoder(p.getPoder());
    }

}
