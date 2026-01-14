package gr.aueb.cf.libapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.aueb.cf.libapp.model.MyBookList;
import gr.aueb.cf.libapp.repository.MyBookRepository;

@Service
public class MyBookListService {

    @Autowired
    private MyBookRepository myBookRepo;

    public void saveMyBooks(MyBookList book) {
        myBookRepo.save(book);
    }

    public List<MyBookList> getAllMyBooks(){
        return myBookRepo.findAll();
    }

    public void deleteById(int id) {
        myBookRepo.deleteById(id);
    }
}