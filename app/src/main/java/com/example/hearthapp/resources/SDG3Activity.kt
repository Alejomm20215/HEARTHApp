package com.example.hearthapp.resources

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.hearthapp.R
import com.example.hearthapp.databinding.ActivityBnefitsBinding
import kotlinx.android.synthetic.main.activity_bnefits.*

class SDG3Activity : AppCompatActivity() {

    private lateinit var binding: ActivityBnefitsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBnefitsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bg = binding.benefits.background as AnimationDrawable
        bg.setEnterFadeDuration(800)
        bg.setExitFadeDuration(1700)
        bg.start()
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.navigationBarColor = this.resources.getColor(R.color.camel_2)



        val producto = Producto("Sustainable Development Goal 3: Good health and well-being", "THE TARGETS\n" +
                "Everyone can help to make sure that we meet the Global Goals. Use these thirteen targets to create action to promote health and well-being for all.\n" +
                "\n" +
                "TARGET 3.1\n" +
                "\n" +
                "REDUCE MATERNAL MORTALITY\n" +
                "By 2030, reduce the global maternal mortality ratio to less than 70 per 100,000 live births.\n" +
                "\n" +
                "TARGET 3.2\n" +
                "\n" +
                "END ALL PREVENTABLE DEATHS UNDER 5 YEARS OF AGE\n" +
                "By 2030, end preventable deaths of newborns and children under 5 years of age, with all countries aiming to reduce neonatal mortality to at least as low as 12 per 1,000 live births and under‑5 mortality to at least as low as 25 per 1,000 live births.\n" +
                "\n" +
                "TARGET 3.3\n" +
                "\n" +
                "FIGHT COMMUNICABLE DISEASES\n" +
                "By 2030, end the epidemics of AIDS, tuberculosis, malaria and neglected tropical diseases and combat hepatitis, water-borne diseases and other communicable diseases.\n" +
                "\n" +
                "TARGET 3.4\n" +
                "\n" +
                "REDUCE MORTALITY FROM NON-COMMUNICABLE DISEASES AND PROMOTE MENTAL HEALTH\n" +
                "By 2030, reduce by one third premature mortality from non-communicable diseases through prevention and treatment and promote mental health and well-being.\n" +
                "\n" +
                "TARGET 3.5\n" +
                "\n" +
                "PREVENT AND TREAT SUBSTANCE ABUSE\n" +
                "Strengthen the prevention and treatment of substance abuse, including narcotic drug abuse and harmful use of alcohol.\n" +
                "\n" +
                "TARGET 3.6\n" +
                "\n" +
                "REDUCE ROAD INJURIES AND DEATHS\n" +
                "By 2020, halve the number of global deaths and injuries from road traffic accidents.\n" +
                "\n" +
                "TARGET 3.7\n" +
                "\n" +
                "UNIVERSAL ACCESS TO SEXUAL AND REPRODUCTIVE CARE, FAMILY PLANNING AND EDUCATION\n" +
                "By 2030, ensure universal access to sexual and reproductive health-care services, including for family planning, information and education, and the integration of reproductive health into national strategies and programmes.\n" +
                "\n" +
                "TARGET 3.8\n" +
                "\n" +
                "ACHIEVE UNIVERSAL HEALTH COVERAGE\n" +
                "Achieve universal health coverage, including financial risk protection, access to quality essential health-care services and access to safe, effective, quality and affordable essential medicines and vaccines for all.\n" +
                "\n" +
                "TARGET 3.9\n" +
                "\n" +
                "REDUCE ILLNESSES AND DEATH FROM HAZARDOUS CHEMICALS AND POLLUTION\n" +
                "By 2030, substantially reduce the number of deaths and illnesses from hazardous chemicals and air, water and soil pollution and contamination.\n" +
                "\n" +
                "TARGET 3.A\n" +
                "\n" +
                "IMPLEMENT THE WHO FRAMEWORK CONVENTION ON TOBACCO CONTROL\n" +
                "Strengthen the implementation of the World Health Organization Framework Convention on Tobacco Control in all countries, as appropriate.\n" +
                "\n" +
                "TARGET 3.B\n" +
                "\n" +
                "SUPPORT RESEARCH, DEVELOPMENT AND UNIVERSAL ACCESS TO AFFORDABLE VACCINES AND MEDICINES\n" +
                "Support the research and development of vaccines and medicines for the communicable and non-communicable diseases that primarily affect developing countries, provide access to affordable essential medicines and vaccines, in accordance with the Doha Declaration on the TRIPS Agreement and Public Health, which affirms the right of developing countries to use to the full the provisions in the Agreement on Trade-Related Aspects of Intellectual Property Rights regarding flexibilities to protect public health, and, in particular, provide access to medicines for all.\n" +
                "\n" +
                "TARGET 3.C\n" +
                "\n" +
                "INCREASE HEALTH FINANCING AND SUPPORT HEALTH WORKFORCE IN DEVELOPING COUNTRIES\n" +
                "Substantially increase health financing and the recruitment, development, training and retention of the health workforce in developing countries, especially in least developed countries and small island developing States.\n" +
                "\n" +
                "TARGET 3.D\n" +
                "\n" +
                "IMPROVE EARLY WARNING SYSTEMS FOR GLOBAL HEALTH RISKS\n" +
                "Strengthen the capacity of all countries, in particular developing countries, for early warning, risk reduction and management of national and global health risks.", R.drawable.nueve)

