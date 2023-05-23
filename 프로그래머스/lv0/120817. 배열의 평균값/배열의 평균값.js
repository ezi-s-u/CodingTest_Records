function solution(numbers) {
    var sum = 0;
    for(var n of numbers)
        sum += n;
    return sum/numbers.length;
}