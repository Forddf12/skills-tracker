package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class SkillsController {
    @GetMapping()
    @ResponseBody
    public String programmingLanguages() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";

    }

    @GetMapping("form")
    @ResponseBody
    public String skillForm() {
        String form = "<form action='form' method='post'" +
                "<label>Name</label><br />" +
                "<input type= 'text' name='name'><br />" +
                "<label>My favorite language: <br />" +
                "<select name='favorite1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label><br />" +
                "<label> My second favorite language: <br />" +
                "<select name='favorite2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label><br />" +
                "<label> My third favorite language: <br />" +
                "<select name='favorite3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label><br />" +
                "<input type='submit' value='Greet me!'>" +
                "</form>";
        return form;
    }

    @PostMapping("/form")
    @ResponseBody
    public String processForm(@RequestParam String name, @RequestParam String favorite1, @RequestParam String favorite2, @RequestParam String favorite3) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + favorite1 + "</li>" +
                "<li>" + favorite2 + "</li>" +
                "<li>" + favorite3 + "</li>" +
                "</ol>";

    }


}