        val producto2 = Producto("What is well-being and why should I care?", "Wellbeing seems to be a catch cry for all sorts of health and social programs – but what does it actually mean and why should you care about it?\n" +
                "\n" +
                "Aristotle considered the idea of Eudaimonia1 – humans flourishing and living well, as imperative to the human condition. More contemporary definitions of wellbeing can be found in the Oxford Dictionary2, where wellbeing is defined as the state of being comfortable, healthy, and happy.\n" +
                "\n" +
                "The more appropriate definition can be debated for millennia (and has been) however, the modern definition does seem to be a bit narrow. Happiness is integral to our wellbeing, but as wellbeing is a multi-dimensional concept, the same can be said for the fulfilment of goals and a sense of meaning.\n" +
                "\n" +
                "Wellbeing is subjective. It will be different for everyone on the planet and is based entirely on our thoughts, feelings, behaviours and body. Past experiences, our attitudes, our outlook, and our choices all impact our sense of wellbeing.3\n" +
                "\n" +
                "But why is wellbeing important?\n" +
                "Wellbeing is fundamental to our health and overall happiness.\n" +
                "\n" +
                "Having a strong and well-adapted sense of wellbeing can help us overcome difficulties and help us achieve our goals in life3. Research has shown that a greater sense of wellbeing relates to increased physical benefits, such as lower incidences of cardiovascular disease, stroke and sleeping problems, and with increased productivity and creativeness in both employment and personal lives4.\n" +
                "\n" +
                "In short, having high levels of wellbeing helps us to be the best versions of ourselves.\n" +
                "\n" +
                "How do I increase my wellbeing?\n" +
                "Wellbeing is holistic – we must look after all the aspects of our lives if we wish to increase our wellbeing.\n" +
                "\n" +
                "Enhancing your wellbeing isn’t always easy, but it is always worth it.\n" +
                "\n" +
                "Eating a healthy balanced diet, getting enough sleep and exercise, and creating healthy habits to look after your physical health are some of the easiest ways to help develop your sense of wellbeing (although, this is often easier said than done).\n" +
                "\n" +
                "Martin Seligman’s PERMA theoretic model of happiness5 helps us to understand the elements that contribute to our happiness, and in turn, our wellbeing. By breaking down the broad concept into smaller, more manageable aspects, we can identify how we are tracking with our wellbeing and where there might be room for improvement.\n" +
                "\n" +
                "P – Positive emotion\n" +
                "Positivity is more than just smiling. We need to have a positive and optimistic outlook on life, which can help us deal with any difficulties we might have. Having a silver lining approach to your day can help you overcome difficulties and remain optimistic in challenging times.\n" +
                "\n" +
                "Ask yourself:\n" +
                "\n" +
                "What was one good thing to come out of today?\n" +
                "What was one thing that gave me pleasure (satisfying a bodily need) and enjoyment (intellectual or creative stimulation) today?\n" +
                "What am I optimistic for tomorrow?\n" +
                "E – Engagement\n" +
                "Partaking in an activity that fully captures our engagement helps us to be “in the moment” and enables time to “fly by”. These types of activities flood our brains with happy hormones and neurotransmitters and help to enhance our intelligence, skill and emotional capabilities.\n" +
                "\n" +
                "Ask yourself:\n" +
                "\n" +
                "What is one thing I did today that truly absorbed my attention and gave me true joy?\n" +
                "What is one thing I did today that was just for me and my engagement in life?\n" +
                "What is one thing I will do tomorrow that will completely immerse my attention and let time “fly by”?\n" +
                "R – Relationships\n" +
                "Humans are social animals who need connection with others. Isolation can be detrimental to us physically and emotionally. Positive relationships with other people can bring us great joy, a sense of safety and value, and can provide support when times get difficult.\n" +
                "\n" +
                "Ask yourself:\n" +
                "\n" +
                "Have I truly connected with someone today?\n" +
                "Did I take part in a positive interaction with one of my relationships today?\n" +
                "Who is someone I can reach out to tomorrow who I haven’t spoken to in a while?\n" +
                "M – Meaning\n" +
                "Having meaning and purpose in life is key to driving us towards fulfilment. It doesn’t matter where we derive this sense of meaning from; you might derive it from your position in your family, or what you do for work, or from your connection with your religion and spirituality. Understanding what you do and how it impacts yourself and the wider world can help you clarify your purpose in life.\n" +
                "\n" +
                "Ask yourself:\n" +
                "\n" +
                "Did I do something that gave me a sense of fulfilment today?\n" +
                "Did I contribute to my family, community, workplace, religion (or place of choice) in a meaningful way?\n" +
                "What is something I can do tomorrow that I am passionate about?\n" +
                "A – Accomplishments\n" +
                "Having realistic goals that can be achieved helps to give us a sense of accomplishment and something to look forward to. Chipping away at these goals will give you a sense of satisfaction, and when you finally achieve the end goal a sense of pride and fulfilment will be reached.\n" +
                "\n" +
                "Ask yourself:\n" +
                "\n" +
                "Did I work towards any of my long-term goals today?\n" +
                "Was there something I accomplished today that brought me pride, fulfilment or satisfaction?\n" +
                "How can I work towards my long-term goals tomorrow?\n" +
                "What’s next?\n" +
                "Increasing your wellbeing isn’t an easy thing to do, but it is well worth it in the long run. Looking at these five areas, is there any area you think you might need to work on? Acknowledging an area that needs a bit of work is the first step to increasing your wellbeing. Keep the PERMA model in the back of your mind and try to integrate as many of the aspects into your day-to-day life as possible. Remember, your wellbeing is about YOU!", R.drawable.diez)


