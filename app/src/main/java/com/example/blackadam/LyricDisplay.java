package com.example.blackadam;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.graphics.Color;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class LyricDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyricdisplay);
        Bundle songData = getIntent().getExtras();

        if (songData == null) {
            return;
        }
        String songMessage = songData.getString("songMessage");
        setLyrics(songMessage);
    }

    public void setLyrics(String choice) {
        if (choice.equals("Ransom - Lil Tecca")) {
            String ransomLyrics = "Yeah (Internet Money bitch)\n" +
                    "I got black, I got white, what you want?\n" +
                    "Hop outside a Ghost and hop up in a Phantom\n" +
                    "I know I'm boutta blow-oh-whoa-oh, I ain't dumb\n" +
                    "They try to take my flow, I take they ass for ransom\n" +
                    "I know that I'm gone\n" +
                    "They see me blowing up, now they say they want some\n" +
                    "I got two twin Glocks, turn you to a dancer\n" +
                    "I see two twin opps, leave 'em on the banner\n" +
                    "And I got two thick thots, wanna lick the gang, yeah\n" +
                    "I got red, I got blue, what you want?\n" +
                    "The Chanel or Balenciaga, Louis and Vuitton\n" +
                    "She know I got the Fendi, Prada when I hit Milan\n" +
                    "I needed me a die or rider, I need me the one\n" +
                    "I started from the bottom, you could see the way I stunt\n" +
                    "I want all the diamonds, I want that shit to weigh a ton\n" +
                    "The opps they tryna line me 'cause they hate the place I'm from\n" +
                    "But them niggas don't know me, they just know the place I'm from\n" +
                    "I got lots of shawties tryna pull up to my place\n" +
                    "But you ain't want me last year so just get up out my face\n" +
                    "They all up in my inbox, so I know they want a taste\n" +
                    "I know they want my downfall, lil' nigga are you laced?\n" +
                    "I got black, I got white, what you want?\n" +
                    "Hop outside a Ghost and hop up in a Phantom\n" +
                    "I know I'm boutta blow-oh-whoa-oh, I ain't dumb\n" +
                    "They try to take my flow, I take they ass for ransom\n" +
                    "I know that I'm gone\n" +
                    "They see me blowing up, now they say they want some\n" +
                    "I got two twin Glocks, turn you to a dancer\n" +
                    "I see two twin opps, leave 'em on the banner\n" +
                    "And I got two thick thots, wanna lick the gang, yeah\n" +
                    "I got black, I got white, what you want?\n" +
                    "Hop outside a Ghost and hop up in a Phantom\n" +
                    "I know I'm boutta blow-oh-whoa-oh, I ain't dumb\n" +
                    "They try to take my flow, I take they ass for ransom\n" +
                    "I know that I'm gone\n" +
                    "They see me blowing up, now they say they want some\n" +
                    "I got two twin Glocks, turn you to a dancer\n" +
                    "I see two twin opps, leave 'em on the banner\n" +
                    "And I got two thick thots, wanna lick the gang, yeah";
            TextView songName = (TextView) findViewById(R.id.songName);
            TextView artistName = (TextView) findViewById(R.id.artistName);
            TextView songLyrics = (TextView) findViewById(R.id.songLyrics);
            songName.setText("Ransom");
            artistName.setText("Lil Tecca");
            songLyrics.setText(ransomLyrics);
        }
        if (choice.equals("Panini - Lil Nas X")) {
            String paniniLyrics = "Daytrip took it to 10 (hey)\n" +
                    "Ayy, Panini, don't you be a meanie\n" +
                    "Thought you wanted me to go up\n" +
                    "Why you tryna keep me teeny? I\n" +
                    "It's a dreamy, wished it on a genie\n" +
                    "I got fans finally, ain't you wanting them to see me? I\n" +
                    "I thought you want this for my life, for my life\n" +
                    "Said you wanted to see me thrive, you lied\n" +
                    "Just say to me, what you want from me\n" +
                    "Just say to me, what you want from me\n" +
                    "Ayy, Panini, don't you be a meanie\n" +
                    "Thought you wanted me to go up\n" +
                    "Why you tryna keep me teeny now?\n" +
                    "Now they need me, number one on streaming\n" +
                    "Oh yeah, you used to love me\n" +
                    "So what happened, what's the meaning? I\n" +
                    "I thought you want this for my life, for my life\n" +
                    "Said you wanted to see me thrive, you lied\n" +
                    "Now when it's all done, I get the upper hand\n" +
                    "I need a big Benz, not another fan\n" +
                    "But I still want you as a fan\n" +
                    "I'ma need to sit down, don't mean to make demands\n" +
                    "But I need you to\n" +
                    "Say to me, what you want from me\n" +
                    "Just say to me, what you want from me\n" +
                    "Daytrip took it to 10 (hey)";
            TextView songName = (TextView) findViewById(R.id.songName);
            TextView artistName = (TextView) findViewById(R.id.artistName);
            TextView songLyrics = (TextView) findViewById(R.id.songLyrics);
            songName.setText("Panini");
            artistName.setText("Lil Nas X");
            songLyrics.setText(paniniLyrics);
        }
        if (choice.equals("Thotiana - Blueface")) {
            String thotianaLyrics = "Blueface, baby\n" +
                    "Yeah, aight, bust down, Thotiana\n" +
                    "Yeah, aight, I wanna see you bust down\n" +
                    "Bust down, Thotiana (bust down, Thotiana)\n" +
                    "I wanna see you bust down (over)\n" +
                    "Pick it up, now break that shit down (break it down)\n" +
                    "Speed it up, then slow that shit down, on the gang (slow it down)\n" +
                    "Bust it (bust down), bust down, bust it, bust it\n" +
                    "Bust down on the gang (over)\n" +
                    "Bust down, Thotiana (bust down, Thotiana)\n" +
                    "I wanna see you bust down (over)\n" +
                    "Pick it up, now break that shit down (break it down)\n" +
                    "Speed it up, now slow that shit down, on the gang (slow it down)\n" +
                    "Bust it (bust down), bust down, bust it, bust it\n" +
                    "Bust down on the gang (over)\n" +
                    "Blueface, baby\n" +
                    "Yeah, aight, I'm every woman's fantasy (Blueface, baby)\n" +
                    "Mama always told me I was gon' break hearts\n" +
                    "I guess it's her fault, stupid, don't be mad at me (don't be mad at me)\n" +
                    "I wanna see you bust down (bust down)\n" +
                    "Bend that shit over, on the gang (yeah, ayy)\n" +
                    "Make that shit clap\n" +
                    "She threw it back so I had to double back on the gang (on the gang)\n" +
                    "Smacking high off them drugs\n" +
                    "I tried tell myself, two times was 'nough (was enough)\n" +
                    "Then a nigga relapsed on the dead locs\n" +
                    "Ain't no running, Thotiana, you gon' take these damn strokes (Thotiana)\n" +
                    "I beat the pussy up, now it's a murder scene\n" +
                    "Keep shit player Thotiana like you ain't never even heard of me (Blueface, baby)\n" +
                    "Bust down, Thotiana, I wanna see you bust down (bust down)\n" +
                    "Bend that shit over, yeah, aight (bend it over)\n" +
                    "Now make that shit clap on the gang (make it clap)\n" +
                    "Now toot that thing up (toot it up), throw that shit back (throw it back)\n" +
                    "I need my extras on the dead locs\n" +
                    "Bust down, Thotiana (bust down, Thotiana)\n" +
                    "I wanna see you bust down (over)\n" +
                    "Pick it up, now break that shit down (break it down)\n" +
                    "Speed it up, then slow that shit down, on the gang (slow it down)\n" +
                    "Bust it (bust down), bust down, bust it, bust it\n" +
                    "Bust down on the gang (over)\n" +
                    "Bust down, Thotiana (bust down, Thotiana)\n" +
                    "I wanna see you bust down (over)\n" +
                    "Pick it up, now break that shit down (break it down)\n" +
                    "Speed it up, now slow that shit down, on the gang (slow it down)\n" +
                    "Bust it (bust down), bust down, bust it, bust it\n" +
                    "Bust down on the gang (over)";
            TextView songName = (TextView) findViewById(R.id.songName);
            TextView artistName = (TextView) findViewById(R.id.artistName);
            TextView songLyrics = (TextView) findViewById(R.id.songLyrics);
            songName.setText("Thotiana");
            artistName.setText("Blueface");
            songLyrics.setText(thotianaLyrics);
        }
        if (choice.equals("Soul Sister - Train")) {
            String soulLyrics = "Hey, hey, hey\n" +
                    "Your lipstick stains on the front lobe of my left side brains\n" +
                    "I knew I wouldn't forget you, and so I let you go and blow my mind\n" +
                    "Your sweet moonbeam, the smell of you in every single dream, I dream\n" +
                    "I knew when we collided, you're the one I have decided who's one of my kind\n" +
                    "Hey soul sister, ain't that Mr. Mister on the radio, stereo\n" +
                    "The way you move ain't fair, you know!\n" +
                    "Hey soul sister, I don't want to miss a single thing you do, tonight\n" +
                    "Hey, hey, hey\n" +
                    "Just in time, I'm so glad you have a one-track mind like me\n" +
                    "You gave my life direction, a game show love connection we can't deny\n" +
                    "I'm so obsessed, my heart is bound to beat right out of my untrimmed chest\n" +
                    "I believe in you, like a virgin, you're Madonna\n" +
                    "And I'm always gonna wanna blow your mind\n" +
                    "Hey soul sister, ain't that Mr. Mister on the radio, stereo\n" +
                    "The way you move ain't fair, you know!\n" +
                    "Hey soul sister, I don't want to miss a single thing you do, tonight\n" +
                    "Well you can cut a rug, watching you's the only drug I need\n" +
                    "So gangsta, I'm so thug, you're the only one I'm dreaming of\n" +
                    "You see, I can be myself now finally, in fact there's nothing I can't be\n" +
                    "I want the world to see you'll be, with me\n" +
                    "Hey soul sister, ain't that Mr. Mister on the radio, stereo\n" +
                    "The way you move ain't fair, you know!\n" +
                    "Hey soul sister, I don't want to miss a single thing you do, tonight\n" +
                    "Hey soul sister, I don't want to miss a single thing you do\n" +
                    "Tonight\n" +
                    "Hey, hey, hey\n" +
                    "Tonight\n" +
                    "Hey, hey, hey\n" +
                    "Tonight";
            TextView songName = (TextView) findViewById(R.id.songName);
            TextView artistName = (TextView) findViewById(R.id.artistName);
            TextView songLyrics = (TextView) findViewById(R.id.songLyrics);
            songName.setText("Soul Sister");
            artistName.setText("Train");
            songLyrics.setText(soulLyrics);
        }
        if (choice.equals("Fireflies - Owl City")) {
            String fireLyrics = "You would not believe your eyes\n" +
                    "If ten million fireflies\n" +
                    "Lit up the world as I fell asleep\n" +
                    "'Cause they fill the open air\n" +
                    "And leave teardrops everywhere\n" +
                    "You'd think me rude but I would just stand and stare\n" +
                    "I'd like to make myself believe that planet earth turns slowly\n" +
                    "It's hard to say that I'd rather stay awake when I'm asleep\n" +
                    "'Cause everything is never as it seems\n" +
                    "'Cause I'd get a thousand hugs\n" +
                    "From ten thousand lightning bugs\n" +
                    "As they tried to teach me how to dance\n" +
                    "A foxtrot above my head\n" +
                    "A sock hop beneath my bed\n" +
                    "A disco ball is just hanging by a thread (thread, thread)\n" +
                    "I'd like to make myself believe that planet earth turns slowly\n" +
                    "It's hard to say that I'd rather stay awake when I'm asleep\n" +
                    "'Cause everything is never as it seems (when I fall asleep)\n" +
                    "Leave my door open just a crack\n" +
                    "Please take me away from here\n" +
                    "'Cause I feel like such an insomniac\n" +
                    "Please take me away from here\n" +
                    "Why do I tire of counting sheep\n" +
                    "Please take me away from here\n" +
                    "When I'm far too tired to fall asleep\n" +
                    "To ten million fireflies\n" +
                    "I'm weird cause I hate goodbyes\n" +
                    "I got misty eyes as they said farewell (said farewell)\n" +
                    "But I'll know where several are\n" +
                    "If my dreams get real bizarre\n" +
                    "'Cause I saved a few and I keep them in a jar (jar, jar)\n" +
                    "I'd like to make myself believe that planet earth turns slowly\n" +
                    "It's hard to say that I'd rather stay awake when I'm asleep\n" +
                    "'Cause everything is never as it seems (when I fall asleep)\n" +
                    "I'd like to make myself believe that planet earth turns slowly\n" +
                    "It's hard to say that I'd rather stay awake when I'm asleep\n" +
                    "'Cause everything is never as it seems (when I fall asleep)";
            TextView songName = (TextView) findViewById(R.id.songName);
            TextView artistName = (TextView) findViewById(R.id.artistName);
            TextView songLyrics = (TextView) findViewById(R.id.songLyrics);
            songName.setText("Fireflies");
            artistName.setText("Owl City");
            songLyrics.setText(fireLyrics);
        }
        if (choice.equals("Talk - Khalid")) {
            String talkLyrics = "Can't we just talk?\n" +
                    "Can't we just talk?\n" +
                    "Talk about where we're goin'\n" +
                    "Before we get lost\n" +
                    "Let me out first\n" +
                    "Can't get what we want without knowin'\n" +
                    "I've never felt like this before\n" +
                    "I apologize if I'm movin' too far\n" +
                    "Can't we just talk?\n" +
                    "Can't we just talk?\n" +
                    "Figure out where we're growin'\n" +
                    "Yeah\n" +
                    "Started off right\n" +
                    "I can see it in your eyes\n" +
                    "I can tell that you're wantin' more\n" +
                    "What's been on your mind?\n" +
                    "There's no reason we should hide\n" +
                    "Tell me somethin' I ain't heard before\n" +
                    "Oh, I've been dreamin' 'bout it\n" +
                    "And it's you I'm on\n" +
                    "So stop thinkin' 'bout it\n" +
                    "Can't we just talk?\n" +
                    "Can't we just talk?\n" +
                    "Talk about where we're goin'\n" +
                    "Before we get lost\n" +
                    "Let me out first (yeah)\n" +
                    "Can't get what we want without knowin' (no)\n" +
                    "I've never felt like this before\n" +
                    "I apologize if I'm movin' too far\n" +
                    "Can't we just talk?\n" +
                    "Can't we just talk?\n" +
                    "Figure out where we're growin'\n" +
                    "Penthouse view, left some flowers in the room\n" +
                    "I'll make sure I leave the door unlocked\n" +
                    "Now I'm on the way, swear I won't be late\n" +
                    "I'll be there by five o'clock\n" +
                    "Oh, you've been dreamin' 'bout it\n" +
                    "And I'm what you want\n" +
                    "So stop thinkin' 'bout it\n" +
                    "Can't we just talk? (Oh)\n" +
                    "Can't we just talk? (Na)\n" +
                    "Talk about where we're goin' (na na oh)\n" +
                    "Before we get lost\n" +
                    "Let me out first\n" +
                    "Can't get what we want without knowin' (na)\n" +
                    "I've never felt like this before\n" +
                    "I apologize if I'm movin' too far\n" +
                    "Can't we just talk? (Ooh!)\n" +
                    "Can't we just talk?\n" +
                    "Figure out where we're growin'";
            TextView songName = (TextView) findViewById(R.id.songName);
            TextView artistName = (TextView) findViewById(R.id.artistName);
            TextView songLyrics = (TextView) findViewById(R.id.songLyrics);
            songName.setText("Talk");
            artistName.setText("Khalid");
            songLyrics.setText(talkLyrics);
        }
        if (choice.equals("Old Town Road - Lil Nas X")) {
            String oldLyrics = "Yeah, I'm gonna take my horse to the old town road\n" +
                    "I'm gonna ride 'til I can't no more\n" +
                    "I'm gonna take my horse to the old town road\n" +
                    "I'm gonna ride 'til I can't no more (Kio, Kio)\n" +
                    "I got the horses in the back\n" +
                    "Horse tack is attached\n" +
                    "Hat is matte black\n" +
                    "Got the boots that's black to match\n" +
                    "Ridin' on a horse, ha\n" +
                    "You can whip your Porsche\n" +
                    "I been in the valley\n" +
                    "You ain't been up off that porch, now\n" +
                    "Can't nobody tell me nothin'\n" +
                    "You can't tell me nothin'\n" +
                    "Can't nobody tell me nothin'\n" +
                    "You can't tell me nothin'\n" +
                    "Ridin' on a tractor\n" +
                    "Lean all in my bladder\n" +
                    "Cheated on my baby\n" +
                    "You can go and ask her\n" +
                    "My life is a movie\n" +
                    "Bull ridin' and boobies\n" +
                    "Cowboy hat from Gucci\n" +
                    "Wrangler on my booty\n" +
                    "Can't nobody tell me nothin'\n" +
                    "You can't tell me nothin'\n" +
                    "Can't nobody tell me nothin'\n" +
                    "You can't tell me nothin'\n" +
                    "Yeah, I'm gonna take my horse to the old town road\n" +
                    "I'm gonna ride 'til I can't no more\n" +
                    "I'm gonna take my horse to the old town road\n" +
                    "I'm gonna ride 'til I can't no more\n" +
                    "I got the";
            TextView songName = (TextView) findViewById(R.id.songName);
            TextView artistName = (TextView) findViewById(R.id.artistName);
            TextView songLyrics = (TextView) findViewById(R.id.songLyrics);
            songName.setText("Old Town Road");
            artistName.setText("Lil Nas X");
            songLyrics.setText(oldLyrics);
        }
        if (choice.equals("Old Town Road (Remix) - Lil Nas X ft. Billy Ray Cyrus")) {
            String oldLyrics = "Yeah, I'm gonna take my horse to the old town road\n" +
                    "I'm gonna ride 'til I can't no more\n" +
                    "I'm gonna take my horse to the old town road\n" +
                    "I'm gonna ride 'til I can't no more (Kio, Kio)\n" +
                    "I got the horses in the back\n" +
                    "Horse tack is attached\n" +
                    "Hat is matte black\n" +
                    "Got the boots that's black to match\n" +
                    "Ridin' on a horse, ha\n" +
                    "You can whip your Porsche\n" +
                    "I been in the valley\n" +
                    "You ain't been up off that porch, now\n" +
                    "Can't nobody tell me nothin'\n" +
                    "You can't tell me nothin'\n" +
                    "Can't nobody tell me nothin'\n" +
                    "You can't tell me nothin'\n" +
                    "Ridin' on a tractor\n" +
                    "Lean all in my bladder\n" +
                    "Cheated on my baby\n" +
                    "You can go and ask her\n" +
                    "My life is a movie\n" +
                    "Bull ridin' and boobies\n" +
                    "Cowboy hat from Gucci\n" +
                    "Wrangler on my booty\n" +
                    "Can't nobody tell me nothin'\n" +
                    "You can't tell me nothin'\n" +
                    "Can't nobody tell me nothin'\n" +
                    "You can't tell me nothin'\n" +
                    "Yeah, I'm gonna take my horse to the old town road\n" +
                    "I'm gonna ride 'til I can't no more\n" +
                    "I'm gonna take my horse to the old town road\n" +
                    "I'm gonna ride 'til I can't no more\n" +
                    "I got the";
            TextView songName = (TextView) findViewById(R.id.songName);
            TextView artistName = (TextView) findViewById(R.id.artistName);
            TextView songLyrics = (TextView) findViewById(R.id.songLyrics);
            songName.setText("Old Town Road (Remix)");
            artistName.setText("Lil Nas X ft. Billy Ray Cyrus");
            songLyrics.setText(oldLyrics);
        }
        if (choice.equals("Old Town Road (Remix) - Lil Nas X ft. Billy Ray Cyrus, Young Thug, and Mason Ramsey")) {
            String oldLyrics = "Yeah, I'm gonna take my horse to the old town road\n" +
                    "I'm gonna ride 'til I can't no more\n" +
                    "I'm gonna take my horse to the old town road\n" +
                    "I'm gonna ride 'til I can't no more (Kio, Kio)\n" +
                    "I got the horses in the back\n" +
                    "Horse tack is attached\n" +
                    "Hat is matte black\n" +
                    "Got the boots that's black to match\n" +
                    "Ridin' on a horse, ha\n" +
                    "You can whip your Porsche\n" +
                    "I been in the valley\n" +
                    "You ain't been up off that porch, now\n" +
                    "Can't nobody tell me nothin'\n" +
                    "You can't tell me nothin'\n" +
                    "Can't nobody tell me nothin'\n" +
                    "You can't tell me nothin'\n" +
                    "Ridin' on a tractor\n" +
                    "Lean all in my bladder\n" +
                    "Cheated on my baby\n" +
                    "You can go and ask her\n" +
                    "My life is a movie\n" +
                    "Bull ridin' and boobies\n" +
                    "Cowboy hat from Gucci\n" +
                    "Wrangler on my booty\n" +
                    "Can't nobody tell me nothin'\n" +
                    "You can't tell me nothin'\n" +
                    "Can't nobody tell me nothin'\n" +
                    "You can't tell me nothin'\n" +
                    "Yeah, I'm gonna take my horse to the old town road\n" +
                    "I'm gonna ride 'til I can't no more\n" +
                    "I'm gonna take my horse to the old town road\n" +
                    "I'm gonna ride 'til I can't no more\n" +
                    "I got the";
            TextView songName = (TextView) findViewById(R.id.songName);
            TextView artistName = (TextView) findViewById(R.id.artistName);
            TextView songLyrics = (TextView) findViewById(R.id.songLyrics);
            songName.setText("Old Town Road (Remix)");
            artistName.setText("Lil Nas X ft. Billy Ray Cyrus, Young Thug, Mason Ramsey");
            songLyrics.setText(oldLyrics);
        }
    }
}

