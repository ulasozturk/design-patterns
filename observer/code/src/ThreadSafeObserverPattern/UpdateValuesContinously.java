package ThreadSafeObserverPattern;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class UpdateValuesContinously implements Runnable {

    private double dollar;
    private double euro;
    private double sterlin;
    private int interval;
    private Subject subject;

    public UpdateValuesContinously(Subject subject, double dollar, double euro, double sterlin, int interval) {
        this.dollar = dollar;
        this.euro = euro;
        this.sterlin = sterlin;
        this.interval = interval;
        this.subject = subject;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {

            DecimalFormat df = new DecimalFormat("#.##");
            DecimalFormatSymbols dfs = new DecimalFormatSymbols();
            dfs.setDecimalSeparator('.');
            df.setDecimalFormatSymbols(dfs);

            double rn1 = (Math.random() * (0.05)) - 0.025;
            double rn2 = (Math.random() * (0.06)) - 0.030;
            double rn3 = (Math.random() * (0.07)) - 0.035;

            dollar = Double.valueOf(df.format((dollar + rn1)));
            euro = Double.valueOf(df.format((euro + rn1)));
            sterlin = Double.valueOf(df.format((sterlin + rn1)));

            ((ConcreteSubject) subject).setValues(dollar, euro, sterlin);

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