        val producto3 = Producto("Life after addiction: What to expect", "Recovery from addiction is a lifelong process. You are finally free from the control that drugs or alcohol have had on your life, and now you must direct your energies toward your life after addiction. What to expect in that life depends on a number of steps you can take to make a positive difference moving forward. Use what you’ve learned in treatment to focus on a constructive life after addiction.\n" +
                "\n" +
                "Treatment is Not a Cure\n" +
                "Addiction is a chronic disease. Like other such diseases, you can get treatment but there usually isn’t a real cure. Your addiction can be managed successfully, though, just like heart disease or asthma. When you successfully complete your addiction treatment program, you have what you need to be able to counteract addiction’s disruptive effects on your brain and behavior so you can regain control of your life.\n" +
                "\n" +
                "Relapse is Not Failure\n" +
                "Life after addiction will be challenging. You will be faced with temptations, cravings, and triggers. You may even find yourself relapsing. That does not mean you have failed. It does mean that you need to work on avoiding triggers by avoiding the places and people that you associate with your previous drug or alcohol use. It also means that you need to reach out again for help to get you back on track if you do relapse.\n" +
                "\n" +
                "The Recovery Process\n" +
                "When you stop your drug or alcohol use, that is one major step in a long and complex recovery process. Addiction treatment is not a magical solution. You will need to continue to work on your recovery after completing your treatment program.\n" +
                "\n" +
                "When you entered treatment, your addiction had probably caused serious consequences in your life, disrupting your physical and mental health as well as how you functioned at work, in your community, and in your family. A holistic program helps you not only overcome your addiction but also helps you with these other areas that need to be addressed in your recovery.", R.drawable.once)


