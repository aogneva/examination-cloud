package ru.aogneva.mathmicro;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MathService {
    final private Random random = new Random();

    public Question getRandom() {
        final int max = 10;
        int a = random.nextInt(max);
        int b = random.nextInt(max);
        return Question.builder().question(a + " + " + b + " = ?").answer(String.valueOf(a + b)).build();
    }

}