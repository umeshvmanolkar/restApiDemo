package com.rest.api.restApiDemo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api")
public class ApiController {

    @RequestMapping("/getData")
    public int getData(){
        List<Course> courseList = Arrays.asList(
                new Course(1,"java",3),
                new Course(2,"python",3)
        );


        String s = "MDCXCV";
        String[] sArray = s.split("");
        int[] intArray = new int[sArray.length];
        int result=0;
        HashMap<String, Integer> rMap = new HashMap<String, Integer>() {{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);

        }};
        for(int i=0;i<sArray.length;i++){
            intArray[i]= rMap.get(sArray[i]);

        }


        for(int i=0,j=1;i<intArray.length;){
            if(intArray[i]>=intArray[j]){
                result+=intArray[i];

                i++;
                j++;
                if(j>=intArray.length){
                    return result+intArray[i];
                }

                System.out.println(result);
            }
            else{
                result+=(intArray[j]-intArray[i]);
                i+=2;
                j+=2;
                if(j>=intArray.length){
                    return result;
                }
                System.out.println(result);
            }
        }

        return result;
    }
}
