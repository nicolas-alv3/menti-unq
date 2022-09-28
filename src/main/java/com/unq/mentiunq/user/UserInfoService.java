package com.unq.mentiunq.user;

import com.auth0.client.auth.AuthAPI;
import com.auth0.exception.Auth0Exception;
import com.auth0.json.auth.UserInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class UserInfoService {
    @Value("${auth0.domain}")
    private String domain;
    @Value("${auth0.clientId}")
    private String clientId;
    @Value("${auth0.clientSecret}")
    private String clientSecret;

    public UserInfo getUserInfo(HttpServletRequest req) {
        AuthAPI auth = new AuthAPI(domain, clientId, clientSecret);
        UserInfo userInfo;
        try {
            userInfo = auth.userInfo(req.getHeader("authorization").split(" ")[1]).execute();
        } catch (Auth0Exception e) {
            throw new RuntimeException(e);
        }
        return userInfo;
    }
}
