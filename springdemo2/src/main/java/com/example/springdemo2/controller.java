package com.example.springdemo2;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;

public class controller {
    @RequestMapping(value = "/ladder", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody

    public String ladder(@RequestParam("start") String start, @RequestParam("end") String end) throws IOException
    {
        return "";
    }
};
