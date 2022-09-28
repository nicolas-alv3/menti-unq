package com.unq.mentiunq.presentation;

import com.auth0.client.auth.AuthAPI;
import com.auth0.exception.Auth0Exception;
import com.auth0.json.auth.UserInfo;
import com.unq.mentiunq.presentation.model.Presentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/presentation")
public class PresentationController {
    @Autowired
    private PresentationService presentationService;
    @Value("${auth0.domain}")
    private String domain;
    @Value("${auth0.clientId}")
    private String clientId;
    @Value("${auth0.clientSecret}")
    private String clientSecret;


    @PostMapping(value = "/")
    @ResponseBody
    public Presentation createPresentation(HttpServletRequest req, @RequestBody Presentation presentation) {
        return presentationService.create(presentation);
    }

    @GetMapping(value = "/individual")
    @ResponseBody
    public Presentation[] currentUserPresentation(HttpServletRequest req) {
        AuthAPI auth = new AuthAPI(domain, clientId, clientSecret);

        try {
            UserInfo userInfo = auth.userInfo(req.getHeader("authorization").split(" ")[1]).execute();
            return presentationService.getAllPresentations(userInfo.getValues().get("email").toString());

        } catch (Auth0Exception e) {
            throw new RuntimeException(e);
        }
    }
}