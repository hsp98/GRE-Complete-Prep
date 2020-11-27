package mega.GRE.examination


import android.app.ListActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import java.util.*

class Top500wordslist : ListActivity() {

    private var listValues: MutableList<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top500wordslist)
        listValues = ArrayList()
        listValues?.add("SOPORIFIC: Sleep Causing,lazy")
        listValues?.add("PLUMMET: Fallen Sharply")
        listValues?.add("INSULARITY: Isolation")
        listValues?.add("AUSTERE: Severely Simple")
        listValues?.add("WELTER: Jumbled,Shattered")
        listValues?.add("SHARD: Smell of pottery")
        listValues?.add("PLASTICITY: Ability to be molded")
        listValues?.add("WARY: Very Cautious")
        listValues?.add("SAVOR: Having a distinctive flavour")
        listValues?.add("OSCILLATE: To and fro motion")
        listValues?.add("APPRISE: Inform")
        listValues?.add("SUPPOSITION: Assumption")
        listValues?.add("STINT: Limited work")
        listValues?.add("RESCIND: Cancel")
        listValues?.add("SUBPOENA: A writ summoning a witness to appear in court")
        listValues?.add("OCCLUDE: Shut down,Close")
        listValues?.add("RECONDITE: Secret")
        listValues?.add("LAUD: Praise")
        listValues?.add("DISSONANCE: Opposite of Harmony")
        listValues?.add("CONTRITE: Penitent,Remorse")
        listValues?.add("DOCUMENT: A written form")
        listValues?.add("OBSEQUIOUS: Slavishly Attentive")
        listValues?.add("ENGENDER: Produce")
        listValues?.add("DISSEMBLE: Disguise,Pretend")
        listValues?.add("RECALCITRANT: Stubborn,Intractable")
        listValues?.add("IMPERVIOUS: Impenetrable")
        listValues?.add("DISCREDIT: Defame")
        listValues?.add("ASSIDUOUS: Very proper schedule")
        listValues?.add("STRUT: Pompous walk,Supporting bar")
        listValues?.add("PHLEGMATIC: Calm,Placid")
        listValues?.add("IMPASSIVE: Dull,Without feeling")
        listValues?.add("STOLID: Impassive,Cannot be disturbed")
        listValues?.add("PERVASIVE: Spread Throughout")
        listValues?.add("GOAD: Tear Out")
        listValues?.add("ARTLESS: Honest,Straightforward")
        listValues?.add("SPECTRUM: A band showing 7 colours")
        listValues?.add("SALUBRIOUS: Healthful")
        listValues?.add("OSTENTATIOUS: Trying to gain attention")
        listValues?.add("SPECIOUS: Misleading")
        listValues?.add("EMPIRICAL: Based on experience")
        listValues?.add("LOQUACIOUS: Talkative")
        listValues?.add("DISPARATE: Separate")
        listValues?.add("CATALYST: Increase or decrease rate")
        listValues?.add("ATTENUATE: Weaken")
        listValues?.add("DELINEATE: Depict,portray,sketch")
        listValues?.add("DOGMATIC: Opinionated")
        listValues?.add("DIRGE: Lament,Sorrow")
        listValues?.add("AUDACIOUS: Bold,daring")
        listValues?.add("STIGMA: Disgraceful")
        listValues?.add("MOLLIFY: Soothing")
        listValues?.add("DISMISS: Deny,reject")
        listValues?.add("APPROBATION: Approval")
        listValues?.add("RESOLUTION: Determination")
        listValues?.add("IRRESOLUTE: Uncertain how to act")
        listValues?.add("CONCILIATORY: Reconcile,soothing")
        listValues?.add("DISJOINTED: Disconnected,Separate,Discrete")
        listValues?.add("GULLIBLE: Deceived easily")
        listValues?.add("DISCREPANCY: Lack of consistency,difference")
        listValues?.add("BUTTRESS: Support")
        listValues?.add("CONTENSION: Thesis,Claim")
        listValues?.add("EFFRONTERY: Boldness,Shameless")
        listValues?.add("NEGATE: Deny")
        listValues?.add("INDIGENCE: Poverty")
        listValues?.add("TRACTABLE: Easily manageable")
        listValues?.add("NEOPHYTE: Beginner,Novice")
        listValues?.add("SUBSTANTIATE: Verify")
        listValues?.add("VERBOSE: Wordy")
        listValues?.add("ABEYANCE: Suspended action")
        listValues?.add("INSINUATE: Hint,imply")
        listValues?.add("PENURY: Very poor,Poverty")
        listValues?.add("VITUPERATIVE: Scolding")
        listValues?.add("PIETY: Respect for god")
        listValues?.add("INCHOATE: Elementary,beginning stage")
        listValues?.add("DISINGENUOUS: Slightly dishonest,Sophisticated")
        listValues?.add("ADMONISH: Warning")
        listValues?.add("WARRANTED: Authorised")
        listValues?.add("MUNDANE: Everyday,Hackneyed")
        listValues?.add("APATHY: Understand one's feelings")
        listValues?.add("DIFFIDENCE: Shyness")
        listValues?.add("EULOGY: Praise")
        listValues?.add("DERIVATIVE: Which is not real but derived")
        listValues?.add("AGGREGATE: Accumulate")
        listValues?.add("COMPLAISANT: Trying to please")
        listValues?.add("EQUIVOCATE: Misleading")
        listValues?.add("INERT: Inactive,Lazy")
        listValues?.add("FOMENT: Stir up,commotion")
        listValues?.add("QUIBBLE: Complaint")
        listValues?.add("INSIPID: Dull,lack in flavour")
        listValues?.add("PRAGMATIC: Practical")
        listValues?.add("SOLICITOUS: Concerned")
        listValues?.add("ABSCOND: Hide and walk away secretly")
        listValues?.add("IMPERMEABLE: Unpenetrable,Not allow to pass")
        listValues?.add("LEVEE: Embankment to prevent flooding")
        listValues?.add("TIRADE: Extended Scolding")
        listValues?.add("IMPLODE: Burst inward")
        listValues?.add("PLETHORA: Excess,Abundance")
        listValues?.add("MALLEABLE: Which can be moulded")
        listValues?.add("FLEDGLING: Beginner,un-experienced")
        listValues?.add("TORPOR: Lethargy,Sluggishness,Drowsy")
        listValues?.add("PERMEABLE: Introductory Statement")
        listValues?.add("LUMINOUS: Producing light")
        listValues?.add("BURGEON: Grow forth")
        listValues?.add("EMULATE: Imitate")
        listValues?.add("IMPLICIT: Already understood,Unspoken")
        listValues?.add("DIVEST: Deprive of")
        listValues?.add("AUTONOMOUS: Self governing")
        listValues?.add("CONFOUND: Confused")
        listValues?.add("GOUGE: Urge on")
        listValues?.add("MOROSE: Ill-humoured")
        listValues?.add("INTRANSIGENCE: Stubborn")
        listValues?.add("PROPRIETY: Good conduct,proper manner")
        listValues?.add("PARTISAN: Committed to a party")
        listValues?.add("PRECURSOR: Forerunner")
        listValues?.add("REFRACTORY: Stubborn")
        listValues?.add("ABERRANT: Abnormal,Exception,Irregular")
        listValues?.add("LETHARGIC: Drowsy,Dull")
        listValues?.add("PERENNIAL: Long lasting")
        listValues?.add("REPROACH: Express disapproval or disappointment")
        listValues?.add("PROBLEMATIC: Causing problem")
        listValues?.add("INCONGRUITY: Absurdity")
        listValues?.add("DEFERENCE: Respectful")
        listValues?.add("ADULTERATE: Mixing impurities")
        listValues?.add("BOMBASTIC: Using highly inflated language")
        listValues?.add("CONUNDRUM: Complex problem or situation")
        listValues?.add("DISSOLUTION: Resolving an issue")
        listValues?.add("CASTIGATION: Punishment,Severe criticism")
        listValues?.add("APPEASE: Relief")
        listValues?.add("CAPRICIOUS: Unpredictable")
        listValues?.add("DERIDE: Make fun of")
        listValues?.add("INUNDATE: Flood")
        listValues?.add("FLAG: Weaken,Feeble")
        listValues?.add("RECANT: Openly Confess Error")
        listValues?.add("LACONIC: Brief and to the point ")
        listValues?.add("QUIESCENT: At rest,dormant")
        listValues?.add("REPUDIATE: Disown,Disavow")
        listValues?.add("ABATE: Settle down,Subside")
        listValues?.add("GAINSAY: Deny")
        listValues?.add("POROUS: Consisting of pores for passing")
        listValues?.add("SAGE: A person worshipped for wisdom")
        listValues?.add("IMPERTURBABLE: Which cannot be disturbed")
        listValues?.add("PREVARICATE: Lie")
        listValues?.add("SUBSIDE: Settle down")
        listValues?.add("DETERRENT: Hindrance")
        listValues?.add("DIVERGE: To move away from point")
        listValues?.add("HARANGUE: Vehement Speech")
        listValues?.add("DISTEND: Expand")
        listValues?.add("CONDONE: Overlook,Excuse")
        listValues?.add("DISPARAGE: Separate")
        listValues?.add("FACILITATE: Make easy")
        listValues?.add("METICULOUS: Excessively careful")
        listValues?.add("ICONOCLASTIC: Attacking cherished traditions")
        listValues?.add("PAUCITY: Scarcity")
        listValues?.add("REPROBATE: Person hardened in sin")
        listValues?.add("TACIT: Implicit")
        listValues?.add("AMBIGUOUS: Doubtful in meaning")
        listValues?.add("IDOLATRY: Worshipping of idols")
        listValues?.add("PRECIPITATE: Rash,immature,hasty")
        listValues?.add("TENUOUS: Thin,rare,slim")
        listValues?.add("LOG: Collection of records")
        listValues?.add("PROBITY: Uprightness,In-corruptibility")
        listValues?.add("VERACIOUS: Truthful")
        listValues?.add("BOLSTER: Support")
        listValues?.add("EXACERBATE: Worsen,embitter")
        listValues?.add("MAGNANIMITY: Generosity")
        listValues?.add("PROFOUND: Deep,secret")
        listValues?.add("RAREFIED: Made less dense")
        listValues?.add("IMMUTABLE: Unchangeable")
        listValues?.add("ECLECTIC: Selective")
        listValues?.add("ALACRITY: Cheerful promptness")
        listValues?.add("VENERATE: Respect for something holy or old")
        // initiate the listadapter
        val myAdapter = ArrayAdapter(this,
                R.layout.row_layoutlist, R.id.listText, listValues)
        // assign the list adapter
        listAdapter = myAdapter
    }

    // when an item of the list is clicked
    override fun onListItemClick(list: ListView, view: View, position: Int, id: Long) {
        super.onListItemClick(list, view, position, id)
        val selectedItem = listView.getItemAtPosition(position) as String
        //String selectedItem = (String) getListAdapter().getItem(position);
        if (position == 0) {
            val alert = Viewdialog()
            alert.showDialog(this, "EXAMPLE: The professor's lecture was so SOPORIFIC that all the students slept in the class.")
        } else if (position == 1) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The stock market had PLUMMET since the last few days.")
        } else if (position == 2) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Ram always lives in INSULARITY.He may be too shy to talk to others.")
        } else if (position == 3) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The pandits are generally AUSTERE.They dont care what is happening, they are just focused on themselves")
        } else if (position == 4) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John's room is weltered badly.He must arrange it properly before his mom comes.")
        } else if (position == 5) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The pot fell down from the table and broke into SHARD.")
        } else if (position == 6) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The PLASTICITY of hard metals like Diamond is neglegible")
        } else if (position == 7) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John was WARY while climbing the slippery hill.")
        } else if (position == 8) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The food served at hotel radison has entirely different SAVOR")
        } else if (position == 9) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The pendulum OSCILLATES 24*7.")
        } else if (position == 10) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: All the students were APPRISED about tommorrow's holiday.")
        } else if (position == 11) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Most of John's Theories are based on SUPPOSITIONS.")
        } else if (position == 12) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John never works more than STINT.So he never gets over-paid.")
        } else if (position == 13) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John immediately RESCINDED his reservation from today's flight.")
        } else if (position == 14) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The judge gave SUBPOENA to the witness for appearing in the court.")
        } else if (position == 15) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John's system was so heated that it automatically OCCLUDED after sometime.")
        } else if (position == 16) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: There is always a RECONDITE behind every successful person which is never reflected in public.")
        } else if (position == 17) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: After his eloquent speech, the audience LAUDED him with claps.")
        } else if (position == 18) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: There is great DISSONANCE in between wars.")
        } else if (position == 19) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: If someone's wastes his time in earlier stage of life, he will CONTRITE in future.")
        } else if (position == 20) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: DOCUMENTATION must be properly managed when someone is about to start his startup.")
        } else if (position == 21) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John was so OBSEQUIOUS that the boss liked him very much,but his companions hated him for his attitude.")
        } else if (position == 22) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Hard work in any field ENGENDERS perfect and long awaited success in dramatically unpredictive manner.")
        } else if (position == 23) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Hitman game is all about stealth and DISSEMBLE.")
        } else if (position == 24) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John is too RECALCITRANT to be managed and talk.He never adjusts in any situation.")
        } else if (position == 25) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The more harder the metal is, the more IMPERVIOUS it will be.")
        } else if (position == 26) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John was DEFAMED after losing the race after a long time.")
        } else if (position == 27) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: If one works ASSIDUOUSLY for a long time, success is guaranteed for him.")
        } else if (position == 28) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The bridge had weak STRUT due to which it's life was so less.")
        } else if (position == 29) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The lion was PHLEGMATIC before attacking his prey.")
        } else if (position == 30) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: He was so shocked with the news of his mother's death,that he became IMPASSIVE.")
        } else if (position == 31) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: He was so shocked with the news of his mother's death,that he became STOLID.")
        } else if (position == 32) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The disease was highly communicable, so it spread PERVASIVELY like fire.")
        } else if (position == 33) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John's body was GOAD badly.")
        } else if (position == 34) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Being ARTLESS is sometimes not so good,as one may be misleaded if not clever.")
        } else if (position == 35) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The visible light shows the SPECTRUM of seven colours.")
        } else if (position == 36) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: A balanced diet and regular routine will make us SALUBRIOUS.")
        } else if (position == 37) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Beautiful girls are generally too much OSTENTATIOUS")
        } else if (position == 38) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The solutions given in local books are generally SPECIOUS and hence should not be followed easily.")
        } else if (position == 39) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The advice given to John by his grandfather was EMPIRICAL.")
        } else if (position == 40) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: LOQUACIOUS people are generally clear hearted but sometimes vex us also.")
        } else if (position == 41) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: There were DISPARATE rooms in the hotel, which were best for privacy and security point of view.")
        } else if (position == 42) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The CATALYST suddenly increased the rate of reaction so much that the test tube became very hot. ")
        } else if (position == 43) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Due to the persistant fever since the last few weeks John is ATTENUATED. ")
        } else if (position == 44) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The best way to understand a topic in geometry is to DELINEATE the problem figure. ")
        } else if (position == 45) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John was too DOGMATIC for the wedding.")
        } else if (position == 46) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The death of the Prime Minister caused DIRGE in the entire nation. ")
        } else if (position == 47) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The soldiers were quite AUDACIOUS, which led them to the great victory against their enemies. ")
        } else if (position == 48) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: If a child shows STIGMA towards his parents, it is very bad.")
        } else if (position == 49) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Air Conditioner in summers produces a SOOTHING effect in the room.")
        } else if (position == 50) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John was DISMISSED from his job, due to his dis-graceful behaviour with his boss.")
        } else if (position == 51) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The Delhi metro project got it's APPROBATION due to its promising deadline.")
        } else if (position == 52) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John is successful in his career due to his RESOLUTION towards his goal.")
        } else if (position == 53) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: When john got acute heart failure, everyone was just IRRESOLUTE for a moment.")
        } else if (position == 54) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The medicine applied by doctor on john's wound produced a CONCILIATORY effect.")
        } else if (position == 55) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Mathematics and Biology are entirely DISJOINTED branches.")
        } else if (position == 56) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: An experienced thief cannot be easily GULLIBLE.")
        } else if (position == 57) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: For the last few matches, there is lot of DISCREPANCY in Virat's performance.")
        } else if (position == 58) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The BUTTRESS for the bridge was too weak for sustaining heavy load of traffic.")
        } else if (position == 59) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: For getting Phd from a good university, one must have proper CONTENTION prepared and published.")
        } else if (position == 60) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The EFFRONTERY shown in today's movies are having a bad impact on children.")
        } else if (position == 61) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Jenny NEGATED to John's proposal, since he was too Salacious.")
        } else if (position == 62) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The small villages in the outskirts of the city live in extreme INDIGENCE.")
        } else if (position == 63) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Proper indentation in coding provides TRACTABILITY to the project management.")
        } else if (position == 64) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John knew he was a NEOPHYTE in FIFA, so he did not accepted the challenge. ")
        } else if (position == 65) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The police SUBSTANTIATED the evidence, whether it was misleading or real. ")
        } else if (position == 66) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: According to john , if someone is WORDY, he has rich collection of vocab.")
        } else if (position == 67) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The immediate response was needed at the accident site, but there was ABEYANCE which lead to the death of the victim.")
        } else if (position == 68) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John was not able to do the math problem even after watching the HINT.")
        } else if (position == 69) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The small villages in the outskirts of the city lived in extreme PENURY")
        } else if (position == 70) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John received VITUPERATIVE after he failed in mathematics exam.")
        } else if (position == 71) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Everyone must have PIETY for god, since he is the supreme power of all.")
        } else if (position == 72) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Cancer must be treated when it is INCHOATE , otherwise in later stages it may result to death.")
        } else if (position == 73) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John was DISINGENUOUS in the court, due to which he was suspected more.")
        } else if (position == 74) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The weather report ADMONISHED the city of the upcoming storm.")
        } else if (position == 75) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John always bought only those products which were WARRANTED.")
        } else if (position == 76) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The MUNDANE routine of John was too boring, so he wanted to do something else to change it.")
        } else if (position == 77) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: We must have APATHY with others.")
        } else if (position == 78) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The girl's cheek grew red, that showed she was DIFFIDENCE in nature.")
        } else if (position == 79) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John thanked the crowd after receiving the EULOGY from them for his great performance.")
        } else if (position == 80) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Apple juice is DERIVATIVE of fresh apples.")
        } else if (position == 81) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John's AGGREGATE was low, since his performance graph was not consistent.")
        } else if (position == 82) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Jenny was COMPLAISANT in her approach to convince her parents for the marriage, but they negated it.")
        } else if (position == 83) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Advertisements for products are generally EQUIVOCATE, so they should never be trusted")
        } else if (position == 84) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Neon is an INERT gas.")
        } else if (position == 85) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The death of the President caused a great FOMENT , which was not subsided by the police also. ")
        } else if (position == 86) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Despite of so much QUIBBLE , there was no action taken by company to improve the service.")
        } else if (position == 87) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The fruit juice was too INSIPID to drink, it was tasteless, so everyone avoided it further.")
        } else if (position == 88) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: PRAGMATIC knowledge about a subject is must after understanding the theory.")
        } else if (position == 89) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John was too much addictive to drinking which was a SOLICITOUS issue for his health.")
        } else if (position == 90) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: During the war a soldier was too intimidated to fight more, so he tried to abscond but was killed.")
        } else if (position == 91) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Human body is IMPERMEABLE, that is nothing could pass through it.")
        } else if (position == 92) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The waves were so high that it crossed the LEVEE and entered the village.")
        } else if (position == 93) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The criminal was treated with TIRADE, and finally he confessed his crime.")
        } else if (position == 94) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Appendix in stomach if not operated at right time may IMPLODE and cause immediate death.")
        } else if (position == 95) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: There is PLETHORA of water on Earth's surface, but we should not waste it due its abundance.")
        } else if (position == 96) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Most of metals are MALLEABLE and can be easily given different shapes and sizes.")
        } else if (position == 97) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John was FLEDGLING IN FIFA, so he was not ready to accept the challenge.")
        } else if (position == 98) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: If a person becomes TORPOR in his working, then he can never succeed.")
        } else if (position == 99) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Every effective speech should have proper PREAMBLE, for attracting the listeners.")
        } else if (position == 100) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The LUMINOUS intensity of light is quite high.")
        } else if (position == 101) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: As car prices go down, car dealers are expecting sales to burgeon.")
        } else if (position == 102) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: A monkey always EMULATE human's activities.")
        } else if (position == 103) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Some facts are just IMPLICIT, they are never conveyed, rather they are already understood.")
        } else if (position == 104) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Malnutrition generally occurs in poor, since they are DIVEST of proper nutrients and minerals.")
        } else if (position == 105) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Google has used large no of AUTONOMOUS Algorithms in its development.")
        } else if (position == 106) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: A person who understands concepts gets CONFOUND, but the one who does not is a fool.")
        } else if (position == 107) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John GOUGE to install his application to everyone, but actually no one did.")
        } else if (position == 108) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: A person who is generally too much serious, is often MOROSE.")
        } else if (position == 109) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John is too INTRANSIGENCE to understand and manage. He never listens to anyone ever.")
        } else if (position == 110) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: A person with PROPRIETY is always respected and honoured.")
        } else if (position == 111) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Narendra Modi is PARTISAN to BJP.")
        } else if (position == 112) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Due to john's PRECURSOR habit, sometimes he escapes the danger.")
        } else if (position == 112) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John is too REFRACTORY to understand and manage. He never listens to anyone ever.")
        } else if (position == 113) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Today's weather is quite ABERRANT, since the sunlight and rain are occurring simultaneously.")
        } else if (position == 114) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John after drinking alcohol was feeling extremely LETHARGIC after taking cough syrup at night. ")
        } else if (position == 115) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Duracell batteries are quite PERENNIAL.")
        } else if (position == 116) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: After seeing the result of John's performance in the exam, his parents were quite REPROACHED.")
        } else if (position == 117) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The students were quite PROBLEMATIC for the teachers to subside.")
        } else if (position == 118) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John's logic was just too INCONGRUENT for others to understand.")
        } else if (position == 119) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: We should always show DEFERENCE towards our elder's.")
        } else if (position == 120) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The milkman added ADULTERATE to the milk to gain profit by selling the milk.")
        } else if (position == 121) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: When angry people usually become impatience and their tone becomes BOMBASTIC.")
        } else if (position == 122) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: It proved to be CONUNDRUM for the students to reach the college in time due very hot weather conditions.")
        } else if (position == 123) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The problem of generator was quite DISSOLVED to greater extent after the mechanic worked on it for about 2 hours.")
        } else if (position == 124) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The sin committed by the criminal deserved CASTIGATION.")
        } else if (position == 125) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Air Conditioners generally APPEASE the problem of summers rising temperature.")
        } else if (position == 126) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John's remark about the situation is quite CAPRICIOUS, and it made the situation more worse.")
        } else if (position == 127) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John did not knew riding bike in high school, so his friends DERIDED him a lot.")
        } else if (position == 128) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The rising temperature of earth will soon INUNDATE the coastel areas.")
        } else if (position == 129) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Due to lack of food in poverty, the people were just becoming FLAG.")
        } else if (position == 130) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The criminal RECANT in front of the audience and thus was punished less.")
        } else if (position == 131) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The speech of the politician was quite RECANT, which impressed the crowd listening to him.")
        } else if (position == 132) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Mosquitoes generally are QUIESCENT at a place at the time of breeding. ")
        } else if (position == 133) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The girl REPUDIATE the boy's proposal.")
        } else if (position == 134) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The strike was ABATED by the police officials before emergency.")
        } else if (position == 135) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The girl GAINSAY to john's proposal.")
        } else if (position == 136) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The plastic was not POROUS at all, thus not allowing any water to pass through it.")
        } else if (position == 137) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: In today's world there are very less people who can be called as SAGE.   ")
        } else if (position == 138) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: A person who becomes IMPERTURBABLE in his work succeeds some day, and this has been proved true by life-history of many popular personalities.")
        } else if (position == 139) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John had developed a habit of PREVARICATE all the time to his mother, so his mother lost trust in him slowly.")
        } else if (position == 140) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The police tried to SUBSIDE the mob with their full power but the crowd was just too much out of control. ")
        } else if (position == 141) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Being lazy is the biggest DETERRENT in the person's life if he want's to get his goal.")
        } else if (position == 142) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Both the roads DIVERGE to different points and thus cause lots of confusion for the travellers.")
        } else if (position == 143) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Hitler was HARANGUE in his speech, that is why he was able to sustain dictatorship for so long.")
        } else if (position == 144) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: ")
        } else if (position == 145) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Facebook after it's initial launch DISTENDED so rapidly that all other social networking sites almost vanished.")
        } else if (position == 146) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John's father tried to CONDONE his habit of stealing and thus he became a prominent thief today.")
        } else if (position == 147) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: There should be no DISPARAGE between rich and poor people in society to avoid imbalance which may lead to riots.")
        } else if (position == 148) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Video tutorials on a subject FACILITATE it's learning to a great extent.")
        } else if (position == 149) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Despite being METICULOUS on the calm road, john was killed by a devastating crash at the highway.")
        } else if (position == 150) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John was ICONOCLASTIC towards dowry and child mariage, and it was good for him.")
        } else if (position == 151) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: If there is acute PAUCITY of water then we have no other alternative accept to conserve water sources which are still present.")
        } else if (position == 152) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Usama was REPROBATE after attacking World trade centre and pentagun, and hence he was killed by America.")
        } else if (position == 153) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Some signs are just too TACIT to be uttered like the danger signal we see on the road-end.")
        } else if (position == 154) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The solution proposed by john for the above problem was quite AMBIGUOUS and so was not accepted by his teacher.")
        } else if (position == 155) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: There are very less IDOLATRY persons left in our society .")
        } else if (position == 156) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Due to the PRECIPITATE formation after the reaction, the teacher instructed the students to stop the reaction.")
        } else if (position == 157) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The population of the white tiger is quite TENUOUS, so they are now meant to be preserved at once.")
        } else if (position == 158) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The loss of the LOG files was a great loss for companies database center, since it was now not possible to review any event or changes.")
        } else if (position == 159) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: There are quite few people who have PROBITY in their attitude.")
        } else if (position == 160) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Meera was too VERACIOUS in her attitude which had cost her a lot in a society of liars.")
        } else if (position == 161) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The nut provided the best BOLSTER for the screws, but extra load given was not balanced and hence the system collasped.")
        } else if (position == 162) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Telling lies often only EXACERBATES the situation .")
        } else if (position == 163) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Generally in today's world, MAGNANIMITY is taken for granted and mis-used.")
        } else if (position == 164) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: John was having a PROFOUND secret about which he had not told even his parents as well.")
        } else if (position == 165) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: The gas was RAREFIED to great extent, but then also it caused the death of about 1000 people.")
        } else if (position == 166) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: String's are generally IMMUTABLE in java programming language.")
        } else if (position == 167) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: After being so ECLECTIC in his approach of choosing the vegetables, he was fooled by the shopkeeper.")
        } else if (position == 168) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Girl's have generally more ALACRITY on their faces as compared to boys, it is scientifically proved.")
        } else if (position == 169) {
            val alert = Viewdialog()
            alert.showDialog(this@Top500wordslist, "EXAMPLE: Ramayana and Mahabharata are VENERATED by almost everyone in India as well as abroad foreign countries.")
        }
    }
}