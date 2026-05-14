public class StandardDeviation {

public static double calculateSum(double[] numbers){
    double sum = 0;
    for(double number : numbers){
        sum = sum + number;
    }
    return sum;
}
public static double calculateMean(double[] numbers){

    return calculateSum(numbers)/ numbers.length;
}

public static double calculateSumOfSquares(double[] numbers, double mean){
    double sumOfSquares = 0;
    for(double number : numbers){
        double difference = number - mean;
        sumOfSquares += Math.pow(difference, 2);
    }
    return sumOfSquares;

}

public static double caculateStandardDeviation(double[] numbers){
    double mean = calculateMean(numbers);
    double sumOfSquares = calculateSumOfSquares(numbers, mean);
    double result = sumOfSquares / (numbers.length);
    return Math.sqrt(result);

}
}





