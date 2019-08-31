package level03;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class BestAlbum {

    class Genre {
        int totalPlay = 0;
        Map<Integer, Integer> idxMap = new HashMap<>();

        public void addIndex(int index, int time) {
            idxMap.put(index, time);
        }

        public void addTotalPlayTime(int time) {
            totalPlay += time;
        }

        public int getTotalPlay() {
            return totalPlay;
        }
    }

    public int[] solution(String[] genres, int[] plays) {

        Map<String, Genre> listMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            if (listMap.get(genres[i]) == null) {
                Genre genre = new Genre();
                genre.addIndex(i, plays[i]);
                genre.addTotalPlayTime(plays[i]);

                listMap.put(genres[i], genre);
            } else {
                listMap.get(genres[i]).addIndex(i, plays[i]);
                listMap.get(genres[i]).addTotalPlayTime(plays[i]);
            }
        }

        List<Genre> bestPlayList = new ArrayList<>();
        Iterator<String> iter = listMap.keySet().iterator();

        while (iter.hasNext()) {
            String key = iter.next();
            bestPlayList.add(listMap.get(key));
        }

        List<Map<Integer, Integer>> list = bestPlayList.stream().sorted(new Comparator<Genre>() {
            @Override
            public int compare(Genre o1, Genre o2) {
                if (o1.getTotalPlay() > o2.getTotalPlay()) {
                    return -1;
                } else if (o1.getTotalPlay() < o2.getTotalPlay()) {
                    return 1;
                }
                return 0;
            }
        }).map(genre -> genre.idxMap)
                .collect(toList());


        List<Integer> answer = new ArrayList<>();

        list.stream().forEach(integerIntegerMap -> integerIntegerMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(2).forEach(integerIntegerEntry -> answer.add(integerIntegerEntry.getKey())));

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
