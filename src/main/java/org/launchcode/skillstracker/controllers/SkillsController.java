package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String initialMessage(){
        String html =
                "<html> " +
                        "<body> <h1> Skills Tracker </h1> " +
                        "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                        "<ol> <li>JavaScript</li> <li>Java</li> <li>HTML</li> </ol>";
        return html;
    }

    @GetMapping("form")
    public String createMessage() {
        String html =
                "<html> <body>" +
                "<form method = 'post' action = '/output'>" +

                "Name: " +
                "<input type = 'text' name = 'name' /> <br>" +

                "My favorite language: " +
                "<select name = 'language1'>" +
                "<option value = 'JavaScript'>JavaScript</option> " +
                "<option value = 'Java'>Java</option> " +
                "<option value = 'HTML'>HTML</option> " +
                "</select>" +

                "<br>" +

                "My second favorite language: " +
                "<select name = 'language2'>" +
                "<option value = 'JavaScript'>JavaScript</option> " +
                "<option value = 'Java'>Java</option> " +
                "<option value = 'HTML'>HTML</option> " +
                "</select>" +

                "<br>" +

                "My third favorite language: " +
                "<select name = 'language3'>" +
                "<option value = 'JavaScript'>JavaScript</option> " +
                "<option value = 'Java'>Java</option> " +
                "<option value = 'HTML'>HTML</option> " +
                "</select>" +

                "<br>" +

                "<input type = 'submit' value = 'Submit!' />" +
                "</form>" +
                "</body>" +
                "</html>";
        return html;
    }

    @RequestMapping(value = "output", method = {RequestMethod.GET, RequestMethod.POST})
    public String languages(@RequestParam String name, String language1, String language2, String language3) {
        return "<html>" +
                "<body>" +
                "<h1>" +
                name +
                "</h1> " +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol> </body> </html>";
    }

}

