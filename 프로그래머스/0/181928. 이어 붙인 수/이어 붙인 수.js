function solution(num_list) {
    var odd = "";
    var even = "";
    var answer = 0;
    for(var i = 0; i < num_list.length; i++){
        if(num_list[i]%2 == 0){
            even += num_list[i];
        }else{
            odd += num_list[i];
        }
    }
    return parseInt(even)+parseInt(odd);
}