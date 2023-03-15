package kr.co.photostagram.controller;

import kr.co.photostagram.service.BoardService;
import kr.co.photostagram.service.ProfileService;
import kr.co.photostagram.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.*;

@Slf4j
@Controller
public class BoardController {

    @Autowired
    private BoardService service;
    @GetMapping("board/post")
    public String post(Principal principal, Model model, int no) {
        /*** 사용자, 프로필 페이지 사용자 ***/
        String myName = principal.getName();


        MemberVO user = service.selectMember(myName);

        BoardVO post = service.selectPost(no);

        /*BoardVO comment = service.selectComment(no);*/

        log.info("post : " + post);

        model.addAttribute("user", user);
        model.addAttribute("post", post);

        return "board/post";
    }


}
