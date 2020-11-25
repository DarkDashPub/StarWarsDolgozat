package hu.petrik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import java.util.LinkedList;

public class Main {

    public static LinkedList<AnakinSkyWalker> Anakin;
    public static LinkedList<Uralkodo> Uralkodo;

    static void szereplok(String fajlnev)
    {
        Anakin = new LinkedList<>();
        Uralkodo = new LinkedList<>();

        String sor;
        try
        {

            FileReader fr = new FileReader(fajlnev);
            BufferedReader br = new BufferedReader(fr);

            sor = br.readLine();
            while(sor != null)
            {
                String[] adatok = sor.split(";");
                if(adatok[0].equals("Anakin"))
                {
                    AnakinSkyWalker anakin = new AnakinSkyWalker();
                    for (int i = 0; i < Integer.parseInt(adatok[1]); i++) {
                        anakin.engeddElAHaragod();
                    }
                    Anakin.add(anakin);

                }
                else
                    {
                        Uralkodo uralkodo = new Uralkodo();
                        for (int i = 0; i < Integer.parseInt(adatok[1]); i++) {
                            uralkodo.engeddElAHaragod();

                        }
                        Uralkodo.add(uralkodo);
                    }
                sor = br.readLine();
            }
            br.close();
            fr.close();

        } catch (Exception e)
        {
            e.getMessage();
        }
    }

    static void sithek()
    {
        for (int i = 0; i < Anakin.size() ; i++) {
            Anakin.get(i).toString();
        }
        for (int i = 0; i < Uralkodo.size(); i++) {
            Uralkodo.get(i).toString();
        }
    }

    public static void main(String[] args) {

        try
        {
            szereplok("StarWars.txt");
            sithek();

        } catch (Exception e)
        {
            e.getMessage();
        }

    }
}
