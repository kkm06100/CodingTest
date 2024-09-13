function solution(my_string, is_prefix) {
    var answer = 1;
    for(var i = 0; i < is_prefix.length; i++){
        if(is_prefix.charAt(i) != my_string.charAt(i)){
            return 0;
        }
    }
    return answer;
}