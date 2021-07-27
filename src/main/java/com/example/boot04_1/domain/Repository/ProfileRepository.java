package com.example.boot04_1.domain.Repository;

import com.example.boot04_1.domain.Profile;
import org.springframework.data.repository.CrudRepository;


public interface ProfileRepository extends CrudRepository<Profile, String> {

}