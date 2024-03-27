package com.jpfuentealba.companiescrud.services;

import com.jpfuentealba.companiescrud.entities.Company;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();
    Company readByName(String name);
    Company create(Company company);
    Company update(Company company, String name);
    void delete(String name);
}
