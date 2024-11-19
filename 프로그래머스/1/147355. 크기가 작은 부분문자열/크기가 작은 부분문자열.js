function solution(t, p) {
    var answer = 0;
    var intP = parseInt(p);
    for(let i = 0; i < t.length - p.length + 1; i ++){
        if(parseInt(t.substring(i,i + p.length)) <= intP){
            answer++;
        }
    }
    return answer;
}