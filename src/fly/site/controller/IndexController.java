package fly.site.controller;

import fly.site.entities.CiLysy;
import fly.site.repositories.interfaces.CiLysyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

/**
 * Created by fly on 2016/10/8.
 */

@Controller
public class IndexController {
    @Inject
    private CiLysyRepository ciLysyRepository;

    @ResponseBody
    @RequestMapping(value = "/test", params = {"name"})
    public String helloName(@RequestParam("name") String name) {
        ciLysyRepository.test(new CiLysy());
        System.out.println();
        return "test";
    }
}
