public class BackToSender {


public static int DailyWage(int numberOfSuccessfulDelivery) {
    int amountPerParcel;
    if (numberOfSuccessfulDelivery < 50) {
        amountPerParcel = 160;
}   else if (numberOfSuccessfulDelivery >= 50 && numberOfSuccessfulDelivery < 60) {
        amountPerParcel = 200;
}   else if (numberOfSuccessfulDelivery >= 60 && numberOfSuccessfulDelivery < 70) {
        amountPerParcel = 250;
}   else {
        amountPerParcel = 500;
}

        
        return (numberOfSuccessfulDelivery * amountPerParcel) + 5000;
}
}


