import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, 0);
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            String first = "" + s.charAt(0);
            String last = "" + s.charAt(s.length() - 1);
            map.put(first, last);
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            String first = "" + s.charAt(0);
            if (map.containsKey(first)) {
                map.put(first, map.get(first) + s);
            } else {
                map.put(first, s);
            }
        }
        return map;
    }

    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
            if (map.get(s) % 2 == 0) {
                result.append(s);
            }
        }
        return result.toString();
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> counts = new HashMap<>();
        Map<String, Boolean> result = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = strings[i];
            if (counts.containsKey(key)) {
                int val = counts.get(key);
                val++;
                counts.put(key, val);
            } else {
                counts.put(key, 1);
            }
            result.put(key, counts.get(key) >= 2);
        }
        return result;
    }

    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)) {
                int pos = map.get(key);
                String tmp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = tmp;
                map.remove(key);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }

    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)) {
                int value = map.get(key);
                if (value == -1) {
                    continue;
                }
                int pos = map.get(key);
                String tmp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = tmp;
                map.put(key, -1);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }
}
