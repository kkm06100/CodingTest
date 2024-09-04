function solution(num_list, n) {
    var answer = [];
    let j = 0;
    for(i = 0;i<num_list.length; i+= n){
        answer[j++] = num_list[i];
    }
    return answer;
}