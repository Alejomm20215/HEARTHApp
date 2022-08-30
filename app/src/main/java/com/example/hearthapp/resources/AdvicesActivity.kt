package com.example.hearthapp.resources

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.hearthapp.R
import com.example.hearthapp.databinding.ActivityAdvicesBinding
import kotlinx.android.synthetic.main.activity_resources_main.*

class AdvicesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAdvicesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdvicesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bg = binding.advices.background as AnimationDrawable
        bg.setEnterFadeDuration(800)
        bg.setExitFadeDuration(1700)
        bg.start()

        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.navigationBarColor = this.resources.getColor(R.color.camel_2)


        val producto = Producto("Smartphone or Internet addiction can also negatively impact your life ", "Increasing loneliness and depression. While it may seem that losing yourself online will temporarily make feelings such as loneliness, depression, and boredom evaporate into thin air, it can actually make you feel even worse. A 2014 study found a correlation between high social media usage and depression and anxiety. Users, especially teens, tend to compare themselves unfavorably with their peers on social media, promoting feelings of loneliness and depression.\n" +
                "\n" +
                "Fueling anxiety. One researcher found that the mere presence of a phone in a work place tends to make people more anxious and perform poorly on given tasks. The heavier a person’s phone use, the greater the anxiety they experienced.\n" +
                "\n" +
                "Increasing stress. Using a smartphone for work often means work bleeds into your home and personal life. You feel the pressure to always be on, never out of touch from work. This need to continually check and respond to email can contribute to higher stress levels and even burnout.\n" +
                "\n" +
                "Exacerbating attention deficit disorders. The constant stream of messages and information from a smartphone can overwhelm the brain and make it impossible to focus attention on any one thing for more than a few minutes without feeling compelled to move on to something else.\n" +
                "\n" +
                "Diminishing your ability to concentrate and think deeply or creatively. The persistent buzz, ping or beep of your smartphone can distract you from important tasks, slow your work, and interrupt those quiet moments that are so crucial to creativity and problem solving. Instead of ever being alone with our thoughts, we’re now always online and connected.\n" +
                "\n" +
                "Disturbing your sleep. Excessive smartphone use can disrupt your sleep, which can have a serious impact on your overall mental health. It can impact your memory, affect your ability to think clearly, and reduce your cognitive and learning skills.\n" +
                "\n" +
                "Encouraging self-absorption. A UK study found that people who spend a lot of time on social media are more likely to display negative personality traits such as narcissism. Snapping endless selfies, posting all your thoughts or details about your life can create an unhealthy self-centeredness, distancing you from real-life relationships and making it harder to cope with stress.", R.drawable.depre)

        val producto2 = Producto("Signs and symptoms of smartphone addiction", "There is no specific amount of time spent on your phone, or the frequency you check for updates, or the number of messages you send or receive that indicates an addiction or overuse problem.\n" +
                "\n" +
                "Spending a lot of time connected to your phone only becomes a problem when it absorbs so much of your time it causes you to neglect your face-to-face relationships, your work, school, hobbies, or other important things in your life. If you find yourself ignoring friends over lunch to read Facebook updates or compulsively checking your phone in while driving or during school lectures, then it’s time to reassess your smartphone use and strike a healthier balance in your life.\n" +
                "\n" +
                "Warning signs of smartphone or Internet overuse include:\n" +
                "Trouble completing tasks at work or home. Do you find laundry piling up and little food in the house for dinner because you’ve been busy chatting online, texting, or playing video games? Perhaps you find yourself working late more often because you can’t complete your work on time.\n" +
                "\n" +
                "Isolation from family and friends. Is your social life suffering because of all the time you spend on your phone or other device? If you’re in a meeting or chatting with friends, do you lose track of what’s being said because you’re checking your phone? Have friends and family expressed concern about the amount of time you spend on your phone? Do you feel like no one in your “real” life—even your spouse—understands you like your online friends?\n" +
                "\n" +
                "Concealing your smartphone use. Do you sneak off to a quiet place to use your phone? Do you hide your smartphone use or lie to your boss and family about the amount of time you spend online? Do you get irritated or cranky if your online time is interrupted?\n" +
                "\n" +
                "Having a “fear of missing out” (or FOMO). Do you hate to feel out of the loop or think you’re missing out on important news or information if you don’t check you phone regularly? Do you need to compulsively check social media because you’re anxious that others are having a better time, or leading a more exciting life than you? Do you get up at night to check your phone?\n" +
                "\n" +
                "Feeling of dread, anxiety, or panic if you leave your smartphone at home, the battery runs down or the operating system crashes. Or do you feel phantom vibrations—you think your phone has vibrated but when you check, there are no new messages or updates?\n" +
                "\n" +
                "Withdrawal symptoms from smartphone addiction\n" +
                "A common warning sign of smartphone or Internet addiction is experiencing withdrawal symptoms when you try to cut back on your smartphone use. These may include:\n" +
                "\n" +
                "Restlessness\n" +
                "Anger or irritability\n" +
                "Difficulty concentrating\n" +
                "Sleep problems\n" +
                "Craving access to your smartphone or other device", R.drawable.jaula)


        val producto3 = Producto("Self-help tips for smartphone addiction", "There are a number of steps you can take to get your smartphone and Internet use under control. While you can initiate many of these measures yourself, an addiction is hard to beat on your own, especially when temptation is always within easy reach. It can be all too easy to slip back into old patterns of usage. Look for outside support, whether it’s from family, friends, or a professional therapist.\n" +
                "\n" +
                "To help you identify your problem areas, keep a log of when and how much you use your smartphone for non-work or non-essential activities. There are specific apps that can help with this, enabling you to track the time you spend on your phone. Are there times of day that you use your phone more? Are there other things you could be doing instead? The more you understand your smartphone use, the easier it will be to curb your habits and regain control of your time.\n" +
                "\n" +
                "Recognize the triggers that make you reach for your phone. Is it when you’re lonely or bored? If you are struggling with depression, stress, or anxiety, for example, your excessive smartphone use might be a way to self-soothe rocky moods. Instead, find healthier and more effective ways of managing your moods, such as practicing relaxation techniques.\n" +
                "\n" +
                "Understand the difference between interacting in-person and online. Human beings are social creatures. We’re not meant to be isolated or to rely on technology for human interaction. Socially interacting with another person face-to-face—making eye contact, responding to body language—can make you feel calm, safe, and understood, and quickly put the brakes on stress. Interacting through text, email or messaging bypasses these nonverbal cues so won’t have the same effect on your emotional well-being. Besides, online friends can’t hug you when a crisis hits, visit you when you’re sick, or celebrate a happy occasion with you.\n" +
                "\n" +
                "Build your coping skills. Perhaps tweeting, texting or blogging is your way of coping with stress or anger. Or maybe you have trouble relating to others and find it easier to communicate with people online. Building skills in these areas will help you weather the stresses and strains of daily life without relying on your smartphone.\n" +
                "\n" +
                "Recognize any underlying problems that may support your compulsive behavior. Have you had problems with alcohol or drugs in the past? Does anything about your smartphone use remind you of how you used to drink or use drugs to numb or distract yourself?\n" +
                "\n" +
                "Strengthen your support network. Set aside dedicated time each week for friends and family. If you are shy, there are ways to overcome social awkwardness and make lasting friends without relying on social media or the Internet. To find people with similar interests, try reaching out to colleagues at work, joining a sports team or book club, enrolling in an education class, or volunteering for a good cause. You’ll be able to interact with others like you, let relationships develop naturally, and form friendships that will enhance your life and strengthen your health.", R.drawable.amorsito)


        val producto4 = Producto("Modify your smartphone use, step-by-step", "For most people, getting control over their smartphone and Internet use isn’t a case of quitting cold turkey. Think of it more like going on a diet. Just as you still need to eat, you probably still need to use your phone for work, school, or to stay in touch with friends. Your goal should be to cut back to more healthy levels of use.\n" +
                "\n" +
                "Set goals for when you can use your smartphone. For example, you might schedule use for certain times of day, or you could reward yourself with a certain amount of time on your phone once you’ve completed a homework assignment or finished a chore, for instance.\n" +
                "Turn off your phone at certain times of the day, such as when you’re driving, in a meeting, at the gym, having dinner, or playing with your kids. Don’t take your phone with you to the bathroom.\n" +
                "Don’t bring your phone or tablet to bed. The blue light emitted by the screens can disrupt your sleep if used within two hours of bedtime. Turn devices off and leave them in another room overnight to charge. Instead of reading eBooks on your phone or tablet at night, pick up a book. You’ll not only sleep better but research shows you’ll also remember more of what you’ve read.\n" +
                "Replace your smartphone use with healthier activities. If you are bored and lonely, resisting the urge to use your smartphone can be very difficult. Have a plan for other ways to fill the time, such as meditating, reading a book, or chatting with friends in person.\n" +
                "Play the “phone stack” game. Spending time with other smartphone addicts? Play the “phone stack” game. When you’re having lunch, dinner, or drinks together, have everyone place their smartphones face down on the table. Even as the phones buzz and beep, no one is allowed to grab their device. If someone can’t resist checking their phone, that person has to pick up the check for everyone.\n" +
                "Remove social media apps from your phone so you can only check Facebook, Twitter and the like from your computer. And remember: what you see of others on social media is rarely an accurate reflection of their lives—people exaggerate the positive aspects of their lives, brushing over the doubts and disappointments that we all experience. Spending less time comparing yourself unfavorably to these stylized representations can help to boost your mood and sense of self-worth.\n" +
                "Limit checks. If you compulsively check your phone every few minutes, wean yourself off by limiting your checks to once every 15 minutes. Then once every 30 minutes, then once an hour. If you need help, there are apps that can automatically limit when you’re able to access your phone.\n" +
                "Curb your fear of missing out. Accept that by limiting your smartphone use, you’re likely going to miss out on certain invitations, breaking news, or new gossip. There is so much information available on the Internet, it’s almost impossible to stay on top of everything, anyway. Accepting this can be liberating and help break your reliance on technology.", R.drawable.controldetimepo)

        val producto5 = Producto("Treatment for smartphone and Internet addiction", "If you need more help to curb your smartphone or Internet use, there are now specialist treatment centers that offer digital detox programs to help you disconnect from digital media. Individual and group therapy can also give you a tremendous boost in controlling your technology use.\n" +
                "\n" +
                "Cognitive-behavioral therapy provides step-by-step ways to stop compulsive behaviors and change your perceptions about your smartphone and the Internet. Therapy can also help you learn healthier ways of coping with uncomfortable emotions—such as stress, anxiety, or depression—that may be fueling your smartphone use.\n" +
                "\n" +
                "Marriage or couples counseling. If excessive use of Internet pornography or online affairs is affecting your relationship, counseling can help you work through these challenging issues and reconnect with your partner.\n" +
                "\n" +
                "Group support. Organizations such as Internet Tech Addiction Anonymous (ITAA) and On-Line Gamers Anonymous offer online support and face-to-face meetings to curb excessive technology use. Of course, you need real-life people to benefit fully from any addiction support group. Online support groups can be helpful in finding sources of assistance, but it’s easy to use them as an excuse to spend even more time on your smartphone. Sex Addicts Anonymous can be a place to try if you’re having trouble with cybersex addiction.", R.drawable.grupito)
        val producto6 = Producto("Helping a child or teen with smartphone addiction", "Any parent who’s tried to drag a child or teen away from a smartphone or tablet knows how challenging it can be to separate kids from social media, messaging apps, or online games and videos. Youngsters lack the maturity to curb their smartphone use on their own, but simply confiscating the device can often backfire, creating anxiety and withdrawal symptoms in your child. Instead, there are plenty of other ways to help your child find a healthier balance:\n" +
                "\n" +
                "Be a good role model. Children have a strong impulse to imitate, so it’s important you manage your own smartphone and Internet use. It’s no good asking your child to unplug at the dinner table while you’re staring at your own phone or tablet. Don’t let your own smartphone use distract from parent-child interactions.\n" +
                "\n" +
                "Use apps to monitor and limit your child’s smartphone use. There are a number of apps available that can limit your child’s data usage or restrict texting and web browsing to certain times of the day. Other apps can eliminate messaging capabilities while in motion, so you can prevent your teen using a smartphone while driving.\n" +
                "\n" +
                "Create “phone-free” zones. Restrict the use of smartphones or tablets to a common area of the house where you can keep an eye on your child’s activity and limit time online. Ban phones from the dinner table and bedrooms and insist they’re turned off after a certain time at night.\n" +
                "\n" +
                "Encourage other interests and social activities. Get your child away from screens by exposing them to other hobbies and activities, such as team sports, Scouts, and after-school clubs. Spend time as a family unplugged.\n" +
                "\n" +
                "Talk to your child about underlying issues. Compulsive smartphone use can be the sign of deeper problems. Is your child having problems fitting in? Has there been a recent major change, like a move or divorce, which is causing stress? Is your child suffering with other issues at school or home?\n" +
                "\n" +
                "Get help. Teenagers often rebel against their parents, but if they hear the same information from a different authority figure, they may be more inclined to listen. Try a sports coach, doctor, or respected family friend. Don’t be afraid to seek professional counseling if you are concerned about your child’s smartphone use.", R.drawable.paternidad)



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
