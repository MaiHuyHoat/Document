package com.ead.app.Service;

import com.ead.app.Model.Candidate;
import com.ead.app.Repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CandidateSevice implements BaseService <Candidate>{
    @Autowired
   private CandidateRepository repository;
    @Override
    public List<Candidate> GetAll() {
        List<Candidate> data=repository.findAll();
        return data;
    }
    public List<Candidate> SearchByName(String name){
       List<Candidate>data= repository.findCandidateByName(name);
       return data;
    }
    @Override
    public Candidate GetDetail(long id) {
        Candidate modelEx= repository.findById(id).orElse(null);
        return modelEx;
    }

    @Override
    public boolean save(Candidate model) {

       try {
           repository.save((model));
           return  true;
       }catch (Exception e){
           e.printStackTrace();
           return false;
       }
    }

    @Override
    public boolean Delete(Long id) {

        try {
            repository.deleteById(id);
            return  true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
