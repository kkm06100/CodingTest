function solution(n_str) {
    var answer = '';
    let i = 0;
    let start = 0;
    while(n_str[i] == "0"){
        start++;
        i++;
    }
    answer = n_str.slice(start);
    return answer;
}