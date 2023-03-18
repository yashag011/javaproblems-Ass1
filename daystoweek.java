public class  daystoweek{
    public static void main(String[] args) {
        int days = Integer.parseInt(args[0]);
        int weeks = (days%365)/7;
        int years = days/365;
        System.out.println("days "+ days+"weeks "+weeks+"year "+years);
    }
}