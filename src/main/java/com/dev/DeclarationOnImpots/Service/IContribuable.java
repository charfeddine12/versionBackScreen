package com.dev.DeclarationOnImpots.Service;

import com.dev.DeclarationOnImpots.Entity.Contribuable;

import java.util.List;


public interface IContribuable {
    void add(Contribuable contribuable);

    Contribuable update(Contribuable contribuable);

    List<Contribuable> findAll();

    Contribuable findOne(Long NIF);

    public boolean supprimer(Long NIF);

    void changeStatus(long NIF, String status);
}

