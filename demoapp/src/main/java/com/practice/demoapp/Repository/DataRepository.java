package com.practice.demoapp.Repository;

import com.practice.demoapp.Model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface DataRepository extends CrudRepository<Alien, Integer> {

}
