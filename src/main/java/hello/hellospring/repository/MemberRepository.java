package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;


public interface MemberRepository {
    Member save(Member member);
    Member findById(long id);
    void logout();
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
