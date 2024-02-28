package design_patterns.strategy_pattern_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CaeserCipher implements ICipherStrategy {

    @Override
    public String encode(String input) {
        /*
        implement a caesar cipher here - where letters are shifted along x number of values in alphabet
        x can be whatever you like
        If you go beyond the end of the alphabet, you should wrap back around to the front
        e.g. 'z' on a cipher with a shift of 2 should become 'b'
         */

        List<String> alphabet = Arrays.stream("abcdefghijklmnopqrstuvwxyz".split("")).toList();

        List<String> caesar = new ArrayList<>();

        for(String i : input.split("")) {
          int index =  alphabet.indexOf(i);
          if (index >= 25) {
              caesar.add("a");
          }
          else {
              caesar.add(alphabet.get(index + 1));
          }
        }
        return String.join("", caesar);
    }
}
