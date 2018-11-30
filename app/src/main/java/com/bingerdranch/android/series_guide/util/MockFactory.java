package com.bingerdranch.android.series_guide.util;

import com.bingerdranch.android.series_guide.Database.Episode;
import com.bingerdranch.android.series_guide.Database.Season;
import com.bingerdranch.android.series_guide.Database.Serie;

import java.util.ArrayList;

public class MockFactory {
    //private ArrayList<Serie> output = new ArrayList<>();


    public static ArrayList<Episode> getmockedsuitss8() {
        ArrayList<Episode> output = new ArrayList<>();
        output.add(new Episode("Season 8", "Right hand man", "Jul 18"));
        output.add(new Episode("Season 8", "Pecking Order", "Jul 25"));
        output.add(new Episode("Season 8", "Promises,Promises", "Aug 1"));
        output.add(new Episode("Season 8", "Revenue Per Square Foot", "Aug 8"));
        output.add(new Episode("Season 8", "Good Mudding", "Aug 15"));
        output.add(new Episode("Season 8", "Cats,Ballet,Harvey Specter", "Aug 22"));
        output.add(new Episode("Season 8", "Sour Grapes", "Aug 29"));
        output.add(new Episode("Season 8", "Coral Gables", "sep 5"));
        output.add(new Episode("Season 8", "Motion to Delay", "sep 12"));
        output.add(new Episode("Season 8", "Managing Partner", "sep 15"));


        return output;
    }
/*
    public static ArrayList<Serie> getMockedSerieList() {
        ArrayList<Serie> output = new ArrayList();

        output.add(new Serie("Suits", R.drawable.suits,"Dec 5,2010"));
        output.add(new Serie("Game of thrones", R.drawable.gameoft,"Dec 6,2010"));
        output.add(new Serie("The office", R.drawable.theoffice,"Dec 5,2010"));
        output.add(new Serie("Modern family", R.drawable.modernfamily,"Dec 5,2010"));
        output.add(new Serie("The Carmichael show", R.drawable.carmichael,"Dec 5,2010"));
        output.add(new Serie("Shameless", R.drawable.shameless,"Dec 5,2010"));
        output.add(new Serie("Insecure", R.drawable.insecure,""));
        return output;
    } */

    public static ArrayList<Season> getMockedsuitseasons() {

        ArrayList<Season> season_suits = new ArrayList<>();
        season_suits.add(new Season("Suits", ("Season 8"), "10 remaining",MockFactory.getmockedsuitss8()));
        season_suits.add(new Season("Suits", ("Season 7"), "16 remaining",MockFactory.getmockedsuitss8()));
        season_suits.add(new Season("Suits", ("Season 6"), "16 remaining",MockFactory.getmockedsuitss8()));
        season_suits.add(new Season("Suits", ("Season 5"), "16 remaining",MockFactory.getmockedsuitss8()));
        season_suits.add(new Season("Suits", ("Season 4"), "16 remaining",MockFactory.getmockedsuitss8()));
        season_suits.add(new Season("Suits", ("Season 3"), "16 remaining",MockFactory.getmockedsuitss8()));
        season_suits.add(new Season("Suits", ("Season 2"), "16 remaining",MockFactory.getmockedsuitss8()));
        season_suits.add(new Season("Suits", ("Season 1"), "12 remaining",MockFactory.getmockedsuitss8()));
        season_suits.add(new Season("Suits", ("Special episodes"), "29 remaining",MockFactory.getmockedsuitss8()));

        return season_suits;

    }

    public static ArrayList<Season> getMockedgotseasons() {
        ArrayList<Season> season_got = new ArrayList<>();
        season_got.add(new Season("Game of thrones", ("Season 7"), "7 remaining",MockFactory.getmockedsuitss8()));
        season_got.add(new Season("Game of thrones", ("Season 6"), "10 remaining",MockFactory.getmockedsuitss8()));
        season_got.add(new Season("Game of thrones", ("Season 5"), "10 remaining",MockFactory.getmockedsuitss8()));
        season_got.add(new Season("Game of thrones", ("Season 4"), "10 remaining",MockFactory.getmockedsuitss8()));
        season_got.add(new Season("Game of thrones", ("Season 3"), "10 remaining",MockFactory.getmockedsuitss8()));
        season_got.add(new Season("Game of thrones", ("Season 2"), "10 remaining",MockFactory.getmockedsuitss8()));
        season_got.add(new Season("Game of thrones", ("Season 1"), "10 remaining",MockFactory.getmockedsuitss8()));
        season_got.add(new Season("Game of thrones", ("Special episodes"), "40",MockFactory.getmockedsuitss8()));

        return season_got;

    }

