package level2;

public class Skill_Tree {
	
	public static void main(String[] args) {
		
		String skill = "CBD";
		String[] st = {"BACDE", "CBADF", "AECB", "BDA"};
		
		System.out.println(solution(skill, st));
		
	}//end main
	
	static int solution(String skill, String[] skill_trees) {
		
        int answer = 0;
        
        for (String skillTree : skill_trees) {
        	
            String tempSkill = skillTree;
            
            for (int i = 0; i < skillTree.length(); i++) {
                String s = skillTree.substring(i, i+1);
                if (!skill.contains(s)) {
                    tempSkill = tempSkill.replace(s, ""); // 필수 스킬이 아닐 경우 공백으로 치환
                }
            }
            
            if (skill.indexOf(tempSkill) == 0)
                answer++;
        }
 
        return answer;

        
    }

}
