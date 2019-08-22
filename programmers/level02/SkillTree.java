package level02;


import java.util.HashMap;
import java.util.Map;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        Map<Character, Integer> map = new HashMap();

        for(int i=0; i<skill.length(); i++){
            map.put(skill.charAt(i), i);
        }
        int count = 0;
        for(int i=0; i<skill_trees.length; i++){
            String skill_tree = skill_trees[i];

            int pos = 0;
            boolean isPossible = true;
            for(int j=0; j<skill_tree.length(); j++){
                if(map.get(skill_tree.charAt(j)) != null){
                    if(map.get(skill_tree.charAt(j)) != pos) {
                        isPossible = false;
                        break;
                    } else {
                        pos++;
                    }
                }
            }

            if(isPossible) count++;
        }
        return count;
    }
}
