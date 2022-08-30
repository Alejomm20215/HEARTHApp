package com.example.hearthapp.resources

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.hearthapp.R
import com.example.hearthapp.databinding.ActivitySdg3Binding
import kotlinx.android.synthetic.main.activity_sdg3.*

class BenefitsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySdg3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySdg3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val bg = binding.sdg3.background as AnimationDrawable
        bg.setEnterFadeDuration(800)
        bg.setExitFadeDuration(1700)
        bg.start()

        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.navigationBarColor = this.resources.getColor(R.color.camel_2)

        val producto = Producto("The Benefits of Scheduling Your Free Time", "For many people, the first task when arriving to work is to pull up the calendar and create a mental map of the day’s events. Having everything laid out in front of us helps us structure our day and know what needs to get done when. But studies have shown that most of us are misusing our calendars, if we’re even using one in the first place.\n" +
                "\n" +
                "A paltry 1/3rd of Americans bother keeping any calendar at all, and 2/3rds of those calendars are only for work related events (shame). By employing calendars only for work, we can create an imbalance where we are focusing too much on our jobs and not enough on our free time. Actually penciling in leisure activities is a form of self-care that can benefit your mental health and even your performance at work.\n" +
                "\n" +
                "The Benefits of Scheduling Free Time\n" +
                "\n" +
                "When we schedule our free time we are essentially making it clear to ourselves that our happiness is a priority. This can not only enhance the quality of the time you spend outside of work, but it can actually give you something to look forward to while working, keeping you in a good mood and increasing the quality of the work you get done. If all you have to look forward to is more work, it’s easy to feel overwhelmed, get worn down, and let the burnout sink in.\n" +
                "\n" +
                "Making specific time for our friends and loved ones also shows them that they are a priority in your life, and you may need this reminder too. We are only as strong as the relationships we have, and strengthening those relationships can help solidify your entire life, significantly reducing your stress.\n" +
                "\n" +
                "Another benefit of scheduling your free time is that you may find it easier to soak it up guilt free. We all know the feeling of being halfway through bingeing our favorite series, only to have our love for Baby Yoda constantly threatened by a sense of pending doom lurking beneath the surface for not having gone grocery shopping or ticked everything off our work itinerary. With scheduled free time you set the standard that you are allowed to take your designated time off from your responsibilities, letting you sink into the couch and gobble up the ice cream stress free.\n" +
                "\n" +
                "Implied here is that when we’re taking advantage of our free time, we have already taken care of the other items on our schedule, but knowing specifically when we’re supposed to be off the clock can help us focus on our tasks at hand and cross those items off the to-do list more easily. It also will make us less susceptible to daydreaming, external distractions vying for our attention, or simply getting lazy when we are supposed to be working. Finishing our day’s tasks leads to feeling better about our time off.", R.drawable.tres)

        val producto2 = Producto("What Type of Free Time Should We Schedule", "Entonces, ¿qué tipo de tiempo libre deberíamos dedicar para asegurarnos de aprovecharlo al máximo? Esto será diferente para todos, pero hay varias cosas básicas que hacemos en nuestro tiempo libre, y es probable que todos necesitemos una combinación de cada una.\n" +
                "\n" +
                "La primera distinción es si vamos a pasar nuestro tiempo libre solos, con una pareja o con un grupo de amigos. Los introvertidos se recargan solos o con otra persona, mientras que los extrovertidos se benefician de entornos más sociales. Es probable que ya tenga una idea de lo que más necesita, pero no se encasille: la introversión frente a la extroversión es un espectro y casi todos nos encontramos más cerca del centro que de un lado.\n" +
                "\n" +
                "La segunda distinción que debemos hacer es si queremos planear algún tipo de salida, pasar el rato en casa o incluso dormir la siesta. Una vez más, la mayoría de nosotros debemos asegurarnos de obtener una dosis de ambos lados aquí. Incluso los más activos entre nosotros necesitan tomarse un descanso a veces o arriesgarse a excederse, e incluso los más introvertidos necesitan salir de casa y conocer gente nueva.\n" +
                "\n" +
                "Desafiarse a sí mismo para hacer ocasionalmente cosas que están fuera de su rango normal de actividades puede abrirlo a nuevas experiencias que tal vez no se haya dado cuenta de que disfrutaría, y muchas personas encuentran que un nuevo tipo de estimulación puede ser refrescante. Esto puede ayudar a que su cerebro se reinicie y se recargue, e incluso puede mejorar su imagen personal a medida que aprende cosas nuevas sobre usted y amplía sus horizontes.\n" +
                "\n" +
                "Cambia tu rutina normal de quedarte fuera hasta las 2 a. m. los fines de semana e intenta ir de excursión o a un museo. O, si sueles ir a museos... ¡intenta quedarte fuera hasta las 2 a. m.! (Solo estamos bromeando a medias). Vivir de una manera nueva, aunque sea por un día, puede recordarte que hay infinitas posibilidades y despertar un interés en explorar nuevos lugares, actividades o incluso ideas, forjando nuevas vías neuronales en tu cerebro, literalmente abriendo tu mente.\n" +
                "\n" +
                "En cuanto a las actividades de interior, probablemente tengas esto cubierto. Netflix, juegos de mesa, tejer… lo que sea, tú. Un movimiento subestimado que quizás no hayas considerado es simplemente acostarte en tu cama, con el teléfono fuera de tu alcance y ver qué pensamientos comienzan a llegar a ti. Esta es una excelente manera de sumergirse en su subconsciente y tener una breve sesión de autoterapia. Cualquier cosa que haya estado ocupando RAM en el fondo de sus pensamientos seguramente saldrá a la superficie, y resolver estos problemas puede conducir a una mente mucho más tranquila. Si esto te suena tonto, probablemente lo necesites más que nadie. Pruébelo, puede que se sorprenda de lo que sale.", R.drawable.cuatro)


        val producto3 = Producto("Do You Have Tech Discipline?", "Discipline is an important characteristic to display in many facets of our life. What do we mean when we talk about “technological discipline”? It may not be a phrase that you’re familiar with right now, but you will be.\n" +
                "\n" +
                "Technological discipline refers to the ability to resist the temptations found in our digital devices.\n" +
                "\n" +
                "This is a pretty wide definition so let’s break it down and highlight some examples of what I mean. And more importantly, what are some things you can do to become more disciplined when it comes to your technology.\n" +
                "\n" +
                "The Pull of the Screen\n" +
                "Technology should always be a tool. It should be a means of getting to an end. Ideally, you pick up your phone in order to place a call. You open up your laptop to send an e-mail. There should be a reason for you to take each of these actions.\n" +
                "\n" +
                "The problem is that our devices have gotten too smart. Tech companies have developed tricks to get us to use their products more and spend more money. Picking up a smartphone has become a gateway into so many other things. Searching the Internet opens up a whole world which is amazing but extremely distracting.\n" +
                "\n" +
                "The average American looks at their phones 52 times each day and that number is on the rise. You can make the argument that a solid percentage of those times are intentional and are done in order to complete a task. But how many of those phone pickups are mindless, with no specific intended task?", R.drawable.cinco)


        val producto4 = Producto("We Need to Strengthen Our Discipline", "When we hear the word discipline we may think of children learning manners at school. Maybe we think about forcing ourselves to go to the gym. But discipline can also mean self-control. Or maybe we refer to it as self-discipline. However you refer to it, it’s a vitally important skill you need to develop in order to be a fully-functioning human being.\n" +
                "\n" +
                "This is just the first time in human existence that we need the discipline to control our use of something that’s become so ubiquitous. I’m not arguing for you to destroy your technology and go live in the woods. I am arguing for you to practice awareness when using the many devices that have become part of our daily lives.\n" +
                "\n" +
                "How Do We Do It?\n" +
                "Ok, here’s what I do recommend. It’s as simple as having an intended use whenever you pick up a technological device. It sounds easy, right? On the surface, it is pretty simple, but it will likely still take time for you to get good at it.\n" +
                "\n" +
                "Here’s an exercise that could help. Take out an old-fashioned pen and paper. Write down the things that you use your devices for. Just give it five minutes of thought. You might think that you use your devices for everything in your life, but if you get specific you’ll realize that the list isn’t as long as you thought.\n" +
                "\n" +
                "Keep this list in plain sight. Maybe on your desk or in your wallet. Refer back to it often. Whenever you open up your computer or unlock your smartphone, make sure you are doing it explicitly for one of the reasons written here. The device shouldn’t open until you’ve chosen one of the tasks that need the digital tool in order to be completed.\n" +
                "\n" +
                "And don’t forget to control the number of browser tabs you have open. Keep focused on the task at hand!\n" +
                "\n" +
                "Practice\n" +
                "This skill takes practice. Maybe the exercise of writing down your digital tasks will help illustrate just how great your devices are. But more likely, it will make you question how often you need to do these tasks. And you may be able to do a lot of them without the help of a screen.\n" +
                "\n" +
                "Like any other discipline, you need to work at building this muscle every day. It won’t be easy at first. Each day you should see improvement. You should slowly be decreasing your screen time or at least be more aware of how much time you spend looking at your screen each day.\n" +
                "\n" +
                "If less screen time or more digital mindfulness is one of your goals, you should check-in each week to see how you’re progressing. It should be thought of the same way as a physical exercise goal. You can set milestones each week that you aim to hit. Maybe week one is just to create your digital task list. Week two could be to see which tasks could be done without a device and so on. And if you need help, I’m always available to lend a hand through one of my coaching packages.\n" +
                "\n" +
                "What do you think? Is this a frightening exercise? How would you rate your technological discipline?", R.drawable.seis
        )

        val producto5 = Producto("Tech is equally capable of making lives easier and harder. Just like everything else in this world, it pretty much depends on how we use it.", "According to Edelman's Trust Barometer 2020, trust in tech dropped by 6 points globally (to 68 on a scale of 100). In the US, it hit an all-time low of 57 out of 100. It’s a good time to go back and review what tech and the tech industry are doing well and what's to improve. Is technology good or bad for us? \n" +
                "\n" +
                "Positive impact of technology on society\n" +
                "The development and adoption of technology have helped societies raise productivity, inclusivity of services and improve overall well-being. Where tech advancements have helped the most?\n" +
                "\n" +
                "Healthcare & wellness advancements\n" +
                "Tech possesses an enormous potential to improve health and healthcare systems as we know them. From AI-powered clinical drug trials through enabling preventative patients’ monitoring up to wellness solutions like wearables. We have seen tech minding the gap in healthcare in the pandemic. Telemedicine apps are the first step to making healthcare more equitable and accessible for all, no matter their socioeconomic status.\n" +
                "\n" +
                "Wide tech adoption by both patients and healthcare professionals has immense potential to improve public health entities’ efficiency. Tech advancements in preventative health (like wearables) can diminish overall healthcare expenditures and allow to monitor patients’ status and detect abnormalities sooner, hence react sooner. Complex healthcare systems fueled with AI analytics are able to better distribute care and treatment. Virtual Reality Therapy is being tested on patients with severe trauma as going back and facing your fears once again and surviving proved to be the biggest therapy leap for many.\n" +
                "\n" +
                "Startups and healthcare tech companies move significantly faster than traditional companies, with fewer regulatory obstacles. A good example of this would be xCures’ Beat-19 study, which went live in the first month after the pandemic hit the US.\n" +
                "\n" +
                "xCures, an AI-fueled company matching cancer patients and their oncologists with optimal investigational or approved therapies, utilized their algorithm to gather data about Covid-19 spread, including sex, race, one’s underlying conditions. Now it is being used for scientific research purposes.\n" +
                "\n" +
                "Education (EdTech)\n" +
                "We already have many learning platforms aggregating courses for different age groups, all from different fields and industries. They usually contain videos, interactive boards or games for practice. This alone makes education much more accessible and scalable than ever before.\n" +
                "\n" +
                "But tech influence on education does not end on virtual learning. Thanks to the use of virtual reality, Artificial Intelligence, neuroscience, and learning sciences tech makes learning a more immersive and holistic experience in class. Startups like Immerse use VR to help students learn English by communicating and practising their English skills through a range of topics and themes with a VR headset.\n" +
                "\n" +
                "Artificial intelligence can help students with disabilities determine the best way for them to learn efficiently and with tangible progress. Automation and systemization can solve the ultimate pain point for teachers across the globe: administrative tasks, which take a lot of their time.\n" +
                "\n" +
                "Environment protection & smart cities\n" +
                "If you ask someone how tech influences the environment, they are likely to say “very badly”. Even though it used to be true in the past, the ultimate awareness of the necessity to protect the environment has been growing over the last decade, and tech has been one of the quickest industries to jump on the train.\n" +
                "\n" +
                "Environmental startups (also called “green startups”) are building sustainable solutions to utilize materials that are difficult to recycle and reduce waste, purify water, and monitor changes in the environment to ensure a more sustainable future.\n" +
                "\n" +
                "A Nigerian startup, Brickify recycles plastic waste into bricks that are resistant to water, fire, and heat and can be used for both: road construction and low-cost housing.\n" +
                "\n" +
                "GOT BAG from Germany is the first company to make a backpack out of ocean plastic. They work with 1,5000 fishermen in Asia to collect plastic from the ocean. \n" +
                "\n" +
                "Another startup from Germany, KRAFTBLOCK designed a storage-based thermal energy system, able to operate up to 1,300-degree Celsius. 85% of the system is made from recycled materials, so they have a lower carbon footprint than the competition.\n" +
                "\n" +
                "Just after months of major wildfires in Australia, Dryad Networks launched their product: a wireless environmental sensor network to detect wildfires about 60 minutes before they actually break out. It is based on the leading open-standard for long-range radio IoT networks. They recently enhanced their product and provide growth & health monitoring solutions for public and private forests. Some of the metrics that can be measured are humidity, drought, air quality, CO2 levels, O2 concentration in water etc.\n" +
                "\n" +
                "The concept of smart cities is also closely related to environmental protection. Many cities around the globe are using tech solutions to implement measures to reduce waste and pollution, and optimize energy usage. Electric cars are favoured in the city centres; waste distribution regulations also rely on the Internet of Things to optimize processes. IoT is able to reduce the frequency of bin collections and minimizes overall waste collection costs, lowering carbon emissions in cities.\n" +
                "\n" +
                "Equal opportunities\n" +
                "The universal value behind technology is bringing equality to products and services and minimizing socioeconomic gaps among societies and people. As described above, tech makes health and education available to more people, making it easier  to learn and get care, no matter their background.\n" +
                "\n" +
                "In a work setting, tech can de-bias recruitment, unveiling pay gaps, and standardizing pay systems. Tech helps to detect all kinds of discrimination: gender gap, exclusion of minorities' etc. Artificial Intelligence models are learning (and getting better at it) how to detect hate speech in all forms and sizes. For disabled people, implementing tech solutions makes physical spaces more accessible for them.\n" +
                "\n" +
                "Negative impact of technology on society\n" +
                "The negative impact of tech on society involves mass-made products, with most often blamed: social media. A multitude of research has been made on the topic where social media is listed as a number one place with misinformation, hate speech, and harassment on the one hand, and a place leaving people isolated and depressed on the other.\n" +
                "\n" +
                "Social media’s impact on mental health\n" +
                "Social media relies on instant gratification. All apps’ notifications are there to lure a person back into the app and scroll. According to neuroscientists at Freie University in Berlin, social media notifications (especially likes, follows etc) activate our brains’ reward system.\n" +
                "\n" +
                "Numerous studies showed that social media exposure might lead to a prolonged feeling of loneliness and detachment. The popularly used phrase, FOMO (fear of missing out), is linked directly to intensive social media use. It refers to a situation when a person is flooded with content of friends, colleagues, or even influencers doing exciting things while their life or activities seem mundane and somewhat worse. It is especially harmful at a young age, as even though people are aware that the content they see is just a set of highlights of someone’s life, it leaves them feeling lonely and lacking on a subconscious level.\n" +
                "\n" +
                "Connected to FOMO and social media anxiety is declining self-esteem. A lot of research has been done on the subject, but the conclusions are still very much inconclusive.\n" +
                "\n" +
                "A team of researchers from Ryerson University Toronto analyzed cumulative results from 121 studies to see if they could reach a consensus. They found a small yet significant negative relationship between social media use and one’s self-esteem, suggesting that the higher level of social media use, the lower your self-esteem. Other findings were that people using social networking sites might be doing so at the expense of their in-person relationships. People with low self-esteem were naturally more drawn to social media as it helped them avoid awkward real-life experiences.", R.drawable.siete)
        val producto6 = Producto("33 Ways to Relax without Technology", "With technology being such a fundamental part of our lives, sometimes it is important to relax without the presence of phones, computers or television sets. The following offers 33 different ways to relax technology free and focus on the smaller things in life.\n" +
                "\n" +
                "Read a book\n" +
                "When staying in our Hunchy Montville cabins get lost in another world and enjoy a little time away from digital devices with an old fashioned paperback book.\n" +
                "Go on a technology free holiday\n" +
                "As much as we may like to think otherwise, technology can actually create more stress. Take a break and go on holidays without the digital distraction.\n" +
                "Sleep in\n" +
                "A good night’s sleep is essential to a happy and healthy life and sometimes sleeping in past your usual wake up can also be a little exhilarating. Allow your body to naturally awaken, rather than jarring it with an alarm.\n" +
                "Watch a sunset\n" +
                "Sit back, relax and watch the world go from day to night. Be aware of how precious and magical time is and enjoy the moment, without any distractions.\n" +
                "Run a hot bath\n" +
                "A hot bath can be one of the most soothing experiences in the world, yet so many of us hardly touch the bath – or may not even have one! Whether it’s at home or in a hotel, run the water and set yourself up for some time in the tub. Grab a book or a glass of wine and relax.\n" +
                "Meditate\n" +
                "Get back to basics and enjoy some time free from thought. Meditation is a powerful tool for relaxing – without the need for technology!\n" +
                "Breathe\n" +
                "It may seem odd, but many people forget to simply breathe, especially when stressed. Find a quiet space and breathe deeply, filling your lungs and expelling slowly.\n" +
                "Immerse yourself in nature\n" +
                "heading outside has many benefits and enjoying the touch and feel of the world around you is a great way to relax. Take off your shoes, lie down in the grass and open your senses.\n" +
                "Go out for dinner\n" +
                "No takeaways in front of the television or dinners with phones! Instead, organise an outing to a nice restaurant with someone you love and enjoy the good food and company without the technology.\n" +
                "Commute without technology\n" +
                "Getting to work often goes hand in hand with playing on your phone or watching a movie on your tablet. But this is a great opportunity to truly relax, so put away the phone and watch the world go by. Or, if that sounds a little dull, get an old fashioned hard copy book!\n" +
                "Have a nothing day\n" +
                "Choose to do nothing. Just be. This will help relax you from the inside out, with no distractions to upset your mood or body.\n" +
                "Get a massage\n" +
                "It may sound obvious, but a massage is a great way to wind down. However, a massage is more than a way to relax. It has also been found to reduce anxiety, boost the immune system and prevent depression. If you're staying at Hunchy Hideaway Montville Cabins we can arrange a couples massage in your very own cabin.\n" +
                "Take a day off from exercising\n" +
                "It is possible to overexert yourself, even if you think just one day without a gym session will put you behind. Don’t let yourself burn out. Instead, take a day off and relax and enjoy vegging out!\n" +
                "Indulge in your favourite food\n" +
                "We live in a world where everything we eat should be “good” for us. But sometimes something that seems bad will do more good than you think. So, give yourself a break! Enjoy your favourite food, savouring each bite.\n" +
                "Have a “me” day\n" +
                "Sometimes all we do is things for others. Give yourself a chance to do something for you. Have a “me” day and do all the things you want to do that don’t involve technology. Every day at Hunchy's Sunshine Coast adults only accommodation is a tech-free \"me\" day so why not book a mid-week or weekend escape.\n" +
                "Have a spa day at home\n" +
                "Rather than spending a lot of money or worrying about what to wear, pamper yourself at home. Fill a bucket with warm water and soap for your feet, make a homemade face mask, sit back and read some magazines.\n" +
                "Spend time with your pets\n" +
                "There is nothing like the relaxed, friendly vibe only a pet can give you. Take some time out of your day to give them some attention and a good scratch and reap the benefits.\n" +
                "Have some tea\n" +
                "Put down the coffee and get a pot of tea brewing. Tea has lots of great beneficial properties and less of the caffeine that makes coffee rev you up. A warm mug of tea is a great way to relax.\n" +
                "Go to the theatre\n" +
                "Don’t rent out a movie or head to your computer, instead go out to the theatre and enjoy a good old fashioned move night – in real life.\n" +
                "Dress up\n" +
                "Nothing makes you feel better than getting all done up – even for guys! Whether it’s planning for an event or just trying on something you love, dressing up is a great way to improve your mood and let go of your worries.\n" +
                "Get a hobby\n" +
                "A hobby is a great way to unwind and give yourself a break from technology. It could be knitting, cycling, painting or renovating – whatever it is, go out and get the basics and fall in love with something hands on.\n" +
                "Eat breakfast in bed\n" +
                "Feel like a kid again and make yourself breakfast in bed. Make sure it is something simple that you can munch on while enjoying watching the world wake up around you. Hunchy's B&B Sunshine Coast can arrange scrumptious breakfasts you and your partner can enjoy in bed, inside by the roaring fireplace or out on the deck surrounded by rainforest.\n" +
                "Chew gum\n" +
                "This is a surprisingly quick and easy way to relax, with just a few minutes of chewy known to reduce anxiety and lower cortisol levels.\n" +
                "Close your eyes\n" +
                "Get away from the world for a moment. Close your eyes, breathe slowly and allow yourself to relax and let your mind wander.\n" +
                "Squeeze a stress ball\n" +
                "A stress ball is a quick and easy way to let go of some stress and get on with more important things. Have a little fun with it and choose a design that makes you smile.\n" +
                "Brush your hair\n" +
                "Repetitive movements can be very relaxing. Brushing your hair is great way to relax and can also double as a gentle scalp massage. Even if you’ve already done your 100 brushes for the day, whip it out and brush it through.\n" +
                "Sit in the sun\n" +
                "Getting your daily dose of vitamin D can actually be a great way to de-stress. Get away from the computer, turn off the television and head outside and let the rays drench you. Montville is a great area to soak up the sun. Book a Sunshine Coast couples hinterland retreat to destress and unwind amidst nature in our Montville cabins\n" +
                "Stretch out the stress\n" +
                "Stretching is a great way to release tension. Stretch your whole body from your toes to your head. Let everything relax and sit naturally.\n" +
                "Create a bedtime ritual\n" +
                "It can be hard to relax enough for a good night’s sleep. One way to prepare your body for slumber is to have a routine. From brushing your teeth to putting your pyjamas on, having a ritual will signal to your body that it is time to sleep. Do this without technology or you will spend most of the night tossing and turning!\n" +
                "Have a catnap\n" +
                "A short, 20 minute nap can do wonders for your wellbeing and can melt away any worries you may have.\n" +
                "Smell the roses\n" +
                "Literally! Ever heard of aromatherapy? Get it for free by heading outdoors and enjoy the sweet smell of some flowers. Make sure you always have a fresh vase of flowers in your work space to take a whiff any time.\n" +
                "Take a bathroom break\n" +
                "Sometimes you simply need to get away. In the office, this can be hard. An easy way to make an escape and have some alone time is to head to the bathroom. Close your eyes and breathe away the worries.\n" +
                "Go on a romantic weekend away\n" +
                "Spend time with the person who loves you most. Go somewhere secluded and romantic and simply enjoy each other’s company for a few days. Hunchy's Montville accommodation cottages offer the perfect adults only getaway to enjoy stress-free, tech-free, brick-and-mortar free \"couples\" time. Set amidst lush rainforest, and boasting a private waterfall, just a short drive from Kondalilla National Park and the heart of town, what more could you want from a city escape?", R.drawable.ocho)



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
