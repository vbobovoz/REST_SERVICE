package com.example.factorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class FactorialController {

    @GetMapping("/factN")

        public long fact(@RequestParam(value = "num", defaultValue = "0") long n) {
            long res = 1;
            if(n == 0) { return 1; }
            for(int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        }
    @GetMapping("/factTillN")
        public ArrayList<Long> facts(@RequestParam(value="num", defaultValue = "0") long n) {
            ArrayList<Long> res = new ArrayList<>();
            long result = 1;
            if(n == 0) {
                res.add(1L);
                return res;
            }
            for(int i = 1; i <= n; i++) {
                result *= i;
                res.add(result);
            }
            return res;
        }
}
