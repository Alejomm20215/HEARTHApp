package com.example.hearthapp.resources

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.hearthapp.R
import com.example.hearthapp.databinding.ActivityConcentrationBinding
import kotlinx.android.synthetic.main.activity_concentration.*

class ConcentrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityConcentrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConcentrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Color changing
        val bg = binding.concentration.background as AnimationDrawable
        bg.setEnterFadeDuration(800)
        bg.setExitFadeDuration(1700)
        bg.start()

        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.navigationBarColor = this.resources.getColor(R.color.camel_2)


        val producto = Producto("Concentration – the key to success", "On a daily basis, you have to be focused from morning till night so as not to be late to school or work, to be efficient at the office and to be there for your family and friends. Do you think concentration is a problem for you? Do you often make mistakes? Do people who speak to you think that you don’t listen to them? Do you have trouble finishing what you are doing? If you answer “yes” to at least one of these questions, it means you may be easily distracted. So read on for some tips on how to improve your concentration.\n" +
                "Unfortunately, it is easy to get distracted. At work the temptation to read an email, answer a phone, respond to a tweet or instant message, make a coffee or talk to a friend can interrupt your schedule, force you to move meetings or be late completing your projects. Your brain becomes quickly overworked. Instead of focusing on one task you skip from one to another, becoming less effective and losing concentration.", R.drawable.ni_itoconcentrao)

        val producto2 = Producto("Why the concentration is important in your life", "Here’s what happened: When you got your first smartphone, you probably did some things that made you feel good. Think: reconnecting with a childhood bud, reading a nice text message from a friend, or getting a notification. All of these activities caused the release of dopamine.\n" +
                "What’s dopamine? It’s a neurotransmitter that makes you feel good. Our brains are designed to release dopamine when we do something that meets a survival need, like eating or having sex. Countless studies have shown that phone activity causes the release of dopamine in our brains, making us feel aroused, motivated, and happy\n" +
                "But each time you did something that prompted the release of dopamine, your brain started to notice a pattern. Soon enough, your brain began to associate ‘cell phone’ with ‘dopamine.’ And since your brain naturally craves easy hits of dopamine, it started to crave your phone. \n", R.drawable.dopa)


        val producto3 = Producto("Focus skill", "Focus is so important because it is the gateway to all thinking: perception, memory, learning, reasoning, problem-solving, and decision-making. \n" +
                "\n" +
                "Without good focus, all aspects of your ability to think will suffer... \n" +
                "\n" +
                "Here's a simple reality: \"If you can't focus effectively, you can't think effectively.\"\n" +
                "\n" +
                "Focus can truly change everything.\n" +
                "\n" +
                "As it is said – “Energy flows where the attention goes”. \n" +
                "\n" +
                "When you focus on something, it expands.\n" +
                "\n" +
                "\n" +
                "It is necessary to understand why focus is so important, so you can use it to your advantage.\n" +
                "\n" +
                "“When every physical and mental resource is focused, one’s power to solve a problem multiplies tremendously.”\n" +
                "– Norman Vincent Peale\n" +
                "\n" +
                "“The powers of the mind are like the rays of the sun. When they are concentrated, they illumine.”\n" +
                "– Swami Vivekananda\n" +
                "\n" +
                "A magnifying glass can burn a piece of paper when the rays of the sun are focused through it at one point. The fire could only be ignited, when the sun’s rays were concentrated on a small point.\n" +
                "When the magnifying glass moves too far away, or too close to the paper, the rays of the sun cannot be focused enough, and nothing happens.\n" +
                "\n" +
                "This experience, describes vividly, how the power of concentration works. It is a skill, which enables you to fix your attention on one single thought or activity, while at the same time excluding from your awareness everything else.", R.drawable.file)


        val producto4 = Producto("How to improve your focus", "A balanced diet and physical exercise are important for your ability to stay focused. A healthy diet provides your brain with vitamins and minerals that allow it to function properly. Some B-group vitamins, like B3 (nicotinamide), B9 (folic acid) and B12 can help you boost your focus, concentration and productivity. They can be found in a healthy diet containing foods like:\n" +
                "\n" +
                "egg yolk,\n" +
                "watercress,\n" +
                "certain cheeses,\n" +
                "some fruits and vegetables.\n" +
                "Magnesium is a mineral that also greatly improves the ability to concentrate. Magnesium-rich foods include:\n" +
                "\n" +
                "whole wheat,\n" +
                "spinach,\n" +
                "dark chocolate,\n" +
                "mussels,\n" +
                "beans,\n" +
                "nuts,\n" +
                "lentils.\n" +
                "You can also boost your concentration by doing some simple exercises. Try doing them at home or at work and watch how your concentration levels go up.\n" +
                "\n" +
                "1. For this exercise, you need to sit on a chair with your back straight and shoulders relaxed. Then close your eyes and focus on your breathing. When it slows down you will be able to feel yourself relaxing. Now you need to think of an object (it can be anything) and try to concentrate on it. Try to describe it as best as possible, view it from different angles and discover its characteristics. Then let the object go and focus on your body, stretch and open your eyes.\n" +
                "\n" +
                "2. This exercise will help you improve your concentration at work. You should choose a task that you find difficult. First, you have to set a time frame for completing this task. This will make you work more efficiently. Second, you should make a list of all things that distract you and find a way of excluding them. Then, sort out the tasks you still have to do and set yourself the goal of completing one task a day. That way your mind won’t be cluttered with unnecessary thoughts.\n" +
                "\n" +
                "In some situations, you may need a vitamin and mineral supplement but note that these are not a substitute to a varied and balanced diet and a healthy lifestyle. Both are essential if you want to boost your focus. Below you can find more tips that can help you improve your concentration.\n" +
                "\n" +
                "- Brain training: did you know that playing certain types of games can help you get better at concentrating? You can try playing sudoku, chess, memory and word games as well as crosswords or jigsaw puzzles. All of these activities not only improve concentration over time, but can also help you develop your working and short-term memory as well as problem-solving skills.\n" +
                "\n" +
                "- Getting quality sleep: Insufficient amounts of sleep impede your concentration. While it’s OK to not get enough sleep from time to time, constant sleep deprivation will leave you unable to focus and negatively affect your mood and overall performance. To improve your sleep, you can try turning off any screens about an hour before bedtime, keeping your bedroom cool, relaxing with a good book or a warm bath and exercising regularly. It’s also advisable to try to go to sleep and get up at around the same time every day to maintain a regular schedule.\n" +
                "\n" +
                "- Spending time in nature. There’s a reason why having plants in your workspace helps increase concentration: your brain has a tendency to relax in a natural environment. That’s why it’s good to try and find time for a short walk in a park, bush, or along the coast every day. Even sitting in your backyard or garden can help you wind down, so try to reserve 15 to 20 minutes in your daily schedule just to be in nature.", R.drawable.senior)

        val producto5 = Producto("These are the reasons why focus is relevant in your life.", "1. IT HELPS YOU CHANGE YOUR LIFE. \n" +
                "\n" +
                "Focus can change your life dramatically. When you focus on your life to make it better, it will start to get better eventually.\n" +
                "\n" +
                "As it is said – “The secret of change is to focus all your energy not fighting the old, but building the new”.\n" +
                "\n" +
                "Life changes when you decide to change it. You need to start working on change. The more you focus in life, the better your life will be.\n" +
                "\n" +
                "\n" +
                "\n" +
                "2. IT GIVES YOU MORE OPPORTUNITIES. \n" +
                "\n" +
                "Focus will help you to discover the path that you don’t even know exist. We become so blind with our problems in life that we forget to focus on possibilities.\n" +
                "\n" +
                "As it is said – “WHEN YOU FOCUS ON PROBLEMS, YOU WILL HAVE MORE PROBLEMS. WHEN YOU FOCUS ON POSSIBILITIES, YOU WILL HAVE MORE OPPORTUNITIES”.\n" +
                "\n" +
                "\n" +
                "So, you need to start looking for possibilities in your life and you will open new doors to new opportunities.\n" +
                "\n" +
                "Don’t listen to other people. Just remember that focus is important in your life in order to embrace the opportunity around you.\n" +
                "\n" +
                "\n" +
                "\n" +
                "3. FOCUS EXPANDS YOUR KNOWLEDGE.\n" +
                "\n" +
                "Focus will help you to expand your intelligence and knowledge. When you start to focus on learning, your knowledge will expand eventually.\n" +
                "\n" +
                "Focus on learning new things everyday. Make learning a priority in your life. However, there are going to be distraction around you, but you need to focus anyways.\n" +
                "\n" +
                "When you focus on expanding your knowledge, your life will automatically expand.\n" +
                "\n" +
                "\n" +
                "\n" +
                "4. IT HELPS YOU BECOME MORE PRODUCTIVE AT WORK.\n" +
                "\n" +
                "Distraction will always knock your doors. It is your choice, what you choose between focus vs distraction. Focus will help you to become more productive at your work.\n" +
                "\n" +
                "It will help you to bring your attention towards a particular task as a primary objective. Everything else is secondary.\n" +
                "\n" +
                "Focus on being productive, however, most people never focus on being productive. Instead they focus on being busy.\n" +
                "\n" +
                "Focus is important in your life in order to become highly productive at work and get the work done efficiently.\n" +
                "\n" +
                "\n" +
                "\n" +
                "5. IT HELPS YOU ACHIEVE YOUR GOALS.\n" +
                "\n" +
                "Your focus will determine the level of achievements you get in life. When you bring your focus to achieve something in life, you will reach your goals. Otherwise you will end up wasting your time and energy on useless things.\n" +
                "\n" +
                "Life is like a camera, focus on what is important and capture it.\n" +
                "\n" +
                "If you want to reach your targets, bring your focus to the goals and keep working until you achieve it.\n" +
                "\n" +
                "\n" +
                "\n" +
                "6. FOCUS  HELPS YOU BECOME  SUCCESSFUL FASTER.\n" +
                "\n" +
                "When you are focused, no one can stop you to achieve the success. Successful people are focused on their mission. They work on their goals every single day. This helps them achieve success faster than anyone.\n" +
                "\n" +
                "However, most people try something but never stay consistent. It becomes their road block.\n" +
                "\n" +
                "Focus is important in your life to achieve the success you desire.\n" +
                "\n" +
                "Successful people never let distractions come in their way.\n" +
                "\n" +
                "Here is how to be successful faster than anyone .\n" +
                "\n" +
                "\n" +
                "\n" +
                "Conclusion\n" +
                "\n" +
                "Focus can change your life if used correctly. Successful people knows the importance of focus in life. Your focus will determine the level of success you achieve.\n" +
                "\n" +
                "When your focus is aligned with your actions, it will produce great results.", R.drawable.bombo)
        val producto6 = Producto("What is cognifit and why should you start practicing it?", "Cognifit is a cognitive stimulation method designed by a team of neurologists and cognitive psychologists who study the processes of synaptic plasticity and neurogenesis (representing the brain's ability to recover, restructure and form new neural connections between its left and right sides).\n" +
                "15 minutes of exercise a day at least 2 or 3 times a week will be enough to stimulate the cognitive abilities and processes that allow us to keep our brain healthy and learn any new activity faster. To start practicing we will share with you 3 easy Cognifit exercises. Take note!\n" +
                "\n" +
                " \n" +
                "Become ambidextrous\n" +
                "\n" +
                "Start by practicing with your non-dominant hand, according to some studies the left hemisphere of the brain will be linked to the right hand and vice versa, thus balancing brain activity and improving your performance. You can lift light weights, write sticks and balls on paper until you can write complete sentences, or brush your teeth with the opposite hand to the one you normally use.\n" +
                "\n" +
                "\n" +
                "learn a new language\n" +
                "\n" +
                "Northwestern and Houston universities did a study on how a bilingual brain worked and found that those who speak several languages \u200B\u200Bhave a greater capacity for concentration and memorization. It also helps prevent Alzheimer's or senile dementia when you get older and allows you to connect with other people, cultures, and experiences.\n" +
                "\n" +
                "\n" +
                "Get out of the rut\n" +
                "\n" +
                "Losing order in some of your usual activities is as simple as moving things around to challenge your brain to scan over a wider field of vision as well as acquire new skills (that test your reflexes and your hand-and-eye coordination). eyes stimulate your brain to strengthen the connections between brain cells) both work as an anti-aging method for your mental health, in addition to reducing stress and anxiety.", R.drawable.cerebron)



        val listaProductos = listOf(producto, producto2, producto3, producto4, producto5, producto6)

        val adapter = ProductosAdapter(this, listaProductos)

        lista.adapter = adapter

        lista.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent( this, ProductoActivity::class.java)
            intent.putExtra("producto", listaProductos[position])
            startActivity(intent)
        }
    }
}