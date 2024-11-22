package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @ResponseBody
    @GetMapping
    public String index() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is a list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @ResponseBody
    @GetMapping("form")
    public String skillsForm() {
        String html = "<form method='post'>" +
                "<p>Name:</p>" +
                "<input type='text' name='name'/>" +
                "<p>My Favorite Language: </p>" +
                "<select name='lang1'>" +
                "<option>Choose option</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<p>My Second Favorite Language: </p>" +
                "<select name='lang2'>" +
                "<option>Choose option</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<p>My Third Favorite Language: </p>" +
                "<select name='lang3'>" +
                "<option>Choose option</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<p><button type='submit'>Submit</button></p>" +
                "</form>";

        return html;
    }
    @ResponseBody
    @PostMapping("form")
    public String skillsPost(@RequestParam String name, @RequestParam String lang1){
        return ;
    }

}
