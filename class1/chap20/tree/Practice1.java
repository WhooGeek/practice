package com.whoo.chap20.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Practice1 {

    public String solution(String input) throws IOException{
        BufferedReader br = new BufferedReader(new StringReader(input));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t  = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            int k = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> map = new TreeMap<>();

            for(int j = 0; j < k; j++){
                st = new StringTokenizer(br.readLine(), " ");
                char cmd = st.nextToken().charAt(0);
                int value = Integer.parseInt(st.nextToken());

                if(cmd == 'I'){
                    map.put(value, map.getOrDefault(value, 0) + 1);
                }else if(!map.isEmpty()){
                    int key = (value == 1) ? map.lastKey() : map.firstKey();
                    map.computeIfPresent(key, (k1, v) ->(v ==1) ? null : v-1);
                }

            }

            if(map.isEmpty()){
                sb.append("EMPTY\n");
            }else{
                sb.append(map.lastKey()).append(' ').append(map.firstKey()).append('\n');
            }
        }

        return sb.toString().trim();
    }
}
