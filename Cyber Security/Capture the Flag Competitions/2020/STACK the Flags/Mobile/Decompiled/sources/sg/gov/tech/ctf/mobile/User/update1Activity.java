package sg.gov.tech.ctf.mobile.User;

import a.b.k.d;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import sg.gov.tech.ctf.mobile.R;

public class update1Activity extends d {

    /* renamed from: b  reason: collision with root package name */
    public TextView f3017b;

    /* renamed from: c  reason: collision with root package name */
    public ImageButton f3018c;

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.update1_activity);
        this.f3017b = (TextView) findViewById(R.id.update_details);
        this.f3018c = (ImageButton) findViewById(R.id.back_btn);
        this.f3017b.setText("By Sarah Miller\n\nThere are some amazing conferences happening all over the world in every industry. From the unveiling of the latest products to guest speakers that are the top of the top, it can be so disappointing when you can’t afford to attend yourself, especially when you know there will be a lot going on there that can give you and edge over the competition.\n\nThis is the most common woe that I hear from others in my field: “Oh, I wanted to be there so badly, but just didn’t have the cash!” It is a sentiment I have echoed myself many times.\n\nBut the Internet has been a game changer, and social networking has expanded well beyond what we initially saw as its purpose. Twitter has become especially crucial in the sharing of information and connecting, with a number of tools to help keep up to date.\n\nEven if you are going, you may want your employees who are staying in the office to be able to follow the event to get more of your brand out there.\n\nHere are a couple of ways that you can be there without actually being there, and so get all of the benefits. Some of these could also be used by event planners to offer others the chance to check them out.\n\nTwitter Archiver\n\nA simple update program, this runs as an extension for Google Chrome. It lets you search Twitter for any hashtag or hashtag and save matching tweets in a Google Sheet. This way you end up with a searchable Google Spreadsheet you can play with to extract most useful users and popular tweets to interact with.You can share the Google Spreadsheet with your social media team to let them interact and participate in Twitter conversations around an event.\n\nAll you do is use your Twitter account info through a login connection in the “Addons” tab of the spreadsheet. Then, you set up an archive using hashtags as a parameter.\n\nThis will allow the program to gather all tweets that use those hashtags as keywords, and put it all together into a single archive. Then, it permanently keeps it active for you to use or share with others. Some useful info you’ll see for each archived tweet:\n\n1.   How many times each tweet was retweeted and favorite\n2.   Whether the user was verified\n3.   Location of the user\n4.   The full bio of the user\n\nAnalytics for Twitter\n\nIf either Google Chrome or Google Spreadsheets (or both) are not an option for you, you can try this Excel app (Windows-only) that imports Twitter search results into an Excel file and archives them.\n\nThe app comes with nice visualizations. My favorite feature is, again, the ability to see users tweeting the hashtags most actively. You can go through their profiles or set up an list of potential conference attendees.A few more tools to try:\n\n1.   Keyhole lets you archive the hashtags, download the results into an Excel file and go through historical data for the terms you need to analyze retroactively\n2.   Hooks allows you to set up hashtag tracking on your mobile phone in case you want to participate on the go. BestAndroidApps offers a good tutorial on how to set up mobile alerts using the app.\n\nNow, What to Do with All Those Archives?\n\nWhether you handle your social media marketing yourself or you have a team for that, make sure you are doing the most of your archives:\n\n1.   Engage with those tweets: Retweet, congratulate, ask questions, etc.\n2.   Follow people you are engaging with. Remember conference people are there to network: They will be happy to interact back!\n3.   Bookmark and read the tweeted URLs: Conference speakers often tweet URLs of their PowerPoint presentations, books or articles. This is your chance to educate yourself!\n\nIf you do everything right, you may be able to drive as much value as people actually attending the conference! Grow your connections and expertise for free!\n\n@amanda.lee , I’m sure you’ll find this tool useful for our secret social media *wink* *wink*");
        this.f3018c.setOnClickListener(new a());
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            update1Activity.this.startActivity(new Intent(update1Activity.this, UserHomeActivity.class));
        }
    }
}
