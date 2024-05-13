package dev.pradeep.todoappspringboot.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class TodoItemController {
    private final Logger logger=LoggerFactory.getLogger(TodoItemController.class);

    @GetMapping("/")
    public ModelAndView index(){
        logger.debug("request to get index");
        return new ModelAndView("index.html");
    }
}
