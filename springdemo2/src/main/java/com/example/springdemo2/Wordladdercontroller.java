package com.example.springdemo2;

import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Wordladdercontroller {
    @RequestMapping(value = "/wordladder",method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String doReq(@RequestParam("start") String start, @RequestParam("end") String end) throws IOException
    {
        System.out.println(start);
        BufferedReader in =new BufferedReader(new FileReader("./dictionary.txt"));
        List<String> wordList=new ArrayList<>();
        String str;
        while((str = in.readLine())!=null) {
            if(str!="") {
                wordList.add(str);
            }
        }
        Solution ans = new Solution();
        String start_word,end_word;
        start_word = start;
        end_word = end;
        String ladd = ans.ladderLength(start_word,end_word,wordList);

        return ladd;
    }
}
