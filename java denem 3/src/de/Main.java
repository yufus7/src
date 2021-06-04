package de;

import javafx.stage.Stage;
import sample.f;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, NullPointerException, IndexOutOfBoundsException {
        f ne=new f();

        ne.start(ne.getSt1());
        ParseTXT parse=new ParseTXT();
        parse.getSortTXTList();



   /*     BufferedReader okunan = new BufferedReader(new FileReader("C:\\Users\\Public\\Documents\\city_populations.txt"));
        //city_populations
        List<RecordTXT> RecordTXTS = new ArrayList<RecordTXT>();
        List<Integer> address = new ArrayList<>();
        List<Integer> sortValues = new ArrayList<>();
        List<Integer> groups = new ArrayList<>();

        Scanner scanner = new Scanner(okunan);
        String[] line;
        String str;
        int satir = 0, grup = 0, y = 0, t = 0;

        while (scanner.hasNext()) {
            str = scanner.nextLine();
            if (str.matches("[\\d]{2,3}")) {
                grup++;
                groups.add(Integer.valueOf(str));
            } else if (str.matches("[\\d]{4}.*,.*")) {
                satir++;
                line = str.split(",");
                RecordTXT bilgi = new RecordTXT(grup, line[0], line[1], line[2], Integer.parseInt(line[3]), line[4]);
                RecordTXTS.add(bilgi);
            }
        }*/


    //    parse.yazdir(RecordTXTS, satir);

     //   ParseTXT.sirala(RecordTXTS, address, sortValues, groups, grup, y);



    }
}
