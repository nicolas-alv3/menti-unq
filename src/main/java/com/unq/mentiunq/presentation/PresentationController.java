package com.unq.mentiunq.presentation;

import com.auth0.json.auth.UserInfo;
import com.unq.mentiunq.presentation.model.Presentation;
import io.swagger.annotations.ApiOperation;
import com.unq.mentiunq.user.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/presentation")
public class PresentationController {
    @Autowired
    private PresentationService presentationService;

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping(value = "/")
    @ResponseBody
    @ApiOperation(value = "Crea una presentacion")
    public Presentation createPresentation(HttpServletRequest req, @RequestBody @Valid Presentation presentation) {
        UserInfo user = userInfoService.getUserInfo(req);
        presentation.setOwnerEmail(user.getValues().get("email").toString());
        return presentationService.create(presentation);
    }

    @PutMapping(value = "/")
    @ResponseBody
    public Presentation updatePresentation(@RequestBody @Valid Presentation presentation) {
        return presentationService.update(presentation);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public void deletePresentation(@PathVariable Long id) {
        presentationService.delete(id);
    }

    @GetMapping(value = "/individual")
    @ResponseBody
    @ApiOperation(value = "Obtiene las presentaciones del usuario conectado")
    public List<Presentation> currentUserPresentation(HttpServletRequest req) {
            UserInfo userInfo = userInfoService.getUserInfo(req);
            return presentationService.getAllPresentations(userInfo.getValues().get("email").toString());
    }
}