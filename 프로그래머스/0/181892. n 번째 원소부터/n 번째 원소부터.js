function solution(num_list, n) {
    var answer = [];
    let j = 0;
    for(let i = n-1; i < num_list.length; i++){
        answer[j++] = num_list[i];
    }
    return answer;
}