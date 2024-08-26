public class ClasCastExcepExample {
    public static void main(String[] args){
        BBB b = new CCC();
        DDD d = (DDD) b;
    }
}
class BBB{

}
class CCC extends BBB{

}
class DDD extends BBB{

}