
function solution(x) {
    var answer = true;
    var num = x.toString();
    var sum = 0;
    for(let i = 0; i < num.length; i++){
        sum += parseInt(num.charAt(i));
        console.log(num.charAt(i));
    }
    
    return (x%sum == 0) ? true:false;
}