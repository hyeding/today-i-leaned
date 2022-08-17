package soloproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soloproject.demo.entity.Member;

public interface MemberRipository extends JpaRepository<Member, Integer> {
}