        val producto4 = Producto("Rebuilding Self-Esteem", "Addiction and low self-esteem have long been known to be linked. In your life after addiction, you will be challenged with rebuilding your self-esteem so you can move forward with a positive, productive life. Some steps you can take include:\n" +
                "\n" +
                "Write an affirmation that reflects how you want to feel about yourself. You might write, “I am proud of what I have accomplished.” Repeat the affirmation to yourself at least daily, if not more often. Over time, these affirmations can help transform negative self-talk into a more optimistic view of yourself.\n" +
                "Forgive yourself for your past mistakes. Understand that your addiction affected your judgment and impulse control, so you probably said and did things that you later regretted. Now is the time to recognize and acknowledge what you did, let go of punishing yourself, and commit to doing things differently in the future.\n" +
                "Accept compliments you receive now. When someone gives you a compliment, resist the urge to dismiss it or think to yourself that the person didn’t mean it. Instead, imagine it’s true, and you might just find that it is.\n" +
                "Do something kind for someone else every day. You don’t have to make a grand gesture; something as simple as holding a door open for another person, giving up a seat on the bus, or giving someone directions if they look lost can elicit a genuine expression of appreciation.\n" +
                "Make positive changes in your life after addiction. If a major change seems like too much, break it down into smaller acts, and choose to do one a day or one a week, whichever you feel you’ll follow through on. With each small change, inwardly celebrate your success in moving toward your goal.\n" +
                "Steps to Success\n" +
                "Your daily life after addiction may look challenging, but you can overcome those challenges with focus and strategies for taking steps to your success.\n" +
                "\n" +
                "Find sober friends and sober activities. There are many things to do in the Austin area that you can enjoy without drugs or alcohol.\n" +
                "Reconsider your work environment. You may need to find a new job if you encounter triggers at work each day.\n" +
                "Look for answers when you have questions or doubts. Talking about issues can often help uncover your underlying distress before it activates a craving.\n" +
                "Build a support network. Look to groups such as Alcoholics Anonymous or Narcotics Anonymous for supportive meetings, many of which have gone virtual during the COVID-19 pandemic.", R.drawable._22)

