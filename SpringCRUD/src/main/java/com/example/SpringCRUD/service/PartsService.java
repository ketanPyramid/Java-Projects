package com.example.SpringCRUD.service;

import com.example.SpringCRUD.entity.Parts;

import java.util.List;

public interface PartsService {
    public List<Parts> findAll();
    public Parts findById(int id);
    public void save(Parts part);
    public void deleteById(int id);
}
