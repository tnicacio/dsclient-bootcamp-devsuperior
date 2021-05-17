package com.tnicacio.dsclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnicacio.dsclient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
