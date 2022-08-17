package soloproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import soloproject.demo.entity.Member;
import soloproject.demo.repository.MemberRipository;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/member")
public class MemberController {
    private MemberRipository memberRipository;

    @Autowired
    public MemberController(MemberRipository memberRipository) {
        this.memberRipository = memberRipository;
    }

    @GetMapping
    public List<Member> getAllMember() {
        return memberRipository.findAll();
    }

    @GetMapping("/{id}")
    public Member getMember(@PathVariable(value = "id")Integer id) {
       return memberRipository.findById(id).get();
    }

    @PostMapping
    public Member saveMember(@RequestBody Member member) {
        return memberRipository.save(member);
    }

    @PutMapping
    public Member update(@RequestBody Member member) throws Exception {
        return memberRipository.findById(member.getId()).map(db -> {
            memberRipository.save(member);
            return member;
        }).orElseThrow(Exception::new);
    }

    @DeleteMapping("/{id-delete}")
    public Member delete(@PathVariable(value = "id1")Integer id) throws Exception {
        return memberRipository.findById(id).map(member -> {
            memberRipository.delete(member);
            return member;
        }).orElseThrow(Exception::new);
    }
}
