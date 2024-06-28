class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int index_str = my_string.length()-1;
        if(my_string.length()<is_suffix.length()){
            return 0;
        }
        for(int i = is_suffix.length()-1;i>=0;i--){
            if(my_string.charAt(index_str--) != is_suffix.charAt(i)){
                return 0;
            }
        }
        return 1;
    }
}