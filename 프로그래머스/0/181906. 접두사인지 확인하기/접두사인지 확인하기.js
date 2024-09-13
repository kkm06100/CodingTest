function solution(my_string, is_prefix) {
    var answer = 1;
    answer = my_string.startsWith(is_prefix)?1:0;
    // for(var i = 0; i < is_prefix.length; i++){
    //     if(is_prefix.charAt(i) != my_string.charAt(i)){
    //         return 0;
    //     }
    // }
    return answer;
}