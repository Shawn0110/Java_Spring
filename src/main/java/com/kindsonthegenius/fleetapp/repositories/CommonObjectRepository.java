package com.kindsonthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.kindsonthegenius.fleetapp.models.CommonObject;

import org.springframework.stereotype.Repository;

@Repository
public interface CommonObjectRepository extends JpaRepository<CommonObject, Integer> {

}
