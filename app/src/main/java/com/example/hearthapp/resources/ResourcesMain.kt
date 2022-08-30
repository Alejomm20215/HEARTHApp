package com.example.hearthapp.resources

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.hearthapp.R
import com.example.hearthapp.databinding.ActivityResourcesMainBinding
import kotlinx.android.synthetic.main.activity_resources_main.*

class ResourcesMain : AppCompatActivity() {
    private lateinit var binding: ActivityResourcesMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResourcesMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bg = binding.addiction.background as AnimationDrawable
        bg.setEnterFadeDuration(800)
        bg.setExitFadeDuration(1700)
        bg.start()

        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.navigationBarColor = this.resources.getColor(R.color.camel_2)

        val producto = Producto("The people and the smartphone", "For many of us, our phones have become an integral part of our day-to-day. In fact, US Chief Justice John Roberts Jr. stated that phones are such an “insistent part of daily life that a visitor from Mars might conclude they were an important feature of human anatomy.” \n" +
                "Whoa. Big impact.\n" +
                "It’s no question that this phenomenon is widespread. In a recent study, 94% of participants reported feeling troubled when they didn’t have their phone with them, 80% felt jealous when someone else held their phone, and 70% expected to feel depressed, panicked, and helpless if their phone was lost or stolen, according to Psychology Today. \n" +
                "Another study even found that half of participants would rather have a broken bone than a broken phone, says NPR.\n", R.drawable.celus)

        val producto2 = Producto("Little by little we use the smartphone more", "Here’s what happened: When you got your first smartphone, you probably did some things that made you feel good. Think: reconnecting with a childhood bud, reading a nice text message from a friend, or getting a notification. All of these activities caused the release of dopamine.\n" +
                "What’s dopamine? It’s a neurotransmitter that makes you feel good. Our brains are designed to release dopamine when we do something that meets a survival need, like eating or having sex. Countless studies have shown that phone activity causes the release of dopamine in our brains, making us feel aroused, motivated, and happy\n" +
                "But each time you did something that prompted the release of dopamine, your brain started to notice a pattern. Soon enough, your brain began to associate ‘cell phone’ with ‘dopamine.’ And since your brain naturally craves easy hits of dopamine, it started to crave your phone. \n", R.drawable.dopa)


        val producto3 = Producto("And suddenly, a habit forms", "When you perform a specific behavior over and over again that triggers a certain reward, the pattern becomes etched into your neural pathways. Soon enough, your brain begins to crave that reward regularly.\n" +
                "And here’s the thing about dopamine: it quickly metabolizes in your brain, leaving you wanting more and more, as soon as possible. So once the impact of the dopamine goes away, your brain will do whatever it takes to get that feeling back, as soon as it can.\n" +
                "What’s an easy, accessible way to get that surge of dopamine? Picking up your phone. So that’s just what your brain tells your body to do.\n" +
                "The thing is, not every text, Facebook post, and Instagram picture will deliver the goods your brain is looking for. But we’re wired to work hard for these dopamine rewards, and will continue sifting through the mediocrity in the way to get there.\n" +
                "Sometimes, we’ll even contribute to the reward system ourselves.\n" +
                "Ever find yourself posting something on social media just to feel good? Or sending a bunch of texts to friends, just to feel connected? No worries – you’re not alone. It happens to the best of us, and it’s our neural systems at work.", R.drawable.cadena)


        val producto4 = Producto("People are social beings who need human connection", "All things considered, it looks like smartphones provide us with a platform to carry out our innate need for human connection, which is a “fundamental feature of human evolution that predates smartphones by hundreds of thousands of years,” according to Dr. Veissière.\n" +
                "Why can’t we stop picking up our phones? They deliver one of our most basic needs in a way that’s simple and instant: human connection.\n" +
                "This is especially appealing to humans, since our brains are hardwired to find shortcuts to everything to save cognitive energy for other pursuits.\n" +
                "And truth be told, this effect is only exacerbated by tech companies. Several tech companies hire psychologists, neuroscientists, and social science experts to help them create addictive products that keep the release of dopamine going. There’s even a startup called Dopamine Labs, which uses neuroscience to help tech companies make their products extra ‘sticky.’\n", R.drawable.mundito)

        val producto5 = Producto("Smartphones interfere with our social life", "Dr. Keith Hampton of Michigan State University points out that smartphones enable us to stay connected to friends, even after transitioning from school to college or moving to a new city. Because of that, we can have a wider network of people to confide in, travel with, and learn from. “You’re gaining a more diverse social network,” he says.\n" +
                "But it’s also worth mentioning that our phones interfere with some of our most important relationships in face-to-face scenarios. According to a study conducted by James Roberts and Meredith David, ‘phubbing’ – snubbing others in favor of our phones – decreases marital satisfaction, in part because it leads to conflict over phone use.\n" +
                "Not only that, but another set of studies showed that just having a phone out (say, on the dinner table) and present during a meaningful conversation interferes with your sense of connection to the other person. And usually, it’s those meaningful, face-to-face conversations that truly bring us closer to each other.\n" +
                "In one of these studies, Professor Misra found that “if either participant placed a mobile device on the table, or held it in their hand, the quality of conversation was rated to be less fulfilling.” She also noticed that participants who took out their phone mid-convo felt less empathy for the other person\n", R.drawable.cena)



        val listaProductos = listOf(producto, producto2, producto3, producto4, producto5)

        val adapter = ProductosAdapter(this, listaProductos)

        lista.adapter = adapter

        lista.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent( this, ProductoActivity::class.java)
            intent.putExtra("producto", listaProductos[position])
            startActivity(intent)
        }
    }

    }
