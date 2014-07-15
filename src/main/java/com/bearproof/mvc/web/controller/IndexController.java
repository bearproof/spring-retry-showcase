package com.bearproof.mvc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Date:   6/5/13 / 7:58 AM
 * Author: Johnathan Mark Smith
 * Email:  john@johnathanmarksmith.com
 * <p/>
 * Comments:
 * <p/>
 * This is my basic controller for my web app.
 */


@Controller
@RequestMapping("/")
class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String displayRequestPage(ModelMap model) {
        model.addAttribute("message", "message from server");
        logger.debug("made it to controller");
        return "helloworld";

    }


}
