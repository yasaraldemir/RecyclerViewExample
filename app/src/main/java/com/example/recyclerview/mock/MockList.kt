package com.example.recyclerview.mock

import com.example.recyclerview.R
import com.example.recyclerview.model.WriterModel

object MockList {

    fun getMockedWriterList(): List<WriterModel> {
        val image = arrayOf(R.drawable.android_sanati, R.drawable.android_op)
        val writerModel = WriterModel(
            0,
            "Android Sanatı",
            "Volkan Gürbüz",
            "Kitap - İnce Kapak",
            "Level",
            "55,00 TL",
            "44,00 TL",
            "%20"

        )
        val writerModel2 = WriterModel(
            0,
            "Android İle Oyun Programlama",
            "Murat Dikici",
            "Kitap - İnce Kapak",
            "Kodlab",
            "40,00 TL",
            "26,00 TL",
            "%35"

        )

        val writerModel3 = WriterModel(
            0,
            "Android Programlama",
            "Ethem Narman",
            "Kitap - İnce Kapak",
            "Kodlab",
            "50,00 TL",
            "32,00 TL",
            "%35"

        )

        val writerModel4 = WriterModel(
            0,
            "Java İle Android Programlama",
            "Çağlar Artar",
            "Kitap - İnce Kapak",
            "Dikeyeksen",
            "50,00 TL",
            "37,00 TL",
            "%25"

        )

        val writerList: ArrayList<WriterModel> = ArrayList()

        writerList.add(writerModel)
        writerList.add(writerModel2)
        writerList.add(writerModel3)
        writerList.add(writerModel4)



        return writerList
    }
}