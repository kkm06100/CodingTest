function solution(my_string, is_suffix) {
    var answer = 1;
    // answer = my_string.endsWith(is_suffix)?1:0;
    
        var index_str = my_string.length-1;
        if(my_string.length<is_suffix.length){
            return 0;
        }
        for(var i = is_suffix.length-1;i>=0;i--){
            if(my_string.charAt(index_str--) != is_suffix.charAt(i)){
                return 0;
            }
        }
        return 1;
    return answer;
}