package com.solution.ladder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> queue = new LinkedList<>();
        int[] visited = new int[wordList.size() + 1];
        queue.offer(new Pair(beginWord, 1));
        while (!queue.isEmpty() && wordList.size() > 0) {
            Pair pair = queue.poll();
            String word = pair.getWord();
            int step = pair.getStep();
            for (int i = 0; i < wordList.size(); i++) {
                String str = wordList.get(i);
                if (canChange(word, str)) {
                    if (str.equals(endWord)) {
                    	System.out.print(endWord + "->");
                    	System.out.print(pair.getWord() + "->");	
                    	while(pair.father!=null) {
                    		pair = pair.father;
                    		System.out.print(pair.getWord() + "->");
                    	}
                    	
                        return step + 1;
                    }
                    else {
                        if (visited[i] == 0) {
                        	Pair son = new Pair(str,step + 1);
                        	son.father = pair;
                            queue.offer(son);
                            visited[i] = 1;
                        }
                    }
                }
            }

        }
        return 0;
    }

    // 判断字符串a和b是否只有1个字符不相同
    public boolean canChange(String a, String b) {
        int different = 0;
        if(a.length()!=b.length()) {
        	return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                different++;
        }
        return different == 1 ? true : false;
    }
    public static void main(String[] args) {
    	try {	
			BufferedReader in =new BufferedReader(new FileReader("src\\dictionary.txt"));
			List<String> wordList=new ArrayList<>();
			String str;
			while((str = in.readLine())!=null) {
				if(str!="") {
					wordList.add(str);
				}
			}
			Solution ans = new Solution();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String word1, word2;
			System.out.println("Please input begin word:");
			word1 = br.readLine();
			System.out.println("Please input end word:");
			word2 = br.readLine();
			
			int p = ans.ladderLength(word1, word2, wordList);
			if( p == 0) {
				System.out.println("There is no such ladder");
			}
		} catch (IOException e) {
			System.out.print("Exception");
		}
    }
}