        val producto5 = Producto("About Mental Health", "What is mental health?\n" +
                "Mental health includes our emotional, psychological, and social well-being. It affects how we think, feel, and act. It also helps determine how we handle stress, relate to others, and make healthy choices.1 Mental health is important at every stage of life, from childhood and adolescence through adulthood.\n" +
                "\n" +
                "Although the terms are often used interchangeably, poor mental health and mental illness are not the same. A person can experience poor mental health and not be diagnosed with a mental illness. Likewise, a person diagnosed with a mental illness can experience periods of physical, mental, and social well-being.\n" +
                "\n" +
                "stethescope icon\n" +
                "Why is mental health important for overall health?\n" +
                "Mental and physical health are equally important components of overall health.  For example, depression increases the risk for many types of physical health problems, particularly long-lasting conditions like diabetes, heart disease, and stroke. Similarly, the presence of chronic conditions can increase the risk for mental illness.2\n" +
                "\n" +
                "hourglass icon\n" +
                "Can your mental health change over time?\n" +
                "Yes, it’s important to remember that a person’s mental health can change over time, depending on many factors.  When the demands placed on a person exceed their resources and coping abilities, their mental health could be impacted. For example, if someone is working long hours, caring for a relative, or experiencing economic hardship, they may experience poor mental health.\n" +
                "\n" +
                "icon showing numerical phrases 1 in 5, 50%26#37;, 1 in 25\n" +
                "How common are mental illnesses?\n" +
                "Mental illnesses are among the most common health conditions in the United States.\n" +
                "\n" +
                "More than 50% will be diagnosed with a mental illness or disorder at some point in their lifetime.3\n" +
                "1 in 5 Americans will experience a mental illness in a given year.4\n" +
                "1 in 5 children, either currently or at some point during their life, have had a seriously debilitating mental illness.5\n" +
                "1 in 25 Americans lives with a serious mental illness, such as schizophrenia, bipolar disorder, or major depression.6\n" +
                "puzzle pieces\n" +
                "What causes mental illness?\n" +
                "There is no single cause for mental illness. A number of factors can contribute to risk for mental illness, such as\n" +
                "\n" +
                "Early adverse life experiences, such as trauma or a history of abuse (for example, child abuse, sexual assault, witnessing violence, etc.)\n" +
                "Experiences related to other ongoing (chronic) medical conditions, such as cancer or diabetes\n" +
                "Biological factors or chemical imbalances in the brain\n" +
                "Use of alcohol or drugs\n" +
                "Having feelings of loneliness or isolation", R.drawable._33)
        val producto6 = Producto("10 Ways To Help Others That Will Lead You To Success", "Helping others should be a natural extension of every business leader’s responsibilities. Unfortunately, it doesn’t come as easy as you would think. As leaders, we often get too caught up in operations or our own problems to give people the help they need. However, in the last year, I’ve realized that most of my best clients, partners and relationships have come from me helping someone. Here are 10 thoughts that can remind you to help others.\n" +
                "\n" +
                "1.Sharing knowledge\n" +
                "One of the easiest ways to help others is to simply share your knowledge. You don’t have to be in front of a classroom to teach. Every day there is an opportunity to educate someone about your area of expertise. The key is to keep educating yourself so you can stay ahead of the curve.\n" +
                "\n" +
                "2.Finding out what’s valuable to them\n" +
                "The number one rule of helping people should be to find out what’s actually valuable to someone. You may spend time and effort helping someone with something that they didn’t even want help with. Make an effort to ask them where they need help, and keep that in mind when you see an opportunity.\n" +
                "\n" +
                "3.Sharing your resources\n" +
                "Think about the resources you’ve invested in and be mindful of whether they can help someone else. Maybe a developer on your team has some extra time and one of your contacts needed some help on a quick job. Or, maybe you have Cardinals season tickets and there’s a game that you won’t be able to attend. Keep those under- or unused resources in the back of your mind and try to connect them to people who can use them.\n" +
                "\n" +
                "4.Making them aware of an opportunity\n" +
                "It’s important to keep an eye out for opportunities. It could be good press, a potential partner, or a general business opportunity. Once you see an opportunity, think about who could benefit from knowing about it. One of the ways I like to help my employees is to help their friends, relatives or significant others if they’re looking for a job. A lot of times I can use my business connections to find a potential good fit.\n" +
                "\n" +
                "5.Giving them transparent feedback\n" +
                "Transparent feedback can be tough because some people don’t take constructive criticism well.  There is a difference between telling someone that they suck and giving them good examples of how they can improve.  Some people won’t take it well but, in the long run, you will help the people that you want to work with and improve the efficiency and success of your company as well.\n" +
                "\n" +
                "6.Being a brand advocate\n" +
                "I was at a conference the other day speaking with someone from American Airlines, a client of ours. She was going on and on about how she loved her Modify watch. She truly wanted to help the company because she loved the product and wanted to see them succeed. Think about the products and services that you love, and don’t be shy about letting people know about them.\n" +
                "\n" +
                "7.Giving introductions\n" +
                "There’s a lot of big talk out there. Someone knows somebody who is a great contact or client, but they never actually make the introduction. Rather than making and breaking promises, make an effort to actually send out several intros each week. However, don’t let your credibility take a hit: make sure the people you’re advocating are legit.\n" +
                "\n" +
                "8.Volunteering your time\n" +
                "Time is valuable and most people understand that.  When you take time out of your day to help a friend, they remember it. I try and do a guest webinar every couple of weeks for contacts so they know I’m willing to take time out of my day to share my experience with the community. Even if it’s not something as public as a webinar or podcast, set aside some time to help a contact. It could be as simple as helping them move to a new home.\n" +
                "\n" +
                "9.Recognizing them\n" +
                "There are a variety of ways to give someone recognition. You can include them in an article that you’ve written or mention them in a speech or presentation. An easy way to recognize someone is to nominate them for an award. There are countless awards out there that could really help out your network. It will mean a lot to the nominee that you thought of them and wanted to recognize them. On a smaller scale, you can have internal recognition within your company. We have an award called “the belt” that looks like a WWF belt. Each week the current winner chooses the next winner. It’s an easy way to make an employee feel good about the solid work they’ve done for your company.\n" +
                "\n" +
                "10.Giving gifts\n" +
                "Gifts can be tricky because you don’t want to “buy” peoples’ favor. You want to get them a gift that makes sense and will help them.  When Hurricane Sandy hit, we sent care packages with items that survivors could use as they recovered from the devastation. People tend to remember who helped them when they were in need, so it’s important to make an extra effort during these times.\n" +
                "\n" +
                "Helping others isn’t always easy. It can sometimes derail your schedule and cost you time, money and other resources. It can even be interpreted the wrong way. However, keep these tips in mind for some easy ways to show your connections that they truly matter to you.", R.drawable._44)



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