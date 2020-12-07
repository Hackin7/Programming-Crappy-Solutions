package sg.gov.tech.ctf.mobile.Info;

import a.b.k.d;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import f.a.a.a.a.c.c.e;
import f.a.a.a.a.c.c.f;
import f.a.a.a.a.d.a;
import java.util.ArrayList;
import sg.gov.tech.ctf.mobile.R;

public class AtoZCovid extends d implements e.c {

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f2963b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<f> f2964c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView.g f2965d;

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.covid_encyclopedia_activity);
        getWindow().setFlags(1024, 1024);
        getWindow().setSoftInputMode(32);
        this.f2963b = (RecyclerView) findViewById(R.id.content);
        a();
    }

    public final void a() {
        this.f2963b.setHasFixedSize(true);
        this.f2963b.setLayoutManager(new LinearLayoutManager(1, false));
        this.f2964c.add(new f("A"));
        this.f2964c.add(new f("Ansomia"));
        this.f2964c.add(new f("Asymptomatic"));
        this.f2964c.add(new f("B"));
        this.f2964c.add(new f("Behave"));
        this.f2964c.add(new f("C"));
        this.f2964c.add(new f("Circuit Breaker"));
        this.f2964c.add(new f("Contact Tracing"));
        this.f2964c.add(new f("Contagious"));
        this.f2964c.add(new f("Cough"));
        this.f2964c.add(new f("COVID"));
        this.f2964c.add(new f("D"));
        this.f2964c.add(new f("Deaths"));
        this.f2964c.add(new f("Diagnostics"));
        this.f2964c.add(new f("E"));
        this.f2964c.add(new f("Endemic"));
        this.f2964c.add(new f("Epidemic"));
        this.f2964c.add(new f("F"));
        this.f2964c.add(new f("Face Shield"));
        this.f2964c.add(new f("Fake News"));
        this.f2964c.add(new f("Fever"));
        this.f2964c.add(new f("Flu"));
        this.f2964c.add(new f("G"));
        this.f2964c.add(new f("Government Services"));
        this.f2964c.add(new f("H"));
        this.f2964c.add(new f("High Temperature"));
        this.f2964c.add(new f("Herd Immunity"));
        this.f2964c.add(new f("I"));
        this.f2964c.add(new f("Incubation"));
        this.f2964c.add(new f("Infodemic"));
        this.f2964c.add(new f("J"));
        this.f2964c.add(new f("K"));
        this.f2964c.add(new f("L"));
        this.f2964c.add(new f("Lockdown"));
        this.f2964c.add(new f("M"));
        this.f2964c.add(new f("Masks"));
        this.f2964c.add(new f("Mortality Rate"));
        this.f2964c.add(new f("N"));
        this.f2964c.add(new f("O"));
        this.f2964c.add(new f("Outbreak"));
        this.f2964c.add(new f("P"));
        this.f2964c.add(new f("Pandemic"));
        this.f2964c.add(new f("Put flag here"));
        this.f2964c.add(new f("Q"));
        this.f2964c.add(new f("Quarantine"));
        this.f2964c.add(new f("R"));
        this.f2964c.add(new f("Respiratory problems"));
        this.f2964c.add(new f("S"));
        this.f2964c.add(new f("Social Distancing"));
        this.f2964c.add(new f("Spread"));
        this.f2964c.add(new f("Symptoms"));
        this.f2964c.add(new f("Swab"));
        this.f2964c.add(new f("T"));
        this.f2964c.add(new f("Transmission"));
        this.f2964c.add(new f("U"));
        this.f2964c.add(new f("Underlying condition"));
        this.f2964c.add(new f("V"));
        this.f2964c.add(new f("Vaccine"));
        this.f2964c.add(new f("Virus"));
        this.f2964c.add(new f("W"));
        this.f2964c.add(new f("WHO"));
        this.f2964c.add(new f("Wuhan"));
        this.f2964c.add(new f("Work from home"));
        this.f2964c.add(new f("X"));
        this.f2964c.add(new f("Y"));
        this.f2964c.add(new f("Z"));
        e eVar = new e(this.f2964c, this);
        this.f2965d = eVar;
        this.f2963b.setAdapter(eVar);
    }

    public void b(int position) {
        this.f2964c.get(position);
        switch (position) {
            case 1:
                new a("Ansomia", "One symptom of COVID is the loss or a change in your normal sense of smell (it can also affect your sense of taste). If you can't smell a durian, KOROVAX thinks it is likely you have COVID.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 2:
                new a("Asymptomatic", "This is when you feel perfectly well and do not show any symptoms of COVID despite having the virus.  But before you start celebrating that you are asymptomatic, note that you can still pass the virus on to others.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 3:
            case 5:
            case 11:
            case 14:
            case 17:
            case 22:
            case 24:
            case 27:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 38:
            case 40:
            case 43:
            case 45:
            case 47:
            case 52:
            case 54:
            case 56:
            case 59:
            default:
                return;
            case 4:
                new a("Behave", "KOROVAX thinks it is best to behave yourself during this period. Try your best to stay at home!").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 6:
                new a("Circuit Breaker", "A short intensive period of strict restrictions for everyone to help curb the spread of COVID. Well, it's a partial lockdown introduced in April in Singapore, and has nothing to do with the electrical circuit... for now.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 7:
                new a("Contact Tracing", "This occurs when a person tests positive for COVID, and people who have been recently in close contact with the positive man will be contacted! Not to sell them insurance, but to tell them to self-isolate and perhaps get themselves tested if they exhibits similar symptoms.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 8:
                new a("Contagious", "If you haven't realised, COVID is contagious! Thus KOROVAX advice will be to wash your hands regularly... how about now? And wash your hands with soap!").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 9:
                new a("Cough", "Coughing is one of the 3 main symptoms of COVID. The other 2 are Ansomia and fever! If you have been continuously coughing for a while, KOROVAX thinks you should get yourself checked!").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 10:
                new a("COVID", "'CO' stands for corona, 'VI' for virus, and 'D' for disease. There you have it people. COVID.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 12:
                new a("Deaths", "1.27 million people have died from COVID. That's why you should take it seriously lest you add on to the number!").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 13:
                new a("Diagnostics", "Methods used by healthcare staff to identify a particular illness or disease. For example, through laboratory testing").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 15:
                new a("Endemic", "Constant presence of a disease in a population within a certain area").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 16:
                new a("Epidemic", "A sudden increase in the number of cases of a disease – more than what’s typically expected for the population in that area.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 18:
                new a("Face Shield", "A shield that covers your face. It is made of plastic, so it's definitely not used to protect your face from bullets, but the virus.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 19:
                new a("Fake News", "News that are not true. KOROVAX does not share fake news! Trust KOROVAX and this app!").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 20:
                new a("Fever", "One of the 3 main symptoms of COVID. Temperature more than 37.5 degrees celsius is considered a fever!!").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 21:
                new a("Flu", "An illness caused by the influenza virus. It occurs every year, usually in winter.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 23:
                new a("Government Services", "In many countries, government services are available to help the population tide through this pandemic. KOROVAX lends a helping hand too, by providing the right information!").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 25:
                new a("High Temperature", "SEE FEVER. One of the 3 main symptoms of COVID. Temperature more than 38 degrees celsius is considered a high temperature!!").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 26:
                new a("Herd Immunity", "When a high percentage of the community is immune to a disease, usually through vaccination and/or prior illness. That's why vaccines are important, anti-vaxxers.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 28:
                new a("Incubation", "The time period when you are exposed to the virus and when symptoms become obvious. COVID has an incubation period for as long as 14 days, which explains the 2 weeks quarantine period.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 29:
                new a("Infodemic", "Not a deadly virus, but this happens when there are too much information. So much so that some are accurate, some are not.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 33:
                new a("Lockdown", "As per the title, it means everyone has to stay at home unless they have a legitimate excuse to leave their house.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 35:
                new a("Masks", "By masks we mean medical masks, not Halloween masks! Wearing masks ensure that if we are sick, we do not spread the virus to someone else! And it also protects us from exposure too!").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 36:
                new a("Mortality Rate", "Proportion of people who have died from an illness in the population.  It may be expressed as a percentage or per 100,000").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 39:
                new a("Outbreak", "A number of disease cases higher than what is normally expected. Is COVID an outbreak? It sure is mate.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 41:
                new a("Pandemic", "When an epidemic spreads between countries affecting a large number of people.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 42:
                new BottomSheetDialogEdit("Put the flag here").e(getSupportFragmentManager(), "ModalBtmSheetEdit");
                return;
            case 44:
                new a("Quarantine", "Period of time where a person or animal with a contagious disease is isolated.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 46:
                new a("Respiratory problems", "Literally breathing problems. Common sign of COVID, but not a sure sign!").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 48:
                new a("Social Distancing", "Stay away from people and less people get the virus. TREAT EVERYONE LIKE YOUR ENEMIES!").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 49:
                new a("Spread", "Nothing to do with bread, but spread here means the spread of COVID. We are kinda the bread.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 50:
                new a("Symptoms", "Look out for signs of COVID. Remember the 3 main symptoms! (KOROVAX is not gonna remind you again.)").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 51:
                new a("Swab", "Small piece of cotton wool used by a doctor or nurse for taking a specimen. Painful.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 53:
                new a("Transmission", "Act of transferring something from one person or place to another. For COVID transmission means transferring the virus from one person to another.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 55:
                new a("Underlying condition", "Any condition for which the patient has already received medical advice or treatment. People with underlying conditions are more at risk of serious illness if they catch COVID. KOROVAX thinks that you are likely to die, but you might not as well.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 57:
                new a("Vaccine", "Product that helps the body’s immune system to fight against infections. Most vaccines are given by an injection, but some are given orally (by mouth) or sprayed into the nose. There is currently no vaccine for COVID. KOROVAX is working hard on it.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 58:
                new a("Virus", "Tiny, living thing (particle) that causes disease and sickness when a person becomes infected with the virus. Oh and yes, they are ALIVE. *shrieks in COVID* ").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 60:
                new a("WHO", "No it's not who as in who are you, but who as in the world health organisation. They are important... We think.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 61:
                new a("Wuhan", "City in China where the first case of COVID was discovered... Not that they made it though.").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
            case 62:
                new a("Work from home", "What KOROVAX employees like doing right now. It's tough to get them back to office!!!").e(getSupportFragmentManager(), "ModalBtmSheet");
                return;
        }
    }
}
