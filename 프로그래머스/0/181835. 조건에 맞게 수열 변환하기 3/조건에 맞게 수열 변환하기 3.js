function solution(arr, k) {
    var answer = [];
    if(k%2 == 0){// 짝수
        for(var i = 0; i < arr.length; i++){
            answer.push(arr[i]+k);
        }
    }else {
        for(var i = 0; i < arr.length; i++){
            answer.push(arr[i]*k);
        }
    }
    return answer;
}