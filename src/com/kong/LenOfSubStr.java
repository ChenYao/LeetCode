package com.kong;

public class LenOfSubStr {

    public static void main(String[] args){
        LenOfSubStr solution = new LenOfSubStr();
        System.out.println(solution.lengthOfLongestSubstring("dvdf"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null){
            return  0;
        }
        if (s.length() == 1){
            return 1;
        }
        int start = 0;
        int step = 0;
        for (int i = 1; i < s.length(); i++){
            char checkChar = s.charAt(i);
            String checkStr = s.substring(start, i + 1);
            int dupPos = checkStr.substring(0,checkStr.length()-1).indexOf(checkChar);
            if (dupPos != -1){
                int newStep = i - start;
                start = start + dupPos + 1;
                step = newStep >= step?newStep:step;
            }
        }

        int lastStep = s.length() - start;
        step = lastStep >= step?lastStep:step;

        return step;
    }

}
