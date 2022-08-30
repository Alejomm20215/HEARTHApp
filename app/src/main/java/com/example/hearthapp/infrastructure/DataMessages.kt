package com.example.hearthapp.infrastructure

import kotlin.random.Random

data class Phrase(val description: String, val categoryId: Int)

class Mock {

    private val all = MotivationConstants.FILTER.ALL
    private val happy = MotivationConstants.FILTER.HAPPY
    private val sunny = MotivationConstants.FILTER.SUNNY

    private val mListPhrase: List<Phrase> = listOf(
        Phrase("Just one small positive thought in the morning can change your whole day", happy),

        Phrase("Opportunities don't happen, you create them.", happy),

        Phrase("Every worthy act is difficult. Ascent is always difficult. Descent is easy and often slippery." +
                "– Mahatma Gandhi", happy),

        Phrase("Success is the sum of small efforts, repeated day in and day out." +
                " – Robert Collier", happy),

        Phrase("“Life is like riding a bicycle. To keep your balance, you must keep moving." +
                "– Albert Einstein", happy),

        Phrase("When you rise in the morning, think of what a privilege it is to be alive, to think, to enjoy, to love …" +
                " ―Marcus Aurelius", happy),

        Phrase("Sometimes you can only find Heaven by slowly backing away from Hell." +
                " – Carrie Fisher", sunny),

        Phrase("Though no one can go back and make a brand new start, anyone can start from now and make a brand new ending." +
                " – Carl Bard", sunny),

        Phrase("What progress, you ask, have I made? I have begun to be a friend to myself.” " +
                "– Hecato", sunny),

        Phrase("All the suffering, stress, and addiction comes from not realizing you already are what you are looking for. “" +
                "– Jon Kabat-Zinn", sunny),

        Phrase("The most common way people give up their power is by thinking they don’t have any." +
                " – Alice Walker", sunny),

        Phrase("Hardships often prepare ordinary people for an extraordinary destiny." +
                "– C.S. Lewis", sunny),

        Phrase("Today you are You, that is truer than true. There is no one alive who is Youer than You." +
                " – Dr. Seuss", sunny)
    )

    fun getPhrase(value: Int): String {
        val filtered = mListPhrase.filter { it.categoryId == value || value == all}
        return filtered[Random.nextInt(filtered.size)].description
    }
}