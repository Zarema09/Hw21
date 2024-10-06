public class LimitException extends Exception {
    private double remainingAmount;

        public LimitException(String message,double remainingAmount) {
        }

        public double getRemainingAmount() {
            return remainingAmount;
        }

    }
