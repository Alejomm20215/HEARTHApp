package com.example.hearthapp.chatbot

import com.example.hearthapp.chatbot.Constants.OPEN_GOOGLE
import com.example.hearthapp.chatbot.Constants.OPEN_SEARCH
import java.sql.Date
import java.sql.Timestamp
import java.text.SimpleDateFormat

object BotResponse {

    fun basicResponses(_message: String): String {

        val random = (0..2).random()
        val message =_message.toLowerCase()

        return when {

            //Flips a coin
            message.contains("flip") && message.contains("coin") -> {
                val r = (0..1).random()
                val result = if (r == 0) "heads" else "tails"

                "I flipped a coin and it landed on $result"
            }

            //Math calculations
            message.contains("solve") -> {
                val equation: String? = message.substringAfterLast("solve")
                return try {
                    val answer = SolveMath.solveMath(equation ?: "0")
                    "$answer"

                } catch (e: Exception) {
                    "Sorry, I can't solve that."
                }
            }

            //Hello
            message.contains("hello") -> {
                when (random) {
                    0 -> "Hello there!"
                    1 -> "... Need something?"
                    2 -> "Hello!"
                    3 -> "HI!"
                    else -> "error" }
            }

            //How are you?
            message.contains("how are you") -> {
                when (random) {
                    0 -> "I'm doing fine, thanks! Can I help you"
                    1 -> "I'm hungry...Do you need something?!"
                    2 -> "Pretty good! How about you?"
                    3 -> "EXTREMELY GOOD! HOW CAN I HELP YOU?"
                    else -> "error"
                }
            }
            message.contains("functionality") -> {
                when (random) {
                    0 -> "Enhances your mental skills and gives you superpowers!!!"
                    1 -> "Gives you tasks, creative and useful tasks"
                    2 -> "It helps you with tons of things! specifically with your brain"
                    3 -> "GIVES YOU ALL MY CHARISMA, AND BORED THINGS ABOUT BRAIN..."
                    else -> "error"
                }
            }
            message.contains("Tell me about this app")->{
                when (random) {
                    0 -> "This H.E.A.R.T.H. An amazing app that tries to help you enhance your brain skills!"
                    1 -> "This is Hyper-reticulated Educational and Alternative Resource To be Healthy, and I am your... friend"
                    2 -> "You are in H.E.A.R.T.H, I do not want to say what that acronym says, but it's just beautiful!"
                    3 -> "YOU ARE IN THE 'IMPROVEMENT' HOUSE!!!"

                    else -> "error"
                }
            }

            //What time is it?
            message.contains("time") && message.contains("?")-> {
                val timeStamp = Timestamp(System.currentTimeMillis())
                val sdf = SimpleDateFormat("dd/MM/yyyy HH:mm")
                val date = sdf.format(Date(timeStamp.time))

                date.toString()
            }

            //Open Google
            message.contains("open") && message.contains("google")-> {
                OPEN_GOOGLE
            }

            //Search on the internet
            message.contains("search")-> {
                OPEN_SEARCH
            }

            //When the programme doesn't understand...
            else -> {
                when (random) {
                    0 -> "I don't understand..."
                    1 -> "Try asking me something different"
                    2 -> "Idk"
                    else -> "error"
                }
            }
        }
    }
}
