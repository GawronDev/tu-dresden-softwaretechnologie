public class Adel extends Einwohner{
    
    @Override
    public int steuer(){
        int result = super.steuer();
        if(result < 20) {
            result = 20;
        }
        return result;
    }

}
