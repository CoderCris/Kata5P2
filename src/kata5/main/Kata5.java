package kata5.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kata5.model.Histogram;
import kata5.view.HistogramDisplay;
import kata5.view.MailHistogramBuilder;
import kata5.view.MailListBuilder;

public class Kata5 {

    public static void main(String[] args) throws IOException {
        Kata5 kata4 = new Kata5();
        kata4.execute();
    }
    private List<String> mailList;
    private HistogramDisplay histoDisplay;
    private Histogram<String> histogram;
    
    public void execute() throws FileNotFoundException, IOException{
        input();
        process();
        output();
    }
    private void input()throws FileNotFoundException, IOException{
        String filename = "C:\\Users\\Cris\\Desktop\\Ficheros para la práctica en laboratorio 5 -20180110\\emails.txt";
        mailList = MailListBuilder.read(filename);
    }
    
    private void output(){
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
    private void process(){
        histogram = MailHistogramBuilder.build(mailList); 
    }
}
