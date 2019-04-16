package com.example.springdemo2;

public class Pair {
	String word;
    int step;
    Pair father;
    public Pair(String word, int step) {
        this.word = word;
        this.step = step;
    }

    public String getWord() {
        return word;
    }

    public int getStep() {
        return step;
    }
}
