package com.example.topsummitjava;

import java.util.ArrayList;

public class Glide {
    private static String[] name = new String[]{
            "Gunung Merbabu",
            "Gunung Merapi",
            "Gunung Arjuno",
            "Gunung Ciremai",
            "Gunung Gede Pangrango",
            "Gunung Lawu",
            "Gunung Semeru",
            "Gunung Sindoro",
            "Gunung Slamet",
            "Gunung Sumbing",
    };
    private static String[] summary = new String[]{
            "Gunung Merbabu adalah gunung api yang bertipe Strato yang terletak secara geografis pada 7,5° LS dan 110,4° BT",
            "Gunung Merapi adalah gunung berapi di bagian tengah Pulau Jawa dan merupakan salah satu gunung api teraktif di Indonesia.",
            "Gunung Arjuno adalah sebuah gunung berapi kerucut di Jawa Timur, Indonesia dengan ketinggian 3.339 m dpl. Gunung Arjuno secara administratif terletak di perbatasan Kota Batu, Kabupaten Malang, dan Kabupaten Pasuruan dan berada di bawah pengelolaan Taman Hutan Raya Raden Soerjo.",
            "Gunung Ceremai adalah gunung berapi kerucut yang secara administratif termasuk dalam wilayah dua kabupaten, yakni Kabupaten Kuningan dan Kabupaten Majalengka, Provinsi Jawa Barat. Posisi geografis puncaknya terletak pada 6° 53' 30\" LS dan 108° 24' 00\" BT, dengan ketinggian 3.078 m di atas permukaan laut.",
            "Gunung Gede merupakan sebuah gunung api bertipe stratovolcano yang berada di Pulau Jawa, Indonesia. Gunung Gede berada dalam ruang lingkup Taman Nasional Gede Pangrango, yang merupakan salah satu dari lima taman nasional yang pertama kali diumumkan di Indonesia pada tahun 1980.",
            "Gunung Lawu terletak di Pulau Jawa, Indonesia, tepatnya di perbatasan Provinsi Jawa Tengah dan Jawa Timur. Gunung Lawu terletak di antara tiga kabupaten yaitu Kabupaten Karanganyar, Jawa Tengah, Kabupaten Ngawi, dan Kabupaten Magetan, Jawa Timur. ",
            "Gunung Semeru atau Gunung Meru adalah sebuah gunung berapi kerucut di Jawa Timur, Indonesia. Gunung Semeru merupakan gunung tertinggi di Pulau Jawa, dengan puncaknya Mahameru, 3.676 meter dari permukaan laut.",
            "Gunung Sindoro, biasa disebut Sindara, atau juga Sundoro merupakan sebuah gunung volkano aktif yang terletak di Jawa Tengah, Indonesia, dengan Temanggung sebagai kota terdekat. Gunung Sindoro terletak berdampingan dengan Gunung Sumbing. Gunung sindara dapat terlihat jelas dari puncak sikunir dieng",
            "Gunung Slamet adalah sebuah gunung berapi kerucut yang terdapat di Pulau Jawa, Indonesia. Gunung Slamet terletak di antara 5 kabupaten, yaitu Kabupaten Brebes, Kabupaten Banyumas, Kabupaten Purbalingga, Kabupaten Tegal, dan Kabupaten Pemalang, Provinsi Jawa Tengah",
            "Gunung Sumbing adalah gunung api yang terdapat di Jawa Tengah, Indonesia., Gunung Sumbing merupakan gunung tertinggi ketiga di Pulau Jawa setelah Gunung Semeru dan Gunung Slamet. Gunung ini secara administratif terletak di tiga wilayah kabupaten, yaitu Kabupaten Magelang; Kabupaten Temanggung; dan Kabupaten Wonosobo.",

        };
    private static final int [] image = {
            R.drawable.merapi,
            R.drawable.merbabu,
            R.drawable.arjuno,
            R.drawable.ciremai,
            R.drawable.gedepangrango,
            R.drawable.lawu,
            R.drawable.semeru,
            R.drawable.sindoro,
            R.drawable.slamet,
            R.drawable.sumbing
    };

    public static ArrayList getListData(){
        ListGunung ListGunung = null;
        ArrayList list = new ArrayList<>();
        for(int position =0;position<name.length; position++){
            ListGunung = new ListGunung();
            ListGunung.setImage(image[position]);
            ListGunung.setName(name[position]);
            ListGunung.setSummary(summary[position]);
            list.add((ListGunung));
        }
        return list;
    }

}
