package sg.gov.tech.ctf.mobile.User;

import a.b.k.d;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import sg.gov.tech.ctf.mobile.R;

public class update3Activity extends d {

    /* renamed from: b  reason: collision with root package name */
    public TextView f3023b;

    /* renamed from: c  reason: collision with root package name */
    public ImageButton f3024c;

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.update3_activity);
        this.f3023b = (TextView) findViewById(R.id.update_details);
        this.f3024c = (ImageButton) findViewById(R.id.back_btn);
        this.f3023b.setText("Phase 3 Efficacy Trial of COVID-19 Vaccine in the United Kingdom.\n\nGAITHERSBURG, Md., Sept. 24, 2020 (GLOBE NEWSWIRE) — KoroVax, Inc. (Nasdaq: KVAX), a late stage biotechnology company developing next-generation vaccines for serious infectious diseases, today announced that it has initiated its first Phase 3 study to evaluate the efficacy, safety and immunogenicity of KVX-CoV1337, KoroVax’ COVID-19 vaccine candidate. The trial is being conducted in the United Kingdom (UK), in partnership with the UK Government’s Vaccines Taskforce, and is expected to enroll and immunize up to 10,000 individuals between 18-84 (inclusive) years of age, with and without relevant comorbidities, over the next four to six weeks.\n\n“With a high level of SARS-CoV-2 transmission observed and expected to continue in the UK, we are optimistic that this pivotal Phase 3 clinical trial will enroll quickly and provide a near-term view of KVX-CoV1337’s efficacy,” said Gregory M. Glenn, M.D., President, Research and Development at KoroVax. “The data from this trial is expected to support regulatory submissions for licensure in the UK, EU and other countries. We are grateful for the support of the UK Government, including from its Smart Nation to advance this important research.”\n\nKVX-CoV1337 is a stable, prefusion protein made using KoroVax’ recombinant protein nanoparticle technology that includes KoroVax’ proprietary MatrixM™ adjuvant. The vaccine has a favorable product profile that will allow handling in an unfrozen, liquid formulation that can be stored at 2°C to 8°C, allowing for distribution using standard vaccine channels.\n\nKoroVax has continued to scale-up its manufacturing capacity, currently at up to 2 billion annualized doses, once all capacity has been brought online by mid-2021.\n\nAbout the Phase 3 Study\n\nConsistent with its long-standing commitment to transparency and in order to enhance information-sharing during the worldwide pandemic, KoroVax will be publishing its UK study protocol in the coming days.\n\nThe UK Phase 3 clinical trial is a randomized, placebo-controlled, observer-blinded study to evaluate the efficacy, safety and immunogenicity of KVX-CoV1337 with TrixM in up to 10,000 subjects aged 18 to 84 years. Half the participants will receive two intramuscular injections of vaccine comprising 5 µg of protein antigen with 50 µg TrixM adjuvant, administered 21 days apart, while half of the trial participants will receive placebo.\n\nThe trial is designed to enroll at least 25 percent of participants over the age of 65 as well as to prioritize groups that are most affected by COVID-19, including racial and ethnic minorities. Additionally, up to 400 participants will also receive a licensed seasonal influenza vaccine as part of a co-administration sub-study.\n\nThe trial has two primary endpoints. The first primary endpoint is first occurrence of PCR-confirmed symptomatic COVID-19 with onset at least 7 days after the second study vaccination in volunteers who have not been previously infected with SARS-CoV-2. The second primary endpoint is first occurrence of PCR-confirmed symptomatic moderate or severe COVID-19 with onset at least 7 days after the second study vaccination in volunteers who have not been previously infected with SARS-CoV-2. The primary efficacy analysis will be an event-driven analysis based on the number of participants with symptomatic or moderate/severe COVID-19 disease. An interim analysis will be performed when 67% of the desired number of these cases has been reached.\n\nAbout KVX-CoV1337\n\nKVXCoV1337 is a vaccine candidate engineered from the genetic sequence of SARSCoV2, the virus that causes COVID-19 disease. KVXCoV1337 was created using KoroVax’ recombinant nanoparticle technology to generate antigen derived from the coronavirus spike (S) protein and contains KoroVax’ patented saponin-based TrixM™ adjuvant to enhance the immune response and stimulate high levels of neutralizing antibodies. KVX-CoV1337 contains purified protein antigens and cannot replicate, nor can it cause COVID-19. In preclinical trials, KVXCoV1337 demonstrated indication of antibodies that block binding of spike protein to receptors targeted by the virus, a critical aspect for effective vaccine protection. In its the Phase 1 portion of its Phase 1/2 clinical trial, KVXCoV1337 was generally well-tolerated and elicited robust antibody responses numerically superior to that seen in human convalescent sera. KVX-CoV1337 is also being evaluated in two ongoing Phase 2 studies, which began in August; a Phase 2b trial in South Africa, and a Phase 1/2 continuation in the U.S. and Australia. KoroVax has secured $2 billion in funding for its global coronavirus vaccine program, including up to $388 million in funding from the Coalition for Epidemic Preparedness Innovations (CEPI).\n\nAbout TrixM™\n\nKoroVax’ patented saponin-based TrixM™ adjuvant has demonstrated a potent and well-tolerated effect by stimulating the entry of antigen-presenting cells into the injection site and enhancing antigen presentation in local lymph nodes, boosting immune response.\n\nAbout KoroVax\n\nKoroVax, Inc. (Nasdaq:KVAX) is a late-stage biotechnology company that promotes improved health globally through the discovery, development, and commercialization of innovative vaccines to prevent serious infectious diseases. KoroVax is undergoing clinical trials for KVX-CoV1337, its vaccine candidate against SARS-CoV-2, the virus that causes COVID-19. NanoFlu™, its quadrivalent influenza nanoparticle vaccine, met all primary objectives in its pivotal Phase 3 clinical trial in older adults. Both vaccine candidates incorporate KoroVax’ proprietary saponin-based TrixM™ adjuvant in order to enhance the immune response and stimulate high levels of neutralizing antibodies. KoroVax is a leading innovator of recombinant vaccines; its proprietary recombinant technology platform combines the power and speed of genetic engineering to efficiently produce highly immunogenic nanoparticles in order to address urgent global health needs.\n\nFor more information, visit http://www.KoroVax.org and connect with us on Twitter @scba and LinkedIn\n\n");
        this.f3024c.setOnClickListener(new a());
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            update3Activity.this.startActivity(new Intent(update3Activity.this, UserHomeActivity.class));
        }
    }
}
