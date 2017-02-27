package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

@Controller
public class HomeController {

    public static int randInt(int min, int max) {

        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
    @RequestMapping("/")

    public ModelAndView helloWorld() {
        return new
                ModelAndView("welcome", "message", "HELLO WORLD!");

    }
    @RequestMapping("welcome")

    public ModelAndView helloWorld2() {
        int[] ar = {1, 2, 3, 4};
        return new
                ModelAndView("welcome2", "message", ar);

    }
    @RequestMapping("getDate")

    public ModelAndView getDateMethod() {
        Date date = Calendar.getInstance().getTime();

        return new ModelAndView("showDate", "dateToday", date);
    }
    @RequestMapping("displayDate")

    public ModelAndView displayDate() {
        Date date = Calendar.getInstance().getTime();

        return new ModelAndView("showDate", "dateToday", date);
    }
    @RequestMapping("randomizeJoke")

    public ModelAndView randomizeJoke() {
        return getRandomJoke();

    }

    //TODO COMPLETE THIS METHOD, FIGURE OUT A WAY TO DISPLAY GIFS/IMAGES ON THE WEBPAGE
    @RequestMapping("gifGenerator")
    public ModelAndView generateGif() {
        return null;
    }


    private ModelAndView getRandomJoke() {
        String joke = "Something";

        int randomNumber = randInt(1, 6);
        if (randomNumber == 1) {
            joke = "Why is Yoda afraid of seven? \n Because six seven eight.";
        } else if (randomNumber == 2) {
            joke = "Did you hear about the crazy Spanish train killer? \n He had loco motives.";
        } else if (randomNumber == 3) {
            joke = "I never wanted to believe that my Dad was stealing from his job as a road worker.\n" +
                    "But when I got home, all the signs were there.";
        } else if (randomNumber == 4) {
            joke = "I told my friend that she drew her eyebrows on too high.\n" +
                    "She looked surprised.";
        } else if (randomNumber == 5) {
            joke = "Why couldn't the bicycle stand up?\n Because it was two tired";
        } else if (randomNumber == 6) {
            joke = "Like most people my age,\n" +
                    "I'm 27.";
        }

        return new ModelAndView("randomizeJoke", "message", joke);
    }

}
