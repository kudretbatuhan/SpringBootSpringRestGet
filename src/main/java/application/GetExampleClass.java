package application;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class GetExampleClass {
    @RequestMapping(value = "/memberlist" , method= RequestMethod.GET)
    public Member getMemberList(@RequestParam(value = "memberName",defaultValue = "Batuhan") String memberName){
        Member returnedMember =null;
        List<Member>memberList = new ArrayList<>();
        Member member = new Member();
        member.setName("Batuhan");
        member.setSurname("Kilic");
        member.setCity("Ankara");

        memberList.add(member);
        member=new Member();
        member.setName("Yiğithan");
        member.setSurname("Kilic");
        member.setCity("Nevsehir");

        memberList.add(member);

        member=new Member();
        member.setName("Mehmet");
        member.setSurname("Kilic");
        member.setCity("Muğla");

        memberList.add(member);

        for (Member m : memberList){
            if (memberName.equals(m.getName()))
                returnedMember = m;
        }
        return returnedMember;
    }
}
