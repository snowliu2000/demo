package com.example.demo.amazon;

import java.util.HashSet;

/**
 * @author lsl
 * @Date:2019/4/14
 * @Time:17:41
 * 交换两个元音字母的位置
 */
public class Solution {
    private static final String WORD = "hello";

    private String reverseVowels(String word) {
        int index = 0;
        int[] oldWord = new int[word.length()];
        HashSet<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        for (int i = 0; i < word.length(); i++) {
            if (vowel.contains(word.charAt(i))) {
                oldWord[index] = i;
                index++;
            }
        }
        char[] newWord;
        newWord = word.toCharArray();
        for (int i = 0; i < index; i++) {
            newWord[oldWord[i]] = word.charAt(oldWord[index - i - 1]);
        }
        return String.valueOf(newWord);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.reverseVowels(WORD);
        System.out.println(result);
    }
}
