package com.example.hearthapp.resources

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.hearthapp.R
import com.example.hearthapp.databinding.ActivityMindSetBinding
import kotlinx.android.synthetic.main.activity_mind_set.*

class MindSetActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMindSetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMindSetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bg = binding.mindset.background as AnimationDrawable
        bg.setEnterFadeDuration(800)
        bg.setExitFadeDuration(1700)
        bg.start()

        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.navigationBarColor = this.resources.getColor(R.color.camel_2)

        val producto = Producto("Self improvement", "What Is Self-Discipline?\n" +
                "Self-discipline is the ability to push yourself forward, stay motivated, and take action, regardless of how you're feeling, physically or emotionally. You're showing it when you intentionally choose to pursue something better for yourself, and you do it in spite of factors such as distractions, hard work, or unfavorable odds.\n" +
                "\n" +
                "Self-discipline is different from self-motivation or willpower. Motivation and willpower contribute to it, as do persistence, the ability to follow through on your intentions, and hard work.\n" +
                "\n" +
                "Why Work on Your Self-Discipline?\n" +
                "Self-discipline is useful in many areas of our lives.\n" +
                "\n" +
                "For instance, it's what pushes you to do high-quality work, even when you don't feel like it. It gives you the strength to stay professional with your clients, even when you're ready to throw in the towel. It helps you to stick with and achieve tough goals that you set for yourself. Self-discipline also enables you to keep going through to great success, despite what others might see as insurmountable odds.\n" +
                "\n" +
                "It can also improve learning and enhance performance. Studies have shown that students with a high degree of self-discipline retain more knowledge than those without self-discipline. Additionally, researchers discovered that students with strong self-discipline are more careful in their tasks, which improves their performance.\n" +
                "\n" +
                "Research has also shown that measuring a person's level of self-discipline is a more accurate predictor of success than measuring their IQ.", R.drawable.hombremetas)

        val producto2 = Producto("How to Develop Self-Discipline", "Self-discipline is like a muscle: the more you work on developing it and using it, the stronger it will become.\n" +
                "\n" +
                "However, it's just as important not to start out with goals that are too ambitious. Instead, set small goals, and increase the level of challenge slowly over time. The more you practice, the better you'll become.\n" +
                "\n" +
                "Follow these five steps to start developing your self-discipline:\n" +
                "\n" +
                "1. Choose a Goal\n" +
                "Begin by choosing just one goal that you want to focus on to develop your self-discipline.\n" +
                "\n" +
                "For instance, perhaps you want to start exercising every evening, or you want to read one leadership book a week to enhance your skills. You could even practice self-discipline on very small goals such as concentrating on a piece of work for an hour without checking your messages, or avoiding unhealthy food for one day.\n" +
                "\n" +
                "Remember, starting small is the best way to start developing your self-discipline. As your discipline gets stronger, you can spread the focus to more areas of your life.\n" +
                "\n" +
                "Make sure that the goal you set is SMART  – Specific, Measurable, Attainable, Relevant, and Time-bound – and break the goal down into smaller sub-goals, where you can.\n" +
                "\n" +
                "2. Find Your Motivation\n" +
                "Once you've chosen a goal, list the reasons why you want to achieve it. Try to express these reasons in a positive way.\n" +
                "\n" +
                "So, instead of saying, \"I want to exercise three times a week to lose weight,\" say \"I want to exercise so that I have the energy to play with my kids and work successfully.\" Or, instead of saying, \"I want to get this task off my To-Do List,\" say, \"I want to do this task, so that I can meet my objectives, get praise from my boss, and feel satisfied with my day's work.\"\n" +
                "\n" +
                "When you list the reasons why you want to achieve something, you'll find it much easier to get the job done.\n" +
                "\n" +
                "3. Identify Obstacles\n" +
                "Now you need to identify the obstacles that you'll likely face when working toward your goal, and devise a strategy for overcoming each one.\n" +
                "\n" +
                "For instance, imagine that your goal is to read one leadership book a week to enhance your skills. In the past, you've faced a number of obstacles in reaching this goal. For example, when you find a book you like, it's hard to find time each night to read. Between work, dinner and the kids, your time is taken up until late in the evening, and you get distracted by messages coming in while you're reading.\n" +
                "\n" +
                "Once you've identified obstacles, come up with a strategy to overcome each one. In this example, you could do the following:\n" +
                "\n" +
                "Instead of going to a bookstore, spend an hour looking at leadership books online. Find several that interest you, and that have good reviews. Order all of them at once, and download them to tablet so that you always have a book on hand to read.\n" +
                "Find more time in your day  to focus on reading. Perhaps you could read during your lunch hour, or while you're waiting to pick your kids up from school.\n" +
                "Turn your phone off when you want to focus on reading.\n" +
                "\n" +
                "Often our self-discipline crumbles because we haven't identified the obstacles that we'll face, and we haven't developed strategies to overcome them. When these obstacles show up, we're unprepared to deal with them, and this shakes our resolve. Don't skip this step!\n" +
                "\n" +
                "4. Replace Old Habits\n" +
                "When we're developing self-discipline, we're often trying to break a bad habit and replace it with something more productive. However, if that habit is tied into a certain time of day or routine, breaking it can leave a hole. If we don't replace that habit with something else, then its absence becomes even more noticeable.\n" +
                "\n" +
                "A good example is if you're trying to stop yourself shopping online when you take a break at work. This bad habit destroys your focus and attention, because you're likely to be online for 20-30 minutes each time.\n" +
                "\n" +
                "Once you've resolved to stop, identify a new behavior that you can engage in when you need a quick break. Instead of online shopping, you could do some stretches in your office, get a cup of coffee, or take a quick walk outside. These behaviors will help to support your goal and strengthen your self-discipline, instead of leaving you with nothing to do on your break.\n" +
                "\n" +
                "5. Monitor Your Progress\n" +
                "As you work on your self-discipline, pay attention to how you're feeling as it develops and strengthens. You might feel free, happy, proud, and energized.\n" +
                "\n" +
                "Also, think about keeping a journal to write down your self-discipline goals and to track your progress. This reinforces the positive changes that you're implementing in your life, and gives you a record that you can look back on to see the progress that you've made.\n" +
                "\n" +
                "Over time, your self-discipline will strengthen, and you'll be able to apply it to lots of other areas of your life.\n" +
                "\n", R.drawable.woman)


        val producto3 = Producto("More Tips for Self-Discipline", "Try to avoid distractions  when you begin to develop your self-discipline. Make it harder to engage in the activity you're trying to avoid.\n" +
                "It's important to reward yourself when you experience success. Celebrating your accomplishments will keep things fun, and strengthen your resolve to keep going.\n" +
                "Don't let a fear of failure  or an occasional setback discourage you. All of us experience setbacks and failures – they're parts of life! Acknowledge that you slipped up, learn the lesson, and move on.\n" +
                "Key Points\n" +
                "It's important to develop self-discipline in life. Self-discipline is what enables us to do high-quality work. It keeps us pursuing our goals through tough times. And it helps us to stay professional, even when we're not feeling great.\n" +
                "\n" +
                "To develop self-discipline, follow these steps:\n" +
                "\n" +
                "Choose a goal.\n" +
                "Find your motivation.\n" +
                "Identify obstacles.\n" +
                "Replace old habits.\n" +
                "Monitor your progress.\n" +
                "Self-discipline is an essential quality, and it's a key differentiator between people who are successful in life and those who aren't.", R.drawable.saltoo)


        val producto4 = Producto("Why Mindset Is Everything: The Key to Success & Happiness", "What Is Mindset?\n" +
                "Before we get too far, let’s get clear around the definition of mindset.  The dictionary definition of mindset is this:\n" +
                "\n" +
                "a way of thinking, and/or\n" +
                "a mental attitude or inclination.\n" +
                "Simply put, your mindset is the combination of your beliefs, thoughts, emotions, assumptions and attitudes.  These aren’t just your conscious thoughts and beliefs, but also what’s in your subconscious.\n" +
                "\n" +
                "Your mindset encompasses how you view yourself, your place in the world, the world around you.  And that means that it determines your decisions, choices and actions, including how you relate to others and deal with stressful situations.\n" +
                "\n" +
                "Your mindset influences (even shapes) your outcomes (which is why mindset is everything).\n" +
                "\n" +
                "It’s important to understand that having a healthy mindset doesn’t guarantee success.  Unfortunately, you don’t control other people or many of your circumstances.  But succeeding in life requires a healthy mindset.\n" +
                "\n" +
                "What Does Success Look Like?\n" +
                "In order to understand why mindset is everything (especially when it comes to your success, fulfillment and happiness), it’s important to understand what success looks like. Because it’s not just about wealth, accomplishments, or external approval. . . it includes being happy.\n" +
                "\n" +
                "The Overachievers’ Dilemma\n" +
                "There’s a vicious cycle that many overachievers fall into.  You work hard to succeed. . . only to find that success doesn’t bring the happiness and fulfillment you imagined.  And so you double down on what you do best (work harder, push more).\n" +
                "\n" +
                "Rinse and repeat.\n" +
                "\n" +
                "Before you know it, you’re on the edge of burnout and craving something more in life (only to feel guilty about that because . . . shouldn’t you feel grateful for all that you have?).\n" +
                "\n" +
                "The problem isn’t just that you’re working too hard, it’s that you’re working to meet the expectations, values and priorities of society and other people. \n" +
                "\n" +
                "This is a unique problem for us overachievers because we’re gold star collectors.  Earning respect from others and being seen as a leader is important – and so we often adopt a definition of success that’s based primarily on what other people want of us.\n" +
                "\n" +
                "How Your Definition Of Success Creates Unhappiness\n" +
                "When working towards a definition of success not entirely your own, it’s easy to push your own priorities aside.  That’s because success brings with it new responsibilities and obligations.  And so something has to give. . . which is usually your own priorities (it’s the easiest thing to push down your list).\n" +
                "\n" +
                "But because your list of obligations continues to grow, before you know it your values and priorities have been pushed aside entirely.  That’s when you end up:\n" +
                "\n" +
                "losing self-confidence,\n" +
                "uncertain about what you want,\n" +
                "questioning your decisions,\n" +
                "feeling bitter (even resentful), and\n" +
                "ruining once strong relationships.\n" +
                "That’s not exactly a formula for a successful, happy life. And it’s why mindset is everything when it comes to succeeding in life. . . because your mindset is the foundation for how you feel about yourself and your place within the world.", R.drawable.bug)

        val producto5 = Producto("How to Make the Most Out of Life: Redefine Success From the Inside-Out", "Here’s the deal. . . success starts from within. It’s not just about achievement or wealth.  You must also feel content in who you are and your decisions.\n" +
                "\n" +
                "Nor is success one-size-fits-all.  Your success definition should be based on your specific strengths, values, needs and priorities.  Because they are what make you uniquely you (and what bring you purpose, meaning and happiness).\n" +
                "\n" +
                "That’s why it’s so important to redefine success in a way that takes all of these things into account.\n" +
                "\n" +
                "Want to know more about how to do that? Listen to my podcast episode about How To Redefine Success From the Inside-Out.\n" +
                "\n" +
                "But note: merely redefining success isn’t enough. You also need to do the work to make what you want a reality. And that all hinges on having a strong, resilient mindset.\n" +
                "\n" +
                "Why Mindset Is Everything For Success and Happiness\n" +
                "Making the most out of life is about two things:\n" +
                "\n" +
                "Feeling content in your life and your decisions (this is how I define happiness).\n" +
                "Overcoming fears and doubts so that you can live your life fully and not have big regrets.\n" +
                "The problem is that going after your BIG goals and dreams requires courage and a strong mind. It’s hard work because you must be willing to get started when you have doubts, push through fears and get back up after failures.\n" +
                "\n" +
                "Plus, you’ll need to stay focused on what’s important and not allow yourself to get pulled off track by bright, shiny objects (which usually happens when things feel hard). The truth is, consistency is a difficult yet necessary component to success.\n" +
                "\n" +
                "That’s why real success requires relentless positivity, a strong sense of determination, and a healthy dose of self-confidence (in fact, confidence and success are linked). Because you’ll absolutely experience failure. And you’ll have to face your fears and doubts head-on.\n" +
                "\n" +
                "The ONLY way to do all of this is by cultivating the right mindset. . . a growth mindset (to be precise). And that is exactly why mindset is everything. It all starts there.\n" +
                "\n" +
                "What Comes First: Success Or Confidence?\n" +
                "When we talk about mindset, it’s clear that self-confidence plays a part (along with self-esteem). You must believe in yourself and your abilities to achieve high levels of success. But what comes first. . . success or confidence?\n" +
                "\n" +
                "It’s true that success breeds new confidence (and can also increase your self-esteem), but the hard truth is that confidence and even self-esteem are primarily created from within. You must build it yourself with proven mindset strategies.\n" +
                "\n" +
                "For more about how to build your self-confidence and self-esteem (and the difference between the two), \n" +
                "\n", R.drawable.uno)
        val producto6 = Producto("How to Make the Most Out Of Life Through a Growth Mindset", "Before I get into how a growth mindset helps, let’s get clear about what I’m talking about.\n" +
                "\n" +
                "A growth mindset is a mentality where you embrace challenges and believe in your ability to learn as you go (and that you’ll learn from failure). It’s the opposite of a fixed mindset, where you worry about failing, looking badly and/or being criticized.\n" +
                "\n" +
                "To be clear, mindset isn’t just about a belief or attitude. It’s much deeper than that because it includes how confident you are in your abilities and the value you place on yourself (also known as self-esteem).\n" +
                "\n" +
                "Here’s how a growth mindset will help you to make the most out of both your career and personal life:\n" +
                "\n" +
                "A Growth Mindset Means Living a ‘Not Yet’ Life (Instead of An ‘I Failed’ Life)\n" +
                "Having a growth mindset allows you to embrace the power of ‘not yet’ because the focus is on learning and growing (as opposed to worrying about looking badly, failing or being criticized).\n" +
                "\n" +
                "That means that your focus isn’t just on (or even mostly about) winning versus losing. Instead it’s about being the best you can be while acknowledging that you can be better. Imagine how this mindset would change how you perceive yourself, your achievements, failures, other people and the world around you.\n" +
                "\n" +
                "A growth mindset is what allows you to be content with yourself and your life. . . even while working to be and live better. It’s why mindset is everything when it comes to living a happy life.\n" +
                "\n" +
                "By adopting a growth mindset of ‘not yet’, you’ll be more likely to start something new (even with doubts and fears about failing), push forward when facing adversity, and not get stuck in setbacks (but instead think more creatively to move forward).\n" +
                "\n" +
                "The Right Mindset Will Increase Your Mental Resilience and Self-Confidence\n" +
                "Having a growth mindset will make you more likely to succeed. Not because you’ll suddenly be able to manifest what you want (sorry, it doesn’t work like that), but because you’ll:\n" +
                "\n" +
                "Be more resilient to stress and setbacks,\n" +
                "Acknowledge your weaknesses, and\n" +
                "Admit what isn’t working.\n" +
                "These are necessary requirements for success. You’re more likely to persist and course correct as needed without getting stuck. This is how failure is turned into fuel (it’s a new challenge to overcome).\n" +
                "A Growth Mindset Creates Stronger Relationships (With Self and Others)\n" +
                "As already mentioned, a growth-oriented mindset allows you to readily admit and deal with weaknesses, failures and mistakes. That makes you more willing to ask for help and delegate when needed (strengthening trust and relationships with others).\n" +
                "\n" +
                "It also means that you have deeper knowledge around what’s most important to you, allowing you to face vulnerable feelings most people shy away from. But there’s more to it than just being self-aware.\n" +
                "\n" +
                "I’ve found (both in myself and within my clients) that as self-awareness deepens, it increases your awareness of others. You start to notice how other people perceive you, which then leads you to notice how you affect other people. And that eventually leads you to become more aware of other people’s emotions (and sometimes their thoughts).\n" +
                "\n" +
                "Over time, your emotional intelligence will increase, making you more attractive to others and increasing your communication and leadership skills. And your relationships will strengthen (both at work and in your personal life).\n" +
                "\n" +
                "Master Your Mind To Make the Most Out of Life\n" +
                "To sum up what you’ve learned:\n" +
                "\n" +
                "Mindset is everything when it comes to both success and happiness. The right mindset will help build a more confident, calm mind that’s ready to take on any challenge while focusing on ‘not yet’ as opposed to ‘I failed’.\n" +
                "Cultivating a growth mindset will help you turn failure (and even fear) into fuel so that you take courageous action and make better decisions for yourself moving forward.\n" +
                "A strong mindset means more awareness – of self and others and an increase in your emotional intelligence.  This will help to strengthen your relationships.", R.drawable.dos)



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
