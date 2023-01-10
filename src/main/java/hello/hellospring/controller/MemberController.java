package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMemberForm";
    }
    @PostMapping("/members/new")
    public String create(Member member){
        System.out.println("name = " + member.getName());
        memberService.join(member);
        return "redirect:/";
    }
    @GetMapping("/members")
    public String memberList(Model model){
        List<Member> members = memberService.findMembers();
        model.addAttribute("members",members);
        return "members/memberList";
    }
    @PostMapping("/login")
    public String logIn(Model model,String memberId){
        Long Id = Long.parseLong(memberId);
        Member member = memberService.findOne(Id);
        if(member == null){
            return "redirect:/";
        }
        model.addAttribute("member",member);
        return "redirect:/";
    }
    @GetMapping("/loginPage")
    public String loginPage(){
        return "members/loginPage";
    }

    @GetMapping("/logout")
    public String logOut(){
        memberService.logOut();
        return "redirect:/";
    }
}
