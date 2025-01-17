package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.ChuckNorrisJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final ChuckNorrisJokeService chuckNorrisJokeService;

    public JokeController(ChuckNorrisJokeService chuckNorrisJokeService) {
        this.chuckNorrisJokeService = chuckNorrisJokeService;
    }

    @RequestMapping({"/", ""})
    public String getAJoke(Model model){
        model.addAttribute("joke", chuckNorrisJokeService.getQuote());
        return "index";
    }
}
