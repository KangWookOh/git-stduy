package com.example.boot04_1;

import com.example.boot04_1.domain.Member;
import com.example.boot04_1.domain.Repository.MemberRepository;
import com.example.boot04_1.domain.Repository.ProfileRepository;
import lombok.extern.java.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
@Commit
public class ProfileTests {
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    ProfileRepository profileRepository;

    @Test
    public void testInsertMemeber()
    {
        IntStream.range(1, 101).forEach(i -> {
            Member member = new Member();
            member.setUid("user" + i);
            member.setUpw("pw" + i);
            member.setUname("사용자" + i);

            memberRepository.save(member);

        });
    }

}

