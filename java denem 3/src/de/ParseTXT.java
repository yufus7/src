package de;

import sample.f;

import javax.xml.namespace.QName;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ParseTXT {
    List<RecordTXT> RecordTXTS=new ArrayList<>();
    List<SortTXT> sortTXTList=new ArrayList<>();
    f a=new f();


    public List<SortTXT> getSortTXTList() throws FileNotFoundException {

        BufferedReader okunan = new BufferedReader(new FileReader(a.getFile()));
        List<Integer> groups = new ArrayList<>();
        List<Integer> address = new ArrayList<>();
        List<Integer> sortValues = new ArrayList<>();



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
                RecordTXT bilgi = new RecordTXT( Integer.parseInt(line[0]), line[1], line[2], Integer.parseInt(line[3]), line[4]);
                RecordTXTS.add(bilgi);

            }
            System.out.println(grup);
        }
        for (int i = 0; i<grup;i++){
            t=groups.get(i);
            sortValues.clear();
            address.clear();

            for (int j = y; j<(groups.get(i)+y);j++){
                sortValues.add(RecordTXTS.get(j).getValue());
            }

            Collections.sort(sortValues);
            Collections.reverse(sortValues);
       //     System.out.println("\ntop 10 value");
            for (int k = 0; k<10;k++) {
                for (int l =y ; l<(groups.get(i)+y);l++) {
                    if (sortValues.get(k).equals(RecordTXTS.get(l).getValue()) && !address.contains(l)) {
                        address.add(l);
                    }
                }

            }
            for (int m = 0; m<10;m++){
                SortTXT sortTXT=new SortTXT(RecordTXTS.get(address.get(m)).getYear()
                        ,RecordTXTS.get(address.get(m)).getName()
                        ,RecordTXTS.get(address.get(m)).getCountry()
                        ,RecordTXTS.get(address.get(m)).getValue(),RecordTXTS.get(address.get(m)).getCategory());
                sortTXTList.add(sortTXT);

            }
            y=y+t;
            if(i==grup) {

                break;
            }
            //System.out.println(i);


        }


       /* for (SortTXT abc:sortTXTList){
            System.out.println(abc.getYear()+" "+abc.getName()+" "+abc.getValue());
        }*/


        return sortTXTList;

    }


}