    public static ArrayList<Season> getMockedtheofficeseasons() {
        ArrayList<Season> season_theoffice = new ArrayList<>();
        season_theoffice.add(new Season("The office", ("Season 9"), "23 remaining",MockFactory.getmockedsuitss8()));
        season_theoffice.add(new Season("The office", ("Season 8"), "24 remaining",MockFactory.getmockedsuitss8()));
        season_theoffice.add(new Season("The office", ("Season 7"), "26 remaining",MockFactory.getmockedsuitss8()));
        season_theoffice.add(new Season("The office", ("Season 6"), "26 remaining",MockFactory.getmockedsuitss8()));
        season_theoffice.add(new Season("The office", ("Season 5"), "26 remaining",MockFactory.getmockedsuitss8()));
        season_theoffice.add(new Season("The office", ("Season 4"), "26 remaining",MockFactory.getmockedsuitss8()));
        season_theoffice.add(new Season("The office", ("Season 3"), "19 remaining",MockFactory.getmockedsuitss8()));
        season_theoffice.add(new Season("The office", ("Season 2"), "23 remaining",MockFactory.getmockedsuitss8()));
        season_theoffice.add(new Season("The office", ("Season 1"), "6 remaining",MockFactory.getmockedsuitss8()));
        season_theoffice.add(new Season("The office", ("Special episodes"), "13 remaining",MockFactory.getmockedsuitss8()));

        return season_theoffice;
    }


    public static ArrayList<Serie> getMockedSerieList() {
        ArrayList<Serie> output = new ArrayList<>();

        output.add(new Serie("Suits", "https://i.4pcdn.org/tv/1521400377795s.jpg", "23 Jun 2011","tt1632701",8,"On the run from a drug deal gone bad, Mike Ross, a brilliant college dropout, finds himself a job working with Harvey Specter, one of New York City's best lawyers."));
        output.add(new Serie("Game of thrones", "https://i.amz.mshcdn.com/pQkWoEuSZC3xedPhIfKPJsbs6w0=/950x534/filters:quality(90)/https%3A%2F%2Fblueprint-api-production.s3.amazonaws.com%2Fuploads%2Fcard%2Fimage%2F579408%2Fb313faf9-bbc0-4a3e-9cc6-16beeb8e20bb.jpg", "17 Apr 2011","tt0944947",8,"Nine noble families fight for control over the mythical lands of Westeros, while an ancient enemy returns after being dormant for thousands of years."));
        output.add(new Serie("The office", "https://m.media-amazon.com/images/M/MV5BMTgzNjAzMDE0NF5BMl5BanBnXkFtZTcwNTEyMzM3OA@@._V1_.jpg", "24 Mar 2005","tt0386676",9,"A mockumentary on a group of typical office workers, where the workday consists of ego clashes, inappropriate behavior, and tedium."));
        output.add(new Serie("Modern family", "https://m.media-amazon.com/images/M/MV5BMTI5MjUyYjUtMzhmOC00NTc3LWIzMTctMTVlOTA2NjI2NDU2XkEyXkFqcGdeQXVyMzAzNTY3MDM@._V1_.jpg", "22 Sep 2009","tt1442437",10,"Three different, but related families face trials and tribulations in their own uniquely comedic ways."));
        output.add(new Serie("The Carmichael show", "http://on-camera-audiences.com/shows/The_Carmichael_show/img", "26 Aug 2015","tt4307902",3,"Follows the life of stand up comedian Jerrod Carmichael as he navigates through life with his therapist in-training girlfriend and his heavily opinionated family."));
        output.add(new Serie("Shameless", "https://images-na.ssl-images-amazon.com/images/I/91k87UE5ipL._SX342_.jpg", "09 Jan 2011","tt1586680",9,"A scrappy, fiercely loyal Chicago family makes no apologies."));
        output.add(new Serie("Insecure", "https://ssle.ulximg.com/image/750x750/cover/1534627983_7353746d91f43dcdb9c894ecd94423df.jpg/cbcee31ea6138d100f4769039ce69e72/1534627983_f219ba33b1e36ef89d92e94160800049.jpg", "09 Oct 2016","tt5024912",3,"Follows the awkward experiences and racy tribulations of a modern-day African-American woman."));

        return output;

    }

    public static ArrayList<Serie> getMockedSerieListfordb() {
        ArrayList<Serie> output = new ArrayList<>();

        output.add(new Serie("Suits", "https://i.4pcdn.org/tv/1521400377795s.jpg", "Dec 5,2010",5,"1","suits pilot"));
        output.add(new Serie("Suits", "https://i.4pcdn.org/tv/1521400377795s.jpg", "Dec 5,2010",15,"2","pilot"));
        output.add(new Serie("Suits", "https://i.4pcdn.org/tv/1521400377795s.jpg", "Dec 5,2010",8,"3","pilot"));
        output.add(new Serie("Suits", "https://i.4pcdn.org/tv/1521400377795s.jpg", "Dec 5,2010",18,"4","pilot"));


        return output;

    }
}