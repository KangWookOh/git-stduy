package com.example.boot04_1.domain.Repository;

import com.example.boot04_1.domain.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, String> {

}