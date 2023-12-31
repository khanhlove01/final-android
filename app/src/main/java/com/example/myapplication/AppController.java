package com.example.myapplication;

import com.example.myapplication.onhomefragment.NFTHome;
import com.example.myapplication.onplacebid.NFTBidHistoryInfo;
import com.example.myapplication.onprofilefragment.NFTOfferMadeInfo;

import java.util.ArrayList;
import java.util.List;

public class AppController {

    public static int check = 0;
    public static float totalETHWeHave = 26.031f;
    public static List<NFTHome> nftHomeTrendingList = new ArrayList<>();
    public static List<NFTHome> nftHomeArtList = new ArrayList<>();

    public static List<NFTHome> nftHomeGamingList = new ArrayList<>();
    public static List<NFTHome> nftHomeFullList = new ArrayList<>();

    public static List<NFTBidHistoryInfo> nftBidHistoryInfoList = new ArrayList<>();

    public static List<NFTOfferMadeInfo> nftOfferMadeInfoList = new ArrayList<>();

    public static void addNFTOfferMade()
    {
        nftOfferMadeInfoList.add(new NFTOfferMadeInfo(R.drawable.activity_image1,"Kakira #1599","0,03",
                "1 months ago","$60,00","3 months",""));
        nftOfferMadeInfoList.add(new NFTOfferMadeInfo(R.drawable.activity_image2,"Horse #1099","0,06",
                "2 months ago","$120,00","2 months",""));
        nftOfferMadeInfoList.add(new NFTOfferMadeInfo(R.drawable.img13,"People #4445","0,02",
                "1 months ago","$40,00","3 months",""));
        nftOfferMadeInfoList.add(new NFTOfferMadeInfo(R.drawable.img17,"Universe #01","0,05",
                "2 months ago","$100,00","1 month",""));
        nftOfferMadeInfoList.add(new NFTOfferMadeInfo(R.drawable.img18,"Nowhere #01","0,02",
                "1 months ago","$40,00","2 months",""));
    }

    public static void addNFTTrending()
    {
        nftHomeTrendingList.add(new NFTHome(R.drawable.cyball_home1,"Cybloc #569"));
        nftHomeTrendingList.add(new NFTHome(R.drawable.cyball_home2,"Cybloc #153"));
        nftHomeTrendingList.add(new NFTHome(R.drawable.cyball_home3,"Cybloc #396"));
        nftHomeTrendingList.add(new NFTHome(R.drawable.cyball_home4,"Cybloc #111"));
    }

    public static  void  addNFTArt()
    {
        nftHomeArtList.add(new NFTHome(R.drawable.art_home1,"SeasonArt #121"));
        nftHomeArtList.add(new NFTHome(R.drawable.art_home2,"SeasonArt #441"));
        nftHomeArtList.add(new NFTHome(R.drawable.art_home3,"SeasonArt #159"));
        nftHomeArtList.add(new NFTHome(R.drawable.art_home4,"SeasonArt #981"));
    }

    public static  void addNFTGaming()
    {
        nftHomeGamingList.add(new NFTHome(R.drawable.avatar_home1,"Avatar #904"));
        nftHomeGamingList.add(new NFTHome(R.drawable.avatar_home2,"Avatar #054"));
        nftHomeGamingList.add(new NFTHome(R.drawable.avatar_home3,"Avatar #903"));
        nftHomeGamingList.add(new NFTHome(R.drawable.avatar_home4,"Avatar #154"));

        /*nftHomeGamingList.add(new NFTHome(R.drawable.img8,"CatCat #102"));
        nftHomeGamingList.add(new NFTHome(R.drawable.img9,"CatCat #963"));
        nftHomeGamingList.add(new NFTHome(R.drawable.img10,"CatCat #636"));
        nftHomeGamingList.add(new NFTHome(R.drawable.img9,"CatCat #021"));*/

        /*nftHomeGamingList.add(new NFTHome(R.drawable.trending_home1,"BearNFT #545"));
        nftHomeGamingList.add(new NFTHome(R.drawable.trending_home2,"BearNFT #545"));
        nftHomeGamingList.add(new NFTHome(R.drawable.trending_home3,"BearNFT #545"));
        nftHomeGamingList.add(new NFTHome(R.drawable.trending_home4,"BearNFT #545"));*/
    }

    public static void addNFTFullList()
    {
        nftHomeFullList.addAll(nftHomeArtList);
        nftHomeFullList.addAll(nftHomeTrendingList);
        nftHomeFullList.addAll(nftHomeGamingList);
    }
}
